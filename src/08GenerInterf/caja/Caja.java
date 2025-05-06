class Caja<Tipo> 
{
  private Tipo elemento;

  void add (Tipo e) 
  {
    elemento = e;
  }
  Tipo elemento () 
  {
   return elemento;
  }
}