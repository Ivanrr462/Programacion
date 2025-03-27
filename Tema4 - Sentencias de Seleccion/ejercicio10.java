import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca la hora (0-23): ");
        int hora = scanner.nextInt();

        System.out.print("Introduzca los minutos: ");
        int minutos = scanner.nextInt();

        final int medianoche = 24 * 3600;
        
        if (hora == 0 && minutos == 0){
            System.out.println("Ya es medianoche");
        } else {
            int segundoshora = hora * 3600;
            int segundosminutos = minutos * 60;
            int queda = medianoche - (segundoshora + segundosminutos);
            System.out.println("Desde las " + hora + ":" + minutos + " hasta la medianoche faltan " + queda + " segundos.");
        }

        scanner.close();
    }   
}
