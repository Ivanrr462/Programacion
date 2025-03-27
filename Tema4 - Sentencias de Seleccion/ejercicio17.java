import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un número entero (máx 5 dígitos): ");
            int numero = scanner.nextInt();

            if (Math.abs(numero) <= 99999) {
                int numeroAbsoluto = Math.abs(numero);
                int numDigitos = 0;

                if (numeroAbsoluto >= 10000) {
                    numDigitos = 5;
                } else if (numeroAbsoluto >= 1000) {
                    numDigitos = 4;
                } else if (numeroAbsoluto >= 100) {
                    numDigitos = 3;
                } else if (numeroAbsoluto >= 10) {
                    numDigitos = 2;
                } else {
                    numDigitos = 1;
                }

                System.out.println("El número tiene " + numDigitos + " dígitos.");
            } else {
                System.out.println("Error: La opción debe ser un número con un máximo de 5 dígitos.");
            }
        } catch (Exception e) {
            System.out.println("Error: Debes introducir un número de 5 digitos.");
            scanner.nextLine(); 
        }
        scanner.close();
    }
}
