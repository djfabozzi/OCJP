package ch4;

public class SpecialOps {
  public static void main(String[] args)  {
    String s = "";
    Boolean b1 = true; 
    boolean b2 = false;
    boolean i;
    if (i = false) System.out.println("yo");
    // i is set, not compared, only true if set to true
    if ((b2 = false) | (21%5) > 2) s += "x";
    // b2 is set but set to false
    if (b1 || (b2 == true)) s += "y";
    // b1 is unwrapped/true, shortcut or, s = y
    if (b2 == true)         s += "z";
    // b2 is false, s = y
    System.out.println(s);
  }
}
