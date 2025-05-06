public class Punto
{
  private double x;
  private double y; 
  
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
  double distancia (Punto p) 
  {
    double dx = x - p.x;
    double dy = y - p.y;
    return Math.sqrt(dx * dx + dy * dy); 
  }
  public static void main (String[] args) 
  {
    Punto p0 = new Punto(0.0, 0.0);
    Punto p1;
    p1 = new Punto(1.0, 1.0);
    Punto p2 = new Punto(1.0, 1.0);
    System.out.println("p1 = " + p1);
    System.out.println("p2 = " + p2);
    System.out.println("p1 == p2 ==> " + (p1 == p2));
    System.out.println("p1.equals(p2) ==> " + p1.equals(p2));
    System.out.println("p0.distancia(p1) ==> " + p0.distancia(p1));
    //
    // Asignación
    // p1 = p2;
    // System.out.println("p1 = " + p1);
    // System.out.println("p2 = " + p2);
    // System.out.println("p1 == p2 ==> " + (p1 == p2));
  }  
}