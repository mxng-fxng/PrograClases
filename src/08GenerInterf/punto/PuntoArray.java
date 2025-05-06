class PuntoArray implements IPunto
{
  private double[] coords;
  
  PuntoArray () 
  {
    coords = new double[2];
  }    
  PuntoArray (double x0, double y0) 
  {
    coords = new double[2];
    coords[0] = x0;
    coords[1] = y0;
  }
  public String toString () 
  {
    return "(" + coords[0] + ", " + coords[1] + ")";
  }
  public boolean equals (PuntoArray q) 
  {
    return coords[0] == q.coords[0] && coords[1] == q.coords[1];
  }
  public double x () 
  {
    return coords[0];
  }  
  public double y () 
  {
    return coords[1];
  }
  public void cambiarX (double x0) 
  {
    coords[0] = x0;
  }  
  public void mover (double dx, double dy)
  {
    coords[0] += dx;
    coords[1] += dy;
  }
  public double distancia (IPunto p) 
  {
    double dx = coords[0] - p.x();
    double dy = coords[1] - p.y();
    return Math.sqrt(dx * dx + dy * dy); 
  }

}