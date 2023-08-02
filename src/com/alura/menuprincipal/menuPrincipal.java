package com.alura.menuprincipal;

import javax.swing.JOptionPane;

public class menuPrincipal {
   static cuadroDialogoMoneda cuadroDialogoMoneda = new cuadroDialogoMoneda();
   static cuadroDialogoTemp cuadroDialogoTemp = new cuadroDialogoTemp();
     
    public static void main(String[] args) {
      elegirConversor();
    }

    public static void elegirConversor() {
        String moneda = "Convertidor de monedas";
        String temperatura = "Convertidor de Temperaturas";
        Object[] selectionValues = { moneda, temperatura };

        String seleccion = (String) JOptionPane.showInputDialog(null,
                "Elija una Opción",
                "Menu", JOptionPane.INFORMATION_MESSAGE,
                null,
                selectionValues,
                selectionValues[0]);

        if (seleccion != null && seleccion.equals(moneda)) {
            cuadroDialogoMoneda.inputMoneda();
        } else if (seleccion != null && seleccion.equals(temperatura)) {
            cuadroDialogoTemp.inputTemperatura();
        } else {
            cuadroDialogoMoneda.continuar();
        }
    }
}








