/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class Problema3_Autobus {

    public String nombre;
    public String grado;
    public int permiso;

    public Problema3_Autobus(String nombre, String grado, int permiso) {
        this.nombre = nombre;
        this.grado = grado;
        this.permiso = permiso;
    }

    public int verifyPermiso() {
        return permiso;
    }

    @Override
    public String toString() {
        String validacion;
        if (permiso == 1) {
            validacion = "Sí";
        } else {
            validacion = "No";
        }

        return "Estudiante: " + nombre
                + "\nGrado: " + grado
                + "\nPermiso vigente: " + validacion;
    }
}
