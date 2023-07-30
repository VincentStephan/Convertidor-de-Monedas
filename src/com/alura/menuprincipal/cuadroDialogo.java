package com.alura.menuprincipal;

import javax.swing.JOptionPane;

public class cuadroDialogo {
    public static void main(String[] args) {
    Object[] selectionValues = {"Convertidor de monedas" , "Convertidor de Temperaturas"};

    JOptionPane.showInputDialog(null,
     "Elija una Opción",
     "Menu", JOptionPane.INFORMATION_MESSAGE, 
     null,
      selectionValues,
       selectionValues [0]);

    }

}
