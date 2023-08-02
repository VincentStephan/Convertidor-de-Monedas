package com.alura.menuprincipal;

import javax.swing.JOptionPane;

public class Convertidor extends cuadroDialogoMoneda {
    
    public void convertirMoneda(double dinero, double tasa, String moneda) {
    
     double resultado = dinero * tasa;
     String mensaje = String.format("Tienes $ %.2f", resultado);
     JOptionPane.showMessageDialog(null, mensaje + moneda, "Resultado", JOptionPane.INFORMATION_MESSAGE);
     continuar(); 

    

    }

    public void convertirTemperatura(double grado, String escala) {
    double resultado = 0;
    
     if (escala.equals("Fahrenheit")) {
         resultado = (grado * 9/5) + 32;
     } else {
         resultado = (grado - 32) * 5/9;
     }
     
     String mensaje = String.format("Hay  %.2f convertidos a", resultado);
     JOptionPane.showMessageDialog(null, mensaje + escala, "Resultado", JOptionPane.INFORMATION_MESSAGE);
     continuar(); 


     }
}