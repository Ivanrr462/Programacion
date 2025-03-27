import java.util.Scanner;

public class ejercicio9_tema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("N PRIMERO/S NUMERO/S DE LA SERIE DE FIBONACCI\n");

        // Declaraciones
        int numerosacontar = 0;
        int primero = 0;
        int segundo = 1;
        int numero = 0;

        try {
            System.out.print("Introduzca un numero: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.print(primero);
            } else if (numero == 1) {
                System.out.print(primero + " " + segundo);
            } else {
                while (numerosacontar < numero) {
                    System.out.print(primero + " ");
                    int siguiente = primero + segundo;
                    primero = segundo;
                    segundo = siguiente;
                    numerosacontar++;
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR. Se debe poner un valor númerico");
        } finally {
            scanner.close();
        }
    }
}
