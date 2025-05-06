import javax.swing.JFrame;
import java.util.Date;

public class JFrameTest
{ 
  public static void main (String[] args) 
  {
    JFrame jf = new JFrame();
    jf.setSize(400, 400);
    jf.setVisible(true);
    jf.setTitle(new Date() + "");
  }
    
}