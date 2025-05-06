/**
 * Pruebas informales de Comunidad
 */
import stdlib.StdIn; 

public class ComunidadJugar
{
  public static void prueba_1 ()
  {
    Comunidad vacia = new Comunidad();
    System.out.println("vacia = " + vacia);   
    System.out.println();
  }
  public static void prueba_2 ()
  {
    Comunidad com = new Comunidad();
    Localidad loc2 = new Localidad("Alcorcon", 170296)
    Localidad loc3 = new Localidad("Mostoles", 208761);
    Localidad loc4 = new Localidad("Leganes", 186660);    
    com.add(loc2);
    com.add(loc3);
    com.add(loc4);
    System.out.println(com); 
  }
  /**
   * Crea una Comunidad leyendo los datos de la entrada estándar. 
   * Cada línea tiene el formato:
   *         Sexo;Provincia;Municipio;Fecha;Total
   * DONDE:
   *    Sexo = Total | Hombres | Mujeres
   */
  public static Comunidad comunidad () 
  {
    Comunidad com = new Comunidad();
    String linea = StdIn.readLine(); //Salta la primera línea.
    linea = StdIn.readLine(); //Salta la segunda línea.
    while (!StdIn.isEmpty())
    {  
      linea = StdIn.readLine();
      if (esValida(linea))
      {
        Localidad loc = new Localidad(linea);      
        com.add(loc);
      }       
    }   
    return com;
  }
  
  public static boolean esValida (String linea)
  {
    String[] items = linea.split(";");
    return items[0].equals("Total");
  }
  
  public static void prueba_3 ()
  {
    Comunidad com = new Comunidad();
    Localidad loc2 = new Localidad("Alcorcon", 170296)
    Localidad loc3 = new Localidad("Mostoles", 208761);
    Localidad loc4 = new Localidad("Leganes", 186660);    
    com.add(loc2);
    com.add(loc3);
    com.add(loc4);
    System.out.println(com); 
    System.out.println("comunidad = " + "\n" + com.nombresLocalidades());   
    // Alcorcon
    // Mostoles    
    // Leganes
  }
  
  public static void main (String[] args)
  {
    prueba_1();
    prueba_2();
    prueba_3();
  }
}