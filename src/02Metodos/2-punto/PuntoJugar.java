/** 
 * Pruebas de la clase Punto.
 */
class PuntoJugar 
{
  public static void main (String[] args) 
  {
    // Constructor sin parámetros (predefinido):  
    Punto p = new Punto();
    // p.x = 9;
    // p.y = 8;
    System.out.println("p = " + p); 
    // Constructor:
    Punto p0;
    p0 = new Punto(0.0, 0.0);
    Punto p1;
    p1 = new Punto(1.0, 1.0);
    //
    // Con toString:
    // System.out.println("p0 = " + p0); 
    // System.out.println("p0 = " + p0.toString()); 
    //
    // Comparador 
    // Punto p2 = new Punto(1.0, 1.0);
    // System.out.println("p1 = " + p1);
    // System.out.println("p2 = " + p2);
    // System.out.println("p1 == p2 ==> " + (p1 == p2));
    // System.out.println("p1.equals(p2) ==> " + p1.equals(p2));
    //
    // Asignación
    // p1 = p2;
    // System.out.println("p1 = " + p1);
    // System.out.println("p2 = " + p2);
    // System.out.println("p1 == p2 ==> " + (p1 == p2));
  }  
}