public class BiciElec {
  
  /* Atributos */
  private String marca;
  private int bateria; // batería actual en porcentaje (0-100)
  private double alcance; // km con el 100% de batería (80)
  
  /**
   * Constructor
   */
  public BiciElec (String marca, double alcance) 
  {
  }

  /**
   * resultado: distancia en número de km que puede alcanzar esta 
   *            bici con la batería actual
   */
  public int distancia () 
  {
  }
    
  /**
   * "esta bici puede alcanzar una distancia d con la batería actual"
   */
  public boolean puedeLlegar (double d) 
  {
  }

  /**
   * Carga la batería con carga en %.
   * Si no cabe, no hace nada.
   */
  public void cargar (double carga)
  {
  }

  /**
   * Recorre d km y gasta la batería correspondiente.
   * Si gasta más de la que se necesita, deja la bateria a 0.
   */
  public void recorrer (int d)
  {
  }

  @Override
  public String toString() {
      return "BiciElec (" +
             "marca=" + marca + 
             ", bateria=" + bateria + "%" +
             ", alcance=" +  alcance + ")";
  }

  // Ejemplo de uso
  public static void main(String[] args) {
    BiciElec b1 = new BiciElec("BH", 80);
    System.out.println(b1);
    System.out.println(b1.distancia());
    System.out.println(b1.puedeLlegar(80));
    b1.cargar(100);
    System.out.println(b1);
    System.out.println(b1.distancia());
    System.out.println(b1.puedeLlegar(80));
    b1.recorrer(10);
    System.out.println(b1);
    System.out.println(b1.distancia());
    System.out.println(b1.puedeLlegar(80));
  }
}