public class Alumno extends Persona {
    private String nivelAcademico;

    public Alumno() {
        super() ;
    }
 
    public Alumno(String nombre, String apellido) {
        super(nombre, apellido) ;
    }

    public Alumno(String nombre, String apellido, String nivelAcademico) {
        super(nombre, apellido);
        this.nivelAcademico = nivelAcademico;
    }

    public void estudiar() {
        
    }
    
    @Override
    public void andar() {
        super.andar();
        System.out.println("Y va a clase muerto asco");
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
 }
