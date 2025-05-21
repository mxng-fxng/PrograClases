/** 
 * Bola
 */
import stdlib.StdDraw;
import java.awt.Color;
 
public class BolaChunga extends Bola
{ 

  public BolaChunga (double x, double y, int dimX, int dimY)
  {
    super (x,y, dimX, dimY);
  }
  public boolean choca (Bola b)
  { 
    if(chora(b)) b.destruir();
  }
  public void chocar (Bola b)
  {
    if (choca(b) || b.choca(this))
    {  
      cambiarDir();
      b.cambiarDir();      
    }
  }  
  
} 