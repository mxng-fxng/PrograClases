class Empleado 
{
  private String nombre; // Nunca null, usar "" si no se conoce
  private String dni;    // Nunca null, usar "" si no se conoce  
  private static int numEmpleados;
  
  Empleado (String nom, String num_dni) {
    nombre = nom;
    dni = num_dni;
    numEmpleados += 1;
  }
  Empleado (String nom) {
    this(nom, "");
  }
  String nombre () {
    return nombre;
  }   
  String dni () {
    return dni;
  }
  public String toString () {
    return "Empleado " + nombre + " - DNI: " +  dni;
  }
  static int numEmpleados () {
    return numEmpleados;
  }
  
}