package EjercicioPrueba;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cofre<String> cofre = new Cofre<>("cadena", 10000);

        Cofre<Integer> cofre2 = new Cofre<>(7, 500);

        Integer numeroEnContenedor;
        Long longContenedor;
        Boolean booleanContenedor;
        Double doubleCont;
        Float floatCont;

        ArrayList<Integer> listaAnimales = new ArrayList<>();

        listaAnimales.add(7);

        int prueba = listaAnimales.get(0);
        System.out.println(prueba);
    }
}
