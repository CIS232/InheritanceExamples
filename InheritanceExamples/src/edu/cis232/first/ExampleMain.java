package edu.cis232.first;

public class ExampleMain {

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.setCapacity(10);
		v.setSpeed(20);
		int speed = v.getSpeed();
		
		Car c = new Car();
		//We can use the methods from the Car's superclass (Vehicle)
		c.setSpeed(5);
		c.move();
		c.setNumWheels(3);
		
		System.out.printf("The car has %d wheels%n", c.getNumWheels());
		
		Boat b = new Boat("Annapolis");
		
		System.out.printf("The boat has %d capacity and a homeport of %s%n", b.getCapacity(), b.getHomePort());
	}

}
