package Ejercicios;

public class Ejercicio31 {
    public static void main(String[] args) {
        System.out.print("Dime un numero: ");
        String numero1 = System.console().readLine();

        int num1 = Integer.parseInt(numero1);

        System.out.print("Dime otro numero: ");
        String numero2 = System.console().readLine();

        int num2 = Integer.parseInt(numero2);
        int total = num1 * num2;

        System.out.println(num1 + " * " + num2 + " = " + total);
    }
}