/**
 * Representa un círculo.
 * 
 * @author Javier Galve
 */
class Circulo
{
  private double x;
  private double y;
  private double radio;
  
  Circulo (double x0, double y0, double radio0)
  {
    x = x0;
    y = y0;
    radio = radio0;
  } 
  public String toString () 
  {
    return "(" + centro() + ", " + radio + ")";
  }
  double distancia (Circulo c) 
  {
    return centro().distancia(c.centro());
  }
  double area () 
  {
    return Math.PI * radio * radio;
  }
  void mover (double dx, double dy) 
  {
    x += dx;
    y += dy;
  }
  double radio () 
  { 
    return radio;
  }   
  Punto centro () 
  { 
    return new Punto(x, y);
  }   
}

