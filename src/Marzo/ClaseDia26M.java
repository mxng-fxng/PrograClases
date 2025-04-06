class Clase26M{
/** 
 * Bola
 */
import stdlib.StdDraw;
import java.awt.Color;
 
public class Bola
{ 
  private double x, y;    // posición
  private double dx, dy;  // velocidad
  private double radio;   // radio
  private Color color;    // color

  Bola (double x, double y, double radio, double dx, double dy, Color color)
  {
    this.x = x;
    this.y = y;
    this.radio = radio;
    this.color = color;
    this.dx = dx;
    this.dy = dy;
  }
  Bola (double x, double y, double radio, Color color)
  {
    this(x, y, radio, 1, 1, color);
  }=
  void mover () 
  {  
    x += dx;
    y += dy;
  }
  private boolean estaDentroX (int n)
  {
    return x + dx - radio >= -n && x + dx + radio <= n;
  }
  private boolean estaDentroY (int n)
  {
    return y + dy - radio >= -n && y + dy + radio <= n;
  }
  void rebotar (int n)
  {
    if (!estaDentroX(n))
      dx = -dx;
    if (!estaDentroY(n))
      dy = -dy;
  }
  double x ()
  {
    return x;
  }
  double y ()
  {
    return y;
  }
  double radio ()
  {
    return radio;
  }
  Color color()
  {
    return color;
  }

}

/** 
 * Juego
 */
import stdlib.StdDraw;
import java.awt.Color;
 
public class Juego
{ 
  static final int MAX = 600;
  static final int n = 100;

  static void iniciarGraficos () 
  {  
    StdDraw.setCanvasSize(MAX, MAX);
    StdDraw.setScale(-n, n);
    StdDraw.setPenRadius(0.01);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.enableDoubleBuffering();
  }   
  static void dibujar (Bola b) 
  {
    StdDraw.setPenColor(b.color());
    StdDraw.filledCircle(b.x(), b.y(), b.radio());
  }  
  static void animacion (Bola b)
  {
    while (true)  
    {
      StdDraw.clear();
      dibujar(b); 
      b.rebotar(n);
      b.mover();
      StdDraw.show(); 
      StdDraw.pause(100); 
    }
  }
  public static void main (String[] args) 
  {
    iniciarGraficos();
    Bola b1 = null;
    Bola b2 = null;
    b1 = new Bola(0, 0, 10, 4, 2, Color.ORANGE);
    b2 = new Bola(2, 1, 20, 3, 3, Color.BLUE);
    animacion(b1);
  } 
} 
}

class Localidad
{
/* Nombre de la localidad */
private String nombre;
/* Población */
private int poblacion;

/** Constructor de Localidad */
Localidad (String nombre, int poblacion){
  String nom = nombre;
  int pob = población;
}

/** Constructor de Localidad a partir de una línea de texto */
Localidad (String linea){
  char [] aux = linea.toCharArray();
  pob = new char [aux.length];
  loc = new char [aux.length];
  for (int i = 0; i < aux.length; i++){
    if (aux[i] == '0' ||aux[i] == '1' || aux[i] == '2'|| aux[i] == '3'|| aux[i] == '4'||aux[i] == '5'||aux[i] == '6'||aux[i] == '7'||aux[i] == '8'||aux[i] == '9'){
      aux[i]= pob[i];
    }
    else{
      aux[i] = loc[i];  
    }
  }
  String nom = String(loc); //tenbemos el nombre localidad
  String pobString = String(pob);
  int pob = Integer.parseInt(pobString); //número de población
}

/** Localidad como texto */
public String toString (){
  return "Nombre: " + nombre + "Población: " + poblacion;
}

/** Nombre de esta localidad */
String nombre (){
  return nombre;
}

/** Población total de esta localidad */
int poblacion (){
  return poblacion;
}

/** Comparador de Localidad por igualdad */
public boolean equals (Object o){
  return o == this.localidad;
}
}

public class Comunidad
{
/* Colección de localidades */
private Localidad[] ldloc;
/* Número de localidades guardadas en la colección */
private int size;

/** Constructor de Comunidad */
public Comunidad (){
  localidad[] localidadesCol = ldloc;
  int localidadesNum = size;
}

/** "loc está en esta Comunidad" */
private boolean esta (Localidad loc){
  for (int i = 0; i < this.ldloc.length ; i++){
    if(this.ldloc[i] == loc){
      return true;
    }
  }
  return false;
}

/** Comunidad como texto */
public String toString (){
  return "Localidades de la comunidad: " + ldloc + "Total de localidades: " + size;
}


/** Añade loc a esta Comunidad poniéndola al final */
public void add (Localidad loc){
  actualizado = new Localidad[this.ldloc.length+1];
  for (int i = 0; i < actualizado.length; i++){
    actualizado[i] = this.ldloc[i];
    if (i == this.ldloc.length + 1){
      actualizado[i] = loc;
    } 
  }
}

/**
* POST: resultado: listado de los nombres de Localidad(es)
* que están en esta Comunidad, cada nombre en una línea.
*/
public String nombresLocalidades (){
  String localidades;
  for (int i = 0; i < this.ldloc.length; i++){
    localidades += String(rhis.ldloc[i]);
  }
  return "Listado de localidades: " + localidades;
}

/*
* POST: Devuelve la posición que ocupa la Localidad con este nombre.
* Si no se encuentra, devuelve -1.
*/
public int posicion (String nombre){
  for (int i = 0; i < this.ldloc.length; i++){
    if (this.ldloc[i].nombre() == nombre){
      return i;
    }
  }
  return -1;
}

/*
* POST: Devuelve la población de la Localidad con este nombre.
* Si no se encuentra, devuelve -1.
*/
public int poblacion (String nombre){
  for (int i = 0; i < this.ldloc.length ; i++){
    if (this.ldloc[i].nombre() == nombre){
      return poblacion(nombre);
    }
    else{
      return -1;
    }
  }
}

/*
* POST: resultado: población total del grupo de localidades
* cuyos nombres vienen en ldloc.
*/
public int poblacionConjunta (String[] locs){
  int total = 0;
  for (int i = 0; i < this.ldloc.length ; i++){
    total += poblacion(this.ldloc[i].nombre());
  }
  return total;
}
}
//Entrada formato: Sexo;Provincia;Municipio;Fecha;Total
