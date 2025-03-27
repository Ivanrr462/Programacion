package Ejercicios;

import java.util.Scanner;

public class Ejercicio311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de Kb: ");
        double kb = sc.nextDouble();

        double mb = kb / 1024;

        System.err.println(kb + "Kb son " + mb + "Mb.");

        sc.close();
    }
}
