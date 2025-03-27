package Ejercicios;
import java.util.ArrayList;
import java.util.Random;

public class ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Random rand = new Random();

        // Entre 10 y 20 números de forma aleatoria
        int cantidad = rand.nextInt(10, 21);
        for (int i = 0; i < cantidad; i++){
            //Introducimos del 0 al 100
            lista.add(rand.nextInt(0, 101));
        }

        int suma = 0;
        double media = 0;
        int maximo = 0;
        int minimo = Integer.MAX_VALUE;
        System.out.println("IMPRIME LISTA GENERADA:\n");

        for (Integer numero : lista){
            System.out.println(numero);
            suma += numero;
            media += numero;
            if (numero > maximo){
                maximo = numero;
            }
            if (numero < minimo){
                minimo = numero;
            }
        }

        media /= lista.size();

        System.out.println();
        System.out.println("suma: " + suma);
        System.out.println("maximo: " + maximo);
        System.out.println("minimo: " + minimo);
        System.out.println("media: " + media);
    }
}
