/**
 * Hora. 
 * 
 * Ejemplo de excepciones no comprobadas (RuntimeException). 
 * Vigilancia del invariante de un tipo.
 */
 
public class Hora 
{ 
  private int horas; 
  private int minutos; 
  public Hora (int horas, int minutos) //throws RuntimeException
  { 
    if (!esHoraValida(horas))
      throw new RuntimeException("horas no es válido: " + horas); 
    else 
      this.horas = horas; 
    if (!esMinutoValido(minutos))
      throw new RuntimeException("minutos no es válido: " + minutos); 
    else 
      this.minutos = minutos; 
  } 
  private static boolean esHoraValida (int horas)
  {
    return horas >= 0 && horas < 24; 
  } 
  private static boolean esMinutoValido (int minutos)
  { 
    return minutos >= 0 && minutos < 60; 
  }
  public String toString () 
  {
    return 
      new String( "Hora : " + 
                  "\t" + "horas : " + this.horas + 
                  "\t" + "minutos : " + this.minutos);  
  }

} 
