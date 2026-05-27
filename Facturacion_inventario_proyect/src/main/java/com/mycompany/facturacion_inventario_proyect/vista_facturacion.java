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

public class vista_facturacion extends JPanel {

    // CAMBIO AQUÍ
    JComboBox<String> comboClientes;

    JTextField txtProducto;
    JTextField txtCantidad;

    JButton btnFacturar;

    JTable tabla;

    DefaultTableModel modelo;

    JLabel lblTotal;

    public vista_facturacion() {

        setLayout(new BorderLayout());

        JPanel formulario = new JPanel(new GridLayout(4,2));

        // CLIENTE
        formulario.add(new JLabel("Cliente"));

        // CAMBIO AQUÍ
        comboClientes = new JComboBox<>();

        // CLIENTES DE PRUEBA
        comboClientes.addItem("Juan");

        formulario.add(comboClientes);

        // PRODUCTO
        formulario.add(new JLabel("Producto"));

        txtProducto = new JTextField();

        formulario.add(txtProducto);

        // CANTIDAD
        formulario.add(new JLabel("Cantidad"));

        txtCantidad = new JTextField();

        formulario.add(txtCantidad);

        // BOTÓN
        btnFacturar = new JButton("Generar Factura");

        formulario.add(btnFacturar);

        add(formulario, BorderLayout.NORTH);

        // TABLA
        modelo = new DefaultTableModel();

        modelo.addColumn("Cliente");
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total");

        tabla = new JTable(modelo);

        add(new JScrollPane(tabla), BorderLayout.CENTER);

        // TOTAL
        lblTotal = new JLabel("TOTAL: $0");

        add(lblTotal, BorderLayout.SOUTH);

        Controlador_factura controladorfactura =
                new Controlador_factura(this);
    }
}
    
