public class Prueba2 {
    public static void main(String[] args) {
        int nota = 5;

        if (nota < 5){
            System.out.println("Suspenso");
        } else if (nota == 5) {
            System.out.println("Raspao");
        } else if (nota == 6) {
           System.out.println("Bien"); 
        } else if (nota == 7 || nota == 8) {
            System.out.println("Notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente");
        }
    }
}
