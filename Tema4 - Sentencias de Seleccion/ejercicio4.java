import java.util.Scanner;

public class ejercicio4 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Introduzca el valor de b: ");
        double b = scanner.nextDouble();

        if (a != 0 && b != 0){
            double x = (b * (-1)) / a;
            System.out.println("x = " + x);
        } else {
            System.out.println("Solucion invalida");
        }
            
        scanner.close();
}
}
