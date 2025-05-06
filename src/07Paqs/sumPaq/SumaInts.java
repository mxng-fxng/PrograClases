import stdlib.StdIn;

public class SumaInts 
{
  /* Sumar n números de la entrada estándar */
  public static int suma (int n) 
  { 
    int sum = 0;
    for (int i = 1; i <= n; i++) 
	  {
      int k = StdIn.readInt();
      sum += k;
    }
    return sum;
  }
  
  public static void main (String[] args) 
  { 
    int n = Integer.parseInt(args[0]);
    System.out.println("suma(n) = " + suma(n));    
  }
}
