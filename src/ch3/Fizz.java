package ch3;

/*
 * Class: Fizz
 * 
 * Summary: 
 * - contains a static method which returns a new reference, after the member variable has changed
 * - shows how when two reference vars point to the same object, when one changes, the other changes
 * 
 * Questions: 
 * - what happens when you assign a final reference variable to another object? (compiler error)
 * 
 * @version: 1.0
 * @since: 10/29/2016
 */

public class Fizz {
  int x = 5;
  public static void main(String[] args)   {
    final Fizz f0; 
    final Fizz f1 = new Fizz();
    Fizz f2 = new Fizz();
    f0 = f2; // ok.  f0 hasn't been assigned yet
//    f0 = f1; // compiler error 
    Fizz f3 = FizzSwitch(f1,f2);
    // f3 is now referencing f1
    // because f3 and f1 point to the same object, f1 changes when
    // f3 changes. f1.x = 6 and f3.x = 6
    System.out.println((f1==f3) + " " + (f1.x == f3.x));
  }
  static Fizz FizzSwitch(Fizz x, Fizz y) {
    final Fizz z = x;
    z.x = 6;
    return z;
  }
}
