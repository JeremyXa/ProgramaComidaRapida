/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

/**
 *
 * @author jerem
 */
public interface InterComboBuilder {
    
InterComboBuilder setBase(InterComboBase base);
    InterComboBuilder setBebida(String bebida);
    InterComboBuilder setAcompañamiento(String acomp);
    InterComboBuilder setExtra(String extra);
    Combo build();
}