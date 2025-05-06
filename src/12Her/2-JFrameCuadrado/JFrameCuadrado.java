/*
 * JFrameCuadrado.java
 *
 * Galve
 */
import javax.swing.*;

public class JFrameCuadrado extends JFrame 
{
  public int area () 
  {
    return getWidth() * getHeight();
  }
  public void setHeightToWidth () 
  {
    setSize(getWidth(), getWidth());
  }  
}