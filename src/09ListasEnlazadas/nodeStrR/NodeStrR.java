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
  E element;
  Node<E> next;

  Node (E e, Node<E> n) {
    element = e;
    next = n;
  }
}

public class NodeStrR
{
  static Node<String> vacia () 
  {
    return null;
  }
  
  static boolean esVacia (Node<String> lds) 
  {
    return lds == null;
  }
  
  //No funciona:
  static void addPproc (Node<String> lds, String s) 
  {
    lds = new Node<String>(s, lds);
  }
  
  static Node<String> addP (Node<String> lds, String s) 
  {
    return new Node<String>(s, lds);
  }
  
  static Node<String> add (Node<String> lds, String s) 
  {
    if (lds == null)
      return new Node<String>(s, null);
    else
      return new Node<String>(lds.element, add(lds.next, s));
  }

  static int size (Node<String> lds) 
  {
   if (lds == null)
      return 0;
    else 
      return 1 + size(lds.next);  
  }

  static <E> String toString (Node<E> lds) 
  {
    if (lds == null)
      return "";
    else if (lds.next == null)
      return lds.element + "";
    else
      return (lds.element + ", ") + toString(lds.next);
  }

  static void imprimir (Node<String> lds) 
  {
    System.out.println(toString(lds));
  }

  static String primero (Node<String> lds) 
  {
    return lds.element;
  }

  static String ultimo (Node<String> lds) 
  {
    if (lds.next == null)
      return lds.element;
    else 
      return ultimo(lds.next);  
  }

  static String get (Node<String> lds, int i) 
  {
    if (i == 0)
      return lds.element;
    else 
      return get(lds.next, i-1);  
  }

  static void set (Node<String> lds, int i, String s) 
  {
    if (i == 0)
      lds.element = s;
    else
      set(lds.next, i-1, s);
  }

  static Node<String> add (Node<String> lds, int i, String s) 
  {
    if (i == 0)
      return new Node<String>(s, lds);
    else 
      return new Node<String>(lds.element, add(lds.next, i-1, s));
  }

  static int indexOfAux (Node<String> lds, String s, int i) 
  {
    if (lds == null)
      return -1;
    else if (lds.element.equals(s))
      return i;
    else 
      return indexOfAux(lds.next, s, i+1);  
  }

  static int indexOf (Node<String> lds, String s) 
  {
    return indexOfAux(lds, s, 0);
  }

  static Node<String> remove (Node<String> lds, int i) 
  {
    if (i == 0)
      return lds.next;
    else 
      return new Node<String>(lds.element, remove(lds.next, i-1));
  }

  static Node<String> remove (Node<String> lds, String s) {
    int pos = indexOf(lds, s);
    if (pos == -1)
      return lds;
    else
      return remove(lds, pos);
  }
  
  public static void main (String[] args) 
  {
    Node<String> lds = vacia();
    System.out.println(esVacia(lds));
    
    lds = add(lds, "uno");
    lds = add(lds, "dos");
    lds = add(lds, "tres");
    lds = add(lds, "cuatro");
    System.out.println(toString(lds));
    System.out.println(size(lds));
    
    System.out.println(get(lds, 0));
    System.out.println(get(lds, 1));
    // System.out.println(get(lds, 4)); //Error
    
    // imprimir(lds);
    
    System.out.println(primero(lds));
    System.out.println(ultimo(lds));
    
    set(lds, 2, "TRES");
    System.out.println(toString(lds));
    
    lds = add(lds, 3, "CUATRO");
    System.out.println(toString(lds));
    add(lds, 0, "cero"); //Error: add es una función!
    System.out.println(toString(lds));
    
    System.out.println(indexOf(lds, "TRES"));
    System.out.println(indexOf(lds, "DOS"));
    System.out.println(indexOf(lds, "cinco"));

    lds = remove(lds, 2);
    System.out.println(toString(lds));
    
    lds = remove(lds, "dos");
    System.out.println(toString(lds));
  }
}  