import java.util.Scanner;

public class ejercicio6_tema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("NUMERO DE DIGITOS DE UN NUMERO ENTERO");
        System.out.print("Introduzca un numero entero: ");
        int numero = scanner.nextInt();

        int numeroAbsoluto = Math.abs(numero);
        int numDigitos = 0;

        while (numeroAbsoluto > 0) {
            numeroAbsoluto /= 10;
            numDigitos++;
        }

        if (numDigitos == 0){
            numDigitos = 1;
        }

        System.out.println(numero + " tiene " + numDigitos + " digito/s.");

        scanner.close();
    }
}
