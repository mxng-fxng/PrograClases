/** 
 * Cronometro para medir el tiempo de ejecución
 */
class Crono
{
  long inicio;   // en nanosegs o microsegs

  Crono () {
    inicio = System.nanoTime();  
    // inicio = System.currentTimeMillis();  
  }
  /** Da el tiempo transcurrido en segundos */
  double tiempo () {
    long ahora = System.nanoTime();    
    return (ahora - inicio) / 1e9;
  }
}
