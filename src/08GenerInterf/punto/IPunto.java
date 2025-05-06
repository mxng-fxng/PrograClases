/** 
 * Especificación del TAD Punto.
 * 
 * @author Javier Galve
 */
interface IPunto 
{
  /**
   * Punto ()
   * POST: Constructor de Punto.
   */
  /**
   * Punto (x : double, y : double);
   * POST: Constructor de Punto.
   */
  public String toString ();
  /**
   * POST: Visualizador de Punto.
   */
  boolean equals (Object o);
  /**
   * POST: Comparador de Punto.
   */
  double distancia (IPunto q);
  /**
   * POST: Calcula la distancia de este Punto a q.
   */
  void mover (double dx, double dy);
  /**
   * Mueve este punto según (dx, dy).
   */
  double x ();
  double y ();
}

