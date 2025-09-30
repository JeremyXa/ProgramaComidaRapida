/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import Model.Combo;
import Model.ComboBuilder;
import Model.ComboFactory;
import Model.InterComboBase;
import Model.InterComboBuilder;
import Model.InterComboBuilder;
import View.ComboView;
/**
 *
 * @author jerem
 */
public class ComboController {
    private ComboView view;

    public ComboController(ComboView view) {
        this.view = view;
    }

    public void iniciar() {
        String baseElegida = view.elegirBase();
        InterComboBase base = ComboFactory.crearCombo(baseElegida);

        String bebida = view.elegirBebida();
        String acomp = view.elegirAcompanamiento();
        String extra = view.elegirExtra();

        Combo combo = new ComboBuilder()
                .setBase(base)
                .setBebida(bebida)
                .setAcompanamiento(acomp)
                .setExtra(extra)
                .build();

        view.mostrarResumen(combo);
    }
}