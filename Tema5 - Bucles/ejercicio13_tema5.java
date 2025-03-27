import java.util.Scanner;

public class ejercicio13_tema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println(numero + " no es primo.");
        } else {
            
            int divisor = 2;
            boolean esPrimo = true; 

            while (divisor <= numero / 2) {  
                if (numero % divisor == 0) {  
                    esPrimo = false;
                    break;  
                }
                divisor++;
            }


            if (esPrimo) {
                System.out.println(numero + " es primo.");
            } else {
                System.out.println(numero + " no es primo.");
            }
        }
        
        scanner.close();
    }
}
