package ch5;
/*
 * Class: Frisbee
 * Summary: tests exceptions

 * Questions:
 *  - will a divide by 0 be caught at compile time? no
 *  - will a "throws" in main catch the divide by zero?  no
 * @version: 1.0
 * @since: 1/14/2017
 */
import java.io.IOException;

public class Frisbee
{
  public static void main(String[] args) {
	  try {
      int x = 0;
      System.out.println(7/x);
	  }
      catch (Exception e) {
    	  System.out.println("caught");
      }
  }

}
