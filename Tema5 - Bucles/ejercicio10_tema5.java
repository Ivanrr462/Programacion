import java.util.Scanner;

public class ejercicio10_tema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros = 0;
        int positivo = 0;
        int negativo = 0;

        System.out.print("Introduzca 10 numeros enteros: \n");
        while (numeros < 10) {
            System.out.print("");
            int numero = scanner.nextInt();
            if (numero >= 0) {
                positivo++;
                numeros++;
            } else {
                negativo++;
                numeros++;
            }
        }

        System.out.println("Has introducido " + positivo + " numeros positivos y " + negativo + " negativos.");
        
        scanner.close();
    }
}
