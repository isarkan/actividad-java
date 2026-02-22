/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rojas_Edwar;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author estudiante
 */
public class Vehiculo extends JFrame implements ActionListener {
    
    JPanel p1, p2, p3;
    JTextField t1, t2, t3, t4, t5;
    JTextArea ta;
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JRadioButton par, ser, ofi;
    ButtonGroup g;
    JButton gua, sal, rei;
    JScrollPane sc1;
    
    Validacion va = new Validacion();
    Metodo me = new Metodo();
    
    public Vehiculo() {
        setTitle("TECNICO MECANICA DE VEHICULOS");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        
        Datos();
        Captcha();
        Pantalla();
        
        setVisible(true);
    }
    
    public void Pantalla() {
        p2 = new JPanel(new FlowLayout());
        ta = new JTextArea();
        sc1 = new JScrollPane(ta);
        ta.setEditable(false);
        sc1.setPreferredSize(new Dimension(550, 200));
        sc1.setBorder(BorderFactory.createTitledBorder("RESULTADO"));
        add(p2);
        p2.add(sc1);
    }
    
    public void Datos() {
        p1 = new JPanel(new GridLayout(3, 2));
        
        l1 = new JLabel("PLACA");
        t1 = new JTextField();
        
        l2 = new JLabel("TIPO");
        par = new JRadioButton("Particular");
        ser = new JRadioButton("Servicio");
        ofi = new JRadioButton("Oficial");
        g = new ButtonGroup();
        g.add(par);
        g.add(ser);
        g.add(ofi);
        
        l3 = new JLabel("MODELO");
        t2 = new JTextField();
        va.soloNumeros(t2);
        
        gua = new JButton("GUARDAR");
        gua.addActionListener(this);
        
        sal = new JButton("SALIR");
        sal.addActionListener(this);
        
        rei = new JButton("REINICIAR");
        rei.addActionListener(this);
        
        add(p1);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(par);
        p1.add(ser);
        p1.add(ofi);
        p1.add(l3);
        p1.add(t2);
        p1.add(gua);
        p1.add(rei);
        p1.add(sal);
        
    }
    
    public void Captcha() {
        p3 = new JPanel(new FlowLayout());
        l4 = new JLabel("CAPTCHA");
        
        l5 = new JLabel();
        me.Seguridad(l5);
        
        l6 = new JLabel("Respuesta Correcta");
        t4 = new JTextField("", 10);
        me.respuesta(t4);
        
        add(p3);
        p3.add(l4);
        p3.add(l5);
        p3.add(l6);
        p3.add(t4);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (gua == ae.getSource()) {
            va.validarJT(t1, ta);
            va.validarJRB(par, ser, ofi, ta);
            va.validarJT(t2, ta);
            va.validarJT(t4, ta);
            System.out.println(va.Comparar(va.convertir(t2)));
            System.out.println(va.Cotizacion(va.convertir(t2)));
        }
        if (rei == ae.getSource()) {
            ta.setText("");
            
        }
        if (sal == ae.getSource()) {
            System.exit(0);
        }
    }
    
}
