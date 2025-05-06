/**
 * Jugando con Punto(s) en 3D
 */
 
class Punto3DJugar 
{
    
  static void incrX (Punto3D q) 
  {
    q.x += 1;
  }
    
  static void swap (Punto3D p, Punto3D q) 
  {
    Punto3D t = p;
    p = q;
    q = t;
  }
  
  static void swapX (Punto3D p, Punto3D q) 
  {
    double t = p.x;
    p.x = q.x;
    q.x = t;
  }
  
  public static void main (String[] args)
  {   
    // 1
    Punto3D p0 = new Punto3D();
    Punto3D p1 = new Punto3D(1, 1, 1);
    System.out.println("p0 = " + p0);
    System.out.println("p1 = " + p1);
    
    // 2
    // Punto3D p = new Punto3D(1, 2, 3);
    // p.x += 3;
    // System.out.println("p = " + p);
    
    // 3
    // Punto3D p = new Punto3D(1, 2, 3);
    // Punto3D q = new Punto3D(4, 5, 6);
    // swap(p, q);
    // System.out.println("p = " + p);
    // System.out.println("q = " + q);
    
    // 4
    // Punto3D p = new Punto3D(1, 2, 3);
    // Punto3D q = new Punto3D(4, 5, 6);
    // swapX(p, q);
    // System.out.println("p = " + p);
    // System.out.println("q = " + q);
    
    // 5
    // Punto3D p = new Punto3D(1, 2, 3);
    // p.mover();
    // System.out.println("p = " + p);

    // 6
    // System.out.println("p0.distancia(p1) = " + p0.distancia(p1));

    //Función distancia imperativa (función "de clase")
    // System.out.println("distancia(p0, p1) = " + distancia(p0, p1));
    
    //¿Qué pasa si los atributos de Punto3D son ocultos?
    
    //¿Podemos meter la función estática `distancia` en Punto3D?
  }

}