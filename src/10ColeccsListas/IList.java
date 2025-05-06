package tads;

/**
 * Especificación del TAD {@code IList}: lista de elementos con acceso
 * por posición (se ha tomado el modelo el interfaz {@code List} de
 * Java).
 */
public interface IList<E> {

  /**
   * Inserta un elemento en la lista al final.
   *
   * @param elem el nuevo elemento que se va a insertar 
   */
  void add (E elem);

  /**
   * Inserta un elemento en la lista en una posición determinada.
   *
   * Coloca {@code element} en {@code index} y desplaza desde esa posición el
   * resto de los elementos una posición a la derecha.
   *
   * @param index el lugar donde se va a insertar
   * @param elem el nuevo elemento que se va a insertar 
   * @pre. {@code index in [0, size()]}
   * @throws IndexOutOfBoundsException si el índice no está entre los
   * límites indicados (depende de la implementación)
   */
  void add (int index, E elem);

  /**
   * Devuelve el elemento que está en la posición {@code index}.
   *
   * @param index el índice del elemento que se va a devolver (empezando en cero)
   * @pre. {@code index in [0, size())} 
   * @post. {@code resultado} es el elemento que ocupa la posición {@code index}
   * @return El elemento en la posición dada por index
   * @throws IndexOutOfBoundsException si el índice no está entre los
   * límites indicados (depende de la implementación)
   */
  E get (int index);

  /**
   * Devuelve la longitud de la lista.
   *
   * @pre. {@code index in [0, size())} 
   * @post. {@code resultado} es el número de elementos que hay en la lista
   * @return el número de elementos actualmente en la lista
   */
  int size ();

  /**
   * Pone {@code elem} en la posición {@code index} de la lista, eliminando el
   * elemento que había en esa posición.
   * 
   * @param index el lugar donde se va a colocar el número elemento
   * @param elem el nuevo elemento de la lista
   * @pre. index in [0, size())
   * @post. get(index) == {@code elem}
   * @throws IndexOutOfBoundsException si el índice no está entre los
   * límites indicados (depende de la implementación)
   */
  void set (int index, E elem);

  /**
   * Busca un elemento en la lista.
   *
   * @param elem el elemento a buscar en la lista
   * @post. si existe: get(indexOf(elem)) == elem
   * @return el índice que ocupa (empezando en cero) la primera
   * ocurrencia de {@code elem} en la lista, -1 si no existe
   */
  int indexOf (E elem);

  /**
   * Quita de la lista el elemento que está en la posicion {@code index}.
   *
   * @pre. {@code index} in [0, size())
   * @post. el tamaño de la lista se ha decrementado en uno
   * @param index el índice del elemento que se va a eliminar 
   * @throws IndexOutOfBoundsException si el índice no está entre los
   * límites indicados (depende de la implementación)
   */
  void remove (int index);

  /**
   * Quita la primera ocurrencia de {@code elem} de la lista. Si no existe, no hace nada.
   * 
   * @post. Si existe el tamaño de la lista lista se decrementa en uno
   * @param elem el elemento a eliminar
   */
  void remove (E elem);

  /**
   * Devuelve una vista de la porción del objeto entre las posiciones
   * {@code inicio} y {@code fin - 1}.
   *
   * @param inicio el índice del primer elemento de la lista resultante
   * @param fin, fin - 1 es el índice del último elemento de la lista resultante 
   * @pre. {@code inicio >= 0 and fin <= size() and inicio <= fin}
   * @post. sublist(a, b).size() == b - a
   * @return una lista con los elementos de la original en [inicio, fin)
   * @throws IndexOutOfBoundsException si los índices no están entre
   * los límites indicados (depende de la implementación)
   */
  IList<E> subList (int inicio, int fin);

  /**
   * Devuelve una representación de la lista. En el string devuelto,
   * <b>el elemento de la lista, el que ocupa la posición 0, debería
   * ser el primer elemento en aparecer</b>.
   */
  String toString();
}
