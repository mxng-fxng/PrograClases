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