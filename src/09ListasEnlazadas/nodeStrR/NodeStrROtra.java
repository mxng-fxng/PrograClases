/**
 * Operaciones de manejo de una lista enlazada de String(s) de tipo 
 * Node<String> (II)
 *
 * lds = lista de String(s)
 */
 
 public class NodeStrROtra extends NodeStrR
 {
   static Node<String> borraP (Node<String> lds) {
     return lds.next;
   }
 
   static Node<String> borraU (Node<String> lds) {
     if (lds == null || lds.next == null) 
       return null;
     else
       return new Node<String>(lds.element, borraU(lds.next));  
   }
 
   static Node<String> copia (Node<String> lds)
   {
     if (lds == null) 
       return null;
     else
       return new Node<String>(lds.element, copia(lds.next));  
   }
   
   public static boolean esIgual (Node<String> una, Node<String> otra)
   {
     if (una == null && otra == null) 
       return true;
     else if (una == null)
       return false;
     else if (otra == null)
       return false;
     else 
       return una.element.equals(otra.element) && esIgual(una.next, otra.next);
   }   
 
   public static Node<String> inversa (Node<String> lds)
   {
     if (lds == null) 
       return null;
     else
       return NodeStrR.add(inversa(lds.next), lds.element);  
   }
   
   public static Node<String> interseccion (Node<String> una, Node<String> otra)
   {
     if (una == null) 
       return null;
     else if (NodeStrR.indexOf(otra, una.element) != -1) 
       return new Node<String>(una.element, interseccion(una.next, otra));  
     else 
       return interseccion(una.next, otra);  
   }   
 
   static Node<String> insertaO (Node<String> lds, String s) {
     if (lds == null ||  s.compareTo(lds.element) < 0)
       return new Node<String>(s, lds);
     else
       return new Node<String>(lds.element, insertaO(lds.next, s));
   }
 
   static Node<String> ordena (Node<String> lds) {
     if (lds == null)
       return null;
     else
       return insertaO(ordena(lds.next), lds.element);
   }
 
   static Node<Integer> menores (Node<Integer> lds, int x) {
     if (lds == null)
       return null;
     else if (lds.element < x)
       return new Node<Integer>(lds.element, menores(lds.next, x));
     else
       return menores(lds.next, x);
   }
   
   static Node<Integer> mezcla (Node<Integer> una, Node<Integer> otra) 
   {
     if (una == null)
       return otra;
     else if (otra == null)
       return una;
     else if (una.element < otra.element)
       return new Node<Integer>(una.element, mezcla(una.next, otra));
     else
       return new Node<Integer>(otra.element, mezcla(una, otra.next));
   }
   
   static void test1 ()
   {
     Node<String> lds = null;
     lds = new Node<String>("tres", lds);
     lds = new Node<String>("dos", lds);
     lds = new Node<String>("uno", lds);
     lds = borraP(lds);
     System.out.println(toString(lds));    
   }
   
   static void test2 ()
   {
     Node<String> lds = null;
     lds = new Node<String>("tres", lds);
     lds = new Node<String>("dos", lds);
     lds = new Node<String>("uno", lds);
     System.out.println(toString(borraU(lds)));    
   }
   
   static void test3 ()
   {
     Node<String> lds = null;
     lds = new Node<String>("tres", lds);
     lds = new Node<String>("dos", lds);
     lds = new Node<String>("uno", lds);
     Node<String> copia = copia(lds);
     System.out.println(toString(copia));
     NodeStrR.set(copia, 1, "DOS");
     System.out.println(toString(copia));
     System.out.println(toString(lds));
   }
 
   static void test4 ()
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
   
   static void test5 ()
   {  
     Node<String> lds = null;
     lds = new Node<String>("tres", lds);
     lds = new Node<String>("dos", lds);
     lds = new Node<String>("uno", lds);
     Node<String> inv = inversa(lds);
     System.out.println(toString(lds));    
     System.out.println(toString(inv));
     NodeStrR.set(inv, 1, "DOS");
     System.out.println(toString(inv));
     System.out.println(toString(lds));    
   }
   
   static void test6 ()
   {  
     Node<String> lds = null;
     lds = new Node<String>("tres", lds);
     lds = new Node<String>("dos", lds);
     lds = new Node<String>("uno", lds);
     
     Node<String> copia = copia(lds);
     System.out.println(toString(copia));
     NodeStrR.set(copia, 1, "DOS");
     System.out.println(toString(copia));
 
     Node<String> inters = interseccion(lds, copia);
     System.out.println(toString(inters));
     
     // NodeStrR.set(inters, 1, "DOS");
     // System.out.println(toString(inters));
     // System.out.println(toString(lds));    
   }
   
   static void test7 ()
   {
     Node<String> lds = null;
     lds = new Node<String>("tres", lds);
     lds = new Node<String>("dos", lds);
     lds = new Node<String>("uno", lds);
     set(lds, 0, "a");
     System.out.println(toString(lds));
     lds = insertaO(lds, "b");
     System.out.println(toString(lds));
     lds = insertaO(lds, "aa");
     System.out.println(toString(lds));
   }
   
   static void test8 ()
   {
     Node<String> lds = null;
     lds = new Node<String>("tres", lds);
     lds = new Node<String>("dos", lds);
     lds = new Node<String>("uno", lds);
     System.out.println(toString(lds));
     System.out.println(toString(ordena(lds)));
   }
   
   static void test9 ()
   {
     Node<Integer> lde = null;
     lde = new Node<Integer>(1, lde);
     lde = new Node<Integer>(2, lde);
     lde = new Node<Integer>(20, lde);
     System.out.println(toString(lde));
     System.out.println(toString(menores(lde, 10)));
   }
   
   static void test10 ()
   {
     Node<Integer> lde = null;
     lde = new Node<Integer>(10, lde);
     lde = new Node<Integer>(5, lde);
     lde = new Node<Integer>(1, lde);
     System.out.println(toString(lde));
     Node<Integer> lde2 = null;
     lde2 = new Node<Integer>(12, lde2);
     lde2 = new Node<Integer>(6, lde2);
     lde2 = new Node<Integer>(3, lde2);
     System.out.println(toString(lde2));
     
     System.out.println(toString(mezcla(lde, lde2)));
   }
   
   public static void main (String[] args) 
   {
     // test1();
     // test2();
     // test3();
     // test4();
     // test5();
     test6();
     // test7();
     // test8();
     // test9();
     // test10();
   }
 }