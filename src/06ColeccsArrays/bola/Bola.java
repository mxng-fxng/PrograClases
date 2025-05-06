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
  private boolean estaDentroX (int n)
  {
    return x + dx - radio >= -n && x + dx + radio <= n;
  }
  private boolean estaDentroY (int n)
  {
    return y + dy - radio >= -n && y + dy + radio <= n;
  }
  void rebotar (int n)
  {
    if (!estaDentroX(n))
      dx = -dx;
    if (!estaDentroY(n))
      dy = -dy;
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
  Color color()
  {
    return color;
  }

} 
