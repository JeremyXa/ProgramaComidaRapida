/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programa_comida_rapida;


import Controller.ComboController;
import View.ComboView;
/**
 *
 * @author jerem
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComboView vista = new ComboView();
        ComboController controller = new ComboController(vista);
        controller.iniciar();
    }
}
