import tads.IQueue;
import tads.BoundedQueue;
import tads.ArrayQueue;
import tads.LinkedQueue;
import stdlib.StdIn;

public class Codificacion
{
  /*
   * Lee caracteres de la entrada est�ndar y los escribe 
   * codificados.
   * Los caracteres vienen todos seguidos. El espacio y salto
   * de l�nea son tambi�n caracteres. 
   * El final viene marcado con <ctrl><z> o <ctrl><d>.
   */
  public static void escribirCodificado (){
    IQueue<Character> buffer  = new ArrayQueue<Character>();
    while (!StdIn.isEmpty()){
      Character c = StdIn.readChar();
      buffer.add((char)(c+1));
    }
    //bucle de ir tomando cada palabra de la pila y mostrandolo por pantalla
    while (!buffer.isEmpty()) {
      System.out.println(buffer.peek());
      buffer.poll(); //borra lo que está en la cima
    }
  }
  
  /*
   * resultado: la longitud de texto 
   */
  public static int longitud (IQueue<Character> texto) 
  
 //Prueba de longitud
  static void testLongitud () 
  {
    IQueue<Character> cdc = new ArrayQueue<Character>();
    System.out.println(longitud(cdc));
    cdc.add('a');
    System.out.println(longitud(cdc));
    cdc.add('b');
    System.out.println(longitud(cdc));
    cdc.add('c');
    System.out.println(longitud(cdc));
    System.out.println(cdc);
  }

  public static void main (String[] args) 
  {
    // escribirCodificado();
    // testLongitud();
  } 
}