import java.util.Scanner;

public class examen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\u001B[1mVUELTAS DE LA TIERRA \u001B[0m");
        System.out.println("=============================");

        System.out.print("Introduzca un número de años: ");
        int años = sc.nextInt();

        int vueltas = años * 365;

        System.out.println("La Tierra habrá dado un total de " + vueltas + " vueltas en " + años + " años.");

        sc.close();
    }
}
