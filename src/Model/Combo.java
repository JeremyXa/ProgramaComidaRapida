/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jerem
 */
public class Combo {
    //Variables del combo
    private String tipoBase;
    private String bebida;
    private String acompañamiento;
    private String extra;       

    
     // Setters
    public void setTipoBase(String tipoBase) {
        this.tipoBase = tipoBase; 
    }
    
    
   
    public void setBebida(String bebida) {
        this.bebida = bebida; 
    }
    
    
    
    public void setAcompañamiento(String acompañamiento) {
        this.acompañamiento = acompañamiento; 
    }
    
    public void setExtra(String extra) { 
        this.extra = extra; 
    }

    
    //Imprimir el resumen del combo
    
    
    @Override
    public String toString() {
        return "Resumen de tu Combo:\n" +    
               "- Base: " + tipoBase + "\n" +
               "- Bebida: " + bebida + "\n" +
               "- Acompañamiento: " + acompañamiento + "\n" +
               "- Extra: " + extra;
    }
}