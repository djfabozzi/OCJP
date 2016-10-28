package ch3;
/*
 * Class: Dims 
 * 
 * Summary:
 *  - we're creating an Object reference variable to a 2D array. 
 * 
 * Questions:
 * - what does a2 print? (3)
 * - what happens when we cast of a 2Dint->Object->2Dint?  (2Dint)
 * -  
 * 
 * @version 1.0
 * @since 2016-10-27
 */

public class Dims {
  public static void main(String[] args)  {
    int[][] a = {{1,2},{3,4}};
    int[] b = (int[]) a[1];
    Object o1 = a;
    int[][]a2 = (int[][]) o1;
//    int[] b2 = (int[])o1; // cannot dimension the o1
    System.out.println("a2: " + a2[1][0]);  
    
    Object myObj = new String[]{"one","two","three"};
    for (String s: (String[])myObj) System.out.print(s + ".");
    // prints one.two.three
    Integer[][] la = {{1,2}, {3,4,5}};
    Number[] na = la[1]; // Super ref to sub
//    System.out.println("\n");
    System.out.println("na: " + na[0]);
    
    Number[] na2 = (Number[])la[0];
    System.out.println("na2: " + na2[0]);
    Object o = na2; //Object reference to a 1-D poly
//    la[1] = o; // Wrapper array can hold anything that IS-A, a number (or Object) isn't 
    // an IS-A so compilation error
    System.out.println("array: "+ la[0][0]);
    la[0] = (Integer[])o;
  }
}
