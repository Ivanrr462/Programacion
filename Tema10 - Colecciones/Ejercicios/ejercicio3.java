package Ejercicios;

import java.util.*;

public class ejercicio3 {
    public static void main(String[] args) {
        // Lista a ordenar
        ArrayList<Integer> lista = new ArrayList<>();
        Random rand = new Random();
        
        for (int i = 0; i < 10; i++){
            lista.add(rand.nextInt());
        }

        System.out.println("Lista sin ordenar: ");
        for (Integer numero : lista){
            System.out.println(numero + " ");
        }

        System.out.println();


        // Ordenados
        Collections.sort(lista);

        System.out.println("Lista ordenada: ");
        for (Integer numero : lista){
            System.out.println(numero + " ");
        }
    }
}