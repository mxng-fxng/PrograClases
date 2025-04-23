class Node<E> 
{
  E element;
  Node<E> next;

  Node (E e, Node<E> n) 
  {
    element = e;
    next    = n;
  }
}



public class ListaBasica 
{
	static String toString (Node <Integer> lde)
	{
		Node <Integer> aux = lde; //variable local auxiliar
		String s = "";
		while (aux != null)
		{
		s += aux.element + " ";
		aux = aux.next;
		}
		return s;
	}

  public static void main (String[] args) 
  {
    Node<Integer> lista; //variable tipo objeto
    
//Asignaciones
    lista = null;// lista =[]
    lista = new Node<Integer>(14, lista); //recursividad, nuevo objeto; lista = [14]            
    lista = new Node<Integer>(25, lista);//lista = [25,14]
    lista = new Node<Integer>(36, lista);// lista = [36,25,14]
      
    // lista = new Node<Integer>(36, 
              // new Node<Integer>(25, 
                // new Node<Integer>(14, null)));
                 
    System.out.println(toString(lista));
    // System.out.println(toStringRec(lista));   
  }
}