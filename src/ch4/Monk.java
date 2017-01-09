package ch4;

public class Monk {
/*
 * Class: Monk
 * Summary: Tests args.length
 * Questions:
 * - what is args[0]?
 * 
 * @version: 1.0
 * @since: 1/8/2017
 */

	public static void main(String[] args) {
		if (args.length == 1 | args[0].equals("test")) {
			System.out.println("test case");
		} else {
			System.out.println("production " + args[0]);
		}
	}

}
