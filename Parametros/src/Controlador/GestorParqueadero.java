/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author Usuario
 */
import Modelo.Caja;
import Modelo.Parqueadero;
import Modelo.Puesto;
import Modelo.Tarifa;
import Modelo.Vehiculo;
import java.time.Duration;
import java.time.LocalDateTime;

public class GestorParqueadero {
    private Parqueadero parqueadero;
    private Caja caja;
    private Tarifa tarifa;

    // Constructor
    public GestorParqueadero(Parqueadero parqueadero, Caja caja, Tarifa tarifa) {
        this.parqueadero = parqueadero;
        this.caja = caja;
        this.tarifa = tarifa;
    }

    // Métodos de negocio
    public void abrirParqueadero(int tarifaPorHora) {
        this.tarifa = new Tarifa(tarifaPorHora);
    }

    public void ingresarVehiculo(Vehiculo vehiculo, Puesto puesto) {
        puesto.ocuparPuesto(vehiculo, LocalDateTime.now());
    }

    public int retirarVehiculo(Puesto puesto) {
        Duration tiempoOcupacion = puesto.calcularTiempoOcupacion();
        int cobro = tarifa.calcularCobro(tiempoOcupacion);
        caja.agregarCobro(cobro);
        puesto.desocuparPuesto();
        return cobro;
    }

    public int cerrarParqueadero() {
        return caja.cerrarCaja();
    }
}

