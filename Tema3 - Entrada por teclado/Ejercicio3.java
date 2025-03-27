
//Ivan Rios Raya
import java.util.Scanner;

public class Ejercicio3 {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\u001B[1mCALCULADORA DE MEDIDAS IMPERIALES \u001B[0m");
        System.out.println("===================================");
        
        System.out.print("Introduce una longitud en metros: ");
        double metros = scanner.nextDouble();
        

        double pulgadas = metros * 39.3701;
        double pies = metros * 3.28084;
        double yardas = metros * 1.09361;


        String fondoPies = "\u001B[48;5;82m"; 
        String fondoPulgadas = "\u001B[48;5;226m";    
        String fondoYardas = "\u001B[48;5;196m"; 
        String reset = "\u001B[0m";               


        System.out.printf("\u001B[1m%s%.2f metros \u001B[0mson:%s%n", reset, metros, reset);
        System.out.printf("%s%.3f pulgadas%s%n", fondoPulgadas, pulgadas, reset);
        System.out.printf("%s%.3f pies%s%n", fondoPies, pies, reset);
        System.out.printf("%s%.4f yardas%s%n", fondoYardas, yardas, reset);
        
        scanner.close();
    }
}

