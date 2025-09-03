package transport;

public class Drone extends Vehicle implements Payable{

	public Drone(String id) {
		super(id);
		// TODO Auto-generated constructor stub
		System.out.println("Drone() constructor called");

	}

	@Override
	public void deliver(String item, String place) {
		// TODO Auto-generated method stub
		if(!SecurityRules.canFly(place)) {
			System.out.println("Delivery to "+place+" is blocked by security");
			return;
		}
		System.out.println("Delivering "+item+" to "+place+" by drone");

	}
	@Override
	public double cost(double distanceKm) {
		return 20*distanceKm;
	}


}
