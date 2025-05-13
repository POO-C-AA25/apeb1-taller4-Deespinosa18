
import java.util.Scanner;

public class Problema3_EjecutorAutobus {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero de estudiantes a registrar ");
        int numE = entrada.nextInt();
        entrada.nextLine();
        Problema3_Autobus[] estudiantes = new Problema3_Autobus[numE];
        int[] contador = new int[numE];
        for (int i = 0; i < numE; i++) {
            contador[i] = i + 1;
            System.out.println("\nEstudiante Numero" + " " + contador[i]);
            System.out.print("Nombre: ");
            String nombre = entrada.nextLine();

            System.out.print("Grado De Estudio: ");
            String grado = entrada.nextLine();

            System.out.print("Tienes tu permiso en estado vigente?"
                    + " 1 = si / 2 = no: ");
            int permiso = entrada.nextInt();
            entrada.nextLine();

            estudiantes[i] = new Problema3_Autobus(nombre, grado, permiso);
        }

        int acept = 0;
        int rech = 0;

        System.out.println("\n Reporte de verificacion ");
        for (int i = 0; i < numE; i++) {

            System.out.println(estudiantes[i].toString());

            if (estudiantes[i].verifyPermiso() == 1) {
                System.out.println("Si tiene permiso de acceso al transporte\n");
                acept++;
            } else {
                System.out.println("No tiene permiso de acceso al transporte\n");
                rech++;
            }
        }

        System.out.println("Estadisticas del dia");
        System.out.println("Total aceptados: " + acept);
        System.out.println("Total rechazados: " + rech);

    }

}
