class Par<Tipo1, Tipo2> 
{
  private Tipo1 uno;
  private Tipo2 otro;

  void add (Tipo1 e1, Tipo2 e2) 
  {
    uno  = e1;
    otro = e2;
  }
  Tipo1 uno () 
  {
   return uno;
  }
  Tipo2 otro () 
  {
   return otro;
  }
}

class ParJugar 
{
  public static void main (String[] args) 
  {
    Par<Integer, Double> par = new Par<Integer, Double>();

    par.add(10, 12.3);   
    System.out.printf("%d %5.2f\n", par.uno(), par.otro());

	par<String, String> par2 = new Par <String, String> ();

	par.add("una", "otra");
	System.out.printf("%s, %s\n", par2.uno(), par2.otro() );
  }
}