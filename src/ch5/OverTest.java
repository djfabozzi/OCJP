package ch5;
/*
 * Class: Frisbee
 * Summary: tests passing types.
 *  - method doStuff() is overridden    

 * Questions:
 *  - how is the method determined? the argument
 *  - is this overloaded or overridden?  overridden
 *  - what happens if both?  determined by the Object
 *  
 * @version: 1.0
 * @since: 1/14/2017
 */
class Big {
  void doStuff(int x) {
	  System.out.println("big");
  }
}
class Heavy extends Big {
  void doStuff(byte b) {
	  System.out.println("Heavy");
  }
}
public class OverTest extends Heavy
{
  int doStuff(short x) {
	  System.out.println("Overtest");
	  return 7;
	  }
  void doStuff(int i) {
	  System.out.println("Overtest int");
  }
  public static void main(String[] args) {
	  byte n = 10;
	  int i = 20;
	  short s = 2; 
	  OverTest ot = new OverTest(); 
	  ot.doStuff(i);
  }
}
