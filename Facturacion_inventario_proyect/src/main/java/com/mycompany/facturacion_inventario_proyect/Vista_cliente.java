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
public class Vista_cliente extends JPanel{


    JTextField txtNombre;
    JTextField txtNit;

    JButton btnGuardar;

    JTable tabla;

    DefaultTableModel modelo;

    public Vista_cliente() {

        setLayout(new BorderLayout());

        JPanel formulario = new JPanel(new GridLayout(3,2));

        formulario.add(new JLabel("Nombre:"));

        txtNombre = new JTextField();
        formulario.add(txtNombre);

        formulario.add(new JLabel("NIT:"));

        txtNit = new JTextField();
        formulario.add(txtNit);

        btnGuardar = new JButton("Guardar Cliente");

        formulario.add(btnGuardar);

        add(formulario, BorderLayout.NORTH);

        modelo = new DefaultTableModel();

        modelo.addColumn("Nombre");
        modelo.addColumn("NIT");

        tabla = new JTable(modelo);

        add(new JScrollPane(tabla), BorderLayout.CENTER);

        Controlador_cliente controladorcliente = new Controlador_cliente(this);
    }
}
    

