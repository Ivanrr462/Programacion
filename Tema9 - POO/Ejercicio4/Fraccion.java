package Ejercicio4;

/*
 * Clase que implemeta una fraccion y sus metodos mas tipicos
 */
public class Fraccion {
    // Declaraciones
    private int numerador;
    private int denominador;

    public Fraccion() {

    }

    /*
     * Constructor
     * @param numerador 
     * @param denominador
     */
    public Fraccion (int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion invertir() {
        Fraccion inversa = new Fraccion();
        inversa.denominador = this.numerador;
        inversa.numerador = this.denominador;

        // Devolvemos la fraccion invertida
        return inversa;
    } 

    public Fraccion simplificar() {
        Fraccion simplificada = new Fraccion();

        int mcd = MCDAlgoritmoEuclides(this.numerador, this.denominador);
        simplificada.numerador = this.numerador / mcd;
        simplificada.denominador = this.denominador / mcd;

        // Devolvemos la fraccion simplificada
        return simplificada;
    }
    
    public Fraccion multiplicar(Fraccion fraccion) {
        Fraccion producto = new Fraccion(this.numerador * fraccion.denominador, this.denominador * fraccion.denominador);
        producto = producto.simplificar();
        return producto;
    }

    public Fraccion dividir(Fraccion fraccion) {
        return new Fraccion(this.numerador * fraccion.denominador, this.denominador * fraccion.denominador).simplificar();
    }

    public String toString() {
        return numerador + "/" + denominador;
    }

    /*
     * Método privado que calcula el MCD mediante el algoritmo de Euclides
     */
    private int MCDAlgoritmoEuclides(int valor1, int valor2) {
        while (valor1 != valor2) {
            if (valor1 >= valor2) {
                valor1 = valor1 - valor2;
            } else {
                valor2 = valor2 - valor1;
            }
        }
        return valor1;
    }
}
