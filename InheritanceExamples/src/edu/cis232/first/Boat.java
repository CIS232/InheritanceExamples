package edu.cis232.first;

public class Boat extends Vehicle {
	private String homePort;
	
	public Boat(String homePort){
		super(5);
		this.setHomePort(homePort);
	}

	public String getHomePort() {
		return homePort;
	}

	public void setHomePort(String homePort) {
		this.homePort = homePort;
	}
}
