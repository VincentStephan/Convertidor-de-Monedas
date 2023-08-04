package com.alura.menuprincipal;


public class Convertidor {
    
    public String convertirMoneda(double dinero, double tasa, String moneda) {
    double resultado = dinero * tasa;
    return String.format("Tienes "+  moneda + " $ %.2f ", resultado );
     

  

    }

    public String convertirTemperatura(double grado, String escala) {
    double resultado = 0;
    
     if (escala.equals("Fahrenheit")) {
         resultado = (grado * 9/5) + 32;
     } else {
         resultado = (grado - 32) * 5/9;
     }
     
      return String.format("%.2f convertidos a  " +  escala + "", resultado);
    


     }
}