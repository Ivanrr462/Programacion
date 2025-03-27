package Ejercicio22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        TiendaDisco tiendaDisco = new TiendaDisco();
        Scanner sc = new Scanner(System.in);
        int opcion = -1;

        tiendaDisco.añadir(new Disco("1", "autor1", "titulo1", "genero1", 1));

        do {
            System.out.println("TIENDA DE DISCOS");
            System.out.println("================\n");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo Disco");
            System.out.println("3. Modificar Disco");
            System.out.println("4. Borrar Disco");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("Introduce una opción: ");
            while (opcion != 5) {
                try {
                    opcion = sc.nextInt();
                    if (opcion < 1 || opcion > 5) {
                        System.out.println("Error: Debes introducir un número entre 1 y 5");
                    }
                } catch (Exception e) {
                    System.out.println("Error: Debes introducir un número");
                    sc.nextLine();
                }
            }
            System.out.println();
            try {
                switch (opcion) {
                    case 1 -> listaDiscos(tiendaDisco, sc);
                    case 2 -> nuevoDisco(tiendaDisco, sc);
                    case 3 -> ModificarDisco(tiendaDisco, sc);
                    case 4 -> BorrarDisco(tiendaDisco, sc);
                }
            } catch (Exception e) {
                System.out.println("Se ga producido un error: " + e.getMessage());
            }

        } while (opcion != 5);
        sc.close();
    }

    private static Object BorrarDisco(TiendaDisco tiendaDisco, Scanner sc) {
        
    }

    private static Object ModificarDisco(TiendaDisco tiendaDisco, Scanner sc) {
        
    }

    private static Object nuevoDisco(TiendaDisco tiendaDisco, Scanner sc) throws Exception {
        //Nuevo Disco
        System.out.println("Introduce los datos del disco");
        System.out.print("Código: ");
        String codigo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        System.out.print("Título: ");
        String titulo = sc.nextLine();
        System.out.print("Género: ");
        String genero = sc.nextLine();
        System.out.print("Duración: ");
        int duracion = sc.nextInt();

        tiendaDisco.añadir(new Disco(codigo, autor, titulo, genero, duracion));
    }

    private static Object listaDiscos(TiendaDisco tiendaDisco, Scanner sc) {
        //lista de Discos
        Disco[] listaDiscos = tiendaDisco.listar();

        for (Disco disco : listaDiscos) {
            int i = 0;
            if(disco == null) {
                System.out.println(i + ". " + disco);
            }
            i++;
        }
    }
}
