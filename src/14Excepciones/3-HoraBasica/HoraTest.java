/**
 * HoraTest.
 * Prueba de Hora.
 * 
 * Ejemplo de excepciones no comprobadas (RuntimeException). 
 * Vigilancia del invariante de un tipo.
 */
 
 public class HoraTest 
{ 
  public static void test ()
  { 
    Hora h1 = new Hora(10, 10); 
    System.out.println("h1 = " + h1); 
    Hora h2 = new Hora(3, 44); 
    System.out.println("h2 = " + h2); 
    
    //Ejecutar 1 y 2 en exclusión: 1 | 2
  
    //1. horas no es válido
    Hora h3 = new Hora(-1, 0); // lanza excepción 
    System.out.println("h3 = " + h3); 
  
    //2. minutos no es válido
    // Hora h4 = new Hora(5, 77); // lanza excepción
    // System.out.println("h4 = " + h4); 
    
  } 
  public static void main (String[] args) 
  { 
    test(); 
  } 
} 
