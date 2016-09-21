package edu.cis232.abstractexamples;

public class Rectangle extends Shape {
    protected double height;
	protected double length;
	
	public Rectangle(double height, double length){
		this.height = height;
		this.length = length;
		this.name = "Rectangle";
	}
	
	public double getHeight(){
		return height;
	}
	
	public double getLength(){
		return length;
	}
	
	public double getPerimeter(){
		return 2 * height + 2 * length;
	}
	
	public double getArea(){
		return length * height;
	}
}
