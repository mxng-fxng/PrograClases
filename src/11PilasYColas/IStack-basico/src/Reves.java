import stdlib.*;
import tads.*;

public class Reves
{
  /* 
   * Lee números de la entrada estándar y los escribe al revés.
   * Los números vienen separados por espacios o saltos
   * de línea. 
   * El final viene marcado con <Ctrl-D>. En windows usar <Ctrl-Z>.
   * PAUTA:
   *   Utilizar una pila IStack<Integer>
   */
  public static void escribirAlReves () 
  
  /*
   * resultado: la longitud de una pila de enteros.
   */
  public static int longitud (IStack<Integer> pila) 
  
  /*
   * escribirAlReves2 () 
   *   Lee palabras de la entrada estándar y los escribe al revés.
   *   Las palabras vienen separados por espacios o saltos
   *   de línea. 
   *   El final viene marcado con <Ctrl-D>. En windows usar <Ctrl-Z>.
   * PAUTA:
   *   Utilizar una pila IStack<String>
   */
   public static void escribirAlReves2 () 
  
   //Prueba de longitud
  static void testLongitud () 
  {
    IStack<Integer> pde = new ArrayStack<Integer>();
    System.out.println(longitud(pde));
    pde.push(1);
    pde.push(2);
    pde.push(3);
    System.out.println(longitud(pde));
    System.out.println(pde); //Se queda vacía!
  }

  public static void main (String[] args) 
  {
    // escribirAlReves();
    // escribirAlReves2();
    testLongitud();
  } 
}