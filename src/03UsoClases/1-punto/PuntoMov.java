import java.awt.Color;
import stdlib.StdDraw;
import stdlib.StdRandom;
/** 
 * Puntos en movimiento
 */
public class PuntoMov
{
  static final int MAX = 600;
  static final int D = 100;

  public static void iniciarGraficos () 
  {  
    StdDraw.setCanvasSize(MAX, MAX);
    StdDraw.setScale(-D, D);
    StdDraw.setPenColor(Color.RED);   
    StdDraw.setPenRadius(0.01);
    StdDraw.enableDoubleBuffering();
  }  
  /**
   * Punto animado
   */  
  static void animacion (Punto p)
  {
    while (true)  
    {
      StdDraw.clear(StdDraw.CYAN);
      PuntoOps.pintar(p, Color.YELLOW); 
      moverRandom(p);
      StdDraw.show(); 
      StdDraw.pause(100); 
    }
  }
  /**
   * Mueve p aleatoriamente en {-D..D}
   */  
  public static void moverRandom (Punto p)
  {
    double dx = StdRandom.uniformDouble(-2, 2);
    double dy = StdRandom.uniformDouble(-2, 2);
    p.mover(dx, dy);
  }
  public static void main (String[] args) 
  {
    iniciarGraficos();
    Punto p = new Punto();
    animacion(p);
  }  
}
