package Examen;

import java.util.Random;
import java.util.Scanner;

public class Entradadatos {
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeromenor = 0;
        int numeromayor = 0;

        // Pedimos por pantalla los numeros
        try {
            System.out.print("GRAPHIFY\n");
            System.out.print("====================================\n");
            System.out.print("Introduce el primer numero (menor): ");
            numeromenor = sc.nextInt();
            System.out.print("Introduce el segundo numero (mayor): ");
            numeromayor = sc.nextInt();

            // Preguntamos si quiere la grafica a color o blanco y negro
            System.out.print("Dibujo la gráfica en blanco y negro o a color (B | C): ");
            String color = sc.next().toLowerCase();

        } catch (Exception e) {
            System.out.println("Error. Los valores del rango deben ser mayores o iguales a 0.");
        } finally {
            sc.close();
        }


    }
}
