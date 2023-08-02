package com.alura.menuprincipal;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class cuadroDialogoTemp extends menuPrincipal {
    
    public void inputTemperatura() {

        try {
            String inputGrados = JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir",
                    null);
            if (inputGrados != null) {
             double gradosDato = Double.parseDouble(inputGrados);
             elegirEscala(gradosDato);
            } else {
             continuar();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
            continuar();
        }

       
    }
    

    public void elegirEscala( double gradosDato) {

        String[] opciones = {
        "De Celsius a Fahrenheit",
        "De Fahrenheit a Celsius",
        };
     

   String opcion =  (String) JOptionPane.showInputDialog(null,
     "Elija una Opción",
     "Menu", JOptionPane.INFORMATION_MESSAGE, 
     null,
    opciones,
    opciones [0]);

    if (opcion != null) {
        Convertidor convertidorTemperatura = new Convertidor();

            Map<String, Runnable> optionAccion = new HashMap<>();
            optionAccion.put("De Celsius a Fahrenheit", () -> convertidorTemperatura.convertirTemperatura(gradosDato , " Fahrenheit"));
            optionAccion.put("De Fahrenheit a Celsius", () -> convertidorTemperatura.convertirTemperatura(gradosDato , " Celsius"));

            Runnable accion = optionAccion.get(opcion);
            if (accion != null) {
                accion.run();
            } else {
                continuar();
            }
        } 
     }
        public void continuar (){
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?", "Menu", JOptionPane.YES_NO_OPTION);
        
            if (opcion == JOptionPane.YES_OPTION) {
               elegirConversor();
            } else {
                JOptionPane.showMessageDialog(null, "Programa Terminado", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
              
            }
         }
}
