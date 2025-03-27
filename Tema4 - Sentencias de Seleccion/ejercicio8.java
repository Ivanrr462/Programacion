import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa resuelve ecuaciones de segundo grado");
        System.out.println("ax^2 + bx + c");
        System.out.println("Introduce los valores:");
        System.out.print("a = ");
        double a = scanner.nextDouble();

        System.out.print("b = ");
        double b = scanner.nextDouble();

        System.out.print("c = ");
        double c = scanner.nextDouble();
        
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("La ecuacion tiene infinitas soluciones");
        } else {
            double raiz = (b * b) - (4 * a * c); 
            if (raiz < 0){
                System.out.println("La ecuacion no tiene soluciones reales");
            } else {
            double x1 = ((-1 * b) + Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            double x2 = ((-1 * b) - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
            }
        }
        
        scanner.close();
    }   
}
