package edu.cis232.second;

public class Square extends Rectangle {
	public Square(double length){
		super(length, length);
	}
	
	public String toString(){
		return String.format("Square %.2f area and %.2f perimeter", getArea(), getPerimeter());
	}
}
