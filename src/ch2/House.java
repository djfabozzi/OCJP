package ch2;
/*
 * Class: House 
 * 
 * Summary: 
 * - demonstrates inheritence and constructor action
 * 
 * Questions
 * 1. What is the expected output?
 * b h hn x
 * 
 * 2. Does Building(String name) ever get called?  No because House(String name) calls 
 * this() instead of super(name).
 * 
 * @version: 1.0
 * @since: 10/19/2016
 * 
 */
class Building {
	Building() { System.out.print("b "); }
	Building(String name) {
		this(); System.out.print("bn " + name);
	}
}
public class House extends Building {
	House() { System.out.print("h "); }
	House(String name) {
		this(); System.out.print("hn " + name);

	}
	public static void main(String[] args) {
		new House("x ");

	}

}
