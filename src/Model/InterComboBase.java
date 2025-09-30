/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Model;

/**
 *
 * @author jerem
 */
public interface InterComboBase {
    
String getTipo();

}

// Clases concretas de combos base
class HamburguesaCombo implements InterComboBase {
    public String getTipo() { 
        return "Hamburguesa"; }
}

class PolloCombo implements InterComboBase {
    public String getTipo() {
        return "Pollo"; }
}

class VegetarianoCombo implements InterComboBase {
    public String getTipo() { 
        return "Vegetariano"; }
    
    
  
}

