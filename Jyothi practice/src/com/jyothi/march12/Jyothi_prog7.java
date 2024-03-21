package com.jyothi.march12;
/*Nested Interface: Define an interface Shape with a nested interface Drawable. The Drawable interface should have a method draw() 
 * that takes no parameters and returns void. Implement the Shape interface with classes Circle and Rectangle. 
 * Implement the Drawable interface within these classes to provide specific implementations for the draw() method. Write a program 
 * to demonstrate the use of these interfaces and classes by creating objects of Circle and Rectangle and invoking their draw() methods.
 */
interface shape{
	interface drawable{
		void draw();
	}
	class Circle implements drawable{
		@Override
		public void draw() {
			System.out.println("Drawing a circle");
		}
	}
	class Rectangle implements drawable{
		@Override
		public void draw() {
			System.out.println("Drawing a Rectangle");
		}
	}
}
public class Jyothi_prog7 implements shape{
	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		Rectangle r=new Rectangle();
		r.draw();
	}
}
