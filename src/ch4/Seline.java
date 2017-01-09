package ch4;
/*
 * Class: Monk
 * Summary: Tests Long, concatenation
 * Questions:
 * - will it print 7 + 2 or 9?  7,2
 * - why? // treats the 7 and 2 as strings
 * 
 * @version: 1.0
 * @since: 1/8/2017
 */
public class Seline {

	public static void main(String[] args) {
		Long x = 42L;
		Long y = 44L; 
		System.out.println(" " + 7 + 2 + " ");
		System.out.println(foo() + x + 5 + " ");
		System.out.println(x + y + foo());
	}
	static String foo() { return "foo"; }

}
