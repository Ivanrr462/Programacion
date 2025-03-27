package Ejercicios;

import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        double IVA = 0.21;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el precio: ");
        double precio = sc.nextDouble();

        double iva = precio * IVA;
        double total = precio + iva;

        System.out.println("Base imponible" + "\t" + precio);
        System.out.println("IVA" + "\t\t" + String.format("%.2f", iva));
        System.out.println("---------------------");
        System.out.println("Total" + "\t\t" + String.format("%.2f", total));

        sc.close();
    }
}
