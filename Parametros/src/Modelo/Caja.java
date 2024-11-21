/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class Caja {
    private int saldo;

    // Constructor
    public Caja() {
        this.saldo = 0;
    }

    // Métodos
    public void agregarCobro(int cobro) {
        saldo += cobro;
    }

    public int consultarSaldo() {
        return saldo;
    }

    public int cerrarCaja() {
        int saldoFinal = saldo;
        saldo = 0; // Reinicia la caja
        return saldoFinal;
    }
}

