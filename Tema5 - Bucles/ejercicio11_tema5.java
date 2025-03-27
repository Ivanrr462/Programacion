import java.util.Scanner;

public class ejercicio11_tema5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.print("Calculo de la potencia\n");
            System.out.print("Introduzca un numero: ");
            int numero = scanner.nextInt();
            
            
            System.out.print("Introduzca su potencia: ");
            int potencia = scanner.nextInt();
            
            
            if (potencia == 0) {
                System.out.println(numero + "^" + potencia + " = 1");
            } else {
                int resultado = 1;  
                for (int i = 1; i <= potencia; i++) {
                    resultado *= numero;  
                }

                System.out.println(numero + "^" + potencia + " = " + resultado);
            }
        } catch (Exception e) {
            System.out.println("ERROR: Eres un pedazo de malito.");
        }

        scanner.close();
    }
}
