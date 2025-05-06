import stdlib.*;

public class SumaInput
{ 
  public static void main (String[] args) 
  { 
    int n = Integer.parseInt(args[0]);
    int suma = 0;
    for (int i = 1; i <= n; i++) 
	  {
      int num = StdIn.readInt();
      suma += num;
    }
    System.out.println("La suma es = " + suma);
  }
}
