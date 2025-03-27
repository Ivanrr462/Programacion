package Ejercicios;

import java.util.Scanner;

public class Ejercicio310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de Mb: ");
        double mb = sc.nextDouble();

        double kb = mb * 1024;

        System.err.println(mb + "Mb son " + kb + "Kb.");

        sc.close();
    }
}
