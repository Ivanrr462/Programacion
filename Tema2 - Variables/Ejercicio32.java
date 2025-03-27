package Ejercicios;

import java.util.Scanner;

public class Ejercicio32 {
    public static void main(String[] args) {
        final double TIPO = 166.386;
        
        //Definimos e inicializamos el escaner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una cantidad en euros: ");
        double euros = sc.nextDouble();
        // Alternativa -> double euros = Double.parseDouble(sc.nextLine());

        //Calculamos el valor en pesetas
        double pesetas = euros * TIPO;

        System.out.println("La cantidad de " + euros + " euros son " + pesetas + " pesteas.");

        sc.close();
    }
}
