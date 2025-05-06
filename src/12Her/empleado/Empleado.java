class Empleado 
{
  private String nombre; // Nunca null, usar "" si no se conoce
  private String dni;    // Nunca null, usar "" si no se conoce  
  private int sueldo;
  
  Empleado (String nombre, String dni) {
    this.nombre = nombre;
    this.dni = dni;
    sueldo = 30000;
  }
  Empleado (String nombre) {
    this(nombre, "");
  }
  public String toString () {
    return "Empleado " + nombre + 
           " - DNI: " +  dni;
  }
  String nombre () {
    return nombre;
  }   
  String dni () {
    return dni;
  }
  int sueldo () {
    return sueldo;
  }
  void cambiarSueldo (int s) {
    sueldo = s;
  }
}