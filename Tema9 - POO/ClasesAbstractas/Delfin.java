package ClasesAbstractas;

public class Delfin extends Mamifero {
    @Override
    public String desplazarse(int distancia, int direccion) {
        return "El delfín se desplaza " + distancia + " metros hacia el " + direccion;
    }

    @Override
    public String emitirSonido() {
        return "El delfín emite un sonido agudo";
    }
}
