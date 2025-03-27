import java.util.Scanner;

public class ejercicio4T05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declaraciones
        final int oportunidades = 4;
        int contador = 1;
        String combinacion = "0000";
        boolean acierto = false;
        

        /*
         * Este switch rellena de ceros a la izquierda la combinación si esta 
         * es un número menor que 1000 (menos de 4 dígitos)
         */
        switch (combinacion.length()) { // Hace el switch sobre la longitud del String
            case 1:
                combinacion = "000" + combinacion;
                break;
            case 2:
                combinacion = "00" + combinacion;
                break;
            case 3:
                combinacion = "0" + combinacion;
                break;
        }


        while (!acierto && contador <= oportunidades) {
            System.out.print("Introduce la clave de la caja fuerte: ");
            String intento = scanner.nextLine();

            //Comprueba 
            if (intento.equals(combinacion)) {
                System.out.println("\033[1mClave correcta. Se ha abierto la caja fuerte.\033[0m");
                acierto = true;
            } else {
                System.out.println("Clave incorrecta");
            }
            //Incrementa el contador
            contador++;
            if (contador > 4) {
                System.out.println("Has fallado tus intentos. Se va a proceder a llamar a la policía.");
            }
        }

        scanner.close();
    }
}