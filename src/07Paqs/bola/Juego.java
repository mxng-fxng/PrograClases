import stdlib.StdDraw;
import java.awt.Color;
import stdlib.StdRandom;
/** 
 * Juego
 */
public class Juego
{ 
  static final int MAX = 600;
  static final int D = 100;

  static void iniciarGraficos () 
  {  
    StdDraw.setCanvasSize(MAX, MAX);
    StdDraw.setScale(-D, D);
    StdDraw.setPenRadius(0.01);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.enableDoubleBuffering();
  }   
  static void dibujar (Bola b) 
  {
    StdDraw.setPenColor(b.color());
    StdDraw.filledCircle(b.x(), b.y(), b.radio());
    // StdDraw.setPenColor(StdDraw.BLACK);
  }  

  static void animacion (Bola b)
  {
    while (true)  
    {
      StdDraw.clear();
      dibujar(b); 
      b.rebotar(D, D);
      b.mover();
      StdDraw.show(); 
      StdDraw.pause(100); 
    }
  }
  
  static Bola bolaRandom () 
  { 
    double x = StdRandom.uniformDouble(-D, D);
    double y = StdRandom.uniformDouble(-D, D);
    double r = StdRandom.uniformDouble(2, 16);
    double dx = StdRandom.uniformDouble(-2, 2);
    double dy = StdRandom.uniformDouble(-2, 2);
    Color color = colorRandom();
    return new Bola(x, y, r, dx, dy, color);    
  }
  
  static Color colorRandom () 
  {
    int rojo  = StdRandom.uniformInt(0, 255);
    int verde = StdRandom.uniformInt(0, 255);
    int azul  = StdRandom.uniformInt(0, 255);
    return new Color(rojo, verde, azul);
  }
  
  static Bola[] fiestaDeBolas ()
  {
    int n = StdRandom.uniformInt(0, 100);
    Bola[] mb = new Bola[n];    
    for (int i = 0; i < n; i+=1)
      mb[i] = bolaRandom();
    return mb;
  }  

  static void chocar (Bola b, Bola[] cb)
  {
    for (int i = 0; i < cb.length; i+=1)
      if (b != cb[i]) b.chocar(cb[i]);
  }    
  
  static void animacion (Bola b1, Bola b2)
  {
    while (true)  
    {
      StdDraw.clear(StdDraw.CYAN);
      dibujar(b1); 
      b1.rebotar(D, D);
      b1.chocar(b2);
      b1.mover();
      dibujar(b2); 
      b2.rebotar(D, D);
      b2.chocar(b1);
      b2.mover();
      StdDraw.show(); 
      StdDraw.pause(60); 
    }
  }
  
  static void animacion (Bola[] bolas)
  {
    while (true)  
    {
      StdDraw.clear();
      for (int i = 0; i < bolas.length; i+=1)
      {
        dibujar(bolas[i]);
        bolas[i].rebotar(D, D);
        chocar(bolas[i], bolas);
        bolas[i].mover();
      }
      StdDraw.show(); 
      StdDraw.pause(20); 
    }
  }

  public static void main (String[] args) 
  {
    iniciarGraficos();
    // Bola b1 = new Bola(0, 0, 10, 2, 2, Color.ORANGE);
    // Bola b2 = new Bola(2, 1, 20, 3, 3, Color.BLUE);
    // animacion(b1);
    
    // Bola b3 = bolaRandom();
    // animacion(b3);
    // animacion(b2, b3);
    
    // Bola b4 = bolaRandom();
    // animacion(b3, b4);

    Bola[] fiesta = fiestaDeBolas();
    animacion(fiesta);

  } 
  
} 
