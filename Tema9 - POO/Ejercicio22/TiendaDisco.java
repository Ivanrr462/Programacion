package Ejercicio22;

public class TiendaDisco {
    private Disco[] listaDiscos = new Disco[100];

    public void añadir(Disco disco) throws Exception {
        for (int i = 0; i < listaDiscos.length; i++) {
            if (listaDiscos[i] == null) {
                listaDiscos[i] = disco;
                return;
            }
        }
        throw new Exception("No se pueden añadir más discos");
    }

    
}
