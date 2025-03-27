import java.util.Scanner;

public class PruebasFunciones {
    public static int pow (int base, int exp) {
        int potencia = 1;
        for (int i = 1; i <= exp; i++){
            potencia *= base;
        }
        return potencia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int num1 = sc.nextInt();

        System.out.print("Dime su exponente: ");
        int num2 = sc.nextInt();

        int resultado = pow(num1, num2);

        System.out.println("El resultado de su numero es " + resultado);

        sc.close();
    }
}