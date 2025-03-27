import java.util.Scanner;

public class ejercicio7_tema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Este programa calcula la media de los números positivos introducidos");
        System.out.println("Para parar introduzca un número negativo");
        System.out.print("");
        
        int numero = 0;
        int sumanumero = 0;
        float numeromedia = 0;

        System.out.print("Introduce números: \n");
        do {
            try {
                numero = scanner.nextInt();
                sumanumero += numero;
                if (numero >= 0) {
                    numeromedia++;
                }
            } catch (Exception e) {
                System.out.println("ERROR. Solo se permiten números.");
                scanner.nextLine();
            }
        } while (numero >= 0);

        float media = sumanumero / numeromedia;

        System.out.println("La media de los numeros introducidos es: " + media);

        scanner.close();
    }
}
