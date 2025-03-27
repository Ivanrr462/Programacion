import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Introduzca la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Introduzca la tercera nota: ");
        double nota3 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;

        if (media < 5) {
            System.out.printf("La media es de %.2f\n", media);
            System.out.println("Suspenso");
        } else if (media >= 5 && media < 7) {
            System.out.printf("La media es de %.2f\n", media);
            System.out.println("Bien");
        } else if (media >= 7 && media < 9) {
            System.out.printf("La media es de %.2f\n", media);
            System.out.println("Notable");
        } else if (media >= 9 && media <= 10) {
            System.out.printf("La media es de %.2f\n", media);
            System.out.println("Sobresaliente");
        }
        

        scanner.close();
    }   
}
