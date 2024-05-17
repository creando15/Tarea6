package tarea6ed;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rocio
 */
public class Facturar {

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double Total;
        if (numProductos > LIMITE_PARA_DESCUENTO) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            Total = precioProducto * DESCUENTO;
            mostrarTotal(Total);
        } else {
            Total = precioProducto * DESCUENTO_BASICO;
            mostrarTotal(Total);
        }
    }
    public static final int LIMITE_PARA_DESCUENTO = 3;
    public static final double DESCUENTO_BASICO = 0.95;
    public static final double DESCUENTO = 0.8;

    public void mostrarTotal(double Total) {
        System.out.println("El total a pagar es:" + Total);
        System.out.println("Enviado");
    }
}
