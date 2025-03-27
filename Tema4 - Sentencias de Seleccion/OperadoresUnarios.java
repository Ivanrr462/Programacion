public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 100;

        /* 
        Operador incremento sufijo 
                (numero ++)
        */ 
        int incrementoSufijo = numero++;
        System.out.println(incrementoSufijo);
        /* 
        Operador incremento prefijo 
                (++numero)
        */ 
        int incrementoPrefijo = ++numero;
        System.out.println(incrementoPrefijo);
    }
}
