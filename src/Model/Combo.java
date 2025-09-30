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
    private String acompanamiento;
    private String extra;       

    public void setTipoBase(String tipoBase) { this.tipoBase = tipoBase; }
    public void setBebida(String bebida) { this.bebida = bebida; }
    public void setAcompanamiento(String acompanamiento) { this.acompanamiento = acompanamiento; }
    public void setExtra(String extra) { this.extra = extra; }

    @Override
    public String toString() {
        return "Resumen de tu Combo:\n" +
               "- Base: " + tipoBase + "\n" +
               "- Bebida: " + bebida + "\n" +
               "- Acompañamiento: " + acompanamiento + "\n" +
               "- Extra: " + extra;
    }
}