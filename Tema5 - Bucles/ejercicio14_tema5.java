import java.util.Scanner;

public class ejercicio14_tema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca un numero entero: \n");
        int numero = scanner.nextInt();

        int numeromas = numero + 1;
        int suma = 0;
        
        if (numero >= 0){
        for (int i = 1; i < 100; i++) {
            suma += numeromas;
            numeromas++;
        }
        } else {
            System.out.println("Debes introducir un numero positivo");
        }
        suma = suma + numero;
        System.out.println("La suma de los 100 numeros siguientes a " + numero + " es " + suma);
        
        scanner.close();
    }
}
