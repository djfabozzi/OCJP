package ch1;

/* 
  file: ch1.
 	objective: 
 	file has 2 nested abstract classes, a concrete class, and an interface
 	the task is to verify that interface contracts are met through the inheritence 

 	Electronic implements the doIt() contract correctly from Device
 	Phone1 doesn't need to implement doIT because Electronic already has.
	Phone2 is creating a new doIt(int x) which is a legal override.
	Phone3 is extending Electronic which has a concrete implementation of 
	of doIt(). 

	Questions:
	Phone2 has a concrete implementation of doIt() but the class is abstract.
	Even though Phone2 is abstract, can it have a concrete method?
	  	- yes. Abstract classes can have concrete methods.  
	Can you instantiate Phone2()?
		- no.  Phone2 is abstract
*/

public class Electronic implements Device
{  
	public void doIt() {} 
	public static void main(String[] args) {
	}
}

interface Device
{  public void doIt(); }

abstract class Phone1 extends Electronic
{ }

abstract class Phone2 extends Electronic
{   public void doIt(int x) {} }

class Phone3 extends Electronic implements Device
{   public void doStuff(String y) {}  }