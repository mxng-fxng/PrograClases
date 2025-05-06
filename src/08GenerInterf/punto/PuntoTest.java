import java.awt.*;
import stdlib.*;

/** 
 * Pruebas de la clase Punto con interfaz.
 * 
 * @author Galve
 */
class PuntoTest
{
  public static void iniciarGraficos () 
  {  
    StdDraw.setCanvasSize(600, 600);
    StdDraw.setScale(-10, 10);
    StdDraw.setPenRadius(0.01);
  }  
  static void pintar (IPunto p, Color c)
  {
    StdDraw.setPenColor(c);   
    StdDraw.point(p.x(), p.y());
  }
  public static void main (String[] args) 
  {
    IPunto p0;
    // p0 = new Punto(0, 0);
    // p0 = new PuntoArray(0, 0);
    p0 = new PuntoGen(0, 0);

	  IPunto p1;
    // p1 = new Punto(1, 1);
    // p1 = new PuntoArray(1, 1);
    p1 = new PuntoGen(1, 1);

    System.out.println("p0.x() = " + p0.x()); 
    System.out.println("p0.y() = " + p0.y()); 
    System.out.println("p0 = " + p0); 
     
    System.out.println("p1 = " + p1);
    //
    System.out.printf("p0.distancia(p1) = %5.2f", p0.distancia(p1));
    //
    // Modo gráfico:
    iniciarGraficos();
    pintar(p0, Color.BLUE);
    pintar(p1, Color.RED);
  }  
}