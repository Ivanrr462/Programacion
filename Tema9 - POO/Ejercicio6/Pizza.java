package Ejercicio6;

public class Pizza {
    // Atributos de clase (estáticas)
    protected static int totalPedidas;
    protected static int totalServidas;

    // Atributos de la instancia
    private String tipo; // Tipo de pizza
    private String tamano; // Tamaño de la pizza
    private String estado; // Estado de la pizza

    // Constructor
    public Pizza(String tipo, String tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
        this.estado = "Pedida";
        totalPedidas++;
    }

    /*
     * Cambia el estado de la pizza de pedida a servida
     */
    public void sirve() {
        if (estado == "Pedida") {
            this.estado = "Servida";
            totalServidas++;
        } else {
            System.err.println("Esta pizza ya esta servida");
        }
    }

    public String toString() {
        return "Pizza " + tipo + " " + tamano + ", " + estado;
    }

    public static void setTotalPedidas(int totalPedidas) {
        Pizza.totalPedidas = totalPedidas;
    }

    public static void setTotalServidas(int totalServidas) {
        Pizza.totalServidas = totalServidas;
    }

    public static int getTotalPedidas() {
        return totalPedidas;
    }

    public static int getTotalServidas() {
        return totalServidas;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public String getTamano() {
        return tamano;
    }

    public String getTipo() {
        return tipo;
    }
}
