class PuntoArray{
	//que el constructor sea un array
	private double [] coords;
	
	PuntoArray(){
		coords = new double [2];
	}

	PuntoArray(double x0, double y0){
		coords = new double [2]; //Había que crear el array
		coords[0] = x0;
		coords[1] = y0;
	}

	PuntoArray(double [] coords){
		this.coords = new double [2]; //Había que crear una copia del array
		this.coords[0] = coords[0];
		this.coords[1] = coords[1];
	}

	public String toString (){
		return "(" + coords[0] + "," + coords[1] + ")";
	}

	public boolean equals (Object o){
		return coords[0] == o.coords[0] && coords[1] == o.coords[1];
	}

	double getX(){
		return coords[0];
	}

	double getY(){
		return coords[1];
	}
}

/** Cronómetro para medir el tiempo de ejecución*/
class Crono{
	long inicio; // en nanosegs o microsegs
	
	Crono(){
	}
	
	/** Da el tiempo transcurrido en segundos */
	double tiempo{
	}
}
//Usando System.currentTimeMillies() ó System.nanoTime()

int factorial(int n){
}

int factorialR(int n){
}

Crono c = new Crono();
factorial(n)
double t1 = c.tiempo();

c = new Crono;
factorialR(n);
double t2 = c.tiempo();
