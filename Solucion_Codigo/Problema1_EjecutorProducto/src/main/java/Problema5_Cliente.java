/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class Problema5_Cliente {
    public String nombre;
    public String tipoEjercicio;
    public int duracion;
    public boolean cumplio;

    public Problema5_Cliente(String nombre, String tipoEjercicio, int duracion, boolean cumplio) {
        this.nombre = nombre;
        this.tipoEjercicio = tipoEjercicio;
        this.duracion = duracion;
        this.cumplio = cumplio;
    }

    @Override
    public String toString() {
        return "CLIENTE: " + nombre +
               "\nEjercicio: " + tipoEjercicio +
               "\nDuracion: " + duracion + " min" +
               "\n¿Cumplio con todo? " + (cumplio ? "Si" : "No");
    }
}