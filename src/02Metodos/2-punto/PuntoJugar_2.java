import java.awt.Color;
import stdlib.StdDraw;
/** 
 * Pruebas de la clase Punto.
 */
class PuntoJugar_2
{
  public static void main (String[] args) 
  {
    Punto p0;
    p0 = new Punto(0.0, 0.0);
    Punto p1;
    p1 = new Punto(1.0, 1.0);
    
    StdDraw.setCanvasSize(600, 600);
    StdDraw.setScale(-10, 10);
    StdDraw.setPenRadius(0.01);
    
    StdDraw.setPenColor(Color.BLUE);   
    StdDraw.point(p0.getX(), p0.getY());

    StdDraw.setPenColor(Color.RED);   
    StdDraw.point(p1.getX(), p1.getY());
  }  
}