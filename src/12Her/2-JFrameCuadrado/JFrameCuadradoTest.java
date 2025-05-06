/*
 * JFrameCuadrado.java
 *
 * Galve
 */
public class JFrameCuadradoTest 
{
  public static void main (String[] args)
  {
    JFrameCuadrado jfc = new JFrameCuadrado();
    System.out.println("jfc = " + jfc);
    System.out.println("jfc.area() = " + jfc.area());
    jfc.setVisible(true);
    jfc.setSize(800, jfc.getHeight());
    jfc.setHeightToWidth();
    System.out.println("jfc.area() = " + jfc.area());
  }
}