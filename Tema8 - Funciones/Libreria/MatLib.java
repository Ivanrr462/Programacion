package Libreria;
public class MatLib {

    public static int suma(int sumando1, int sumando2) {
        return sumando1 + sumando2;
    }

    public static int resta(int num1, int num2) {
        num2 = -num2;
        return num1 + num2;
    }

    public static int inc(int numero) {
        return numero + 1;
    }

    public static int dec(int numero) {
        return numero + (-1);
    }

    public static boolean esMayor(int num1, int num2) {
        if (resta(num1, num2) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esMenor(int num1, int num2) {
        if (0 > resta(num1, num2) ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esIgual(int num1, int num2) {
        if (resta(num1, num2) > -1 && 1 > resta(num1, num2)) {
            return true;
        } else {
            return false;
        }
    }

    public static int divide(int dividendo, int divisor) {
        int cociente = 0;
        while (dividendo > 0) {
            dividendo = dividendo + (-divisor);
            cociente = inc(cociente);
        }
        if (esIgual(dividendo, 0)) {
            return cociente;
        } else {
            return cociente + (-1);
        }

    }

    public static int resto(int dividendo, int divisor) {
        while (dividendo > 0) {
            dividendo = dividendo + (-divisor);
        }

        if (esIgual(dividendo, 0)) {
            return dividendo;
        } else {
            return suma(dividendo, divisor);
        }
    }

    public static int multiplica(int num1, int num2) {
        int resultado = 0;
        while (num2 > 0) {
            resultado = resultado + num1;
            num2 = dec(num2);
        }
        return resultado;
    }

    public static int potencia(int base, int exponente) {
        int resultado = 0;

        if (exponente > 0) {

            resultado = base;

            while (exponente > 1) {
                resultado = multiplica(resultado, base);
                exponente = dec(exponente);
            }
            return resultado;

        } else {
            return resultado;
        }
    }

    public static int cuadrado(int numero) {
        return potencia(numero, 2);
    }

    public static int cubo(int numero) {
        return potencia(numero, 3);
    }

    public static boolean esMultiplo(int multiplo, int numero) {

        if (esIgual(resto(multiplo, numero), 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esDivisor(int divisor, int numero) {

        if (esIgual(resto(numero, divisor), 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean esPrimo(int numero) {
        boolean esPrimo = true;
        int i = 2;
        if(numero > 0){
            while (esPrimo && esMenor(i, numero + (-1))) {
                esPrimo = !(esIgual(resto(numero, i), 0));
        
                i = inc(i);            
            }
            return esPrimo;
        }else {
            numero = -numero;
            while (esPrimo && esMenor(i, numero + (-1))) {
                esPrimo = !(esIgual(resto(numero, i), 0));
        
                i = inc(i);            
            }
            return esPrimo;
        }
    }

    public static boolean esCuadradoPerfecto(int numero){
        int i = 0;
        while(esMenor(cuadrado(i), numero + 1)){
            if(esIgual(cuadrado(i), numero)){
                return true;
            }
            i = inc(i);
        }
        return false;
    }

    public static void piramide(int altura){
        int i;
        int numCaracter = 0;
        int espacio;
        while(altura > 0){
            espacio = altura;

            while (espacio > 1){
                System.out.print(" ");
                espacio = dec(espacio);
            }
            i = numCaracter;
            while (i > 0){
                System.out.print("x");
                i = dec(i);
            }
            System.err.println("x");
            altura = dec(altura);
            numCaracter = numCaracter + 2; 
        }
    }

    
}
