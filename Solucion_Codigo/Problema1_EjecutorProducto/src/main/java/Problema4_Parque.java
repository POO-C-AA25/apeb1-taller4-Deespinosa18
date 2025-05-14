
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Diego
 */
public class Problema4_Parque {

    Scanner entrada = new Scanner(System.in);
    int visitantesValidos = 0;

    public void procedimiento() {
        char continuar;

        do {
            System.out.print("Nombre del visitante: ");
            String nombre = entrada.nextLine();
            
            System.out.print("Edad: ");
            int edad = entrada.nextInt();

            System.out.print("Estatura (Ingresela en metros): ");
            double estatura = entrada.nextDouble();

            System.out.println("Elige un juego:");
            System.out.println("1. Martillo ");
            System.out.println("2. Gusanito");
            System.out.println("3. Tagada");
            int juego = entrada.nextInt();
           

            Problema4_Visitante visitante = new Problema4_Visitante(nombre, edad, estatura);

            boolean acceso = false;

            if (juego == 1 && edad >= 12 && estatura >= 1.50) {
                acceso = true;
            }

            if (juego == 2 && edad >= 5 && estatura >= 0.90) {
                acceso = true;
            }

            if (juego == 3 && edad >= 15 && estatura >= 1.60) {
                acceso = true;
            }

            if (juego != 1 && juego != 2 && juego != 3) {
                System.out.println("Opción no válida.");
            }

            if (acceso) {
                System.out.println( visitante + " puede ingresar al juego!");
                visitantesValidos++;
            } else {
                System.out.println("Lo sentimos, " + visitante + 
                        " no cumple los requisitos.");
            }

            System.out.print("¿Desea ingresar otro visitante? (s/n): ");
            continuar = entrada.next().charAt(0);
             entrada.nextLine();

        } while (continuar == 's');

        System.out.println("\nTotal de visitantes que"
                + " cumplen con todas las condiciones: " + visitantesValidos);
    }
}