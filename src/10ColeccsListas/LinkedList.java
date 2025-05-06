package tads;

/**
 * Implementación de {@code IList} mediante una cadena enlazada.
 */
public class LinkedList<E> implements IList<E> {

  private Node<E> cabeza;

  public LinkedList () {
    cabeza = null;
  }

  public void add (int index, E element) {
    if (index < 0 || index > size())
      throw new IndexOutOfBoundsException("add : at " + index);
    if (index == 0)
      cabeza = new Node<>(element, cabeza);
    else {
      Node<E> aux = cabeza;
      for (int i = 0; i <= index - 2; i++)
        aux = aux.next;
      aux.next = new Node<E>(element, aux.next);
    }
  }

  public void add (E element) {
    add(size(), element);
  }

  public E get (int index) {
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException("get: at " + index);
    Node<E> aux = cabeza;
    for (int i = 0; i <= index - 1; i++)
      aux = aux.next;
    return aux.element;
  }

  public int size () {
    int num = 0;
    Node<E> aux = cabeza;
    while (aux != null) {
      num = num + 1;
      aux = aux.next;
    }
    return num;
  }

  public void set (int index, E element) {
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException("set: at " + index);
    Node<E> aux = cabeza;
    for (int i = 0; i <= index - 1; i++)
      aux = aux.next;
    aux.element = element;
  }

  public int indexOf (E element) {
    int pos = 0;
    Node<E> aux = cabeza;
    boolean encontrado = false;
    while (aux != null && !encontrado)
      if (aux.element.equals(element))
        encontrado = true;
      else {
        pos = pos + 1;
        aux = aux.next;
      }
    return encontrado ? pos : -1;
  }

  public void remove (int index) {
    if (index < 0 || index > size() - 1)
      throw new IndexOutOfBoundsException("remove: at " + index);
    Node<E> actual = cabeza;
    Node<E> anterior = cabeza;
    for (int i = 0; i <= index - 1; i++) {
      anterior = actual;
      actual = actual.next;
    }
    if (actual == anterior)
      cabeza = cabeza.next;
    else if (actual == null)
      anterior.next = null;
    else
      anterior.next = actual.next;
  }

  public void remove (E element) {
    int pos = indexOf(element);
    if (pos > -1)
      remove(pos);
  }

  public String toString () {
    String salida = "[";
    Node<E> aux = cabeza;
    int cont = 0;
    while (aux != null) {
      if (cont != 0)
        salida += ", ";
      salida += aux.element;
      aux = aux.next;
      cont += 1;
    }
    return salida + "]";
  }

  public IList<E> subList (int fromIndex, int toIndex) {
    if (fromIndex < 0 || toIndex > size() || fromIndex > toIndex)
      throw new IndexOutOfBoundsException("sublist:  (" + fromIndex + ", " + toIndex + ")");
    IList<E> result = new LinkedList<>();
    int j = 0;
    for (int i = fromIndex; i < toIndex; i += 1) {
      result.add(j, get(i));
      j += 1;
    }
    return result;
  }
}
