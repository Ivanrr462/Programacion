package Ejercicios;

import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la longitud de la base (cm): ");
        double longitud = sc.nextDouble();

        System.out.print("Introduzca la altura (cm): ");
        double altura = sc.nextDouble();

        double area = longitud * altura;
        
        System.out.println("Area de un rectangulo");
        System.out.println("---------------------");
        System.out.println("Introduzca la longitud de la base (cm): " + longitud);
        System.out.println("Introduzca la altura (cm): " + altura);
        System.out.println("El area del rectangulo es " + area + " cm^2.");

        sc.close();
    }
}
