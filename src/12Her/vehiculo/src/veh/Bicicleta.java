package veh;
//tipo real
/**
 * Implementaci�n de Bicicleta
 */
public class Bicicleta extends Vehiculo
{
  private double peso; 

  public Bicicleta (String color, boolean electrica, double peso){
    super(color);
    this.peso = peso;
  }
  
  public Bicicleta (String color, boolean electrica){
    super(color);
    this.peso = 20;
  }
  
  @Override
  public String toString (){
    return super.toString() + " - Bici" + " - peso:" + peso;
  }
  
  //public boolean esElectrica (){}

  public double peso (){
    return peso;
  }

 @Override
  public boolean equals (Object obj) 
  {   
    return 
      obj instanceof Bici && 
      super.equals((Bici)obj) && 
      peso == ((Bici)obj).peso;
  } 

}