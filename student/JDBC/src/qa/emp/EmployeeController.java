package qa.emp;

public interface EmployeeController {
	
	public boolean createEmployee(String firstname, String lastname, int age);
	
	public boolean deleteEmployee(String firstname, String lastname);
	
	public String getAllEmployees();
	
	public void close();

}
