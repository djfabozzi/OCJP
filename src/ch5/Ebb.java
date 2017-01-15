package ch5;
/*
 * Class: Ebb
 * Summary: tests use of statics
 * 	- iterations: 
 * 		y		x		s
 * 		0		9		
 * 		0		10		10
 * 		1		11		10 d 13
 * 		2		12		10 d 13 d 13
 * Questions:
 *  - what happens after a match?  All subsequent cases are run (unless there's a break)
 * @version: 1.0
 * @since: 1/14/2017
 */
public class Ebb
{
  static Integer z;
  static int x = 7; 
  public static void main(String[] args)
  {
    String s = "";
    x++;	//9
    for (int y=0; y < 3; y++) {
      x++; //10
      switch(x) {
        case 8: s += "8 "; 
        case 9: s += "9 ";
        case 10: { s += "10 "; break; }
        default: s += "d ";
        case 13: s += "13 ";
      }
    }
    System.out.println(s);
  }
  static { x++; } //8
}
