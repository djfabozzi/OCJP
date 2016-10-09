package ch2;
/*
 * File: Frob.java
 * Summary: Example to test what can implement an abstract interface?
 *  
 * Questions: 
 * - can an abstract class implement an abstract interface?
 * - can an abstract class extend an abstract interface?  No
 * - can you override an interface method? no
 * - can you overload an interface method?  yes
 * @author  D.J. Fabozzi
 * @version 1.0
 * @since   2016-10-09
 */
abstract interface Frobnicate {
	 public void twiddle(String s);
}
public class Frob implements Frobnicate
{
  public void twiddle(String i) {  }
  public void twiddle(Integer s) { }
}
