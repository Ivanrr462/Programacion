package Examen;

import java.util.Random;
import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int numeromenor = 0;
        int numeromayor = 0;


        try {
            // Pedimos por pantalla los numeros
            System.out.print("GRAPHIFY\n");
            System.out.print("====================================\n");
            System.out.print("Introduce el primer numero (menor): ");
            numeromenor = sc.nextInt();
            System.out.print("Introduce el segundo numero (mayor): ");
            numeromayor = sc.nextInt();

            // Verificar que numeromenor < numeromayor
            if (numeromenor >= numeromayor) {
                System.out.println("El valor más chico debe ser menor que el valor más grande. Intenta de nuevo.");
                return;
            }
            // Preguntamos si quiere la grafica a color o blanco y negro
            System.out.print("Dibujo la gráfica en blanco y negro o a color (B | C): ");
            String color = sc.next().toLowerCase();

            // Calculamos el numero random en el rango
            int numRandom = random.nextInt(numeromayor - 1) + numeromenor;

            // Pintamos el numero random
            System.out.println(numRandom);

            // Convertimos el número generado a una cadena para separar los dígitos
            String prueba = Long.toString(numRandom);

            for(int digito : prueba.toCharArray()){
                // Convertimos el carácter a un número entero
                int digit = Character.getNumericValue(digito);
                System.out.println(digit);
            }

        } catch (Exception e) {
            System.out.println("Error. Los valores del rango deben ser mayores o iguales a 0.");
        } finally {
            sc.close();
        }


    }
}
