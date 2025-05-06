/**
 * Intercambio entre tipos básicos
 */

import java.util.Arrays;
 
class Swap
{
       
  static void swap (double a, double b) 
  {
    double t = a;
    a = b;
    b = t;
  }
   
  static void swap (int i, int j, double[] a) 
  {
    double t = a[i];
    a[i] = a[j];
    a[j] = t;
  }
  
  public static void main (String[] args)
  {
    // 1
    // double x = 5;
    // double y = 7;
    // swap(x, y);
    // System.out.println("x = " + x);
    // System.out.println("y = " + y);
       
    // 2
    // double[] a = {3, 5, 7};
    // swap(a[0], a[2]);
    // System.out.println("a = " + Arrays.toString(a));
    
    // 3
    double[] a = {3, 5, 7};
    swap(0, 2, a);
    System.out.println("a = " + Arrays.toString(a));
  }

}