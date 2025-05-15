/** 
 * Bola
 */
import stdlib.StdDraw;
import java.awt.Color;
 
public class Bola
{ 
  private double x, y;    // posición
  private double dx, dy;  // velocidad
  private double radio;   // radio
  private Color color;    // color
  private int dimX;           // tamaño X lienzo
  private int dimY;           // tamaño Y lienzo

  public Bola (double x, double y, double radio, double dx, double dy, 
        Color color, int dimX, int dimY)
  {
    this.x = x;
    this.y = y;
    this.radio = radio;
    this.color = color;
    this.dx = dx;
    this.dy = dy;
    this.dimX = dimX;
    this.dimY = dimY;
  }
  public Bola (double x, double y, double radio, Color color, int dimX, int dimY)
  {
    this(x, y, radio, 1, 1, color, dimX, dimY);
  }
  public void mover () 
  {  
    x += dx;
    y += dy;
  }
  private boolean estaDentroX ()
  {
    return x - radio >= -dimX && x + radio <= dimX;
  }
  private boolean estaDentroY ()
  {
    return y - radio >= -dimY && y + radio <= dimY;
  }
  public void rebotar ()
  {
    if (!estaDentroX())
      dx = -dx;
    if (!estaDentroY())
      dy = -dy;
  }
  private void cambiarDir () 
  {  
    dx = -dx;
    dy = -dy;
  }
  public boolean choca (Bola b)
  { 
    Punto p1 = new Punto(x, y);
    Punto p2 = new Punto(b.x, b.y);
    double dist = p1.distancia(p2); 
    //mejor sensación visual de choque:
    // double dist = new Punto(x+dx, y+dy).distancia(p2); 
    return dist <= radio + b.radio;
  }
  public void chocar (Bola b)
  {
    if (choca(b) || b.choca(this))
    {  
      cambiarDir();
      b.cambiarDir();      
    }
  }  
  public double x ()
  {
    return x;
  }
  public double y ()
  {
    return y;
  }
  public double radio ()
  {
    return radio;
  }
  public Color color()
  {
    return color;
  }
  
} 