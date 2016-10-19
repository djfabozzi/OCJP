/**
 * 
 */
package ch2;

/**Class: SubSubAlpha
 * 
 * Summary: 
 * - s can be declared in the static block because that's the first thing executed
 * 
 * Questions: 
 * - what is the output: 
 * 	1. " subsub alpha"
 *  2. run time error
 *  3. " alpha subsub"
 *  
 *  - can s be declared in the Alpha constructor?
 * 
 * @version: 1.0
 * @since: 10/18/2016
 *
 */
class Alpha {
	static String s = " ";
	protected Alpha() {s += "alpha "; }
}
class SubAlpha extends Alpha {
	private SubAlpha() { s += "sub "; }
}
public class SubSubAlpha extends Alpha{
	private SubSubAlpha() { s += "subsub "; }
	public static void main(String[] args) {
		new SubSubAlpha();
		System.out.println(s);

	}

}
