package Modelo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import Modelo.Puesto;
import Modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private List<Puesto> puestos;

    // Constructor
    // Se debe enviar la cantidad de puestos para crear el parqueadero
    public Parqueadero(int numeroDePuestos) {
        this.puestos = new ArrayList<>();
        for (int i = 1; i <= numeroDePuestos; i++) {
            puestos.add(new Puesto(i));
        }
    }

    // Métodos
    public List<Puesto> consultarDisponibilidad() {
        List<Puesto> disponibles = new ArrayList<>();
        for (Puesto puesto : puestos) {
            if (!puesto.isOcupado()) {
                disponibles.add(puesto);
            }
        }
        return disponibles;
    }

    public List<Vehiculo> consultarVehiculosOcupados() {
        List<Vehiculo> vehiculos = new ArrayList<>();
        for (Puesto puesto : puestos) {
            if (puesto.isOcupado()) {
                vehiculos.add(puesto.getVehiculo());
            }
        }
        return vehiculos;
    }

    public List<Puesto> getPuestos() {
        return puestos;
    }
}

