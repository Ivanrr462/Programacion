public class Libreria {

        // 1. Suma de dos números
        public static int suma(int a, int b) {
            return a + b;
        }
    
        // 2. Resta de dos números
        public static int resta(int a, int b) {
            return a + (-b);
        }
    
        // 3. Incremento de un número
        public static int incremento(int a) {
            return a + 1;
        }
    
        // 4. Decremento de un número
        public static int decremento(int a) {
            return a + (-1);
        }
    
        // 5. Resto de una división
        public static int resto(int a, int b) {
            while (a > 0) {
                a = a + (-b);
            }
            
            return a + b;
        }
    
        // 6. Potencia de dos números
        public static int potencia(int base, int exponente) {
            int resultado = 1;
            for (int i = 0; i < exponente; i++) {
                resultado = resultado * base;
            }
            return resultado;
        }
    
        // 7. Cuadrado de un número
        public static int cuadrado(int a) {
            return potencia(a, 2);
        }
    
        // 8. Cubo de un número
        public static int cubo(int a) {
            return potencia(a, 3);
        }
    
        // 9. Es múltiplo de un número
        public static boolean esMultiplo(int a, int b) {
            return resto(a, b) == 0;
        }
    
        // 10. Es divisor de un número
        public static boolean esDivisor(int a, int b) {
            return esMultiplo(b, a);
        }
    
    
        // 12. Cuadrado perfecto de un número
        public static boolean esCuadradoPerfecto(int a) {
            int raiz = 1;
            while (raiz * raiz <= a) {
                if (raiz * raiz == a) return true;
                raiz = incremento(raiz);
            }
            return false;
        }
    
        // 13. Hacer una pirámide de números
        public static void piramide(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    
       



    // Cosas raras del profe
    public static int multiplicacion(int i, int j){
        int multiplicacion = 0;
        while (j > 0){
            multiplicacion += i;
            j--;
        }

        return multiplicacion;
    }

    public static int division(int dividendo, int divisor){
        int cociente = 0;
        while (dividendo > 0){
            cociente++;
            dividendo = dividendo - divisor;
        }

        return cociente;
    }

    public static boolean esPrimo(int numero){
        boolean esPrimo = true;
        if (numero < 2){
            esPrimo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                esPrimo = (numero % i != 0);
            }
        }

        return esPrimo;
    }

    public static void main(String[] args) {
        System.out.println(multiplicacion(5, 6));
        System.out.println(division(5, 6));
    }
}

