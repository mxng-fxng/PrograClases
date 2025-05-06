import stdlib.StdDraw;

public class Punto
{
  private double x;
  private double y; 
  
  Punto (double x, double y)
  {
    this.x = x;
    this.y = y;
  }
  public String toString () 
  {
    return "(" + x + ", " + y + ")";
  }
  void pintar ()
  {
    StdDraw.point(x, y);
  }
  public double x () {
    return x;
  }  
  public double y () {
    return y;
  }  
  public double distancia (Punto p) 
  {
    double dx = x - p.x();
    double dy = y - p.y();
    return Math.sqrt(dx * dx + dy * dy); 
  }
}