import java.util.Scanner;

public class NumeroEnRango {
    public static void main(String[] args) {
        // Establecemos el rango
        final int LIM_INF = 0;         // Limite inferior
        final int LIM_SUP = 100;       // Limite superior

        // Recogemos un numero entero por teclado
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero: ");
        int num = sc.nextInt();

        // Comprueba que este dentro del rango
        if (LIM_INF < num && num < LIM_SUP) {
            System.out.println("El numero " + num + " esta dentro del rango");
        } else {
            System.out.println("El numero " + num + " esta fuera del rango");
        }

        // Cierra el scanner
        sc.close();
    }
}
