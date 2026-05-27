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
import javax.swing.table.DefaultTableModel;
import java.awt.*;
public class Vista_producto extends JPanel {
    
    JTextField txtNombre;
    JTextField txtPrecio;
    JTextField txtCantidad;

    JButton btnGuardar;

    JTable tabla;

    DefaultTableModel modelo;

    public Vista_producto() {

        setLayout(new BorderLayout());

        JPanel formulario = new JPanel(new GridLayout(4,2));

        formulario.add(new JLabel("Nombre"));

        txtNombre = new JTextField();
        formulario.add(txtNombre);

        formulario.add(new JLabel("Precio"));

        txtPrecio = new JTextField();
        formulario.add(txtPrecio);

        formulario.add(new JLabel("Cantidad"));

        txtCantidad = new JTextField();
        formulario.add(txtCantidad);

        btnGuardar = new JButton("Guardar Producto");

        formulario.add(btnGuardar);

        add(formulario, BorderLayout.NORTH);

        modelo = new DefaultTableModel();

        modelo.addColumn("Nombre");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");

        tabla = new JTable(modelo);

        add(new JScrollPane(tabla), BorderLayout.CENTER);

        Controlador_producto controladorproducto =
                new Controlador_producto(this);
    }
}
    

