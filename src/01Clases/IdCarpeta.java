/**
 * El id o dirección de la carpeta de un objeto
 */
public class IdCarpeta {
 
  /** POST: resultado: la direccion de o en hexadecimal*/ 
  public static String id (Object o) {
    return "@"+Integer.toHexString(System.identityHashCode(o));
    // return "@"+Integer.toHexString(o.hashCode());  
     // getClass().getName() + '@' + Integer.toHexString(hashCode())    
  } 
    
}