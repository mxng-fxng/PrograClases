class Directivo extends Empleado
{
  private int extras;
    
  Directivo (String nombre, String dni, int extras) 
  {
    super(nombre, dni);
    this.extras = extras;
  }
  Directivo (String nombre, int extras)  
  {
    this(nombre, "", extras);
  }
  
  @Override
  public String toString () 
  { 
    return super.toString() + ", extras:" + extras; 
  }
  int extras () 
  {
    return extras; 
  }
  @Override
  int sueldo () 
  {
    return super.sueldo() + extras; 
  }
}