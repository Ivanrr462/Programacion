package Ejercicio16;

public class Linea {
    private Punto punto1;
    private Punto punto2;

    public Linea(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public String toString() {
        return "Linea [punto1=" + punto1 + ", punto2=" + punto2 + "]";
    }
}
