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

public class Controlador_factura {

    private vista_facturacion vista;

    public Controlador_factura(vista_facturacion vista) {

        this.vista = vista;

        this.vista.btnFacturar.addActionListener(
                e -> generarFactura()
        );
    }

    public void generarFactura() {

        try {

            String cliente =vista.comboClientes.getSelectedItem().toString();

            String producto =
                    vista.txtProducto.getText();

            int cantidad =
                    Integer.parseInt(
                            vista.txtCantidad.getText()
                    );

            double precio = 5000;

            double total = cantidad * precio;

            Modelo_factura factura = new Modelo_factura(
                    cliente,
                    producto,
                    cantidad,
                    total
            );

            vista.modelo.addRow(new Object[]{

                    factura.getCliente(),
                    factura.getProducto(),
                    factura.getCantidad(),
                    factura.getTotal()
            });

            vista.lblTotal.setText(
                    "TOTAL: $" + total
            );

            JOptionPane.showMessageDialog(null,
                    "Factura generada");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,
                    "Error en factura");
        }
    }
}
    

