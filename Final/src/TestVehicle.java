public class TestVehicle {

	Person a = new Person();
	private Person owner;

	public void transferOwnership(Person a) {
		Car car = new Car();
		int numberOfDoors = 4;
		this.owner = a;
		Truck truck = new Truck();
		int numberOfAxels = 2;
		this.owner = a;
	}

	Person b = new Person();

	public void transferOwnership1(Person b) {

		this.owner = b;
		Truck truck = new Truck();
		int numberOfAxels = 2;
	}

	MotorCycle motorcycle = new MotorCycle();
	boolean hasSideCar = false;

}