package Ejercicios;

import java.nio.charset.Charset;
import java.util.*;

public class ejercicio4 {
    public static void main(String[] args) {
        // Lista a ordenar
        ArrayList<String> lista = new ArrayList<>();
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++){
            byte[] array = new byte[7];
            rand.nextBytes(array);
            String generatedString = new String(array, Charset.forName("UTF-8"));
            lista.add(generatedString);
        }

        System.out.println("Lista sin ordenar: ");
        for (String cadena : lista){
            System.out.print(cadena + " ");
        }

        System.out.println();


        // Ordenados
        Collections.sort(lista);

        System.out.println("Lista ordenada: ");
        for (String cadena : lista){
            System.out.print(cadena + " ");
        }
    }
}
