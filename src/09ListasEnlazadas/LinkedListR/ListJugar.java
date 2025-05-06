import tads.*;
/**
 * Pruebas informales de una IList de enteros.<br>
 */
public class ListJugar
{ 
  public static void prueba_1 ()
  {
    IList<Integer> vacia = new LinkedListR<Integer>();
    System.out.println("vacia = " + vacia);   
  }
  public static void prueba_2 ()
  {
    IList<Integer> lista = new LinkedListR<Integer>();
    lista.add(5);
    lista.add(6);
    lista.add(lista.size(), 7);
    System.out.println("lista = " + lista);   
    System.out.println("longitud de lista = " + lista.size());   
    int primero = lista.get(0);
    System.out.println("primero de lista = " + primero);
    int ultimo = lista.get(lista.size()-1);
    System.out.println("ultimo de lista = " + ultimo);   
    // Excepción IndexOutOfBoundsException!!:
    // System.out.println("lista.get(lista.size()) = " + lista.get(lista.size())); 
  }
  public static void prueba_3 ()
  {
    IList<Integer> lista = new LinkedListR<Integer>();
    lista.add(5);
    lista.add(6);
    lista.add(7);
    System.out.println("lista = " + lista);   
    System.out.println("lista.set(1, 12);");       
    lista.set(1, 12);
    System.out.println("lista = " + lista);   
  }
  public static void prueba_4 ()
  {
    IList<Integer> lista = new LinkedListR<Integer>();
    lista.add(5);
    lista.add(6);
    lista.add(7);
    System.out.println("lista = " + lista);   
    System.out.println("lista.remove(0)");   
    lista.remove(0); //Toma el parámetro como posición.
    // lista.remove(new Integer(0)); //Toma el parámetro como elemento.
    System.out.println("lista = " + lista);   
  }
  public static void prueba_5 ()
  {
    IList<Integer> lista = new LinkedListR<Integer>();
    lista.add(5);
    lista.add(6);
    lista.add(7);
    lista.add(8);
    lista.add(9);
    System.out.println("lista = " + lista);   
    int primero = lista.get(0);
    System.out.println("primero de lista = " + primero);
    IList<Integer> resto = lista.subList(1, lista.size());
    System.out.println("resto de lista = " + resto);   
    // System.out.println("lista.subList(2, 1) = " + lista.subList(2, 1));   //Excepción
    System.out.println("lista.subList(2, 2) = " + lista.subList(2, 2));   
    System.out.println("lista.subList(2, 3) = " + lista.subList(2, 3));   
    System.out.println("lista.subList(2, 4) = " + lista.subList(2, 4));   
    System.out.println("lista.subList(2, 5) = " + lista.subList(2, 5));   
    // System.out.println("lista.subList(2, 6) = " + lista.subList(2, 6));   //Excepción
  }
  public static void main(String[] args)
  {
   prueba_1();
   prueba_2();
   prueba_3();
   prueba_4();
   prueba_5();
  }
}
