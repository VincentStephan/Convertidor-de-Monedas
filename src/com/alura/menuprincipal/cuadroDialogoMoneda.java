package com.alura.menuprincipal;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class cuadroDialogoMoneda extends menuPrincipal {

   

    public void inputMoneda() {

        try {
            String inputMoneda = JOptionPane.showInputDialog("Ingrese la cantidad que desea convertir",
                    null);
            if (inputMoneda != null) {
             double monedaDato = Double.parseDouble(inputMoneda);
             elegirMoneda(monedaDato);
          
            } else {
              continuar();
            }
           
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "valor no valido", "Error", JOptionPane.ERROR_MESSAGE);
            continuar();
        }

       
    }
    

    public void elegirMoneda( double monedaDato) {

        String[] opciones = {
        "De pesos a Dólar",
        "De pesos a Euro",
        "De pesos a Libra",
        "De pesos a Yen",
        "De pesos a Won Coreano",
        "De Dolar a Pesos",
        "De Euro a Pesos",
        "De Libra a Pesos ",
        "De Yen a Pesos",
        "De Won Coreano a Pesos"};
     

     

   String opcion =  (String) JOptionPane.showInputDialog(null,
     "Elija una Opción",
     "Menu", JOptionPane.INFORMATION_MESSAGE, 
     null,
    opciones,
    opciones [0]);

    if (opcion != null) {
        Convertidor convertidorMonedas = new Convertidor();

            Map<String, Runnable> optionAccion = new HashMap<>();
            optionAccion.put("De pesos a Dólar", () -> convertidorMonedas.convertirMoneda(monedaDato, 0.0178 , "USD"));
            optionAccion.put("De pesos a Euro", () -> convertidorMonedas.convertirMoneda(monedaDato, 0.0161, "EUR"));
            optionAccion.put("De pesos a Libra", () -> convertidorMonedas.convertirMoneda(monedaDato, 0.0139, "GBP"));
            optionAccion.put("De pesos a Yen", () -> convertidorMonedas.convertirMoneda(monedaDato, 2.5395, "JPY"));
            optionAccion.put("De pesos a Won Coreano", () -> convertidorMonedas.convertirMoneda(monedaDato, 22.8645, "KRW"));
            optionAccion.put("De Dolar a Pesos", () -> convertidorMonedas.convertirMoneda(monedaDato, 56.3000, "DOP"));
            optionAccion.put("De Euro a Pesos", () -> convertidorMonedas.convertirMoneda(monedaDato, 61.95, "DOP"));
            optionAccion.put("De Libra a Pesos", () -> convertidorMonedas.convertirMoneda(monedaDato, 71.9998, "DOP"));
            optionAccion.put("De Yen a Pesos", () -> convertidorMonedas.convertirMoneda(monedaDato, 0.3939, "DOP"));
            optionAccion.put("De Won Coreano a Pesos", () -> convertidorMonedas.convertirMoneda(monedaDato, 0.0437, "DOP"));
           
            Runnable accion = optionAccion.get(opcion);
            if (accion != null) {
                accion.run();
            } 
            } else {
                continuar();
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


