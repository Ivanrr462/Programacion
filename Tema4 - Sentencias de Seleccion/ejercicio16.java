import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un número entero (máx 5 dígitos): ");
            int numero = scanner.nextInt();

            if (Math.abs(numero) <= 99999) {
                numero = Math.abs(numero);

                int primerDigito = 0;

                if (numero >= 10000) {
                    primerDigito = numero / 10000;
                } else if (numero >= 1000) {
                    primerDigito = numero / 1000;
                } else if (numero >= 100) {
                    primerDigito = numero / 100;
                } else if (numero >= 10) {
                    primerDigito = numero / 10;
                } else {
                    primerDigito = numero; 
                }

                System.out.println("El primer dígito del número es: " + primerDigito);
            } else {
                System.out.println("Error: La opción debe ser un número con un máximo de 5 dígitos.");
            }

        } catch (Exception e) {
            System.out.println("Error: Debes introducir un número entero.");
            scanner.nextLine(); 
        }

        scanner.close();
    }
}
