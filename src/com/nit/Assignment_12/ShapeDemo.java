package com.nit.Assignment_12;

public class ShapeDemo {

	public static void main(String[] args) {
		for (int i=0; i<5;i++) {
			System.out.println((i+1));
		
		Shape shape = Shape.randshape();
		shape.draw();
		shape.erase();
		}
	}

}
