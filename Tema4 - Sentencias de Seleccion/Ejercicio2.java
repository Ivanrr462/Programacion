import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dime una hora del dia (0 - 23): ");
        int hora = scanner.nextInt();

        if ((hora >= 7) && (hora <= 12)) {
            System.out.println("Buenos días");
        } else if ((hora > 12) && (hora <= 20)) {
            System.out.println("Buenas tardes");
        } else {
            System.out.println("Buenas noches");
        }

        scanner.close();
    }
}
