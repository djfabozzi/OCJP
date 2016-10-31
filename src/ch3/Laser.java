package ch3;

/*
 * Class: Laser
 * 
 * Summary: 
 * 
 * @version: 1.0
 * @since: 10/31/2016
 */

class Box {
  int size;
  Box(int s) { size = s;}
}
public class Laser
{
  public static void main(String[] args)
  {
	  Box b1 = new Box(5);
	   Box[] ba = go(b1, new Box(6));
	   ba[0] = b1;
	   for(Box b : ba) System.out.print(b.size + " ");
  }
  static Box[] go(Box b1, Box b2) {
	   b1.size = 4;
	   Box[] ma = {b2, b1};
	   return ma;
	   }

}
