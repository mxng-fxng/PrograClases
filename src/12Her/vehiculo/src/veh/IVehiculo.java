package veh;
/**
 * Especificación de Vehiculo
 */
public interface IVehiculo
{
  /**
   * Vehiculo convertido a texto
   */
  public String toString ();
  
  /**
   * Color del objeto.
   */
  public String color ();
  
  /**
   * Numero de serie del objeto.
   */
  public int numeroSerie ();
  
  /**
   * Modifica el color del objeto con nuevoColor
   */
  public void ponerColor (String nuevoColor);
}