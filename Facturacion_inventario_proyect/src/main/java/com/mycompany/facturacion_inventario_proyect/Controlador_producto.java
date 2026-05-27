/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.facturacion_inventario_proyect;

/**
 *
 * @author user
 */
import javax.swing.*;

public class Controlador_producto {

    private Vista_producto vista;

    public Controlador_producto(Vista_producto vista) {

        this.vista = vista;

        this.vista.btnGuardar.addActionListener(
                e -> guardarProducto()
        );
    }

    public void guardarProducto() {

        try {

            String nombre = vista.txtNombre.getText();

            double precio = Double.parseDouble(
                    vista.txtPrecio.getText()
            );

            int cantidad = Integer.parseInt(
                    vista.txtCantidad.getText()
            );

            Modelo_producto producto =
                    new Modelo_producto(nombre, precio, cantidad);

            vista.modelo.addRow(new Object[]{

                    producto.getNombre(),
                    producto.getPrecio(),
                    producto.getCantidad()
            });

            JOptionPane.showMessageDialog(null,
                    "Producto guardado");

            vista.txtNombre.setText("");
            vista.txtPrecio.setText("");
            vista.txtCantidad.setText("");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,
                    "Datos inválidos");
        }
    }
}
    

