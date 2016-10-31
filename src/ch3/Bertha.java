package ch3;
/*
 * Class: Bertha
 * Summary: method selection based on signature 
 * Questions: 
 * 
 * @version: 1.0
 * @since: 10/30/2016
 * 
 */

public class Bertha {
  public static void main(String[] args)  {
    int x = 4; Boolean y = true; short[] sa = {1,2,3}; byte b = 10;
    boolean j = true; Byte b1 = new Byte("10");
    
    doStuff(x,y); // int will box but Boolean will only widen to an Object
    // output: Object var-arg
    doStuff(x); // will autobox and widen to Number
    // a number is less wide than an Object
    // output: Number
    doStuff(x,x); // 
    // output: Integer var-arg
    doStuff(b); // box to Byte, then widen to Number
    // output: Number
    doStuff(sa,sa);
    // output: Object var-arg
    doStuff(j); // output: Object
    doStuff(y); // output: Object
    doStuff(b1); // output: Number
  }
  static void doStuff(Object o) {System.out.println("Object: ");}
  static void doStuff(Object... o) {System.out.println("Object var-arg ");}
  static void doStuff(Integer... i) {System.out.println("Integer var-arg" + i);}
  static void doStuff(Long L) {System.out.println("Long " + L);}
  static void doStuff(Number n) {System.out.println("Number: " + n);}
}
