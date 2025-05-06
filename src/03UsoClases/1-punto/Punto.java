public class Punto
{
  private double x;
  private double y; 
  
  public Punto (double x0, double y0) 
  {
    x = x0;
    y = y0;
  }
  public Punto () 
  {
    this(0, 0);
  }    
  public String toString () 
  {
    return "(" + x + ", " + y + ")";
  }
  public boolean equals (Object o) 
  {
    Punto q = (Punto)o;
    return x == q.x && y == q.y;
  }
  public double getX () 
  {
    return x;
  }  
  public double getY () 
  {
    return y;
  }
  public void setX (double x0) 
  {
    x = x0;
  }    
  public void mover (double dx, double dy)
  {
    x += dx;
    y += dy;
  }
  public double distancia (Punto p) 
  {
    double dx = x - p.x;
    double dy = y - p.y;
    return Math.sqrt(dx * dx + dy * dy); 
  }
}