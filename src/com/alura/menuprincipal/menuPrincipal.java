package com.alura.menuprincipal;


import com.alura.interfazGrafica.MenuFrame;
import javax.swing.SwingUtilities;

public class menuPrincipal {
 
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            mostrarMenu();
        });
    }

    public static void mostrarMenu() {
        MenuFrame menuFrame = new MenuFrame();
        menuFrame.setTitle("Menú Principal");
        menuFrame.setDefaultCloseOperation( javax.swing.JFrame.EXIT_ON_CLOSE);
        menuFrame.pack();
        menuFrame.setLocationRelativeTo(null); // Centrar el JFrame en la pantalla
        menuFrame.setVisible(true);
    }
}








