package veh;
//tipo aparente
/**
 * Implementación de Vehiculo
 */
public abstract class Vehiculo implements IVehiculo
{
  private static int numeroSerieGeneral;
  private int numeroSerie;
  private String color;
  private boolean electrico;

  public Vehiculo (String color, boolean electrico){
    this.color = color;
    this.numeroSerie = numeroSerieGeneral;
    numeroSerieGeneral += 1; 
  }

  public String toString (){
    return "Veh." + " - " + color + " - " + numeroSerie;
  }

  public int numeroSerie (){
    return numeroSerie;
  }

  public String color (){
    return color;
  }

  public boolean esElectrico (){
    return esElectrico;
  }

  public void ponerColor (String nuevoColor){
    this.color = nuevoColor;
  }

  public boolean mismoColor (Vehiculo v){
    return this.color.equals(v.color);
  }

  public boolean equals (Object obj){
    if (!(obj instanceof Vehiculo))
      return false;
    Vehiculo v = (Vehiculo)obj;
    return color.equals (v.color) && numeroSerie == v.numeroSerie;
  }

}