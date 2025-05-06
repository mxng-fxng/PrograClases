/**
  Un personaje de un juego
*/
import java.util.Arrays;

class Personaje
{ 
  String nombre; // nombre del personaje
  String ciudad; // su ciudad 
  int puntos;    // puntos que lleva
  
  Personaje (String nomb, String ciud, int punt)
  {
    nombre = nomb;
    ciudad = ciud;
    puntos = punt;
  }
  
  public String toString ()
  {
    return nombre + " de " + ciudad + ": " + puntos;
  }
  
  // void saludar ()
  // {
    // System.out.println("Hola, soy " + nombre + " de " + ciudad);
  // }  

  public static void main (String[] args)
  {   
    // 1. sin clase
    // String nombre_1 = "Tales"; 
    // String ciudad_1 = "Mileto";
    // int puntos_1 = 10;
    // System.out.println(nombre_1 + " de " + ciudad_1 + ": " + puntos_1);   	
  
    // 2. con clase y sin visualizador
    // Personaje tales;
    // tales = new Personaje();
    // System.out.println(tales);
    
    // tales.nombre = "Tales";
    // tales.ciudad = "Mileto";
    // tales.puntos = 10;
    // System.out.println(tales.nombre + " de " + tales.ciudad + ": " + tales.puntos);   	
                       
    // 3. con clase, con constructor definido por mí y sin visualizador
    // Personaje tales = new Personaje("Tales", "Mileto", 10);
    // System.out.println(tales);
    
    // 4. con clase + constructor + visualizador 
    // Personaje tales = new Personaje("Tales", "Mileto", 10);
    // System.out.println(tales);

    // 5. con varios personajes
    Personaje tales  = new Personaje("Tales", "Mileto", 10);
    Personaje solon  = new Personaje("Solon", "Atenas", 30);
    Personaje bias   = new Personaje("Bias", "Priene", 40);
   
    Personaje[] lista_personajes = {tales, solon, bias};

    for (p : lista_personajes)
      System.out.println(p); 
    
    System.out.println(Arrays.toString(lista_personajes));
    
    // System.out.println(tales);
    // System.out.println(FolderName.name(tales));
    
    
  }
}