/**
 * Operaciones de manejo de una lista enlazada de String(s) de tipo Node<String> 
 *
 * lds = lista de String(s)
 *
 * Atención: Al implementarla así, todas las operaciones que modifiquen o 
 *           puedan modificar la referencia al primer nodo de la lista, tienen
 *           que ser funciones, no procedimientos.
 */

class Node<E> {
  E elem;
  Node<E> next;

  Node (E e, Node<E> n) {
    elem = e;
    next = n;
  }
}

public class NodeStrR
{
  
  static Node<String> add (Node<String> lds, String s) 

  static int size (Node<String> lds) 

  static String toString (Node<String> lds) 

  static String ultimo (Node<String> lds) 

  static String get (Node<String> lds, int i) 

  static void set (Node<String> lds, int i, String s) 

  static Node<String> add (Node<String> lds, int i, String s) 

  static int indexOf (Node<String> lds, String s) 

  static Node<String> remove (Node<String> lds, int i) 

  static Node<String> remove (Node<String> lds, String s) 
  
  public static void main (String[] args) 
  {
    Node<String> lds = vacia();
    System.out.println(esVacia(lds));
    
    lds = add(lds, "uno");
    lds = add(lds, "dos");
    lds = add(lds, "tres");
    lds = add(lds, "cuatro");
    System.out.println(aTexto(lds));
    System.out.println(size(lds));
    
    System.out.println(get(lds, 0));
    System.out.println(get(lds, 1));
    // System.out.println(get(lds, 4)); //Error
    
    // imprimir(lds);
    
    System.out.println(primero(lds));
    System.out.println(ultimo(lds));
    
    set(lds, 2, "TRES");
    System.out.println(aTexto(lds));
    
    lds = add(lds, 3, "CUATRO");
    System.out.println(aTexto(lds));
    add(lds, 0, "cero"); //Error: add es una función!
    System.out.println(aTexto(lds));
    
    System.out.println(indexOf(lds, "TRES"));
    System.out.println(indexOf(lds, "DOS"));

    lds = remove(lds, 2);
    System.out.println(aTexto(lds));
    
    lds = remove(lds, "dos");
    System.out.println(aTexto(lds));
  }
}  
