package nodeStrR;
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

public class NodeStrROtra
{
  //static String toString (Node<String> lds) igual que sin recursiva

  //static Node<String> borraU (Node<String> lds) igual que sin recursiva

  static Node<String> copia (Node<String> lds){
    if (lds == null)
      return null;
    else
      return new Node <String> (lds.element, copia (lds.next));
  }
  
  public static Node <String> inversa (Node <String> lds){
    if (lds == null)
      return null;
    else
      return add (inversa (lds.next), lds.element);
  }

  public static Node <String> interseccion (Node <String> una, Node <String> otra){
    if (una == null)
      return null;
    else if (indexOf(otra, una.element) != -1)
      return new Node <String> (una.element, interseccion(una.next, otra));
    else
      return interseccion(una.next, otra);
  }

  //public static boolean esIgual (Node<String> una, Node<String> otra){}

  static Node<String> insertaO (Node<String> lds, String s) {
    if ((lds == null) || (s.compareTo(lds.element) < 0))
      return new Node <String> (s, lds);
    else
      return new Node <String> (lds.element, insertaO(lds.next, s));
  }
6
  static Node<String> ordena (Node<String> lds) {
    if (lds == null) 
    return null;
  else
    return insertaO(ordena(lds.next), lds.element);
  }

  public static void main (String[] args) {}
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
