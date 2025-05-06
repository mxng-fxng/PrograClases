class Punto
{
  private double x;
  private double y; 
  
  Punto () 
  {
    x = 0;
    y = 0;
  }    
  Punto (double x0, double y0) 
  {
    x = x0;
    y = y0;
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
  double getX () 
  {
    return x;
  }  
  double getY () 
  {
    return y;
  }
  void setX (double x0) 
  {
    x = x0;
  }    
  void mover (double dx, double dy)
  {
    x += dx;
    y += dy;
  }
  double distancia (Punto p) 
  {
    double dx = x - p.x;
    double dy = y - p.y;
    return Math.sqrt(dx * dx + dy * dy); 
  }
}