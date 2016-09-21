package edu.cis232.abstractexamples;

public class Square extends Rectangle {
	public Square(double length){
		super(length, length);
		this.name = "Square";
	}
	
	public void setLength(double length){
		this.length = length;
		this.height = length;
	}
	
}
