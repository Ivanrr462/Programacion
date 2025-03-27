import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int contador = 0;
        System.out.printf("Test de fidelidad\n");
        System.out.printf("=================\n");
        System.out.printf("Este programa te dirá si hay probabilidad de que tu pareja te esté siendo infiel\n");
        System.out.printf("1. Tu pareja parece estar mas inquieta de lo normal sin ningún motivo aparente\n");
        System.out.print("(v)erdadero o (f)also: ");
        String pregunta1 = scanner.nextLine();
        if (pregunta1.equals("v")) {
            contador = contador + 3;
        } 

        System.out.printf("2. Ha aumentado sus gastos de vestuario\n");
        System.out.print("(v)erdadero o (f)also: ");
        String pregunta2 = scanner.nextLine();
        if (pregunta2.equals("v")) {
            contador = contador + 3;
        } 

        System.out.printf("3. Ha perdido el interes que mostraba anteriormente por ti\n");
        System.out.print("(v)erdadero o (f)also: ");
        String pregunta3 = scanner.nextLine();
        if (pregunta3.equals("v")) {
            contador = contador + 3;
        } 

        System.out.printf("5. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y asea con más frecuencia (si es mujer)\n");
        System.out.print("(v)erdadero o (f)also: ");
        String pregunta4 = scanner.nextLine();
        if (pregunta4.equals("v")) {
            contador = contador + 3;
        }

        System.out.printf("5. No te deja que mires la agenda de su teléfono móvil\n");
        System.out.print("(v)erdadero o (f)also: ");
        String pregunta5 = scanner.nextLine();
        if (pregunta5.equals("v")) {
            contador = contador + 3;
        }

        System.out.printf("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante\n");
        System.out.print("(v)erdadero o (f)also: ");
        String pregunta6 = scanner.nextLine();
        if (pregunta6.equals("v")) {
            contador = contador + 3;
        }

        System.out.printf("7. Últimamente se preocupa mas en cuidar la línea y/o estar bronceado/a.\n");
        System.out.print("(v)erdadero o (f)also: ");
        String pregunta7 = scanner.nextLine();
        if (pregunta7.equals("v")) {
            contador = contador + 3;
        }

        System.out.printf("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\n");
        System.out.print("(v)erdadero o (f)also: ");
        String pregunta8 = scanner.nextLine();
        if (pregunta8.equals("v")) {
            contador = contador + 3;
        }

        System.out.printf("9. Has notado que últimamente se perfuma más.\n");
        System.out.print("(v)erdadero o (f)also: ");
        String pregunta9 = scanner.nextLine();
        if (pregunta9.equals("v")) {
            contador = contador + 3;
        }

        System.out.printf("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n");
        System.out.print("(v)erdadero o (f)also: ");
        String pregunta10 = scanner.nextLine();
        if (pregunta10.equals("v")) {
            contador = contador + 3;
        }

        if (contador <= 10){
            System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
        } else if (contador > 10 && contador <= 22){
            System.out.println("Quizá exista el peligro de otra perona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else if (contador > 22 && contador <= 30){
            System.out.println("Tu pareja tiene todos los ingresdientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigues qué es lo que está pasando por su cabeza.");
        }

        scanner.close();
    } 
}
