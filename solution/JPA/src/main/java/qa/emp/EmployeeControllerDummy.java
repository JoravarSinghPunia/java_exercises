package qa.emp;

public class EmployeeControllerDummy implements EmployeeController {

	@Override
	public boolean createEmployee(String firstname, String lastname, int age) {
		System.out.println("Creating Employee(\"" + firstname + "\",\"" + lastname + "\"," + age + ")");
		return true;
	}

	@Override
	public boolean deleteEmployee(String firstname, String lastname) {
		System.out.println("Deleting Employee(\"" + firstname + "\",\"" + lastname + "\")");
		return true;
	}

	@Override
	public String getAllEmployees() {
		String emps = "Lewis\tPirnie\t47\n";
		emps += "Fred\tBloggs\t33\n";
		return emps;
	}

	@Override
	public void close() {
		System.out.println("Seems like the application is being closed...");
	}
	
	

}
