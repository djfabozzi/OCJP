package ch3;
/*
 * Class: Mixer
 * 
 * Summary: 
 * This is a complicated sequence to track object assignments
 * 
 * Questions:
 * - What happens when you create a reference variable to a contained object which hasn't been instantiated?  
 * - ans: you can create the reference, but don't try runn a method from it, null pointer exception
 * @version: 1.0
 * @since:  10/29/2016
 */

public class Mixer {
	Mixer() { }
	Mixer(Mixer m) { m1 = m; }
	Mixer m1;
	public static void main(String[] args) {
		Mixer m2 = new Mixer();
		Mixer m3 = new Mixer(m2); // the class contains a reference variable of the type of the class
		m3.go();
		Mixer m4 = m3.m1; //creating a new reference var to the contained object 
		m4.go(); 
		Mixer m5 = m2.m1; //
//		m5.go();
	}
	void go() { System.out.print("hi "); }
}
