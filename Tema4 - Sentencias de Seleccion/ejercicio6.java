import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Introduzca la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Introduzca la tercera nota: ");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;

        
        System.out.printf("La media es de %.2f\n", media);
        

        scanner.close();
    }   
}
