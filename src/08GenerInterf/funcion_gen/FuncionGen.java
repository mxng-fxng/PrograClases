public class FuncionGen
{
  public static <E> String texto (E[] a) 
  {       
    String s = "";
    for (E e : a) s += " " + e;
    return s;
  }
  public static void main (String args[]) 
  {
    // int[] intArray = {1, 2, 3, 4, 5}; // Error de compilación
    Integer[]   ai = {1, 2, 3, 4, 5};
    Double[]    ad = {1.1, 2.2, 3.3, 4.4};
    Character[] ac = {'a', 'b', 'c', 'd'};
    Boolean[]   ab = {true, false};
    String[]    as = {"en", "un", "lugar"};

    System.out.println("ai = " + texto(ai));   
    System.out.println("ad = " + texto(ad));   
    System.out.println("ac = " + texto(ac));   
    System.out.println("ab = " + texto(ab));   
    System.out.println("as = " + texto(as));   
  }
}