package edu.cis232.second;

public class Rectangle {
    protected double height;
	protected double length;
	
	public Rectangle(double height, double length){
		this.height = height;
		this.length = length;
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
	
	public String toString(){
		return String.format("Rectangle %.2f area and %.2f perimeter", getArea(), getPerimeter());
	}
}
