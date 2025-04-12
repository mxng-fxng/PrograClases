package Abril.cuestionarioLab6;

import tads.IList;

/**
 * Representa cintas transportadoras de un aeropuerto o centro logistico.
 *
 * Tiene dos limites (que no se pueden superar):
 * 1) El peso maximo por paquete
 * 2) El peso total maximo
 */
public class CintaTransportadora {

    private IList<Paquete> paquetes;

    private int pesoMaximo; // peso max por paquete
    private int pesoTotalMaximo; // peso max de todos los paquetes
    private int pesoTotal; // peso total de los paquetes en la cinta

    CintaTransportadora(int pesoMaximo, int pesoTotalMaximo) {
        // TODO: Escribe aqui la respuesta
        pesoMaximo = this.pesoMaximo;
        pesoTotalMaximo = this.pesoTotalMaximo;
        this.pesoTotal = 0;
    }

    /**
     * Pone un paquete al final de esta cinta si se cumplen ciertas condiciones.
     *
     * PRE: p.peso() <= pesoMaximo() y p.peso() + pesoTotal() <= pesoTotalMaximo()
     * POST: pesoTotal() incrementado en p.peso()
     * @throws IllegalArgumentException si no se cumple PRE
     * @param p, el paquete a poner
     */
    void poner(Paquete p) {
        // TODO: Escribe aqui la respuesta
        if ((p.peso() <= this.pesoMaximo() && p.peso() + this.pesoTotal() <= this.pesoTotalMaximo) == true){
            this.paquetes.add(p);
            this.pesoTotal += p.peso();
        }
        else{
           throw new RuntimeException("\nERROR: Sobrepasa el peso maximo");
        }
    }

    /**
     * Retira un paquete del inicio de esta cinta si se cumplen ciertas condiciones
     *
     * Si `cod` es null.
     * Si el codigo de barras del paquete al inicio de esta cinta contiene `cod`.
     *
     * POST: pesoTotal() decrementado en `resultado`.peso()
     * @param cod, codigo buscado o null si vale cualquiera
     * @return el paquete retirado o null.
     *
     * Nota: se puede (debe) usar el metodo `String.contains`
     */
    Paquete quitar(String cod) {
        // Verificar si hay paquetes, sin usar isEmpty()
        if (this.paquetes.size() == 0) { //si no hay paquetes pues no devuelve nada
            return null;
        }
        
        Paquete primerPaquete = this.paquetes.get(0); //porque es el elemento 0 de la lista
        
        if (cod == null || primerPaquete.codigoBarras().contains(cod)) { // Si el codigo de barras del paquete al inicio de esta cinta contiene `cod`.
            this.paquetes.remove(0); //quita el elemento 0
            this.pesoTotal -= primerPaquete.peso(); //resta el peso
            return primerPaquete; //devuelve el primerPaquete
        }
        
        return null;
    }

    /**
     * El peso total de los paquetes en esta cinta.
     * @return peso total.
     */
    int pesoTotal() {
        return pesoTotal;
    }

    /**
     * El peso maximo de un paquete a colocar en esta cinta
     * @return peso maximo.
     */
    int pesoMaximo() {
        return pesoMaximo;
    }

    /**
     * El peso total maximo de los paquetes en esta cinta.
     * @return peso total maximo.
     */
    int pesoTotalMaximo() {
        return pesoTotalMaximo;
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append(String.format("#: %d\n", paquetes.size()));
        str.append("paquetes:");
        for( int i = 0; i < paquetes.size(); ++i ) {
            str.append(" ");
            str.append(paquetes.get(i).codigoBarras());
        }
        return str.toString();
    }

    /**
     * Transfiere paquetes entre cintas.
     *
     * Intenta quitar de `cinta` un paquete con `cod`.
     * Si lo consigue la intenta por en `cintaPreferente`
     * Si no se puede lo pone en `otros`
     * @param cinta, la cinta de donde se retira el paquete
     * @param cintaPreferente, la cinta donde se intenta poner
     * @param otros, la cinta donde se pone si no se puede en la anterior
     * @param cod, el codigo que se busca en la cinta
     */
public static void sacarConCodigo(CintaTransportadora cinta, CintaTransportadora cintaPreferente, CintaTransportadora otros, String cod) {
    // TODO: Escribe aqui la respuesta
    Paquete transportado = cinta.quitar(cod); //Usamos esta variable para trabajar mejor con el paquete
    if(transportado != null){//si el paquete existe, se quita de la cinta
        if((transportado.peso() <= cintaPreferente.pesoMaximo() && transportado.peso() + cintaPreferente.pesoTotal() <= cintaPreferente.pesoTotalMaximo) == true){
            cintaPreferente.poner(transportado); //si se cumple la condición, se pone en cintaPreferente
        }
        else
        otros.poner(transportado); // si no en otros
    }
}
}