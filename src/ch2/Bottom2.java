package ch2;

/* 
 * Class: Bottom2
*
* Summary: 
* - we're looking at inheritance and the use of the static block.  
* - remember that the order of events is
* 1. super static block
* 2. sub static block
* 3. super instance block
* 4. super constructor
* 5. sub instance block
* 6. sub constructor
* 7. sub action 
*
* Questions: 
*
* @author  	D.J. Fabozzi II
* @version 	1.0
* @since	2016-10-16
*/

class Top {
  static {
    System.out.println("super static block");}
  { System.out.println(" super instance block"); }
  
  public Top (String s) {System.out.print(" super arg constructor"); }
  public Top () {System.out.println("super no arg constructor"); }
  {System.out.println(" super instance block #2"); }
}

public class Bottom2 extends Top {
  Bottom2() {System.out.println("sub no arg constructor");}
  public Bottom2(String s) {
//    super(s);
    this();
    System.out.println("sub arg constructor"); 
    } 
  public static void main(String[] args)  {
    new Bottom2("C");
    System.out.println(" main block");   
  }
}
