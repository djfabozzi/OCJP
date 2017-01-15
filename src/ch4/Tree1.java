package ch4;

/*
 * Class: Tree1
 * Summary: instanceof
 * Questions:
 *   - does instanceof test for interfaces? yes
 *   - does b2 implement both Vessel and Toy?
 * @version: 1.0
 * @since: 1/14/2017
 */

interface Vessel {}
interface Toy {}
class Boat implements Vessel {}
class Speedboat extends Boat implements Toy{}
    
public class Tree1
{

  public static void main(String[] args)
  {
    String s = "0";
    Boat b = new Boat();
    Boat b2 = new Speedboat(); 
    Speedboat s2 = new Speedboat();
    if (( b instanceof Vessel) && (b2 instanceof Toy)) s += "1"; //01
    if (( s2 instanceof Vessel) && (s2 instanceof Toy)) s += "2"; //012
    if (b2 instanceof Vessel) System.out.println("part of Vessel");
    System.out.println(s);
  }

}
