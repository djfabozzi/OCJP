package ch5;
/*
 * Class: Wind
 * Summary:
 * - labeled break
 * 	j	k	
 *  0	0
 *  1	0	
 *  1	1   
 * Questions:
 *  
 * @version: 1.0
 * @since: 1/14/2017
 */
public class Wind
{
  public static void main(String[] args)
  {
  foreach:
  for (int j=0; j<5; j++) {
    for (int k=0;k<3;k++) {
      System.out.print(" " + j);
      if (j==3 & k==1) break foreach;
      if (j==0 || j==2) break;
    }
  }
  }

}
