// Lab 1
class Frac { //mutable
	private int num;
	private int den;
	Frac(int n, int d){ // constructor
		num = n;
		den = d;
		sim(); //llama al metodo sim parasimpplificar la función al crearla
	}
	void sum (Frac f){ // modifica el estado del objeto
		//num = ...
		//denom = ...
		//sim ();
	}

}

//Lab 2
class Frac { // inmutable, por eso devuelve nuevos objetos
	private int num;
	private int den;
	Frac (int n, int d){ //constructor
		mcd = mcd(n,d);
		num = n/mcd;
		den = d/mcd;
	}
	void sum (Frac f){ //devuelve una nueva fracción
		//num = ...
		//denom = ...
		//return new Frac (n,d);
	}
}

//Assert permite hacer pruebas

//Implementacion de tiempo
class Tiempo {
	private int mm;// mm >= 0
	private int ss;// ss e {0...59}
	Tiempo (int m, int n){
		mm = m;
		ss = s;
}
	Tiempo (int s) {
		mm = s /60;
		ss = s % 60;
	}
	public String toString(){
		return mm + "m" + ss + "s";// 3m 2s
		// return String.format("%02d: %02d", mm, ss); 03:02
	}
	boolean esMenor (Tiempo t){
		return mm < t.mm || (mm == t.mm && ss < t.ss);
	}// resultado this < t
	Tiempo suma (Tiempo t) {
		return new Tiempo (aSegundos() + t.aSegundos());
	}
}
