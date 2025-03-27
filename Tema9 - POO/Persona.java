public class Persona {

    private String nombre ;
    private String apellido = "";
 
    public Persona() {
 
    }
 
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
 
    public String toString() {
        return this.nombre + " " + this.apellido;
    }

    public void andar () {
        System.out.println("La persona anda...");
    }


 }
 
