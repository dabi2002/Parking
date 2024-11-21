/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.time.LocalDateTime;
import java.time.Duration;

public class Puesto {
    private int numero;
    private boolean ocupado;
    private Vehiculo vehiculo;
    private LocalDateTime horaIngreso;

    // Constructor
    public Puesto(int numero) {
        this.numero = numero;
        this.ocupado = false;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDateTime getHoraIngreso() {
        return horaIngreso;
    }

    // Métodos de negocio
    public void ocuparPuesto(Vehiculo vehiculo, LocalDateTime horaIngreso) {
            // OJO AQUI que no se está tomando en cuenta premisa de si esta ocupado o no
            // el puesto, deberia desarrollarse en un metodo dentro del JFrame
            // y que este se llame en caso de que el puesto esté ocupado o no.
            // Ejemplo: if (!ocupado){ocuparPuesto(carro, 10:00:00)}else{JPane.showMessage("ta ocupao)
           
            this.vehiculo = vehiculo;
            this.horaIngreso = horaIngreso;
            this.ocupado = true;
    }

    public void desocuparPuesto() {
        this.vehiculo = null;
        this.horaIngreso = null;
        this.ocupado = false;
    }

    public Duration calcularTiempoOcupacion() {
        return Duration.between(horaIngreso, LocalDateTime.now());
       }
}

