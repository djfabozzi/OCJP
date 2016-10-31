package ch3;
/*
 * Class: Eggs
 * Summary: 
 * Questions: 
 * - How many objects are created?
 * - How many objects are eligible for GC?
 * 
 * @version: 1.0
 * @since: 10/31/2016
 */

class Dozens {
	int[] dz = {1,2,3,4,5,6,7,8,9,10,11,12};
 }

public class Eggs {
	public static void main(String[] args) {
		 Dozens [] da = new Dozens[3]; //3
		 da[0] = new Dozens(); //4
		 Dozens d = new Dozens(); //5
		 da[1] = d; 
		 d = null; 				//1 GC
		 da[1] = null;			//2 GC
		 // do stuff
	}
}
