import javax.swing.*;
import java.awt.*;
/*
 * FlowLayoutJFrame.java
 *
 * Galve
 */
public class FlowLayoutJFrame extends JFrame 
{
  /** 
   * Constructor: JFrame con layout tipo flow (center).
   */
  public FlowLayoutJFrame () 
  {
    // Poner el panel.
    getContentPane().setLayout(new FlowLayout());

    // Añadir botones.
    getContentPane().add(new JButton("uno"));
    getContentPane().add(new JButton("dos"));
    getContentPane().add(new JButton("tres"));
    getContentPane().add(new JButton("cuatro"));
    getContentPane().add(new JButton("cinco"));
    getContentPane().add(new JButton("seis"));
    getContentPane().add(new JButton("siete"));
    getContentPane().add(new JButton("ocho"));
    getContentPane().add(new JButton("nueve"));
    
    // Darle tamaño al frame y mostrarlo.
    setSize(200, 400);
    setVisible(true);
  }
}