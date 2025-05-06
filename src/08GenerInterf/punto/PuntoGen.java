class  PuntoGen implements IPunto
{
  Par<Double, Double> par;
  
  PuntoGen (double x, double y)
  {
    par = new Par<Double, Double>();
    par.add(x, y);
  }
  public String toString () 
  {
    return "(" + par.uno() + ", " + par.otro() + ")";
  }
  public boolean equals (Object o) 
  {
    PuntoGen q = (PuntoGen)o;
    return par.uno() == q.x() && par.otro() == q.y();
  }
  public double x () 
  {
    return par.uno();
  }  
  public double y () 
  {
    return par.otro();
  }
  public void mover (double dx, double dy)
  {
    par.add(par.uno() + dx, par.otro() + dy);
  }
  public double distancia (IPunto p) 
  {
    double dx = par.uno() - p.x();
    double dy = par.otro() - p.y();
    return Math.sqrt(dx * dx + dy * dy); 
  }

}