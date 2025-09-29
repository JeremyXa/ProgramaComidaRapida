/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jerem
 */
public class ComoboFactory {
    //creacion  de los tipo de combos
    public static InterComboBase crearCombo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "hamburguesa": return new HamburguesaCombo();
            case "pollo": return new PolloCombo();
            case "vegetariano": return new VegetarianoCombo();
            default: return null;
        }
    }
}