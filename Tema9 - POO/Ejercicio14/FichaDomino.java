package Ejercicio14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FichaDomino {
    protected int lado1;
    protected int lado2;

    public FichaDomino(int lado1, int lado2) throws IllegalArgumentException {
        if (lado1 >= 0 && lado1 <= 6 && lado2 >= 0 && lado2 <= 6) {
            this.lado1 = lado1;
            this.lado2 = lado2;
        } else {
            throw new IllegalArgumentException("Los valores de los lados deben estar entre 0 y 6");
        }
    }

    public FichaDomino voltea() {
        return new FichaDomino(lado2, lado1);
    }

    public boolean encaja(FichaDomino FichaDomino) {
        return this.lado1 == FichaDomino.lado1 || this.lado1 == FichaDomino.lado2 || this.lado2 == FichaDomino.lado1
                || this.lado2 == FichaDomino.lado2;
    }

    public String toString() {
        if (lado1 == 0) {
            return "[ |" + lado2 + "]";
        } else if (lado2 == 0) {
            return "[" + lado1 + "| ]";
        } else {
            return "[" + lado1 + "|" + lado2 + "]";
        }
    }

    // Ejercicio 15
    public static List<FichaDomino> generarSecuencia() {
        Random rd = new Random();
        List<FichaDomino> secuencia = new ArrayList<>();
        
        int numero1 = rd.nextInt(6) + 1;
        int numero2 = rd.nextInt(6) + 1;
        FichaDomino primeraFicha = new FichaDomino(numero1, numero2);
        secuencia.add(primeraFicha);

        for (int i = 1; i < 8; i++) {
            numero1 = numero2; // El lado derecho de la ficha anterior será el lado izquierdo de la nueva ficha
            numero2 = rd.nextInt(6) + 1;
            FichaDomino nuevaFicha = new FichaDomino(numero1, numero2);
            secuencia.add(nuevaFicha);
        }
        System.out.println(secuencia);

        return secuencia;   
    }
}
