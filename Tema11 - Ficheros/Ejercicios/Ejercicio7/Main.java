package Ejercicios.Ejercicio7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Uso: java Main <archivo> [palabra] [traducción]");
            return;
        }
        
        Diccionario diccionario = new Diccionario(args[0]);

        if (args.length == 3) {
            diccionario.agregarPalabra(args[1], args[2]);
        } else {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Ingrese una palabra en español (o 'salir' para terminar): ");
                String palabra = scanner.nextLine();
                if (palabra.equalsIgnoreCase("salir")) break;
                System.out.println("Traducción: " + diccionario.traducir(palabra));
            }
            scanner.close();
        }
    }
}