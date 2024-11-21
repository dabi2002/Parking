/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Usuario
 */
import java.time.Duration;

public class Tarifa {
    private int tarifaPorHora;

    // Constructor
    public Tarifa(int tarifaPorHora) {
        this.tarifaPorHora = tarifaPorHora;
    }

    // Método para calcular el cobro
    public int calcularCobro(Duration tiempoOcupacion) {
        long horas = tiempoOcupacion.toHours();
        return (int) (horas * tarifaPorHora);
    }
}

