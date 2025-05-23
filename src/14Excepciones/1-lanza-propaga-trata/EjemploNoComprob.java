/**
 * Excepciones.
 */
class EjemploNoComprob
{
  static void lanza (int x) throws IllegalArgumentException
  {
    System.out.println("lanza: antes.");
    if (x < 0) throw new IllegalArgumentException();
    System.out.println("lanza: despu�s.");
  }
  static void propaga () throws IllegalArgumentException
  {
    System.out.println("propaga: antes. ");
    lanza(-1);
    System.out.println("propaga: despues. ");
  }
  static void trata ()
  {
    try
    {
      System.out.println("trata: antes.");
      lanza(-1);
      System.out.println("trata: despues.");
    }
    catch (IllegalArgumentException e)
    {
      System.out.println("trata: capturada excepci�n: " + e);
      e.printStackTrace();
    }
    // finally
    // {
      // System.out.println("trata: en el finally. ");
    // }
  }  
  public static void main (String[] args)
  {
    //Ejecutar 1, 2 y 3 en exclusi�n: 1 | 2 | 3
    //1. lanza - lanzamiento de excepci�n
    // System.out.println("main: antes de llamar a lanza");
    // System.out.println("lanza(-1)");
    // lanza(-1);
    // System.out.println("main: despu�s de llamar a lanza");
    //
    //2. propaga - propagaci�n de excepci�n
    // System.out.println("main: antes de llamar a propaga");
    // propaga();
    // System.out.println("main: despu�s de llamar a propaga");
    //
    //3. trata - tratamiento de excepci�n
    System.out.println("main: antes de llamar a trata");
    trata();
    System.out.println("main: despu�s de llamar a trata");
    //
  }
  
}