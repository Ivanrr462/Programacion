package Ejercicios;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {
        final double TIPO = 166.386;
        
        //Definimos e inicializamos el escaner
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca una cantidad en pesetas: ");
        double pesetas = sc.nextDouble();
        // Alternativa -> double euros = Double.parseDouble(sc.nextLine());

        //Calculamos el valor en pesetas
        double euros = pesetas / TIPO;

        System.out.println("La cantidad de " + pesetas + " pesetas son " + euros + " euros.");

        sc.close();
    }
}
