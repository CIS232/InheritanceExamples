package edu.cis232.second;

import java.util.ArrayList;

public class ExampleMain2 {

	public static void main(String[] args) {
		//Polymorphism example
		//Any subclass can act as any of its super classes
		Rectangle rect = new Square(6);
		System.out.println(rect);
		
		ArrayList<Rectangle> rects = new ArrayList<>();
		rects.add(rect);
		rects.add(new Rectangle(5, 3));
		rects.add(new Square(7));
		
		System.out.println("\nRectangles in the Array:");
		for(Rectangle r : rects){
			System.out.println(r);
		}
		
		
	}

}
