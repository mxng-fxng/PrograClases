package veh;
//Tipo real
/**
 * Implementaci�n de Coche
 */
public class Coche extends Vehiculo
{
  private int cilindrada;

  /**
   * 
   */

  public Coche (String color, boolean electrico, int cilindrada){
    super(color);
    this.cilindrada = cilindrada;
  }

  public Coche (String color){
    super (color);
    this.cil = 1000; //Valor default
  }

  @Override
  public String toString (){
    return super.toString() + " -  Coche" + " - cil:" + cilindrada; 
  }

  public int cilindrada (){
    return cilindrada;
  }

  public void ponerCilindrada (int nuevaCilindrada){
    this.cilindrada = nuevaCilindrada;
  }

  public boolean equals (Object obj){
    return 
      obj instanceof Coche && 
      cil == ((Coche)obj).cil && 
      super.equals(obj);
  }

}