package qa.emp;

public class EmployeeMain {

	public static void main(String[] args) {
		
		EmployeeController controller = new EmployeeControllerJPA();
		EmployeeFrame frame = new EmployeeFrame(controller);
		frame.launch();
		
	}

}
