/**
 * Enumerados.
 * 
 * @author Javier Galve
 */
import stdlib.StdIn;

class Colores
{
  enum Color {ROJO, AMARILLO, VERDE};
  
  static String alerta (Color c) 
  {
    switch(c) 
    {
      case ROJO: case AMARILLO: return "parar";
      default: return "adelante";
    }
  }
  public static void main (String[] args)
  {
    // mostrar la lista de todos los colores
    for (Color c : Color.values()) System.out.println("Color " + c);
    
    // usar un color
    Color c = Color.VERDE;
    System.out.println("c = " + c);
    System.out.println("c.ordinal() = " + c.ordinal());

    // Comparación:
    // System.out.println("c == ROJO --> " + c == Color.ROJO); //error de compilac.
    System.out.println("c.equals(Color.ROJO) --> " + c.equals(Color.ROJO));
    
    // uso de switch: 
    System.out.println("alerta(c) = " + alerta(c));
    
    // leer un texto
    System.out.print("Color> ");
    String texto = StdIn.readString();
    // convertir texto a un color
    c = Color.valueOf(texto);
    System.out.println("\nc = " + c);
  }
  
}