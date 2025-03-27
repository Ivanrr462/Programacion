import java.util.Random;
import java.util.Scanner;

public class Ejercicioexamen_tablero {
    public static final String RESET = "\033[0m";
    public static final String RED_BACKGROUND = "\033[41m";
    public static final String GREEN_BACKGROUND = "\033[42m";
    public static final String BLUE_BACKGROUND = "\033[44m";
    public static final String PURPLE_BACKGROUND = "\033[45m";

    public static int obtenerLongitud(int numero) {
        int longitud = (int)Math.log10(numero)+1;
        return(longitud);
    }

    public static String getColorBackground(int digit) {
        if (digit <= 4) return BLUE_BACKGROUND;
        if (digit <= 6) return RED_BACKGROUND;
        if (digit <= 8) return GREEN_BACKGROUND;
        return PURPLE_BACKGROUND;
    }
    public static void main(String[] args) {
        
        //declaramos scaner y random

            Scanner sc = new Scanner(System.in);
            Random random = new Random();
            try {
            //pedimos por pantalla los numeros 1 y 2
            
            System.out.print("introduce el primer numero (pequeño): ");

            int num1 = sc.nextInt();

            System.out.print("introduce el primer numero (grande): ");

            int num2 = sc.nextInt();

            System.out.print("quieres que sea a color (yes/no): ");

            String color = sc.next().toLowerCase();

            //calculamos los numeros para sacar el random
            int numAleatorio = random.nextInt(num2 - 1) + num1;

            //sacamos la longitud
            int longitud = obtenerLongitud(numAleatorio);

            System.out.println(numAleatorio);
            System.out.println(longitud);
            String prueba = Long.toString(numAleatorio);
            //sacamos el cubo
            for(int digito : prueba.toCharArray()){
                int digit = Character.getNumericValue(digito);
                
                    
                if (color.equals("yes")) {
                    // Dibujamos la fila superior del cubo
                    for (int i = 0; i < 8 + 2; i++) {
                        System.out.print("+---");
                    }
                    System.out.println("+");
   
                    // Dibujamos la fila del contenido
                    System.out.print("| " + digit + " |");
                    for (int i = 0; i < 8+1; i++) {
                        if (i < digit) {
                            System.out.print(getColorBackground(digit) + "   " + RESET + "|");
                        } else {
                            System.out.print("   |");
                        }
                    }
                    System.out.println();
   
                   
                    
                }
                if (color.equals("no")) {
                    // Dibujamos la fila superior del cubo
                    for (int i = 0; i < 8 + 2; i++) {
                        System.out.print("+---");
                    }
                    System.out.println("+");
   
                    // Dibujamos la fila del contenido
                    System.out.print("| " + digit + " |");
                    for (int i = 0; i < 8+1; i++) {
                        if (i < digit) {
                            System.out.print(" * |");
                        } else {
                            System.out.print("   |");
                        }
                    }
                    System.out.println();
   
                   
                    
                    
                }
                
            }
             // Dibujamos la fila inferior del cubo
            System.out.print("+");
                for (int i = 0; i < 8+2; i++){
                    System.out.print("---+");
                }
        } catch (Exception e) {

            System.out.println("gilipollas");
        } finally {
            sc.close();
        }
    }
}
