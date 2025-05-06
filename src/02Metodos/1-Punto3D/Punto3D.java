/**
 * Punto3D 
 * Punto en 3D.
 */
class Punto3D {
  
  double x; // coordenada x; sin restricciones
  double y; // coordenada y; sin restricciones
  double z; // coordenada z; sin restricciones
  
  /** 
   * Constructor: un punto en el origen
   */
  Punto3D () {
    x = 0.0;  
    y = 0.0;  
    z = 0.0;
  }    
  /** 
   * Constructor: un punto con coordenadas (x0, y0, z0)
   */
  Punto3D (double x0, double y0, double z0) {
    x = x0;
    y = y0;
    z = z0;
  }   
  /** 
   * Visualizador en modo texto
   */
  public String toString () {
    return "(" + x + ", " + y + ", " + z + ")";
  }
  /** 
   * resultado (produce - yields - retorna - devuelve) es 
   *   la distancia euclídea de este punto a q
   */
  double distancia (Punto3D q) {
    return Math.sqrt((x-q.x)*(x-q.x)+
                     (y-q.y)*(y-q.y)+
                     (z-q.z)*(z-q.z));
  }
  
  public double getX () {
    return x;
  }

  public void setX (double valor) {
    x = valor;
  }

  public double getY () {
    return y;
  }

  public void setY (double valor) {
    y = valor;
  }

  public double getZ () {
    return z;
  }

  public void setZ (double valor) {
    z = valor;
  }

  // static boolean estaEnOrigen (Punto3D p) {
    // return x == 0 && y == 0 && z == 0;
  // }
  
}