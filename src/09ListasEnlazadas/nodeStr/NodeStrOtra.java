package nodeStr;
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
  //static String toString (Node<String> lds){}

  static Node<String> borraP (Node<String> lds){
    return lds.next;
  }

  static Node<String> borraU (Node<String> lds) {
    Node <String> aux = lds; 
    Node <String> anterior = null;
    while (aux.next != null){ //si es null devuelve null
      anterior = aux;
      aux = aux.next;
    }
    anterior.next = null;
    return lds;
  }

  static Node<String> copia (Node<String> lds){
    Node <String> aux = lds; 
    Node <String> copia = null; 
    while (aux != null){ 
      copia = add (copia, aux.element); //add está en la clase NodeStr, static (hay que poner el nombre de la clase delante)
      aux = aux.next;
    }
    return copia;
  }

  public static Node <String> inversa (Node <String> lds){
    Node <String> aux = lds; 
    Node <String> res = null; 
    while (aux != null){ 
      res = new Node <String> (aux.element, res);
      aux = aux.next;
    }
    return res;
  }
  
  //public static boolean esIgual (Node<String> una, Node<String> otra){}

  public static Node <String> interseccion (Node <String> una, Node <String> otra){
    Node <String> aux = una; 
    Node <String> res = null; 
    while (aux != null){
      if (indexOf(otra, aux.element ) != -1) //Si está 
        res = add(res, aux.element);
      aux = aux.next;
    }
    return res;
  }

  static Node<String> insertaO (Node<String> lds, String s){

  }

  static Node<String> ordena (Node<String> lds){

  } 

  public static void main (String[] args){

  } 

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
