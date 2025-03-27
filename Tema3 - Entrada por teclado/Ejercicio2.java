
//Ivan Rios Raya
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\u001B[1mVOLUMEN DE UNA ESFERA \u001B[0m");
        System.out.println("=======================");
        System.out.print("Introduzca el radio de la esfera (cms): ");
        
        double radio = scanner.nextDouble();
        
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        
        System.out.printf("El volumen de la esfera es de \u001B[31m%.4f \u001B[0mcm", volumen);
        
        scanner.close();
    }
}
