import java.awt.*;
import stdlib.*;
/** 
 * Pruebas de la clase Punto.
 * 
 * Galve
 */
class PuntoArrayTest
{
  public static void main (String[] args) 
  {
    PuntoArray p0;
    p0 = new PuntoArray(0.0, 0.0);
    PuntoArray p1;
    p1 = new PuntoArray(1.0, 1.0);
    
    System.out.println("p0 = " + p0); 
    System.out.println("p1 = " + p1); 
    
    StdDraw.setCanvasSize(600, 600);
    StdDraw.setScale(-10, 10);
    StdDraw.setPenRadius(0.01);
    
    StdDraw.setPenColor(Color.BLUE);   
    StdDraw.point(p0.x(), p0.y());

    StdDraw.setPenColor(Color.RED);   
    StdDraw.point(p1.x(), p1.y());
  }  
}