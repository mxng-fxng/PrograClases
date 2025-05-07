package nodeStr;
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

public class NodeStr
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
    if (lds== null)
      return new Node<String>(s, null);
    else
    {
      Node<String> aux = lds;
      while (aux.next != null) 
        aux = aux.next;
      aux.next = new Node<String>(s, null);
      return lds;
    }
  }

  static int size (Node<String> lds) 
  {
    Node<String> aux = lds;
    int size = 0;
    while (aux != null)
    {
      size += 1;
      aux = aux.next;   
    }
    return size;
  }

  static String toString (Node<String> lds) 
  {
    String res = "[";
    Node<String> aux = lds;
    while (aux != null) 
    {  
      res += aux.element;
      if (aux.next != null)
        res += ", ";
      aux = aux.next;
    }  
    return res + "]";
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
    Node<String> aux = lds;  
    while (aux.next != null) aux = aux.next;
    return aux.element;
  }

  static String get (Node<String> lds, int i) 
  {
    Node<String> aux = lds;
    for (int j=1; j<=i; j++)
      aux = aux.next;
    return aux.element;
  }

  static void set (Node<String> lds, int i, String s) 
  {
    Node<String> aux = lds;
    for (int j=1; j<=i; j++)
      aux = aux.next;
    aux.element = s;
  }

  static Node<String> add (Node<String> lds, int i, String s) 
  {
    if (i == 0)
      return new Node<String>(s, lds);
    else {
      Node<String> aux = lds;
      for (int j=1; j<=i-1; j++)
        aux = aux.next;
      aux.next = new Node<String>(s, aux.next);
    }
    return lds;
  }

  static int indexOf (Node<String> lds, String s) 
  {
    int pos = 0;
    Node<String> aux = lds;
    boolean encontrado = false;
    while (aux != null && !encontrado)
      if (aux.element.equals(s))
        encontrado = true;
      else {
        pos += 1;
        aux = aux.next;
      }
    return encontrado ? pos : -1;
  }

  static Node<String> remove (Node<String> lds, int i) 
  {
    Node<String> actual = lds;
    Node<String> anterior = lds;
    for (int j=1; j<=i; j++)
    {
      anterior = actual;
      actual = actual.next;
    }
    if (actual == anterior)
      lds = lds.next;
    else if (actual == null)
      anterior.next = null;
    else
      anterior.next = actual.next;
    return lds;
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

    lds = remove(lds, 2);
    System.out.println(toString(lds));
    
    lds = remove(lds, "dos");
    System.out.println(toString(lds));
  }
}  
