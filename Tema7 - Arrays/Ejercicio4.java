import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] numero = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        Random rand = new Random();

        for (int i = 0; i < numero.length; i++){
            numero[i] = rand.nextInt(1000);
            cuadrado[i] = (int) Math.pow(numero[i], 2);
            cubo[i] = (int) Math.pow(numero[i], 3);
        }

        System.out.println("   n   |   n2   |   n3");
        System.out.println("-------|--------|---------");

        for (int i = 0; i < numero.length; i++){
            System.out.printf("%7d|%8d|%9d\n", numero[i], cuadrado[i], cubo[i]);
        }
    }
}
