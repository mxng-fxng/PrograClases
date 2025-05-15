package veh;
//Tipo real
/**
 * Implementación de BiciElec
 */
public class BiciElec extends Bici 
{
  private double alcance; // km con el 100% de batería (80)
  
  public BiciElec (String color, double peso, double alcance){
    super(color, peso);
    this.alcance = alcance;
  }

  public BiciElec (String color){
    super(color);
    this.alcance = 80;
  }

  @Override
  public String toString(){
    return super.toString() + " - BiciElec" + " - alcance:" + alcance;
  }
  
   @Override
  public boolean equals (Object obj) 
  {   
    return 
      obj instanceof BiciElec && 
      super.equals((BiciElec)obj) && 
      peso == ((BiciElec)obj).peso;
  } 
  
}