/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class Problema4_Visitante {

    public String nombre;
    public int edad;
    public double estatura;

    public Problema4_Visitante(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String Nombre() {
        return nombre;
    }

    public int Edad() {
        return edad;
    }

    public double Estatura() {
        return estatura;
    }

    @Override
    public String toString() {
        return "Visitante: " + nombre
                + "\nEdad: " + edad
                + "\nEstatura: " + estatura + "m";
    }
}
