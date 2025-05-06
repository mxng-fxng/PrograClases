class IntOps 
{ 
  public static void main (String[] args) 
  {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

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
