/**
 * Operaciones de manejo de una lista enlazada de String(s) de tipo 
 * Node<String> (II)
 *
 * lds = lista de String(s)
 */

class Node<E> {
  E elem;
  Node<E> next;

  Node (E e, Node<E> n) {
    elem = e;
    next = n;
  }
}

public class NodeStrOtra
{
  static String toString (Node<String> lds) 

  static Node<String> borraP (Node<String> lds) 

  static Node<String> borraU (Node<String> lds) 

  static Node<String> copia (Node<String> lds)
  
  public static boolean esIgual (Node<String> una, Node<String> otra)

  static Node<String> insertaO (Node<String> lds, String s) 

  static Node<String> ordena (Node<String> lds) 

  public static void main (String[] args) 
  {
    Node<String> lds = null;
    lds = new Node<String>("tres", lds);
    lds = new Node<String>("dos", lds);
    lds = new Node<String>("uno", lds);

    Node<String> copia = clon(lds);
    System.out.println(toString(copia));
    NodeStr.pone(copia, 1, "DOS");
    System.out.println(toString(copia));
    System.out.println(toString(lds));
    
    Node<String> lds2 = null;
    lds2 = new Node<String>("tres", lds2);
    lds2 = new Node<String>("dos", lds2);
    lds2 = new Node<String>("uno", lds2);
    System.out.println(esIgual(lds, lds2));    
  }
}  
