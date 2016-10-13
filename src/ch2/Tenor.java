package ch2;
/*
 * Class: Tenor
 * 
 * Summary: tests override functionality for static methods
 * 
 * Questions: 
 * note that "s" is a Singer reference variable to a Tenor object.
 * Which method will be invoked? ans: the reference variable (fa la)
 * What would happen if the methods weren't static? ans: the object method (fa fa)
 * 
 * @author  D.J. Fabozzi II
 * @version 1.0
 * @since   2016-10-13
 * 
 */
class Singer { public static String sing() { return "la"; } }

public class Tenor extends Singer {
	public static String sing() { return "fa"; }
	public static void main(String[] args) {
		Tenor t = new Tenor();
		Singer s = new Tenor();
		System.out.println(t.sing() + " " + s.sing());
	}

}
