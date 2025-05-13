/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author Diego
 */
public class Problema1_EjecutorProducto {

    public static void main(String[] args) {
        Problema1_Producto producto1 = new Problema1_Producto(1000, 10);

        producto1.calcularDescuento(producto1.precioP, producto1.cantidadP);
        producto1.calcularPrecioFinal();

        System.out.println(producto1.toString());
    }
}