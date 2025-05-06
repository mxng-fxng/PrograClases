import java.awt.Color;
import stdlib.StdDraw;
import stdlib.StdRandom;
/** 
 * Operaciones de uso de la clase Punto.
 * 
 * @author Galve
 */
public class PuntoOps
{
  public static void iniciarGraficos (int n) 
  {  
    StdDraw.setCanvasSize(600, 600);
    StdDraw.setScale(-n, n);
    StdDraw.setPenColor(Color.RED);   
    StdDraw.setPenRadius(0.001);
  }  
  /**
   * Pinta 2nx2n cuadriculas.
   */
  public static void pintarCuadrics (int n)
  {
    for (int x=-n+1; x<n; x+=1) 
      StdDraw.line(x, -n, x, n);
    for (int y=-n+1; y<n; y+=1) 
      StdDraw.line(-n, y, n, y);   
  }
  /**
   * POST: 
   *   resultado: punto medio del segmento que conecta p1 y p2
   */  
  public static Punto puntoMedio (Punto p1, Punto p2)
  {
    double xm = (p1.getX() + p2.getX()) / 2.0;
    double ym = (p1.getY() + p2.getY()) / 2.0;
    return new Punto(xm, ym);
  }
  /**
   * Pinta un Punto p con Color c
   */
  public static void pintar (Punto p, Color c)
  {
    StdDraw.setPenRadius(0.04);
    StdDraw.setPenColor(c);   
    StdDraw.point(p.getX(), p.getY());
  }
  /**
   * POST: resultado: un punto aleatorio en {-n..n}
   */  
  public static Punto puntoRandom (int n)
  {
    double x = StdRandom.uniformDouble(-n, n);
    double y = StdRandom.uniformDouble(-n, n);
    return new Punto(x, y);
  }
  /**
   * PRE: x1 <= x2, y1 <= y2
   * POST: resultado: un punto aleatorio dentro del rectángulo cuyo 
   *       punto inferior izquierdo es (x1, y1) y cuyo punto superior 
   *       derecho es (x2, y2)
   */  
  public static Punto puntoRandom (double x1, double y1, double x2, double y2)
  {
    double x = StdRandom.uniformDouble(x1, x2);
    double y = StdRandom.uniformDouble(y1, y2);
    return new Punto(x, y);
  }
  
  /************
   * Ejercicios
   ************/
   
  /**
   * POST: resultado es el punto simétrico a p 
   *       respecto al eje y = x.
   */  
  static Punto simetrico (Punto p)
  {
    return new Punto(p.getY(), p.getX());
  }
  /**
   * Pinta el segmento que une p1 con p2 con Color c
   */
  static void pintarSegmento (Punto p1, Punto p2, Color c)
  {
    StdDraw.setPenRadius(0.001);
    StdDraw.setPenColor(c);   
    StdDraw.line(p1.getX(), p1.getY(), p2.getX(), p2.getY());
  }
  public static void main (String[] args) 
  {
    int n = 10;
    iniciarGraficos(n);
    // pintarCuadrics(n);

    // Crear y visualizar dos puntos:
    Punto p = new Punto(1, 2);
    pintar(p, Color.RED);
    Punto q = new Punto(-2, -2);
    pintar(q, Color.BLUE);
    
    // Calcular la distancia entre ellos:
    // double d = p.distancia(q);
    // System.out.printf("La distancia del rojo al azul es = %5.2f", d);

    // Calcular y visualizar el punto medio:
    Punto m = puntoMedio(p, q);
    pintar(m, Color.GREEN);

    // Calcular y visualizar el punto simétrico del punto rojo:
    // Punto s = simetrico(p);
    // pintar(s, Color.BLACK);
    
    pintarSegmento(p, q, Color.BLACK);
    

  }  
}
