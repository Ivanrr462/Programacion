package Ejercicios;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la nota del primer examen: ");
        double examen1 = sc.nextDouble();

        System.out.print("¿Que nota quiere sacar en el trimestre?: ");
        double notafinal = sc.nextDouble();

        double examen2 = (notafinal - (examen1 * 0.4)) / 0.6;

        System.out.println("Para tener un " + notafinal + " en el trimestre necesita sacar un " + examen2 + " en el segundo examen");
        
        sc.close();
    }
}
