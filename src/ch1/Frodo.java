package ch1;
/*
 * Class: Frodo
 * Tests which method is called, static vs overridden
 * 
 * Questions: 
 *  - can the static method hide an instance method?
 *  - do static methods override?
 * 
 * @author  D.J. Fabozzi
 * @version 1.0
 * @since   2016-10-05
 */
class Hobbit
{
	public static int countSilver(int x, int y) { return x + x; }
	int countGold(int x, int y) { return x + y; }
}
public class Frodo extends Hobbit
{
   public static int countSilver(int x, int y) { return y + y; }
  
// will this compile?
//  public static int countGold(int x , int y) { return x + x; }
  
  public int countGold(int x, int y) {
	  return x - y; 
  }

  public static void main(String[] args)
  {
    Frodo f = new Frodo();
    System.out.println("instance method: " + f.countGold(7, 6));
    System.out.println("static method: " + countSilver(7,6));
  }

}
