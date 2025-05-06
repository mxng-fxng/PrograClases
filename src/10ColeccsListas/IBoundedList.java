package tads;

/**
 * Añade el método {@code isFull} a {@code IList}.
 *
 * El método {@code add} podría lanzar una {@code IllegalArgumentException}
 * si la lista está llena.
 */
public interface IBoundedList<E> extends IList<E> {
  /**
   * Comprueba si la lista está llena. 
   * @return verdadero si la lista está llena, falso en caso contrario
   */
  boolean isFull ();
}
