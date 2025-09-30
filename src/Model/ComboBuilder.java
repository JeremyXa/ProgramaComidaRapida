/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jerem
 */
public class ComboBuilder implements InterComboBuilder {
    private Combo combo;

    public ComboBuilder() {
        this.combo = new Combo();
    }

    public InterComboBuilder setBase(InterComboBase base) {
        combo.setTipoBase(base.getTipo());
        return this;
    }

    public InterComboBuilder setBebida(String bebida) {
        combo.setBebida(bebida);
        return this;
    }

    public InterComboBuilder setAcompanamiento(String acomp) {
        combo.setAcompanamiento(acomp);
        return this;
    }

    public InterComboBuilder setExtra(String extra) {
        combo.setExtra(extra);
        return this;
    }

    public Combo build() {
        return combo;
    }
}