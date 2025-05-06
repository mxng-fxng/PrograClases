import stdlib.StdDraw;
import java.awt.Color;
/** 
 * Bola.
 */
public class Bola
{ 
  private double x, y;    // posición
  private double dx, dy;  // velocidad
  private double radio;   // radio
  private Color color;    // color

  Bola (double x, double y, double radio, double dx, double dy, Color color)
  {
    this.x = x;
    this.y = y;
    this.radio = radio;
    this.color = color;
    this.dx = dx;
    this.dy = dy;
  }
  Bola (double x, double y, double radio, Color color)
  {
    this(x, y, radio, 1, 1, color);
  }
  void mover () 
  {  
    x += dx;
    y += dy;
  }
  void rebotar (int dimX, int dimY)
  {
    if (!estaDentroX(dimX, dimY))
      dx = -dx;
    if (!estaDentroY(dimX, dimY))
      dy = -dy;
  }
  void chocar (Bola b)
  {
    if (choca(b))
    {  
      cambiarDir();
      b.cambiarDir();      
    }
  }  
  private boolean estaDentroX (int dimX, int dimY)
  {
    return x - radio >= -dimX && x + radio <= dimX;
  }
  private boolean estaDentroY (int dimX, int dimY)
  {
    return y - radio >= -dimY && y + radio <= dimY;

  }
  private void cambiarDir () 
  {  
    dx = -dx;
    dy = -dy;
  }
  private boolean choca (Bola b)
  { 
    Punto p1 = new Punto(x, y);
    Punto p2 = new Punto(b.x, b.y);
    double dist = p1.distancia(p2); 
    //mejor sensación visual de choque:
    // double dist = new Punto(x+dx, y+dy).distancia(p2); 
    return dist <= radio + b.radio;
  }
  double x ()
  {
    return x;
  }
  double y ()
  {
    return y;
  }
  double radio ()
  {
    return radio;
  }
  Color color ()
  {
    return color;
  }

} 
