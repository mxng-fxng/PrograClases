/**
 * Punto en 3D
 */
class Punto3D {
 
    double x; // coordenada x; sin restricciones
    double y; // coordenada y; sin restricciones
    double z; // coordenada z; sin restricciones
    
    /** 
     * Constructor: un Punto3D en el origen
     */
    Punto3D () {
      x = 0.0;  
      y = 0.0;  
      z = 0.0;
    }    
    /** 
     * Constructor: un Punto3D con coordenadas (x0, y0, z0)
     */
    Punto3D (double x0, double y0, double z0) {
      x = x0;
      y = y0;
      z = z0;
    }   
    /** 
     * resultado: este Punto3D convertido a texto
     */
    public String toString () {
      return "(" + x + ", " + y + ", " + z + ")";
    }
    
}