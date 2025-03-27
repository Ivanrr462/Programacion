import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double gravedad = 9.81;

        System.out.print("Introduzca la altura (en metros) desde la que cae el objeto: ");
        double altura = scanner.nextDouble();
        
        double t = Math.sqrt((2 * altura) / gravedad);

        System.out.println("El objeto tarda " + t + " segundos");

        scanner.close();
    }
}
