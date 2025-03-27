package Ejercicios;

import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca la longitud de un lado: ");
    double lado1 = sc.nextDouble();

    System.out.print("Introduzca la longitud de otro lado: ");
    double lado2 = sc.nextDouble();

    double area = (lado1 * lado2) / 2;
    
    System.out.println("Area de un triangulo");
    System.out.println("---------------------");
    System.out.println("Introduzca la longitud de un lado: " + lado1);
    System.out.println("Introduzca la longitud de otro lado: " + lado2);
    System.out.println("El area del triangulo es " + area + " cm^2.");

    sc.close();  
} 
}
