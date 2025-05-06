class CajaJugar 
{
  public static void main (String[] args) 
  {
    Caja<Integer> cajaInt    = new Caja<Integer>();
    Caja<String>  cajaString = new Caja<String>();

    cajaInt.add(10); 
    cajaString.add("Porompompero");

    System.out.printf("Integer: %d\n", cajaInt.elemento());
    System.out.printf("String: %20s\n", cajaString.elemento());
  }
}