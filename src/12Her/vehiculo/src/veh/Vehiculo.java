package veh;
/**
 * Implementación de Vehiculo
 */
public abstract class Vehiculo implements IVehiculo
{
  private static int numeroSerieGeneral;
  private int numeroSerie;
  private String color;
  private boolean electrico;

  public Vehiculo (String color, boolean electrico)

  public String toString ()

  public int numeroSerie ()

  public String color ()

  public boolean esElectrico ()

  public void ponerColor (String nuevoColor)

  public boolean mismoColor (Vehiculo v)

  public boolean equals (Object obj) 

}