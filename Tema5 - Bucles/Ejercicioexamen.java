
import java.util.Random;
import java.util.Scanner;

public class Ejercicioexamen {
    public static void main(String[] args) {
        // Declaraciones
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int menor = 0;
        int mayor = 0;
        String azul = "\u001B[34m";
        String morado = "\u001B[35m";
        String rojo = "\u001B[31m";
        String amarillo = "\u001B[33m"; // Aproximación a naranja
        String reset = "\u001B[0m"; // Resetear el color al final de cada línea

        // Pedir valores al usuario
        try {
            System.out.print("Introduce un valor mas chico: ");
            menor = scanner.nextInt();
            System.out.print("Introduce un valor mas grande: ");
            mayor = scanner.nextInt();

            // Verificar que menor < mayor
            if (menor >= mayor) {
                System.out.println("El valor más chico debe ser menor que el valor más grande. Intenta de nuevo.");
                return;
            }

            // Generar número aleatorio entre los valores
            int numeroAleatorio = random.nextInt((mayor - menor) + 1) + menor;

            // Preguntar si se quieren los asteriscos en color
            System.out.print("¿Quieres los asteriscos en color? (Escribe 'si' o 'no'): ");
            scanner.nextLine(); // Consumir el salto de línea pendiente
            String opcion = scanner.nextLine().toLowerCase();

            // Convertir el número generado a una cadena para separar los dígitos
            String numeroComoTexto = String.valueOf(numeroAleatorio);

            System.out.println("\nNumero generado: " + numeroAleatorio);
            System.out.println("Representacion por digitos:");

            // Procesar cada dígito
            for (char digitoChar : numeroComoTexto.toCharArray()) {
                // Convertir el carácter a un número entero
                int digito = Character.getNumericValue(digitoChar);

                // Imprimir el dígito
                System.out.print(digito + " ");

                // Seleccionar el color según el valor del dígito
                String color;
                if (digito <= 4) {
                    color = azul;
                } else if (digito <= 6) {
                    color = morado;
                } else if (digito <= 8) {
                    color = amarillo;
                } else {
                    color = rojo;
                }

                // Imprimir los asteriscos correspondientes
                for (int i = 0; i < digito; i++) {
                    if (opcion.equals("si")) {
                        // Mostrar asteriscos en color
                        System.out.print(color + "*" + reset);
                    } else if (opcion.equals("no")) {
                        // Mostrar asteriscos en blanco/negro
                        System.out.print("*");
                    } else {
                        System.out.println("Error. Tienes que decidir si quieres color o no.");
                        scanner.nextLine();
                        return;
                    }
                }

                System.out.println(); // Salto de línea después de cada dígito
            }

        } catch (Exception e) {
            System.out.println("ERROR: Has dado valores inválidos");
        } finally {
            scanner.close();
        }
    }
}
