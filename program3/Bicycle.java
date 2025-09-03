package transport;

public class Bicycle extends Vehicle {

	public Bicycle(String id) {
		super(id);
		// TODO Auto-generated constructor stub
		System.out.println("Bicycle() constructor called");
	}

	@Override
	public void deliver(String item, String place) {
		// TODO Auto-generated method stub
		System.out.println("Delivering "+item+"to "+place+"by bicycle");

	}

}
