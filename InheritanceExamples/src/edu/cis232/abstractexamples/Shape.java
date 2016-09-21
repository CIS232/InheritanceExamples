package edu.cis232.abstractexamples;

public abstract class Shape {
	protected String name = "Shape";
	
	public abstract double getPerimeter();
	public abstract double getArea();
	
	public String toString(){
		return String.format("%s has %.2f area and %.2f perimeter", name, getArea(), getPerimeter());
	}
}
