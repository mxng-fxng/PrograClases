/*
 * Prueba de una pila acotada de enteros<br>
 */
import tads.IStack;
import tads.BoundedStack;
import tads.ArrayStack;
import tads.LinkedStack;
 
public class StackPrueba
{
  public static void push3YPop3 (){
    IStack <Integer> pila = new BoundedStack <Integer> (); //Puedes usar cualquier implementación ArrayStack o LinkedStack
    //añade a la pila
    pila.push(3);
    System.out.println(pila);
    pila.push(5);
    System.out.println(pila);
    pila.push(7);
    System.out.println(pila);
    //borra
    System.out.println(pila.peek());//consulta que hay en la cima
    pila.pop(); //lo borro
    System.out.println(pila);
    System.out.println(pila.peek());//consulta que hay en la cima
    pila.pop(); //lo borro
    System.out.println(pila);
    System.out.println(pila.peek());//consulta que hay en la cima
    pila.pop(); //lo borro
    System.out.println(pila);
  } 
  
  public static void push2YPop3 (){
    IStack <Integer> pila = new BoundedStack <Integer> (); //Puedes usar cualquier implementación ArrayStack o LinkedStack
    //añade a la pila
    pila.push(3);
    System.out.println(pila);
    pila.push(5);
    System.out.println(pila);

    //borra
    System.out.println(pila.peek());//consulta que hay en la cima
    pila.pop(); //lo borro
    System.out.println(pila);
    System.out.println(pila.peek());//consulta que hay en la cima
    pila.pop(); //lo borro
    System.out.println(pila);
    System.out.println(pila.peek());//consulta que hay en la cima
    pila.pop(); //lo borro
    System.out.println(pila);
    //salta una excepción porque consulta el elemento de una pila vacía
  }
  
 /*
  * Ejercicio: 
      Cargar una pila con 3 n�meros e ir sac�ndolos uno a uno,
      mostrando el n�mero que se saca en cada paso.
  */
  
  public static void main (String[] args) 
  {
    // System.out.println("push3YPop3() --> ");
    // push3YPop3();
    
    //trata la excepción
    System.out.println("push2YPop3() -->");
    push2YPop3();
    
    System.out.println("fin");
  } 
}