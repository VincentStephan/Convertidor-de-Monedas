package com.alura.menuprincipal;

import javax.swing.JOptionPane;

public class entradaValor {
    
    public static void main(String[] args) {
        
       String inputMoneda =  JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir", null);
       int monedaDato = Integer.parseInt(inputMoneda);
       System.out.println(monedaDato);
    }
}
