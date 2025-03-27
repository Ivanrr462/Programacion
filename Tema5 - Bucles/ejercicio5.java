import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int tabla = 10;
        int multiplicacion = 0;

        System.out.print("Introduce un numero y te dire su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        while (multiplicacion <= tabla) {
            int solucion = numero * multiplicacion;
            System.out.println(numero + " x " + multiplicacion + " = " + solucion);
            multiplicacion++;
        }

        scanner.close();
    }
}
