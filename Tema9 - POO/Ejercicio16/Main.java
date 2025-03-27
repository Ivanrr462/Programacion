package Ejercicio16;

public class Main {
    public static void main(String[] args) {
        Punto p1 = new Punto(3.5, 4.5);
        Punto p2 = new Punto(1.0, 2.0);
        Linea l = new Linea(p1, p2);
        System.out.println(l);
    }
}
