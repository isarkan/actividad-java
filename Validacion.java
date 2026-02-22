/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rojas_Edwar;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author estudiante
 */
public class Validacion {

    JTextField t;
    JTextArea ta;
    JRadioButton a, b, c;
    int numero;

    public Validacion() {
    }

    public void soloNumeros(JTextField t) {
        t.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (!Character.isDigit(c)) {
                    ke.consume();
                }
            }
        });
    }

    public void sololetras(JTextField t) {
        t.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
                char c = ke.getKeyChar();
                if (Character.isDigit(c)) {  //busca cada uno 
                    ke.consume(); //rechaza el digito 
                }
            }
        });
    }

    public int convertir(JTextField t) {
        numero = Integer.parseInt(t.getText());
        return numero;
    }

    public int Comparar(int n) {
        int num1 = 1980, num2 = 2022, z = 0;
        if (n <= num1) {
            // System.out.println("VEHICULO NO VALIDO");
            JOptionPane.showMessageDialog(null, "VEHICULO NO VALIDO");
        } else if (n >= 1980 && n == 2022) {
            System.out.println("VEHICULO VALIDO");
        } else if (n > 2022) {
            JOptionPane.showMessageDialog(null, "VEHICULO NO VALIDO");
        }
        return n;
    }

    public int Cotizacion(int n) {
        //String cot = "";
        if (n <= 2005 && n >= 1980) {
            //System.out.println("valor a pagar 344.730");
            JOptionPane.showMessageDialog(null, "valor a pagar 344.730");

            // cot = "valor a pagar 344.730";
        } else if (n >= 2006 && n <= 2014) {
            //System.out.println("valor a pagar 302.000");
            JOptionPane.showMessageDialog(null, "valor a pagar 302.000");

            //  cot = "valor a pagar 302.000";
        } else if (n >= 2015 && n <= 2020) {
            //System.out.println("valor a pagar 289.000");
            JOptionPane.showMessageDialog(null, "valor a pagar 289.000");

            // cot = "valor a pagar 289.000";
        } else if (n >= 2021 && n == 2022) {
            JOptionPane.showMessageDialog(null, "no aplica");
        }

        // cot = "No aplica";
        // System.out.println("no aplica");
        return n;
    }

    public String validarJT(JTextField t, JTextArea ta) {
        if (t.getText().trim().isEmpty()) {
            t.setBorder(new TitledBorder(new LineBorder(Color.red), t.getName()));
        } else {
            t.setBorder(new TitledBorder(new LineBorder(null), t.getName()));
            ta.append(t.getText());
        }
        return t.getText();
    }

    public String validarJRB(JRadioButton a, JRadioButton b, JRadioButton c, JTextArea ta) {
        String opcion = "";
        if (a.isSelected()) {
            a.setForeground(Color.BLACK);
            opcion = a.getText();
            ta.append(a.getText());
        } else if (b.isSelected()) {
            b.setForeground(Color.BLACK);
            opcion = b.getText();
            ta.append(b.getText());
        } else if (c.isSelected()) {
            c.setForeground(Color.BLACK);
            opcion = c.getText();
            ta.append(c.getText());
        } else {
            a.setForeground(Color.RED);
            b.setForeground(Color.RED);
            c.setForeground(Color.RED);
        }
        return opcion;
    }
}
