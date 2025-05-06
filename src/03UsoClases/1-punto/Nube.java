import java.awt.*;
import stdlib.*;

/** 
 * Nube de puntos.
 * 
 * @author Galve
 */
class Nube
{
 /**
  * Inicializa el modo grafico
  */
  static void iniciarGraficos (int n) 
  {  
    StdDraw.setCanvasSize(600, 600);
    StdDraw.setScale(-n, n);
    StdDraw.setPenColor(Color.RED);   
    StdDraw.setPenRadius(0.5);
    StdDraw.clear(StdDraw.BLACK);
  }  
 /**
  * Pinta el punto p con color c
  */
  static void pintar (Punto p, Color c)
  {
    StdDraw.setPenRadius(0.01);
    StdDraw.setPenColor(c);   
    StdDraw.point(p.getX(), p.getY());
  }
 /**
  * POST:
  *   resultado: un Punto con x e y aleatorias en {-n..n}
  */
  static Punto puntoAlea (int n)
  {
    double x = StdRandom.uniformDouble(-n, n);
    double y = StdRandom.uniformDouble(-n, n);    
    // double x = StdRandom.gaussian(0, 1);
    // double y = StdRandom.gaussian(0, 1);
    return new Punto(x, y);
  }
 /**
  * Pinta m puntos aleatorios en un cuadrado {-n..n} en Color c
  */
  static void pintarNube (int m, int n, Color c)
  {
    for (int k=1; k<=m; k+=1) 
    {
      Punto p = puntoAlea(n);
      pintar(p, c);
    }
  }
 /**
  * POST:
  *   resultado: p esta dentro o sobre un circulo de centro (0, 0) y radio r
  */
  static boolean estaEnCirculo (Punto p, double r)
  {
    return p.distancia(new Punto(0, 0)) <= r;
  }
 /**
  * Pinta un circulo de radio r a base de pintar m puntos aleatorios 
  * en un cuadrado {-n..n} en Color c
  */
  static void pintarCirculo (int m, int n, double r, Color c)
  {
    for (int k=1; k<=m; k+=1) 
    {
      Punto p = puntoAlea(n);
      if (estaEnCirculo(p, r))
        pintar(p, c);
    }
  }  
  public static void main (String[] args) 
  {
    int n = 6;
    iniciarGraficos(n);

    // Crear y visualizar dos puntos:
    Punto p = new Punto(1, 2);
    pintar(p, Color.RED);
    pintar(puntoAlea(n), Color.RED);
    // Punto q = new Punto(-2, -2);
    // pintar(q, Color.GREEN);
    pintarNube(1000, n, StdDraw.YELLOW);
    // pintarCirculo(100000, n, 2, StdDraw.YELLOW);
    // System.exit(0);    
  }  
}