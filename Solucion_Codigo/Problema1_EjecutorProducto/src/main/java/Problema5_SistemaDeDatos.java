/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego
 */
import java.util.Scanner;

public class Problema5_SistemaDeDatos {

    Scanner entrada = new Scanner(System.in);
    int clientesCumplieron = 0;
    int sumaTiempos = 0;
    int totalClientes = 0;
    double promedio =0;
    public void procedimiento() {
        char continuar;

        do {
            System.out.print("Nombre del cliente: ");
            String nombre = entrada.nextLine();

            System.out.println("Tipo de ejercicio cardio, fuerza, estiramiento:");
            String tipoEjercicio = entrada.nextLine();

            System.out.print("Duracion del ejercicio ingresar en minutos: ");
            int duracion = entrada.nextInt();

            System.out.print("¿Cumplio con la rutina? (si/no): ");
            char respuesta = entrada.next().charAt(0);
            entrada.nextLine(); 

            boolean cumplio = (respuesta == 's');

          
            Problema5_Cliente cliente = new Problema5_Cliente(nombre, tipoEjercicio, duracion, cumplio);

           
            System.out.println(cliente);

         
            totalClientes++;
            sumaTiempos += duracion;
            if (cumplio) {
                clientesCumplieron++;
            }

            System.out.print("¿Desea ingresar otro cliente? (si/no): ");
            continuar = entrada.next().charAt(0);
            entrada.nextLine(); 

        } while (continuar == 's' || continuar == 'S');

       
        System.out.println("\nResumen del dia:");
        System.out.println("Clientes que completaron su rutina:"
                + clientesCumplieron);
        if (totalClientes > 0) {
             promedio =  sumaTiempos / totalClientes;
            System.out.printf("Promedio de duracion: %.2f minutos\n", promedio);
        } else {
            System.out.println("No se registraron clientes.");
        }
    }
}
