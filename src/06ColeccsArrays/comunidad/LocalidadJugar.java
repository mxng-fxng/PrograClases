/**
 * Pruebas de Localidad
 */
public class LocalidadJugar
{
  public static void main (String[] args)
  {
    Localidad loc2 = new Localidad("Alcorcon", 170296);
    Localidad loc3 = new Localidad("Mostoles", 208761);
    Localidad loc4 = new Localidad("Leganes", 186660);
    System.out.println("loc2 = " + loc2);
    System.out.println("loc3 = " + loc3);
    System.out.println("loc4 = " + loc4);
    
    System.out.println("loc2.poblacion() = " + loc2.poblacion());
    System.out.println("loc3.poblacion() = " + loc3.poblacion());
    System.out.println("loc4.poblacion() = " + loc4.poblacion());
    
    Localidad loc = new Localidad("Total;Madrid;Majadahonda;1 de enero de 2022;72179");
    System.out.println("loc = " + loc);
  }
}