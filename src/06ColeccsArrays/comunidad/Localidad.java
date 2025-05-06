/**
 * Datos de población de una Localidad.
 */
class Localidad 
{  
  /* Nombre de la localidad */
  private String nombre;
  
  /* Población */
  private int poblacion;
  
  /** Constructor de Localidad */
  Localidad (String nombre, int poblacion)
  {
    this.nombre = nombre;
    this.poblacion = poblacion;
  }
  
  /** Constructor de Localidad a partir de una línea de texto */
  Localidad (String linea)
  {
    String[] items = linea.split(";");
    nombre = items[2];
    this.nombre = nombre;
    this.poblacion = Integer.parseInt(items[4]);
  }
  
  /** Localidad como texto */
  public String toString ()
  {
    return "(" + nombre + ", " + poblacion + ")";
  }
  
  /** Nombre de esta localidad */
  String nombre ()
  {
    return nombre;
  }
  
  /** Población total de esta localidad */
  int poblacion ()
  {
    return poblacion;
  }  
  
  /** Comparador de Localidad por igualdad */
  public boolean equals (Object o) 
  {
    Localidad loc = (Localidad)o;
    return 
      nombre.equals(loc.nombre) && 
      poblacion == loc.poblacion;
  }

}