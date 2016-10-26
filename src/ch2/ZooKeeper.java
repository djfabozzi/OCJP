package ch2;
/*
 * Class: ZooKeeper
 * 
 * Summary: 
 * - creating a parent reference var to the child
 * 
 * Questions: 
 * - if both the parent and the child have methods with the same signature, which one is invoked?
 * - what determines the method?  (object type)
 * - what determines the variable?  (reference variable)
 * 
 * @version: 1.0
 * @since: 10/25/2016
 */
class Mammal {
	String name = "furry ";
	String makeNoise() { return "generic noise"; }
}

class Zebra extends Mammal {
	String name = "stripes ";
	String makeNoise() { return "bray"; }
}

public class ZooKeeper {

	public static void main(String[] args) {
		new ZooKeeper().go();

	}
	void go() {
		Mammal m = new Zebra();
		System.out.println(m.name + m.makeNoise());
		}

}
