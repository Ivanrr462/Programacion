import java.util.Scanner;

public class PruebaMain {
    public static void main(String[] args) {
        // Declaraciones
        Scanner sc = new Scanner(System.in);

        Gato misifu = new Gato("misifu", "blanco", "normal", "macho", 2, 5);

        Gato silvestre = new Gato("silvestre", "negro y blanco", "mestizo", "macho", 4, 7);

        misifu.setNombre("Puton");

        System.out.println("Tenemos dos gatos, " + misifu.getNombre() + " que es " + misifu.getRaza() + " y tiene " + misifu.getEdad() + " años, y el otro es silvestre, que tiene " + silvestre.getEdad() + " y es " + silvestre.getRaza());
    
        sc.close();

        misifu.peleaCon(silvestre);

        misifu.come("Lasaña");
        
        Persona persona = new Persona("Paquito", "paquez");

        Alumno alumno = new Alumno("ivan", "rios");

        persona.andar();

        alumno.andar();

        System.out.println(persona.toString());
        System.out.println(alumno.toString());

        Persona alumno2 = new Alumno("Marcos", "Alonso");
        alumno2.andar();
    }
}
