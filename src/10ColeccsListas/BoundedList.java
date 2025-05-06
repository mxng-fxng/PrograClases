package tads;

/**
 * Implementación de {@code IBoundedList} basada en un array.
 */
public class BoundedList<E> implements IBoundedList<E> {
  private static final int DEFAULT_LENGTH = 32;
  private Object[] elements;
  private int size;

  public BoundedList () {
    elements = new Object[DEFAULT_LENGTH];
    size = 0;
  }

  public BoundedList (int n) {
    elements = new Object[n];
    size = 0;
  }

  public String toString () {
    String result = "[";
    for (int i = 0; i < size; i++) {
      result = result + elements[i].toString();
      if (i < size - 1)
        result = result + ", ";
    }
    result = result + "]";
    return result;
  }

  public void add (int index, E element) {
    if (index < 0 || index > size())
      throw new IndexOutOfBoundsException("add: at " + index);
    for (int i = size; i > index; i--)
      elements[i] = elements[i - 1];
    elements[index] = element;
    size = size + 1;
  }
  
  public void add (E element) {
    add(size(), element);
  }

  @SuppressWarnings("unchecked")
  public E get (int index) {
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException("get: at " + index);
    return (E) elements[index];
  }

  public int size () {
    return size;
  }

  public void set (int index, E element) {
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException("set: at " + index);
    elements[index] = element;
  }

  public int indexOf (E element) {
    int i = 0;
    boolean esta = false;
    while ((i < size) && !esta)
      if (element.equals(elements[i]))
        esta = true;
      else
        i = i + 1;
    return (esta) ? i : -1;
  }

  public void remove (int index) {
    if (index < 0 || index >= size())
      throw new IndexOutOfBoundsException("remove: at " + index);
    for (int i = index; i < size - 1; i++)
      elements[i] = elements[i + 1];
    size = size - 1;
  }

  public void remove (E elem) {
    int pos = indexOf(elem);
    if (pos > -1)
      remove(pos);
  }

  public IList<E> subList (int fromIndex, int toIndex) {
    if (fromIndex < 0 || toIndex > size() || fromIndex > toIndex)
      throw new IndexOutOfBoundsException("sublist: (" + fromIndex + ", " + toIndex + ")");
    IList<E> result = new BoundedList<>();
    int j = 0;
    for (int i = fromIndex; i < toIndex; i += 1) {
      result.add(j, get(i));
      j += 1;
    }
    return result;
  }

  public boolean isFull () {
    return elements.length == size;
  }

}
