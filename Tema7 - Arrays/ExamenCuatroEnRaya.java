import java.util.Scanner;

public class ExamenCuatroEnRaya {
    private static final int FILAS = 4;
    private static final int COLUMNAS = 4;

    private static final char VACIO = '.';
    private static final char JUGADOR1 = 'X';
    private static final char JUGADOR2 = 'O';

    public static void main(String[] args) {
        char[][] tablero = new char[FILAS][COLUMNAS];
        int f, c;
        int fila, columna;
        boolean terminado = false;
        boolean maquina = false;
        boolean humano = false;
        char[] letrasFila = {'a', 'b', 'c', 'd'};
        Scanner sc = new Scanner(System.in);


        // Inicializar el tablero
        for (f = 0; f < FILAS; f++) {
            for (c = 0; c < COLUMNAS; c++) {
                tablero[f][c] = VACIO;
            }
        }

        do {
            // Colocamos la X del ordenador
            int filabot = (int) (Math.random() * FILAS);
            int columnabot = (int) (Math.random() * COLUMNAS);
            if (tablero[filabot][columnabot] == VACIO) {
                tablero[filabot][columnabot] = JUGADOR1;
            } else if (tablero[filabot][columnabot] == JUGADOR1 || tablero[filabot][columnabot] == JUGADOR2) {
                filabot = (int) (Math.random() * FILAS);
                columnabot = (int) (Math.random() * COLUMNAS);
                tablero[filabot][columnabot] = JUGADOR1;
            }

            //Mostramos el tablero

            System.out.println("LAS CUATRO EN RAYA");
            System.out.println("=====================");

            for (f = 0; f < FILAS; f++) {
                System.out.printf("%c |", letrasFila[f]);
                for (c = 0; c < COLUMNAS; c++) {
                    System.out.printf("%c ", tablero[f][c]);
                }
                System.out.println();
            }

            System.out.print("   ");
            for (c = 0; c < COLUMNAS; c++) {
                System.out.print("--");
            }

            System.out.println();
            System.out.print("   ");
            for (c = 0; c < COLUMNAS; c++) {
                System.out.printf("%d ", c);
            }

            // Turno del jugador
            System.out.println();
            System.out.println("Turno del jugador 1");
            System.out.println("Introduce la fila (a-d)");
            fila = sc.next().charAt(0) - 'a';
            System.out.println("Introduce la columna (0-3)");
            columna = sc.nextInt();
            if (tablero[fila][columna] == VACIO) {
                tablero[fila][columna] = JUGADOR2;
            } else if (tablero[filabot][columnabot] == JUGADOR1 || tablero[filabot][columnabot] == JUGADOR2) {
                System.out.println("Ahí no se puede poner.");
                System.out.println("Turno del jugador 1");
                System.out.println("Introduce la fila (a-d)");
                fila = sc.next().charAt(0) - 'a';
                System.out.println("Introduce la columna (0-3)");
                columna = sc.nextInt();
                tablero[fila][columna] = JUGADOR2;
            }

            // Verificar filas
            for (f = 0; f < FILAS && !terminado; f++) {
                if (tablero[f][0] == JUGADOR1 && tablero[f][1] == JUGADOR1 && tablero[f][2] == JUGADOR1 && tablero[f][3] == JUGADOR1) {
                    terminado = true;
                    maquina = true;
                } else if (tablero[f][0] == JUGADOR2 && tablero[f][1] == JUGADOR2 && tablero[f][2] == JUGADOR2 && tablero[f][3] == JUGADOR2) {
                    terminado = true;
                    humano = true;
                }
            }

            // Verificar columnas
            for (c = 0; c < COLUMNAS && !terminado; c++) {
                if (tablero[0][c] == JUGADOR1 && tablero[1][c] == JUGADOR1 && tablero[2][c] == JUGADOR1 && tablero[3][c] == JUGADOR1) {
                    terminado = true;
                    maquina = true;
                } else if (tablero[0][c] == JUGADOR2 && tablero[1][c] == JUGADOR2 && tablero[2][c] == JUGADOR2 && tablero[3][c] == JUGADOR2) {
                    terminado = true;
                    humano = true;
                }
            }

            

        } while (!terminado);

        //Muestra el final
        System.out.println("LAS CUATRO EN RAYA");
        System.out.println("=====================");

        for (f = 0; f < FILAS; f++) {
            System.out.printf("%c |", letrasFila[f]);
            for (c = 0; c < COLUMNAS; c++) {
                System.out.printf("%c ", tablero[f][c]);
            }
            System.out.println();
        }

        System.out.print("   ");
        for (c = 0; c < COLUMNAS; c++) {
            System.out.print("--");
        }

        System.out.println();
        System.out.print("   ");
        for (c = 0; c < COLUMNAS; c++) {
            System.out.printf("%d ", c);
        }

        System.out.println();

        //Dice el ganador
        if (humano) {
            System.out.println("¡Enhorabuena! ¡Me has ganado!");
        } else if (maquina) {
            System.out.println("¡Ha ganado el ORDENADOR!");
        }else {
            System.out.println("El juego ha terminado en TABLAS");
        }
    }
}
