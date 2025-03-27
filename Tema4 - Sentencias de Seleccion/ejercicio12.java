import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            String par = "par";
            if (numero % 5 == 0) {
                System.out.println("El numero introducido es " + par + " y divisible entre 5");
            } else {
                System.out.println("El numero introducido es " + par + " y no es divisible entre 5");
            }
        } else {
            String impar = "impar";
            if (numero % 5 == 0) {
                System.out.println("El numero introducido es " + impar + " y divisible entre 5");
            } else {
                System.out.println("El numero introducido es " + impar + " y no es divisible entre 5");
            }
        }

        scanner.close();
    } 
}
