/**
 * Excepciones.
 */
class EjemploComprob
{
  private static void lanza (int x) throws ParametroNoValido
  {
    System.out.println("lanza: antes.");
    if (x < 0) throw new ParametroNoValido();
    System.out.println("lanza: después.");
  }
  private static void propaga () throws ParametroNoValido
  {
    System.out.println("propaga: antes. ");
    lanza(-1);
    System.out.println("propaga: despues. ");
  }
  private static void trata () 
  {
    try
    {
      System.out.println("trata: antes.");
      lanza(-1);
      System.out.println("trata: despues.");
    }
    catch (ParametroNoValido e)
    {
      System.out.println("trata: capturada excepción: " + e);
      e.printStackTrace();
    }
    finally
    {
      System.out.println("trata: en el finally. ");
    }
  }  
  public static void main (String[] args) //throws ParametroNoValido
  {
    //Ejecutar 1, 2 y 3 en exclusión: 1 | 2 | 3
    //1. lanza - lanzamiento de excepción
    // System.out.println("main: antes de llamar a lanza");
    // System.out.println("lanza()");
    // lanza(-1);
    // System.out.println("main: después de llamar a lanza");
    //
    //2. propaga - propagación de excepción
    // System.out.println("main: antes de llamar a propaga");
    // propaga();
    // System.out.println("main: después de llamar a propaga");
    //
    //3. trata - tratamiento de excepción
    System.out.println("main: antes de llamar a trata");
    trata();
    System.out.println("main: después de llamar a trata"); 
  }
  
}