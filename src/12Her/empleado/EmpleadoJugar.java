/**
 * EmpleadoJugar
 */
public class EmpleadoJugar 
{
  public static void main (String[] args) 
  { 
    Empleado p = new Empleado("Perez", "3562");  
    Empleado f = new Empleado("Fernandez", "2312");
    Directivo g = new Directivo("Gomez", "4567", 20000);
    System.out.println("p = " + p);  
    System.out.println("f = " + f);  
    System.out.println("g = " + g);  
  }
}
