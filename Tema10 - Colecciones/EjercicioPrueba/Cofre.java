package EjercicioPrueba;

public class Cofre<T> {
    private T contenido;
    private int capacidad;
    private boolean cerrado;

    public Cofre(T contenido, int monto) {
        this.contenido = contenido;
        this.capacidad = monto;
        this.cerrado = true;
    }

    public void abrir(){
        if (this.cerrado){
            this.cerrado = false;
            System.out.println("El cofre se ha abierto");
        } else {
            System.out.println("El cofre ya estaba abierto");
        }
    }

    public void cerrar(){
        if (!this.cerrado){
            this.cerrado = true;
            System.out.println("El cofre se ha cerrado");
        } else {
            System.out.println("El cofre ya estaba cerrado");
        }
    }


    public T getContenido() {
        return contenido;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void agregar(int capacidad){
        if (!this.cerrado){
            this.capacidad += capacidad;
            System.out.println("Se ha agregado " + capacidad + " al cofre");
        } else {
            System.out.println("El cofre está cerrado");
        }
    }

    public void extraer(int capacidad){
        if (!this.cerrado){
            if (this.capacidad >= capacidad){
                this.capacidad -= capacidad;
                System.out.println("Se ha extraido " + capacidad + " del cofre");
            } else {
                System.out.println("No hay suficiente capacidad en el cofre");
            }
        } else {
            System.out.println("El cofre está cerrado");
        }
    }
}
