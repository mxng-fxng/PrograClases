//import java.awt.*;
import javax.swing.*;

/** 
 * Uso de la clase JFrame. 
 * @author David Gries
 * @version 1.0
*/

public class JFrameDemo {
    
    public static void normalMethod () {
        System.out.println("Method begin");        
        System.out.println("Method end");
    }
    
    public static void creaFrame () {
        JFrame f = new JFrame();
        f.setSize(800, 800);
        //f.setVisible(true);
        f.show();
    }
    
}