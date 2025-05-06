/**
 */
import stdlib.StdIn;

public class Ficheros
{
  final static int D = 100;
  
  public static String[] leer () 
  {
    String[] lineas = new String[D];
    int i = 0;
    while (!StdIn.isEmpty())
    {  
      lineas[i] = StdIn.readLine();
      i += 1;
    }   
    return lineas;
  }
  public static void escribir (String[] lineas) 
  {
    int i = 0;
    while (i < D && lineas[i] != null)
    {  
      System.out.println(lineas[i]);
      i += 1;
    }   
  }
  public static void numLineas (String[] lineas) 
  {
    int i = 0;
    while (i < D && lineas[i] != null)
    {  
      System.out.printf("%2s %s\n", i+1, lineas[i]);
      i += 1;
    }   
  }
  public static void main (String[] args) 
  {
    String[] lineas = leer();
    // escribir(lineas);
    numLineas(lineas);    
  }
}