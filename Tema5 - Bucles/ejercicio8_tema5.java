import java.util.Scanner;

public class ejercicio8_tema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;

        try {
            System.out.print("Introduzca un numero: ");
            numero = scanner.nextInt();

            System.out.printf(" \t n1 \t | \t n2 \t |  \t n3 \t\n");
            System.out.printf("-------------------------------------------\n");

            //Calcula y pinta las potencias de los 5 siguientes numeros al introducido.
            for (int i = 1; i <= 5; i++) {
                int numerocuadrado = numero * numero;
                int numerocubo = numero * numero * numero;
                System.out.printf(" \t %s \t | \t %s \t |  \t %s \t\n", numero, numerocuadrado, numerocubo);
                numero++;
            }
        } catch (Exception e) {
            System.out.println("ERROR. Se debe poner un valor númerico.");

        } finally {

            scanner.close();
        }
    }
}
