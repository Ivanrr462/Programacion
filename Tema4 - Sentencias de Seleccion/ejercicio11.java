import java.util.Scanner;

public class ejercicio11 {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int contador = 0;
        System.out.printf("Cuestionadio de 1º DAW\n");
        System.out.printf("1. ¿Cual de los siguientes tipos de datos tiene mas precisión?\n");
        System.out.printf("\t a. int\n");
        System.out.printf("\t b. double\n");
        System.out.printf("\t c. float\n");
        System.out.print("=> ");
        String pregunta1 = scanner.nextLine();
        if (pregunta1.equals("b")) {
            System.out.println("Correcto");
            contador++;
        } else {
            System.out.println("Incorrecto");
        }

        System.out.printf("2. ¿Cuál es la salida de la siguiente expresión en Java?\n");
        System.out.printf("\t a. 6\n");
        System.out.printf("\t b. 8\n");
        System.out.printf("\t c. Error de compilación\n");
        System.out.printf("Expresión: int x = 3; System.out.println(x + 3);\n");
        System.out.print("=> ");
        String pregunta2 = scanner.nextLine();
        if (pregunta2.equals("b")) {
            System.out.println("Correcto");
            contador++;
        } else {
            System.out.println("Incorrecto");
        }

        System.out.printf("3. ¿Qué tipo de datos puede almacenar el tipo de dato 'boolean'?\n");
        System.out.printf("\t a. true o false\n");
        System.out.printf("\t b. 0 o 1\n");
        System.out.printf("\t c. Solo números enteros\n");
        System.out.print("=> ");
        String pregunta3 = scanner.nextLine();
        if (pregunta3.equals("a")) {
            System.out.println("Correcto");
            contador++;
        } else {
            System.out.println("Incorrecto");
        }

        System.out.println("Respuestas correctas: " + contador);

        scanner.close();
    } 
}
