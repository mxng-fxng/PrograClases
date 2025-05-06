import javax.swing.JOptionPane;

/** 
 * Lee un dato y muestra un resultado mediante un GUI. 
 * @author Javier Galve
 * @version 1.0
*/

class JOptionPaneDemo 
{

  public static void main (String[] args)
  {
      
    int horas =                                          
      Integer.parseInt(JOptionPane.showInputDialog
                            ( "Horas trabajadas>" ));   
    JOptionPane.showMessageDialog
      (null, "Paga = " + horas*20, 
       "Paga", JOptionPane.PLAIN_MESSAGE);

  }  
}