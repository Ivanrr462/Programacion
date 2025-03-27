package Ejercicios;

import java.util.Scanner;

public class Ejercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura: ");
        double altura = sc.nextDouble();

        System.out.print("Introduzca el radio: ");
        double radio = sc.nextDouble();

        double division = 1.0 / 3.0;

        double radioradio = radio * radio;

        double volumen = division * Math.PI * radioradio * altura;

        System.out.println("Area de un cono");
        System.out.println("---------------");
        System.out.println("Introduzca la altura: " + altura);
        System.out.println("Introduzca el radio de la base: " + radio);
        System.out.println("El volumen del cono es " + volumen + " cm^3.");

        sc.close();
    }
}
