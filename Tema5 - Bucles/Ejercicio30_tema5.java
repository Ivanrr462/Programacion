import java.util.Scanner;

public class Ejercicio30_tema5 {
    public static void main(String[] args) {
        // Declaraciones
        int altura = 0;
        Scanner sc = new Scanner(System.in);

        // Lee altura de teclado
        System.out.print("Introduzca altura de la U: ");
        altura = sc.nextInt();
        

        // Pintamos la parte vertical de la "U"
        for (int i = 0; i < altura - 1; i++) {
            System.out.print("* ");
            // Imprimimos espacios entre los asteriscos
            for (int j = 0; j < altura - 2; j++) {
                System.out.print(" ");
            }
            System.out.println(" *");
        }

        // Imprimimos la base de la "U" con curvatura
        System.out.print(" ");
        for (int i = 0; i < altura - 2; i++) {
            System.out.print("* ");
        }
        System.out.println(" ");

        // Cerramos Scanner
        sc.close();
    }
}
