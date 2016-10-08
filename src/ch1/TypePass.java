package ch1;
/*
 * Class: TypePass
 * - tests which method is used based on the type of the parameter passed
 * 
 * @author  D.J. Fabozzi
 * @version 1.0
 * @since   2016-10-07
 */
public class TypePass {

	public static void go(Long l) { System.out.println("return: Long");	}
	public static void go(byte b) { System.out.println("byte: " + b); }
	public static void go(Integer I) { System.out.println("Integer: " + I);	}
	public static void go(Short s) {  System.out.println("return: Short"); }
	public static void go(long i) { System.out.println("return: long " + i); }
	public static void go(Number n) { System.out.println("return: number");	}
//	public static void go(int x) { System.out.println("int: " + x);	}  
	
	public static void main(String[] args) {
		    Short s2 = 2;   long a2 = 5;    Long l2 = 10l;
		    int []x[]; Integer a1 = 6;  int a3 = 4;
//		    go(a2); // Long   
//		    go(s2); // Number
//		    go(l2); // number
//		    go(a1); // number
		    go(a3); // long
	}
}
