package edu.cis232.othershape;

import edu.cis232.second.Rectangle;

//This square is in a different package from rectangle to show off different access modifiers on the fields.
public class Square extends Rectangle {

	public Square(double length) {
		super(length, length);
	}
	
	public void setLength(double length){
		this.length = length;
		this.height = length;
	}

}
