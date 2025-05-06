class PuntoArray
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
  PuntoArray (double[] coords) 
  {
    this.coords = new double[2];
    this.coords[0] = coords[0];
    this.coords[1] = coords[1];;
  }
  public String toString () 
  {
    return "(" + coords[0] + ", " + coords[1] + ")";
  }
  public boolean equals (PuntoArray q) 
  {
    return coords[0] == q.coords[0] && coords[1] == q.coords[1];
  }
  double getX () 
  {
    return coords[0];
  }  
  double getY () 
  {
    return coords[1];
  }
  void setX (double x0) 
  {
    coords[0] = x0;
  }  
  void mover (double dx, double dy)
  {
    coords[0] += dx;
    coords[1] += dy;
  }
}