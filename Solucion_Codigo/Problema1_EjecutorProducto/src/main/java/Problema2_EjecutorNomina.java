
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diego
 */
public class Problema2_EjecutorNomina {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el número de empleados: ");
        int numE = entrada.nextInt();
        entrada.nextLine();

        Problema2_Nomina[] empleados = new Problema2_Nomina[numE];
        int contador = 0;

        int op;
        do {
            System.out.println("\nOpciones");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Procedimiento para su aumento");
            System.out.println("4. Salir");

            op = entrada.nextInt();
            entrada.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Nombre del trabajador:");
                    String nombre = entrada.nextLine();
                    System.out.print("Salario: ");
                    double salario = entrada.nextDouble();
                    System.out.print("Edad: ");
                    int edad = entrada.nextInt();
                    entrada.nextLine();
                    empleados[contador++] = new Problema2_Nomina(nombre, salario, edad);
                    System.out.println("Empleado agregado (total: " + contador + ").");
                    break;

                case 2:
                    if (contador == 0) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        System.out.println("\nEmpleados registrados:");
                        for (int i = 0; i < contador; i++) {
                            System.out.println(empleados[i] + "\n");
                        }
                    }
                    break;

                case 3:
                    if (contador == 0) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        double suma = 0;
                        for (int i = 0; i < contador; i++) {
                            suma += empleados[i].obtenerSalario();
                        }
                        double promedio = suma / contador;
                        System.out.printf("Salario promedio actual:"
                                + " $%.2f%n", promedio);

                        System.out.print("Porcentaje de aumento para salarios: ");
                        double porcentaje = entrada.nextDouble();
                        entrada.nextLine();
                        for (int i = 0; i < contador; i++) {
                            if (empleados[i].obtenerSalario() < promedio) {
                                empleados[i].obtenerAumento(porcentaje);
                                System.out.println("→ " + empleados[i].toString() + "\n");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("Cierre del programa");
                    break;

                default:
                    System.out.println("Opción fuera de alcance");
            }

        } while (op != 4);
    }
}
