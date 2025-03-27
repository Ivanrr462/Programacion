package Ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Bicicleta bicicleta = new Bicicleta();
        Coche coche = new Coche();
        int kilometros;

        // Menu
        do {
            System.out.println("1. Anda con la bicicleta");
            System.out.println("2. Haz el caballito con la bicicleta");
            System.out.println("3. Anda con el coche");
            System.out.println("4. Quema rueda con el coche");
            System.out.println("5. Ver kilometraje de la bicicleta");
            System.out.println("6. Ver kilometraje del coche");
            System.out.println("7. Ver kilometraje total");
            System.out.println("8. Salir");
            System.out.print("Elige una opcion (1-8): ");

            // Lee opcion de teclado
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuantos kilometros quiere recorrer?: ");
                    kilometros = sc.nextInt();
                    bicicleta.andar(kilometros);
                    break;
                case 2:
                    bicicleta.hacerCaballito();
                    break;
                case 3:
                    System.out.print("¿Cuantos kilometros quiere recorrer?: ");
                    kilometros = sc.nextInt();
                    coche.andar(kilometros);
                    break;
                case 4:
                    coche.quemaRueda();
                    break;
                case 5:
                    System.out.println("La bici lleva " + bicicleta.kilometrosRecorridos + " kilometros");
                    break;
                case 6:
                    System.out.println("El coche lleva " + coche.kilometrosRecorridos + " kilometros");
                    break;
                case 7:
                    System.out.println("Ambos vehiculos llevan " + Vehiculo.kilometrosTotales + " kilometros");
                    break;
                case 8:
                    System.err.println("Hasta la proxima");
                    break;
                default:
                    System.out.println("Opcion erronea");
                    break;
            }
            System.out.println();
        } while (opcion != 8);
        

        // Cerrar scanner
        sc.close();
    }
}
