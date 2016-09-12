package assignments;

/*
 * File: Dims.java
 * Description: tests various Java array configurations
 * 
 * 
 */

public class Dims {
  public static void main(String[] args)  {
    int[][] a = {{1,2},{3,4}};
    int[] b = (int[]) a[1];
    Object o1 = a;
    int[][]a2 = (int[][]) o1;
//    int[] b2 = (int[])o1; // cannot dimension the o1

    System.out.println(" b: " + b[0]);  // b creates an 
    
    System.out.println(a2[1][0]); // prints 3
    
    Object myObj = new String[]{"one","two","three"};
    for (String s: (String[])myObj) System.out.print(s + ".");
    // prints one.two.three
    Integer[][] la = {{1,2}, {3,4,5}};
    Number[] na = la[1]; // Super ref to sub
    Number[] na2 = (Number[])la[0]; // same thing
    Object o = na2; //Object reference to a 1-D poly
//    la[1] = o; // Wrapper array can hold anything that IS-A, a number (or Object) isn't 
    // an IS-A so compilation error
    System.out.println("\n array: "+ la[1]);
    la[0] = (Integer[])o;
  }
}

