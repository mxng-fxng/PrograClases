/**
 * Operaciones de manejo de una lista enlazada de String(s) de tipo 
 * Node<String> (II)
 *
 * lds = lista de String(s)
 */
public class NodeStrOtra extends NodeStr
{
  static Node<String> borraP (Node<String> lds) 
  {
    if (lds == null) 
      return null;
    else
      return lds.next;
  }

  static Node<String> borraU (Node<String> lds) 
  {
    if (lds == null || lds.next == null) return null;
    Node<String> aux = lds;
    Node<String> anterior = null;
    while (aux.next != null) 
    {
      anterior = aux;
      aux = aux.next;    
    }  
    anterior.next = null;
    return lds;
  }

  static Node<String> copia (Node<String> lds)
  {
    Node<String> res = null;
    Node<String> aux = lds;
    while (aux != null)
    {
      res = NodeStr.add(res, aux.element);
      aux = aux.next;
    }
    return res;
  }
  
  public static boolean esIgual (Node<String> una, Node<String> otra)
  {
    if (NodeStr.size(una) != NodeStr.size(otra)) return false;
    boolean loSon = true;
    Node<String> aux1 = una;
    Node<String> aux2 = otra;
    while (aux1 != null && aux2 != null && loSon)
    if (!aux1.element.equals(aux2.element))
      loSon = false;
    else
    {
      aux1 = aux1.next;
      aux2 = aux2.next;
    }
    return loSon;
  }   

  public static Node<String> inversa (Node<String> lds)
  {
    Node<String> res = null;
    Node<String> aux = lds;
    while (aux != null)
    {
      res = new Node<String>(aux.element, res);
      aux = aux.next;
    }
    return res;
  }
  
  public static Node<String> interseccion (Node<String> una, Node<String> otra)
  {
    Node<String> res = null;
    Node<String> aux = una;
    while (aux != null)
    {
      if (NodeStr.indexOf(otra, aux.element) != -1) 
        res = NodeStr.add(res, aux.element);
      aux = aux.next;
    }
    return res;
  }

  static Node<String> insertaO (Node<String> lds, String s) {
    /* En recursivo */
    return null;
  }

  static Node<String> ordena (Node<String> lds) {
    /* En recursivo */
    return null;
  }

  public static void test1 ()
  {
    Node<String> lds = null;
    lds = new Node<String>("tres", lds);
    lds = new Node<String>("dos", lds);
    lds = new Node<String>("uno", lds);
    lds = borraP(lds);
    System.out.println(toString(lds));    
  }
  
  public static void test2 ()
  {  
    Node<String> lds = null;
    lds = new Node<String>("tres", lds);
    // lds = new Node<String>("dos", lds);
    // lds = new Node<String>("uno", lds);
    System.out.println(toString(lds));    
    lds = borraU(lds);
    System.out.println(toString(lds));    
  }
  
  public static void test3 ()
  {  
    Node<String> lds = null;
    lds = new Node<String>("tres", lds);
    lds = new Node<String>("dos", lds);
    lds = new Node<String>("uno", lds);

    Node<String> copia = copia(lds);
    System.out.println(toString(copia));
    NodeStr.set(copia, 1, "DOS");
    System.out.println(toString(copia));
    System.out.println(toString(lds));
  }
  
  public static void test4 ()
  {  
    Node<String> lds = null;
    lds = new Node<String>("tres", lds);
    lds = new Node<String>("dos", lds);
    lds = new Node<String>("uno", lds);
    
    Node<String> lds2 = null;
    lds2 = new Node<String>("tres", lds2);
    lds2 = new Node<String>("dos", lds2);
    lds2 = new Node<String>("uno", lds2);
    System.out.println(esIgual(lds, lds2));
  }
  
  public static void test5 ()
  {  
    Node<String> lds = null;
    lds = new Node<String>("tres", lds);
    lds = new Node<String>("dos", lds);
    lds = new Node<String>("uno", lds);
    Node<String> inv = inversa(lds);
    System.out.println(toString(inv));
    NodeStr.set(inv, 1, "DOS");
    System.out.println(toString(inv));
    System.out.println(toString(lds));    
  }
  
  public static void test6 ()
  {  
    Node<String> lds = null;
    lds = new Node<String>("tres", lds);
    lds = new Node<String>("dos", lds);
    lds = new Node<String>("uno", lds);
    
    Node<String> copia = copia(lds);
    System.out.println(toString(copia));
    NodeStr.set(copia, 1, "DOS");
    System.out.println(toString(copia));

    Node<String> inters = interseccion(lds, copia);
    System.out.println(toString(inters));
    
    // NodeStr.set(inters, 1, "DOS");
    // System.out.println(toString(inters));
    // System.out.println(toString(lds));    
  }
  
  public static void main (String[] args) 
  {
    // test1();
    test2();    
    // test3();    
    // test4();    
    // test5();    
    // test6();    
  }
}  