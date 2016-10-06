package ch1;
/*
 * /**
* TestDays prints the contents of an enum and copies the contents to an array.
*
* @author  D.J. Fabozzi
* @version 1.0
* @since   2016-10-05
*/ 

public class TestDays {
	
	public enum Days { MON, TUE, WED };
	
	public static void main(String[] args) {
		for(Days d : Days.values() )
		 System.out.println("enum days: " + d);
		Days [] d2 = Days.values();
		System.out.println(d2[2]);
	}

}
