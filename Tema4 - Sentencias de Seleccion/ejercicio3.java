import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el numero de horas que has trabajado esta semana: ");
        int horas = scanner.nextInt();
        final float horas40 = 12f;
        final float horasmas40 = 16f;

        if (horas <= 40){
            float pago = horas * horas40;
            System.out.println("El sueldo semanal que le corresponde es de " + pago + " euros");
        } else {
            float pago  = 40 * horas40;
            float restante = horas - 40;
            float pago2 = restante * horasmas40;
            float sueldo = pago + pago2;
            System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros");
        }

        scanner.close();
    }
}
