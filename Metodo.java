/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rojas_Edwar;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author estudiante
 */
public class Metodo {

    JTextArea ta;
    JLabel la, la1;
    JTextField t;
    int ale, suma, numero, sol;

    public Metodo() {
    }

    public String Seguridad(JLabel la) {
        String ale = " ";
        int ale1 = (int) (Math.random() * 9);
        int ale2 = (int) (Math.random() * 9);
        int ale3 = (int) (Math.random() * 9);
        int ale4 = (int) (Math.random() * 9);
        ale = "" + ale1 + "" + ale2 + "" + ale3 + "" + ale4;
        System.out.println(ale);
        suma = ale1 + ale2 + ale3 + ale4;
        System.out.println(suma);
        la.setText(ale);
        return la.getText();
    }

    public String respuesta(JTextField t) {
        if (suma % 2 == 0 && numero == suma) {
            numero = Integer.parseInt(t.getText());

            System.out.println("RESPUESTA CORRECTA");

        }
        return t.getText();
    }

}
