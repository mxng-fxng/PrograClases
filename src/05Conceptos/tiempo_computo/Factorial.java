/** 
 * Medida del tiempo de ejecución
 */
class Factorial
{
  static long fact (int n) 
  {  
    long res = 1;
    for (int i=1; i<=n; i+=1)
      res *= i;
    return res; 
  }  
  static long factR (int n) 
  { 
    if (n == 0)  
      return 1;
    else
      return n * factR(n-1);
  }  
  public static void main (String[] args) 
  {
    int n = 20;
    Crono c = new Crono();
    System.out.println("fact(n) = " + fact(n));
    double tFact = c.tiempo();
   
    c = new Crono();
    System.out.println("factR(n) = " + factR(n));
    double tFactR = c.tiempo();
    
    System.out.println("Tiempo fact: " + tFact);
    System.out.println("Tiempo factR: " + tFactR);
  }  
}
