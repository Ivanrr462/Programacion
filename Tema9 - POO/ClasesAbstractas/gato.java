package ClasesAbstractas;

public class gato extends Mamifero {
    @Override
    public String desplazarse(int distancia, int direccion) {
        return "El gato se desplaza " + distancia + " metros hacia el " + direccion;
    }

    @Override
    public String emitirSonido() {
        return "El gato emite un maullido";
    }
}
