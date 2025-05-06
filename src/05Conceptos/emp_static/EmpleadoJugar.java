/**
 * EmpleadoJugar
 */
public class EmpleadoJugar 
{
  public static void main (String[] args) 
  { 
    Empleado p = new Empleado("Perez", "3562");  
    System.out.println("p = " + p);  
    System.out.println("Empleado.numEmpleados() = " + Empleado.numEmpleados());  
    Empleado f = new Empleado("Fernandez", "2312");
    System.out.println("f = " + f);  
    System.out.println("Empleado.numEmpleados() = " + Empleado.numEmpleados());  
  }
  
}
