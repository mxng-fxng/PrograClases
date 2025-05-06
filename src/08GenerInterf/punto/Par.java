class Par<Tipo_1, Tipo_2> 
{
  private Tipo_1 uno;
  private Tipo_2 otro;

  void add (Tipo_1 e_1, Tipo_2 e_2) 
  {
    uno  = e_1;
    otro = e_2;
  }
  Tipo_1 uno () 
  {
   return uno;
  }
  Tipo_2 otro () 
  {
   return otro;
  }
}