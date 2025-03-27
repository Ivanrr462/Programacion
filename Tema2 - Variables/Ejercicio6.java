// Ivan Rios Raya
public class Ejercicio6 {
    public static void main(String[] args) {
        double base = 22.75;
        double iva = base * 0.21;
        double total = base + iva;

        System.out.println("Base imponible" + "\t" + base);
        System.out.println("IVA" + "\t\t" + String.format("%.2f", iva));
        System.out.println("---------------------");
        System.out.println("Total" + "\t\t" + String.format("%.2f", total));
    }
}
