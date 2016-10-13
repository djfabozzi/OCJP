package ch2;
/*
 * Class: Redwood.java
 * 
 * Summary: tests downcasting and upcasting
 * 
 * Questions: 
 * 1. What will the code do? (run, compile error, RTE)
 * ans: RTE, java.lang.ClassCastException
 * 2. Are the casts in lines 33 and 38 legal?
 * ans: cannot simply downcast a Tree to a Redwood
 *  
 * 
 * @author  D.J. Fabozzi II
 * @version 1.0
 * @since   2016-10-13
 * 
 */
class Tree { }

public class Redwood extends Tree
{

  public static void main(String[] args)
  {
    new Redwood().go();
  }
  
  void go() {
	// passes a Tree to a Tree, and a Redwood to a Redwood
    go2(new Tree(), new Redwood());
    // is the following legal? ans: no
    go2((Redwood) new Tree(), new Redwood());    
  }
  
  void go2(Tree t1, Redwood r1){
	// downcasts the tree to a Redwood.  Is this legal? ans: no
    Redwood r2 = (Redwood)t1;
    // upcasts the Redwood to a Tree.  Is this legal?  ans: yes
    Tree t2 = (Tree)r1;
  }

}
