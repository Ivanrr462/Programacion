package Ejercicios.Ejercicio16;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String pais = " ";

        Map<String, String> capitales = new HashMap<>();
        capitales.put("Espana", "Madrid");
        capitales.put("Portugal", "Oporto");
        capitales.put("Francia", "PAris");

        Scanner sc = new Scanner(System.in);

        do {
        System.out.print("Escribe el nombre de un país y te dire su capital: ");
        pais = sc.nextLine();

            if (capitales.containsKey(pais)) {
                System.out.println("La capital de " + pais + " es " + capitales.get(pais));
            } else {
                System.out.print("No conozco la capital de ese país, ¿cuál es?: ");
                String capital = sc.nextLine();
                capitales.put(pais, capital);
            }
        } while (!pais.equals("salir"));
        sc.close();
    }
}