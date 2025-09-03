package transport;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBike e=new EBike("EB-101",50);
		e.deliver("Samosa ","Library ");
		Drone d=new Drone("DR-1");
		d.deliver("Notes","ExamCell");
		d.deliver("USB","CSE block");
		double bill=d.cost(5);
		System.out.println("Drone delivery cost:Rs. "+bill);

	}



}
