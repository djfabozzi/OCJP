package ch3;
/*
 * Class: Tester
 * 
 * Questions: how many objects are eligible for GC?
 * 
 * @version: 1.0
 * @since: 10/31/2016
 */
class Beta {}
class Alpha {
  static Beta b1;
  Beta b2;
}
public class Tester {
  public static void main(String[] args)  {
    Beta b1 = new Beta(); //1
    Beta b2 = new Beta(); //2
    Alpha a1 = new Alpha(); //3
    Alpha a2 = new Alpha(); //4
    a1.b1 = b1; // assign a static reference var to an object, no new object
    a1.b2 = b1; // no new object
    a1 = null; //1 gc
    b1 = null; //2 gc
    b2 = null;
  }

}
