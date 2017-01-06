package ch4;

/*
 * Class: Twisty
 * Summary: Tests array instantiation and increment operator
 * Questions:
 * - is the first dimension the row or column?
 *
 * @version: 1.0
 * @since: 1/5/2017
 */

public class Twisty
{
  { index = 1; }
  int index; 
  public static void main(String[] args)
  {
    new Twisty().go();
  }
  void go() {
    int [][] dd = {{9,8,7}, {6,5,4}, {3,2,1,0}};
    System.out.println(dd[index++][index++]);  // should be 4
  }
}
