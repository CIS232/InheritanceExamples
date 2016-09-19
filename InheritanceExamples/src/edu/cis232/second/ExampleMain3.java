package edu.cis232.second;

import java.util.ArrayList;

public class ExampleMain3 {

	public static void main(String[] args) {

		ArrayList<Rectangle> rects = new ArrayList<>();
		rects.add(new Rectangle(5, 10));
		rects.add(new Square(22));

		for (Rectangle rect : rects) {
			if (rect instanceof Square) {
				System.out.println("It's a square!");
			} else {
				System.out.println("It's not a square!");
			}
		}

	}
}
