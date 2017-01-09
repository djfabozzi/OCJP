package ch4;
/*
 * Class: McDonalds
 * Summary: 
 * Questions:
 *  what the output? // same old, the loop exits at "Th" before the 
 *  // F sets it.  Since d1 is already Th, 
 
 * @version: 1.0
 * @since: 1/8/2017
 */
public class McDonalds {

	public static void main(String[] args) {
		Days d1 = Days.TH;
		Days d2 = Days.M;
		for (Days d: Days.values()) {
			if (d.equals(Days.F)) break; 
			d2 = d; 
		}
		System.out.println((d1 == d2)?"same old" : "newly new");
	}
	enum Days {M, T, W, TH, F, SA, SU};
}
