package ClasesAbstractas;

public abstract class Mamifero {
    int edad;
    String nombre;
    String sexo;

    public String dormir() {
        return "Zzzzzzz";
    }

    public String respirar() {
        return "Inhalar, exhalar";
    }

    public abstract String desplazarse(int distancia, int direccion);

    public abstract String emitirSonido();
}
