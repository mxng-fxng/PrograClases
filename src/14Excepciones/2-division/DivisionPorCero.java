/**
 * Excepciones al dividir por cero.
 * Ejemplo de excepciones no comprobadas (RuntimeException).
 * 
 * 1. divide - lanzamiento de excepción ArithmeticException y dejando 
 *    el control a java.
 * 2. aDividir1 - lanzamiento y propagación de excepción ArithmeticException, 
 *    dejando el control a java.
 * 3. aDividir2 - tratamiento de la excepción ArithmeticException.
 */
class DivisionPorCero
{
  private static int divide (int a, int b) //throws ArithmeticException
  {
    System.out.println("divide: antes de hacer la división.");
    int cociente = a/b;
    System.out.println("divide: después de hacer la división.");
    return cociente;
  }
  private static void aDividir1 (int x, int y) //throws ArithmeticException
  {
    System.out.println("aDividir1: antes de llamar a divide");
    int division = divide(x, y);
    System.out.println("aDividir1: resultado = " + division);
  }
  private static void aDividir2 (int x, int y)
  {
    try
    {
      System.out.println("aDividir2: antes de llamar a divide");
      int division = divide(x, y);
      System.out.println("aDividir2: resultado = " + division);
    }
    catch (ArithmeticException e)
    {
      System.out.println("aDividir2: capturada excepción: " + e);
    }
    finally
    {
      System.out.println("aDividir2: " +
                         "dividendo: " + x + " divisor: " + y);
    }
  }
  
  public static void main (String[] args)
  {
    int numero1 = 2;
    int numero2 = 0;
    //Ejecutar 1, 2 y 3 en exclusión: 1 | 2 | 3
    //1. divide - lanzamiento de excepción
//    System.out.println("main: antes de llamar a divide");
//    System.out.println("divide(numero1, numero2) = " + 
//                       divide(numero1, numero2));
//    System.out.println("main: después de llamar a divide");
    //
    //2. aDividir1 - propagación de excepción
    System.out.println("main: antes de llamar a aDividir1");
    aDividir1(numero1, numero2);
    System.out.println("main: después de llamar a aDividir1");
    //
    //3. aDividir2 - tratamiento de excepción
//    System.out.println("main: antes de llamar a aDividir2");
//    aDividir2(numero1, numero2);
//    System.out.println("main: después de llamar a aDividir2");
    //
  }
  
}