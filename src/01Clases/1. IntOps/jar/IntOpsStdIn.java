import stdlib.*;

public class IntOpsStdIn
{ 
  public static void main (String[] args) 
  {
    System.out.print("a>");
    int a = StdIn.readInt();
    System.out.print("b>");
    int b = StdIn.readInt();
    
    int suma  = a + b;
    int producto = a * b;
    int cociente = a / b;
    int resto  = a % b;

    System.out.println(a + " + " + b + " = " + suma);
    System.out.println(a + " * " + b + " = " + producto);
    System.out.println(a + " / " + b + " = " + cociente);
    System.out.println(a + " % " + b + " = " + resto);
    System.out.println(a + " = " + cociente + " * " + b + " + " + resto);
  }
}
