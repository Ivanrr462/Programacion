package Ejercicio18;

public class Incidencia {
    protected int codigo;
    protected static int ultimoCodigo = 0;
    protected String estado;
    protected int numPuesto;
    protected String descripcion;
    protected String descResuelto;
    protected static int Pendientes = 0;

    public Incidencia(int numPuesto, String descripcion) {
        this.numPuesto = numPuesto;
        this.descripcion = descripcion;
        this.codigo = ++ultimoCodigo;
        this.estado = "Pendiente";
        Pendientes++;
    }

    public void resuelve(String descResuelto) {
        this.descResuelto = descResuelto;
        this.estado = "Resuelto";
        Pendientes--;
    }

    public static int getPendientes() {
        return Pendientes;
    }

    public String toString() {
        if (estado == "Resuelto") {
            return "Incidencia " + codigo + " - Puesto " + numPuesto + " - " + descripcion + " - " + estado + " - "
                    + descResuelto;
        } else {
            return "Incidencia " + codigo + " - Puesto " + numPuesto + " - " + descripcion + " - " + estado;
        }
    }
}
