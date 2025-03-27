import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce un número entero (máx 5 digitos): ");
            int numero = scanner.nextInt();

            if (Math.abs(numero) <= 99999) {
                int ultimoDigito = Math.abs(numero % 10);
                System.out.println("El último dígito del número es: " + ultimoDigito);
            } else {
                //throw new Exception();
                System.out.println("Error: La opcion debe ser un número como máximo de 5 digitos. ");
            }

        } catch (Exception e) {
            System.out.println("Error: Debes introducir un número entero.");
            scanner.nextLine();
        }

        scanner.close();
    }
}
