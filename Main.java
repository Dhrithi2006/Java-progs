package employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee("Joe",101,20000);
		Employee emp2=new Employee("Ben",102,25000);
		System.out.println("Initial employee details:");
		emp1.displayDetails();
		emp2.displayDetails();
		emp1.increaseSalary(10);
		emp2.increaseSalary(10);
		System.out.println("Updated employee details:");
		emp1.displayDetails();
		emp2.displayDetails();

	}

}
