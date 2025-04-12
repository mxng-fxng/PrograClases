package Abril.cuestionarioLab6;
public class Paquete {
    private String codigoBarras;
    private int peso;

    public Paquete(String cod, int p) {
        codigoBarras = cod;
        peso = p;
    }

    public int peso() {
        return peso;
    }

    public String codigoBarras() {
        return codigoBarras;
    }
}  

