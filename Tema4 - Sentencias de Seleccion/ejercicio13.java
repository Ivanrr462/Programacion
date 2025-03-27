import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {

    
        System.out.print("Este programa pinta una piramide\n");
        System.out.print("Introduce el caracter de relleno: ");
        String caracter = scanner.nextLine();
        
        System.out.print("Elija un tipo de piramide: \n");
        System.out.print("1. Vertice hacia arriba\n");
        System.out.print("2. Vertice hacia abajo\n");
        System.out.print("3. Vertice a la derecha\n");
        System.out.print("4. Vertice a la izquierda\n");
        System.out.print("? ");
        int vertice = scanner.nextInt();
     
        if (vertice < 1 || vertice > 4) {
            //throw new Exception();
            System.out.println("Error: La opcion debe ser un número del 1 al 4 ");
        }

        if (vertice == 1) {
            System.out.print("La piramide es: \n");
            System.out.println("   " + caracter + "   ");
            System.out.println("  " + caracter + caracter + caracter + "  ");
            System.out.println(" " + caracter + caracter + caracter + caracter + caracter + " ");
        } else if (vertice == 2) {
            System.out.print("La piramide es: \n");
            System.out.println(" " + caracter + caracter + caracter + caracter + caracter + " ");
            System.out.println("  " + caracter + caracter + caracter + "  ");
            System.out.println("   " + caracter + "   ");
        } else if (vertice == 3) {
            System.out.print("La piramide es: \n");
            System.out.println("  " + caracter);
            System.out.println(" " + caracter + caracter);
            System.out.println(caracter + caracter + caracter);
            System.out.println(" " + caracter + caracter);
            System.out.println("  " + caracter);
        } else if  (vertice == 4) {
            System.out.print("La piramide es: \n");
            System.out.println(caracter + "  ");
            System.out.println(caracter + caracter + " ");
            System.out.println(caracter + caracter + caracter);
            System.out.println(caracter + caracter + " ");
            System.out.println(caracter + "  ");
        }
    } catch (Exception e) {
        System.out.println("Error: La opcion debe ser un número del 1 al 4.");
        scanner.nextLine();
    }
        
    scanner.close();
    } 
}
