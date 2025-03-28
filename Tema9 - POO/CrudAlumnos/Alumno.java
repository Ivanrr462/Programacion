package CrudAlumnos;

public class Alumno extends Persona {
    private String ciclo;
    private String curso;
    private String unidad;

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "ciclo='" + ciclo + '\'' +
                ", curso='" + curso + '\'' +
                ", unidad='" + unidad + '\'' +
                '}';
    }
}