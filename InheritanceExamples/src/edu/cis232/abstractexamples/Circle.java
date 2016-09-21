package edu.cis232.abstractexamples;

public class Circle extends Shape {
	private double radius;
	
	public Circle(){
		this.name = "Circle";
		this.radius = 1;
	}
	
	public Circle(double radius){
		this();
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
}
