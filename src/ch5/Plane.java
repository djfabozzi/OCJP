package ch5;
/*
 * Class: Plane
 * Summary:
 * s
 * -22bc   

 * Questions:
 * - once s2 throws the exception after calling s3, what happens? s2 exits also
 *  
 * @version: 1.0
 * @since: 1/14/2017
 */
public class Plane
{
  static String s = "-";
  
  void s1() {
    try { s2(); }
    catch (Exception e) {s += "c";}
  }
  void s2() throws Exception{
    s3(); s += "2";
    s3(); s += "2b";
  }
  void s3() throws Exception {
    throw new Exception();
  }
  public static void main(String[] args)
  {
    new Plane().s1();
    System.out.println(s);
  }

}
