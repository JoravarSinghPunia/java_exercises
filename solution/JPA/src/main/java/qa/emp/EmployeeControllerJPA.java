package qa.emp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class EmployeeControllerJPA implements EmployeeController {
    private EntityManager em;

    public EmployeeControllerJPA() {
        EntityManagerFactory fac = Persistence.createEntityManagerFactory("MyPersistenceUnit");
        em = fac.createEntityManager();
    }

    public boolean createEmployee(String firstname, String lastname, int age) {
        int id = (int) (System.currentTimeMillis() % 10000);
        Employee e = new Employee(id,firstname,lastname,age);
        em.getTransaction().begin();
        em.persist(e);
        em.getTransaction().commit();
        System.out.println("created");
        return true;
    }

    public boolean deleteEmployee(String firstname, String lastname) {

        Employee e = findEmployee(firstname,lastname);
        if (e==null) return false;  // there wasn't such an employee
        em.getTransaction().begin();
        em.remove(e);
        em.getTransaction().commit();
        return true;
    }

    public Employee findEmployee(String firstname, String lastname) {
        Employee e = (Employee) em.createQuery("from Employee e where e.firstname=:firstname and e.lastname=:lastname")
                .setParameter("firstname", firstname)
                .setParameter("lastname", lastname)
                .getSingleResult();
        return e;
    }

    public String getAllEmployees() {
        StringBuilder sb = new StringBuilder();
        List<Employee> allEmployees = em.createQuery("from Employee").getResultList();
        for (Employee e : allEmployees) {
            sb.append(e.getFirstname() + "\t" + e.getLastname() + "\t" + e.getAge() + "\n");
        }
        return sb.toString();
    }

    public void close() {
        em.close();
    }
}
