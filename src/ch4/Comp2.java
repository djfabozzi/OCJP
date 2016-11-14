package ch4; 

/*
 * Class: Comp2
 * Summary: tests equality of types
 * Questions:
 * - how do you define a float, distinquish it from a double? (f after the #)
 * - same as a long? (L after the #)
 * - is a 42L == to a 42f? (yes)
 * - what is f1[1,1] (compilation error, it's [1][1])
 * - when you compare two arrays which have the same contents but different dimensions, are they equal? (no)
 * @version: 1.0
 * @since: 11/13/2016
 */

public class Comp2 {
  public static void main(String[] args)  {
	  // define some floats: 
    float f1 = 2.3f;
    float[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.73f}};
    float[] f3 = {2.7f}; // need the f
    float[] f4 = {42.0f}; // need the f
    byte b1 = 42; 
    Long x = 42L; // the L is needed here otherwise will not compile
//    if (f1 == f2) //cannot compare a primitive and an array
    if (f1 == f2[2][1]) // ok but no match 
      System.out.println("yo " + f2[2][1]); //output: 2.6
    if (x == f2[0][0]) System.out.println("long match");
    //match, the Long unwraps, matches the float
    if (f1 == f2[1][1]) // crap
    	System.out.println("f1 match: " + f2[1][1]);
    if (f3 == f2[2])
    	System.out.println("array match 1! "); 
     // f2[2] is {2.6f, 2.7}
     if (f4 == f2[0]) //COMPARE ARRAYS
       System.out.println("array match 2! ");
     // the contents are the same but the array objects don't match 
     else {
    	System.out.println("f4: " + f4[0]);
     	System.out.println("f2[0]: " + f2[0][0]);
     }
  }
}
