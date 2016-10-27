package ch2;
/*
 * Class: ComingThru
 * 
 * Summary: 
 * - Example of which method selected based on the signature selection
 * - Also a good example of the use of a static.  
 * 
 * Questions:
 * - which has preference, a var-arg or non-var-arg?, Object? (non, object, var-arg)
 * - what is the expected output? (-434)
 * - can you pass an array of objects to a var-args array of objects? (yes)
 * 
 * @version 1.0
 * @since 2016-10-26
 */

class A { }
class B extends A { }
public class ComingThru {
	static String s = "-";
 public static void main(String[] args) {
 A[] aa = new A[2];
 B[] ba = new B[2];
 sifter(aa);
 sifter(ba);
 sifter(7);
 System.out.println(s);
 }
 static void sifter(A[]... a2) { s += "1"; }
 static void sifter(B[]... b1) { s += "2"; }
 static void sifter(B[] b1) { s += "3"; }
 static void sifter(Object o) { s += "4"; }
}