package Ejercicio12;

import java.util.Random;

public class TarjetaRegalo {
    Random rd = new Random();

    protected double saldo;
    protected int codigo;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.codigo = rd.nextInt(90000) + 10000;
    }

    public void gasta(double dinero) {
        if (saldo >= dinero) {
            this.saldo -= dinero;
        } else {
            System.out.println("No tiene suficiente saldo para gastar " + dinero);
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo tarjetaRegalo) {
        // Instancia a devolver
        TarjetaRegalo tNueva = new TarjetaRegalo(this.saldo + tarjetaRegalo.saldo);
        this.saldo = 0;
        tarjetaRegalo.saldo = 0;
        return tNueva;
    }

    public String toString() {
        return "Tarjeta no " + codigo + " - Saldo " + saldo;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
