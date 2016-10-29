package ch3;
/*
 * Class: Hawk
 * 
 * Summary: invocation order example
 * 
 * Questions:
 * - what happens there isn't a public class?  ans: won't run
 * - what is the expected output?
 * - r1 static middle
 * - r4 static middle 
 * - pre instance bottom
 * - b1 instance top
 * - b2 constructor top
 * - r3 instance middle
 * - r2 constructor middle
 * - hawk instance bottom
 * 
 * @version: 1.0 
 * @since: 10/29/2016
 */

class Bird {
{ System.out.print("b1 "); }
	public Bird() { System.out.print("b2 "); }
}
class Raptor extends Bird
{
  static { System.out.print("r1 "); }
  public Raptor() { System.out.print("r2 "); }
  { System.out.print("r3 "); }
  static { System.out.print("r4 "); }

}
class Hawk extends Raptor {
	public static void main(String[] args) {
		System.out.print("pre ");
		new Hawk();
		System.out.println("hawk ");
	}
}
