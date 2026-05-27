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
public class Controlador_cliente {

    private Vista_cliente vista;
    

    public Controlador_cliente(Vista_cliente vista) {

        this.vista = vista;

        this.vista.btnGuardar.addActionListener(e -> guardarCliente());
    }

    public void guardarCliente() {

        String nombre = vista.txtNombre.getText();
        String nit = vista.txtNit.getText();

        if(nombre.isEmpty() || nit.isEmpty()) {

            JOptionPane.showMessageDialog(null,
                    "Complete todos los campos");

            return;
        }

        Modelo_cliente cliente = new Modelo_cliente(nombre, nit);

        vista.modelo.addRow(new Object[]{
                cliente.getNombre(),
                cliente.getNit()
        });

        JOptionPane.showMessageDialog(null,
                "Cliente guardado");

        vista.txtNombre.setText("");
        vista.txtNit.setText("");
    }
}
    

