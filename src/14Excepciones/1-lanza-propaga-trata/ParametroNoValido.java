class ParametroNoValido extends Exception
{
  ParametroNoValido () 
  {
  }
  ParametroNoValido (String msj) 
  {
    super(msj);
  }
}