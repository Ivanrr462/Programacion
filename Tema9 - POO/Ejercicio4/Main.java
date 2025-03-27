package Ejercicio4;

public class Main {
public static void main(String[] args) {
    Fraccion fraccion1 = new Fraccion(560, 18);
    Fraccion fraccion2 = new Fraccion(280, 9);

    System.out.println("Fraccion 1: " + fraccion1);
    System.out.println("Fraccion 2: " + fraccion2);
    System.out.println("Fraccion 1 simplificada: " + fraccion1.simplificar());
    System.out.println("Fraccion 2 simplificada: " + fraccion2.simplificar());
    System.out.println("Fraccion 1 * Fraccion 2: " + fraccion1.multiplicar(fraccion2));
    System.out.println("Fraccion 1 / Fraccion 2: " + fraccion1.dividir(fraccion2));

}    
    
}
