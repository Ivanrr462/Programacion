package Ejercicios;

import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        double preciohora = 12;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el numero de horas trabajadas en la semana: ");
        double horas = sc.nextDouble();

        double salario = horas * preciohora;

        System.out.println("Su salario semanal es de " + salario + " euros.");
        sc.close();
    }
}
