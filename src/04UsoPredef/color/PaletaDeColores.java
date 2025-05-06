import java.awt.Color;
import stdlib.StdDraw;

/** 
 * Círculos concéntricos.
 * @since 09/02/2018
 * @version 1.0
 * @author Javier Galve
 */

public class PaletaDeColores
{ 
  static void iniciarGraficos () 
  {  
    // StdDraw.setCanvasSize(600, 600);
    StdDraw.setScale(0, 255);
    StdDraw.setPenRadius(0.01);
    //StdDraw.setPenColor(StdDraw.BLUE);
  }  
  /*
   * Pinta toda la variedad cromática del azul dejando fijos los tonos 
   * de verdes y de rojos.
   */
  static void pintarPaletaAzules ()
  { 
    double y = 0;
    for (int b = 0; b <= 255; b++) 
    {
      Color c = new Color(175, 175, b);
      // Color c = new Color(0, 0, b);
      StdDraw.setPenColor(c);
      StdDraw.filledRectangle(255/2, y, 255/2, 0.5);
      y += 1;
    }
  }
  public static void main (String[] args) 
  {
    iniciarGraficos();
    pintarPaletaAzules();
  }
}  