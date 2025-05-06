/** 
 * Juego
 */
import stdlib.StdDraw;
import java.awt.Color;
 
public class Juego
{ 
  static final int MAX = 600;
  static final int n = 100;

  static void iniciarGraficos () 
  {  
    StdDraw.setCanvasSize(MAX, MAX);
    StdDraw.setScale(-n, n);
    StdDraw.setPenRadius(0.01);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.enableDoubleBuffering();
  }   
  static void dibujar (Bola b) 
  {
    StdDraw.setPenColor(b.color());
    StdDraw.filledCircle(b.x(), b.y(), b.radio());
  }  
  static void animacion (Bola b)
  {
    while (true)  
    {
      StdDraw.clear();
      dibujar(b); 
      b.rebotar(n);
      b.mover();
      StdDraw.show(); 
      StdDraw.pause(100); 
    }
  }
  public static void main (String[] args) 
  {
    iniciarGraficos();
    Bola b1 = null;
    Bola b2 = null;
    b1 = new Bola(0, 0, 10, 4, 2, Color.ORANGE);
    b2 = new Bola(2, 1, 20, 3, 3, Color.BLUE);
    animacion(b1);
  } 
  
} 
