package edu.cis232.first;

public class Vehicle {
	//Fields
	private int speed;
	
	private int capacity;
	
	//Constructors
	public Vehicle(){
		speed = 0;
		setCapacity(1);
	}
	
	public Vehicle(int capacity){
		speed = 0;
		this.setCapacity(capacity);
	}
	
	//Methods
	public int getSpeed(){
		return speed;
	}
	
	public void setSpeed(int speed){
		this.speed = speed;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public boolean move(){
		return true;
	}
}
