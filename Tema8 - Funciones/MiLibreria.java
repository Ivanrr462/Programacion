import java.util.Scanner;

public class MiLibreria {
    /*
     * Lee un valor numerico entero mayor que 2 desde teclado
     */
    public static int leerValor() {

        int numero;
        boolean ok = false;
        Scanner sc = new Scanner(System.in);

        do {
            numero = sc.nextInt();
            ok = (numero > 2);
            if (!ok) {
                System.out.println("Lo siento, el valor mínimo es 2");
                System.out.print("Introduzca un nuevo valor: ");
            }
        } while (!ok);

        sc.close();

        return numero;
    }

    public static int leerValorEntero() {

        int numero = 0;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                numero = sc.nextInt();
                if (!(numero > 2)) {
                    System.out.println("Lo siento, el valor mínimo es 2");
                    System.out.print("Introduzca un nuevo valor: ");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Debe ser un valor númerico.");
            }
        } while (!(numero > 2));

        sc.close();

        return numero;
    }

    /**
     * Método que devuelve el inverso del número que se le pasa como parámetro
     * 
     * @param numero
     * @return
     */
    public static void invertirEnteroConCerosIzquirda(int numero) {
        // Declaraciones
        int numeroInvertido = 0;
        int longitud = 0;

        while (numero != 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;

            // Añadir el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;

            // Eliminar el último número del número original
            numero /= 10;

            longitud++;
        }

        int ceros = 0;
        while (numeroInvertido / (int) Math.pow(10, longitud - 1) == 0) {
            longitud--;
            ceros++;
        }

        while (ceros > 0) {
            System.out.print("0");
            ceros--;
        }
        System.out.println(numeroInvertido);
    }

    /**
     * Método que devuelve el inverso del número que se le pasa como parámetro
     * 
     * @param numero
     * @return
     */
    public static int invertirEntero(int numero) {
        // Declaraciones
        int numeroInvertido = 0;

        while (numero != 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;

            // Añadir el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;

            // Eliminar el último número del número original
            numero /= 10;
        }

        // Devuelve el número invertido
        return numeroInvertido;
    }

    /**
     * Función que devuelve si el número entero que se le pasa como parámetro es
     * capicúa.
     * 
     * @param numero
     * @return
     */
    public static boolean esCapicua(int numero) {
        return (numero == invertirEntero(numero));
    }

    /**
     * Función que comprueba si el número entero que se le pasa como parámetro es
     * primo
     * 
     * @param numero
     * @return
     */
    public static boolean esPrimo(int numero) {
        // Declaraciones
        boolean esPrimo = true;
        int i = 2;

        // Valor absoluto
        while (esPrimo && i < numero) {
            esPrimo = (numero % i != 0);
            i++;
        }

        return esPrimo;
    }


    /*
     * Devuelve el siguiente numero primo al que se le pasa como parametro
     */
    public static int siguientePrimo(int numero) {
        // Declaraciones
        int siguientePrimo = numero + 1;

        
        while (!esPrimo(siguientePrimo)) {
            siguientePrimo++;
        }

        return siguientePrimo;
    }

}
