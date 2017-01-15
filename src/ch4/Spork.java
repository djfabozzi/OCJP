package ch4;
/*
 * Class: Spork
 * Summary: tests logicals, exclusive or, short circuit or
 * Questions:
 *   what is ^ ? 
 * @version: 1.0
 * @since: 1/14/2017
 */
public class Spork {

	public static void main(String[] args) {
		int mask = 0; 
		int count = 0; 
		if ( (( 5 < 7) || (++count  < 10)) | mask++ < 10) mask = mask + 1; //mask = 2
		if ( (6 < 8) ^ false) mask = mask + 10; // mask = 12
		if ( !(mask > 1) && ++count > 1 ) mask = mask + 100;  // count= 0
		System.out.println(mask + " " + count); // 12 0
	}

}
