package tests;
/**
 * Pruebas informales de Vehiculo
 */
import veh.*;
class VehiculoJugar
{
  // ¿Qué métodos se aplican? 
  // Tipo aparente y tipo real
  // Casting
  static void prueba_1 ()
  {
    Vehiculo coche, moto, bici;
    coche = new Coche("AZUL", true, 1000);
    moto = new Moto("ROJO", true);
    bici = new Bicicleta("VERDE", true);
    
    System.out.println("coche = " + coche);   
    System.out.println("moto = " + moto);   
    System.out.println("bici = " + bici);   
    System.out.println();
    
    // toString en Vehiculo y en Coche (redefinición / sobreescritura)
    System.out.println("coche.toString() = " + coche.toString());
    
    // color solo en Vehiculo
    System.out.println("coche.color() = " + coche.color());
    
    // cilindrada solo en Coche: error de compilación
    // System.out.println("coche.cilindrada() = " + coche.cilindrada()); 
    
    // Un Vehiculo se puede ver como un Coche si realmente es un Coche:
    System.out.println("((Coche)coche).cilindrada() = " + 
                        ((Coche)coche).cilindrada()); 
    
    // Una Bicicleta no puede ser nunca un Coche: error de ejecución - 
    // - ClassCastException
    System.out.println("((Coche)bici).cilindrada() = " + ((Coche)bici).cilindrada()); 
  }
  
  // Polimorfismo
  // Casting
  static void prueba_2 ()
  {
    Vehiculo coche, moto, bici;
    coche = new Coche("AZUL", true, 1000);
    moto = new Moto("ROJO", true);
    bici = new Bicicleta("VERDE", true);
    
    Vehiculo[] garaje = new Vehiculo[3];
    garaje[0] = coche;
    garaje[1] = moto;
    garaje[2] = bici;
    
    System.out.println("garaje = ");   
    for (Vehiculo v : garaje) System.out.println(v + " ");
    Coche c = (Coche)garaje[0];
  }
  
  // 
  static void prueba_3 () //ok
  {
    Coche c = new Coche("AZUL", true, 1000);
    Moto m = new Moto("ROJO", true);
    Bicicleta b = new Bicicleta("VERDE", true);
    
    Vehiculo[] garaje = new Vehiculo[3];
    garaje[0] = c;
    garaje[1] = m;
    garaje[2] = b;
    
    System.out.println("garaje = ");   
    for (Vehiculo v : garaje) System.out.println(v + " "); 
  }  
  static void prueba_4 () 
  {
    Moto m = new Moto("ROJO", true);
    Bicicleta b = new Bicicleta("ROJO", true);
    System.out.println("m.mismoColor(b) = " + m.mismoColor(b)); 
  }
  static void prueba_5 ()
  {
    Vehiculo coche, moto, bici;
    coche = new Coche("AZUL", true, 1000);
    moto = new Moto("AZUL", true);
    bici = new Bicicleta("AZUL", true);
    
    System.out.println("coche.equals(coche) = " + coche.equals(coche));   
    System.out.println("moto.equals(moto) = " + moto.equals(moto));   
    System.out.println("bici.equals(bici) = " + bici.equals(bici));   
    System.out.println("coche.equals(bici) = " + coche.equals(bici));   
    System.out.println("coche.equals(moto) = " + coche.equals(moto));   
    System.out.println("bici.equals(moto) = " + bici.equals(moto));   
  }
  public static void main (String[] args)
  {
    // prueba_1();
    // prueba_2();
    prueba_3();
    // prueba_4();
    // prueba_5();
  }

}