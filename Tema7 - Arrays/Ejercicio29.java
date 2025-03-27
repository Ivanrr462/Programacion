import java.util.Random;
import java.util.Scanner;

public class Ejercicio29 {
    public static void main(String[] args) {
        // Declaraciones
        String[][] tablero = new String[4][5];
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean encontrado = false;
        boolean explotado = false;

        int filaJugador = -1;
        int columnaJugador = -1;

        // Inicicializa el tablero con cadenas vacías
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[0].length; columna++) {
                tablero[fila][columna] = " ";
            }
        }

        // Coordenadas tesoro
        int filaTesoro = rand.nextInt(4);
        int coluTesoro = rand.nextInt(5);

        // Coordenadas mina (comprueba que no este en la misma posicion que el tesoro)
        int filaMina;
        int coluMina;
        do {
            filaMina = rand.nextInt(4);
            coluMina = rand.nextInt(5);
        } while (filaMina == filaTesoro && coluMina == coluTesoro);

        /*
         * Desarrollo del juego
         * 
         * 1. Se pinta el tablero en su estado actual
         * 2. Se piden coordenadas al jugador
         * 3. Se comprueba si ha ganado o ha perdido, y se repite hasta que gane o
         * pierda
         */
        do {
            // Pinta el tablero
            for (int fila = tablero.length - 1; fila >= 0; fila--) {
                System.out.print(fila + "|");
                for (int columna = 0; columna < tablero[0].length; columna++) {
                    System.out.print(tablero[fila][columna]);
                }
                System.out.println();
            }

            // Leyenda inferior de la tabla
            System.out.print("  ");
            for (int columna = 0; columna < tablero[0].length; columna++) {
                System.out.print("--");
            }
            System.out.println();
            System.out.print("  ");
            for (int columna = 0; columna < tablero[0].length; columna++) {
                System.out.print(columna + " ");
            }

            // Pedimos coordenadas
            System.out.println("");
            System.out.print("Coordenada x: ");
            columnaJugador = sc.nextInt();
            System.out.print("Coordenada y: ");
            filaJugador = sc.nextInt();

            // Chequea si ha ganado 
            encontrado = (columnaJugador == coluTesoro && filaJugador == filaTesoro);

            // Chequea si ha perdido
            explotado = (columnaJugador == coluMina && filaJugador == filaMina);

        } while (!encontrado && !explotado);

        // Mensaje final
        System.out.println("");
        if (encontrado){
            System.out.println("¡Enhorabuena, has ganado!");
        } else {
            System.out.println("¡BOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOM! REKETONAAAAAAAA");
        }

        sc.close();
    }
}
