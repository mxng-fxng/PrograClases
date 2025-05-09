import stdlib.StdIn;
import tads.*;

public class Reves
{
  /* 
   * Lee n�meros de la entrada est�ndar y los escribe al rev�s.
   * Los n�meros vienen separados por espacios o saltos
   * de l�nea. 
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
   *   Lee palabras de la entrada est�ndar y los escribe al rev�s.
   *   Las palabras vienen separados por espacios o saltos
   *   de l�nea. 
   *   El final viene marcado con <Ctrl-D>. En windows usar <Ctrl-Z>.
   * PAUTA:
   *   Utilizar una pila IStack<String>
   */
   public static void escribirAlReves2 (){
    IStack<String> pila = new ArrayStack<String>();
    //bucle de lectura para leer de la entrada estandar
    while (!StdIn.isEmpty()){
      String pal = StdIn.readString();
      pila.push(pal);
    }
    //bucle de ir tomando cada palabra de la pila y mostrandolo por pantalla
    while (!pila.isEmpty()) {
      System.out.println(pila.peek());
      pila.pop(); //borra lo que está en la cima
    }

   } 
  
   //Prueba de longitud
  static void testLongitud () 
  {
    IStack<Integer> pde = new ArrayStack<Integer>();
    System.out.println(longitud(pde));
    pde.push(1);
    pde.push(2);
    pde.push(3);
    System.out.println(longitud(pde));
    System.out.println(pde); //Se queda vac�a!
  }

  public static void main (String[] args) 
  {
    // escribirAlReves();
    // escribirAlReves2();
    testLongitud();
  } 
}