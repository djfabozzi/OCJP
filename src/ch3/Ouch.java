package ch3;
/*
 * Class: Ouch 
 * Summary: 
 * - a class static var is also used in a local method var as well as a for loop
 * 
 * Questions: 
 * - can you use "ouch" as the for loop var? (no because it's already used in go())
 * - why can you use "ouch" as both the class static var and the method go?
 * (because 1 belongs to the class, the other belongs to the object)
 * - what happens if you change the static var ouch to an object var?
 * (compilation error.  Cannot make a static reference to the non-static field.
 *  bacause we're trying to pass ouch rather than new Ouch().ouch )
 * is int ouch = 7; the same as {int ouch = 7;}
 * (no)
 * 
 * 
 * @version: 1.0
 * @since: 10/30/2016
 * 
 */
public class Ouch {
	static int ouch = 7;
	public static void main(String[] args) {
//		new Ouch().go(new Ouch().ouch); // use when ouch becomes an object var
		new Ouch().go(ouch);
	}
	
	void go(int ouch1) {
		ouch1++;
		for(int ouch = 3; ouch < 6; ouch++)
			;
		System.out.print(" " + ouch);
	}
}
