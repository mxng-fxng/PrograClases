/**
 * Excepciones al dividir por cero.
 * Ejemplo de excepciones comprobadas (con MalOperando).
 * 
 * 1. Dejando que se propague sin control.
 * 2. Manejando la excepción y elevandola de nuevo
 * 3. Manejandola en el main(). En codigo comentado
 * 
 * @since 26/4/2016  
 * @version 1.0
 * @version 1.1   JGF  29/04/2020  
 * - Cambiados nombres y mensajes.
 * - Cambiados comentarios.
 * 
 * @author JMB
 */
class DivisionComprob 
{
  static int divide (int dividendo, int divisor) throws MalOperando
  {
    int cociente;
    System.out.println("divide: antes de hacer la división.");
    if (divisor == 0)
      throw new MalOperando("El divisor es 0");
    else
      cociente = dividendo / divisor;
    System.out.println("divide: después de hacer la división.");
    return cociente;
  }
  static void aDividir3 (int x, int y) throws MalOperando
  {
    System.out.println("aDividir3: antes de llamar a divide");
    int division = divide(x, y);
    System.out.println("aDividir3: resultado = " + division);
  }
  static void aDividir4 (int x, int y) throws MalOperando
  {
    try
    {
      System.out.println("aDividir4: antes de llamar a divide");
      int division = divide(x, y);
      System.out.println("aDividir4: resultado = " + division);
    }
    catch (MalOperando e)
    {
      System.out.println("aDividir4: detectada excepción: " + e);
      System.out.println("aDividir4: resultado = infinito");
//      throw new MalOperando ("Division por 0");
    }
    finally
    {
      System.out.println("aDividir4: " +
                         " dividendo: " + x + " divisor: " + y);
    }
  }
  public static void main (String[] args) throws MalOperando
  {
    int numero1 = 2;
    int numero2 = 0;
    System.out.println("main: antes de aDividir");
    /*
     Ejecutar 1, 2 y 3 en exclusión: 1 | 2 | 3 
     */
    /*
     1. aDividir3 sin tratamiento        
     (destapar el "throws MalOperando" del main)
     */
//        aDividir3(numero1, numero2);
    /*
     2. aDividir3 y con tratamiento en el main
     */
//    try
//    {
//      aDividir3(numero1,numero2);
//    }
//    catch (MalOperando e)
//    {
//      System.out.println("main: detectada excepción: " + e);
//      System.out.println("main: resultado = infinito");
////      e.printStackTrace();
//    }
    /*
     3. aDividir4, que incluye el tratamiento y 
     no se hace tratamiento en el main. 
     (destapar el "throws MalOperando" del main)
     */
      aDividir4(numero1,numero2);
      System.out.println("En main(). Después de aDividir()");
  }
}