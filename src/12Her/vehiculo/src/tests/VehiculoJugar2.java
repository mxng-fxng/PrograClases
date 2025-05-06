package tests;
/**
 * Pruebas informales de Vehiculo
 */
import veh.*;
import tads.IList;
import tads.ArrayList;

class VehiculoJugar2
{
  static int cuantasBicis (IList<Vehiculo> ldv)
  {
    int num = 0;
    for (int i=0; i<ldv.size(); i++)
      if (ldv.get(i) instanceof Bicicleta)
        num += 1;
    return num; 
  }
  static IList<Bicicleta> bicis (IList<Vehiculo> ldv)
  {
    IList<Bicicleta> ldb = new ArrayList<Bicicleta>();
    for (int i=0; i<ldv.size(); i++)
      if (ldv.get(i) instanceof Bicicleta)
        ldb.add((Bicicleta)ldv.get(i));
    return ldb;      
  }
  static void prueba_1 ()
  {
    Vehiculo coche, moto, bici;
    coche = new Coche("AZUL", true, 1000);
    moto = new Moto("ROJO", true);
    bici = new Bicicleta("VERDE", true);
    
    IList<Vehiculo> garaje = new ArrayList<Vehiculo>();
    garaje.add(coche);
    garaje.add(moto);
    garaje.add(bici);
    
    System.out.println("garaje = " + garaje);   
    System.out.println("cuantasBicis(garaje) = " + cuantasBicis(garaje));       
  }
  static void prueba_2 ()
  {
    Vehiculo coche, moto, bici1, bici2, bici3;
    coche = new Coche("AZUL", true, 1000);
    moto = new Moto("ROJO", true);
    bici1 = new Bicicleta("ROJO", true);
    bici2 = new Bicicleta("VERDE", true, 30);
    bici3 = new Bicicleta("NARANJA", true, 10);
    
    IList<Vehiculo> garaje = new ArrayList<Vehiculo>();
    garaje.add(coche);
    garaje.add(moto);
    garaje.add(bici1);
    garaje.add(bici2);
    garaje.add(bici3);
    
    System.out.println("garaje = " + garaje);   
    System.out.println("bicis(garaje) = " + bicis(garaje));       
  }
  public static void main (String[] args)
  {
    // prueba_1();
    prueba_2();
  }

}