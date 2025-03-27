package Examen;

import java.util.Random;
import java.util.Scanner;

public class examen {
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

            // Convertimos el número generado a una cadena para separar los dígitos
            String cadena = Long.toString(numRandom);

            // Encontramos el dígito más grande de la cadena
            int maxDigit = -1;
            for (char digito : cadena.toCharArray()) {
                int digit = Character.getNumericValue(digito);
                if (digit > maxDigit) {
                    maxDigit = digit;
                }
            }

            for (int digito : cadena.toCharArray()) {
                // Convertimos el carácter a un número entero
                int digit = Character.getNumericValue(digito);

                // Dibujamos la fila superior del cubo
                for (int i = 0; i < maxDigit + 1; i++) {
                    System.out.print("+---");
                }
                System.out.println("+");

                // Dibujamos la fila del contenido
                System.out.print("| " + digit + " |");
                for (int i = 0; i < maxDigit ; i++) {
                    if (i < digit) {
                        // Pintamos el asterisco
                        System.out.print(" * |");
                    } else {
                        System.out.print("   |");
                    }
                }

                // Salto de linea
                System.out.println();

            }
            // Dibujamos la fila inferior del cubo
            System.out.print("+");
            for (int i = 0; i < maxDigit + 1; i++) {
                System.out.print("---+");
            }

        } catch (Exception e) {
            System.out.println("Error. Los valores del rango deben ser mayores o iguales a 0.");
        } finally {
            sc.close();
        }

    }
}
