package Ejercicios;

import java.util.Scanner;

public class Ejercicio34 {
    public static void main(String[] args) {
        System.out.println("Este programa solo de dos numeros enteros");

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo numero: ");
        double num2 = sc.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double mult = num1 * num2;
        double div = num1 / num2;

        System.out.println("x = " + num1);
        System.out.println("y = " + num2);
        System.out.println("x + y = " + suma);
        System.out.println("x - y = " + resta);
        System.out.println("x / y = " + div);
        System.out.println("x * y = " + mult);

        sc.close();
    }
}
