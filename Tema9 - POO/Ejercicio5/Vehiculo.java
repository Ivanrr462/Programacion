package Ejercicio5;

public class Vehiculo {
    // Atributos de clase (estático)
    public static int vehiculosCreados = 0;
    public static int kilometrosTotales = 0;

    // Atributos de instancia
    public int kilometrosRecorridos;

    public Vehiculo() {
        vehiculosCreados++;
    }

    public void andar(int kilometros) {
        kilometrosTotales += kilometros;
        kilometrosRecorridos += kilometros;
    }

    public static int getKilometrosTotales() {
        return kilometrosTotales;
    }
}
