package Ejercicio13;

import java.util.Random;

public class CuentaCorriente {
    Random rd = new Random();

    protected long numCuenta;
    protected int saldo;

    public CuentaCorriente(int saldo) {
        this.saldo = saldo;
        this.numCuenta = 1000000000L + (long)(rd.nextDouble() * 9000000000L);
    }

    public CuentaCorriente() {
        this.saldo = 0;
        this.numCuenta = 1000000000L + (long)(rd.nextDouble() * 9000000000L);
    }

    public String toString() {
        return "Número de cuenta: " + numCuenta + " Saldo: " + saldo;
    }

    public void ingreso(int dinero) {
        this.saldo += dinero;
    }

    public void cargo(int dinero) {
        this.saldo -= dinero;
    }

    public void transferencia(CuentaCorriente CuentaCorriente, int dinero) {
        CuentaCorriente.ingreso(dinero);
        this.cargo(dinero);
    }
}
