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
import java.awt.*;
public class Vista_principal extends JFrame{


    Vista_cliente vistaCliente;
    Vista_producto vistaProducto;
    vista_facturacion vistafacturacion;

    public Vista_principal() {

        setTitle("MERKATODO");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JPanel menu = new JPanel();

        JButton btnClientes = new JButton("Clientes");
        JButton btnProductos = new JButton("Productos");
        JButton btnFacturas = new JButton("Facturación");

        menu.add(btnClientes);
        menu.add(btnProductos);
        menu.add(btnFacturas);

        add(menu, BorderLayout.NORTH);

        vistaCliente = new Vista_cliente();
        vistaProducto = new Vista_producto();
        vistafacturacion = new vista_facturacion();

        add(vistaCliente, BorderLayout.CENTER);

        btnClientes.addActionListener(e -> cambiarPanel(vistaCliente));
        btnProductos.addActionListener(e -> cambiarPanel(vistaProducto));
        btnFacturas.addActionListener(e -> cambiarPanel(vistafacturacion));

        setVisible(true);
    }

    public void cambiarPanel(JPanel panel) {

        getContentPane().remove(1);
        add(panel, BorderLayout.CENTER);

        revalidate();
        repaint();
    }
}
    

