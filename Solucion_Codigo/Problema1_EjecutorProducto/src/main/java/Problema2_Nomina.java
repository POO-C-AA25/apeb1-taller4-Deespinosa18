/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
public class Problema2_Nomina {

    public String nombre;
    private double salario;
    public int edad;

    public Problema2_Nomina(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public double obtenerSalario() {
        return salario;
    }

    public void obtenerAumento(double porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nEdad: " + edad
                + "\nSalario: $" + String.format("%.2f", salario);
    }
}

