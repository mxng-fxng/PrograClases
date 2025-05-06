class ParJugar 
{
  public static void main (String[] args) 
  {
    Par<Integer, Double> par = new Par<Integer, Double>();

    par.add(10, 12.3);   
    System.out.printf("%d %5.2f\n", par.uno(), par.otro());
  }
}