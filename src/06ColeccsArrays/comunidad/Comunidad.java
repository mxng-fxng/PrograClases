/**
 * Comunidad Autónoma como colección de Localidad(es).
 * Implementada como un array[Localidad].
 */
import java.util.Arrays;

public class Comunidad 
{
  /* Colección de localidades */
  private Localidad[] ldloc;
  
  /* Número de localidades guardadas en la colección */
  private int size;
  
  /** Constructor de Comunidad */
  public Comunidad ()
  {
  }
  
  /** "loc está en esta Comunidad" */
  private boolean esta (Localidad loc)
  {
  }  
  
  /** Comunidad como texto */
  public String toString ()
  {
  }
  
  /** Añade loc a esta Comunidad poniéndola al final */
  public void add (Localidad loc)
  {
  }
  
 /**
  * POST: resultado: listado de los nombres de Localidad(es)
  *                  que están en esta Comunidad, cada nombre en una línea. 
  */
  public String nombresLocalidades ()
  {
  }
  
  /*
   * POST: Devuelve la posición que ocupa la Localidad con este nombre.
   *       Si no se encuentra, devuelve -1. 
   */
  public int posicion (String nombre)
  {
  }
  
  /*
   * POST: Devuelve la población de la Localidad  con este nombre. 
   *       Si no se encuentra, devuelve -1. 
   */
  public int poblacion (String nombre)
  {
  }
  
  /*
   * POST: resultado: población total del grupo de localidades 
   *                  cuyos nombres vienen en ldloc. 
   */
  public int poblacionConjunta (String[] locs)
  {
  }

}