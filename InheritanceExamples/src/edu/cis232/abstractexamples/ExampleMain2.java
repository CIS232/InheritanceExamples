package edu.cis232.abstractexamples;

public class ExampleMain2 {

	public static void main(String[] args) {
		// Polymorphism array
		Shape[] shapes = new Shape[3];
		shapes[0] = new Circle(5);
		shapes[1] = new Rectangle(2, 4);
		shapes[2] = new Square(3);

		for(int i = 0; i < shapes.length; i++){
			System.out.println(shapes[i]);
		}
	}

}
