public class Entradaporconsola {
    public static void main(String[] args) {
        String nombre;
        System.out.print("Dime cómo te llamas: ");
        nombre = System.console().readLine();
        
        System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");
        
        System.out.print("Dime tu edad: ");
        String edadstring = System.console().readLine();

        int edad = Integer.parseInt(edadstring);
                System.out.println("Hola " + nombre + ", ¡encantado de conocerte!");

    }
}