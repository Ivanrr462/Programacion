
//Ivan Rios Raya
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\u001B[1mSEGUNDOS QUE TIENE UN DÍA \u001B[0m");
        System.out.println("==========================");
        System.out.print("Introduzca un número de días: ");

        long dias = scanner.nextLong();

        long segundos = dias * 24 * 60 * 60;

        System.out.println(dias + " días equivalen a " + segundos + " segundos.");

        scanner.close();
    }
}