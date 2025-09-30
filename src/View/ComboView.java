/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import Model.Combo;

import java.util.Scanner;

public class ComboView {
   private Scanner sc = new Scanner(System.in);
   
    // Método auxiliar para leer opciones válidas
    private int leerOpcion(int min, int max) {
        int op;
        
        while (true) {
            System.out.print("Ingrese opción (" + min + "-" + max + "): ");
            
            if (sc.hasNextInt()) {
                op = sc.nextInt();
                if (op >= min && op <= max) {
                    return op; // opción válida
                } else {
                    System.out.println("Opción inválida. Intente de nuevo.");
                }
            } else {
                System.out.println("Debe ingresar un número.");
                sc.next(); // limpiar entrada inválida
            }
        }
    }

    
    
    
    
    
    public String elegirBase() {
        System.out.println("\nElige tu combo base:");
        System.out.println("1. Hamburguesa\n2. Pollo\n3. Vegetariano");
        int op = leerOpcion(1, 3);
        switch (op) {
            case 1: return "hamburguesa";
            case 2: return "pollo";
            case 3: return "vegetariano";
            default: return null; // nunca llega aquí
        }
    }

    public String elegirBebida() {
        System.out.println("\nElige tu bebida:");
        System.out.println("1. Pepsi\n2. CocaCola\n3. Chicha");
        int op = leerOpcion(1, 3);
        switch (op) {
            case 1: return "Pepsi";
            case 2: return "CocaCola";
            case 3: return "Chicha";
            default: return null;
        }
    }

    public String elegirAcompañamiento() {
        System.out.println("\nElige tu acompañamiento:");
        System.out.println("1. Papas Fritas\n2. Ensalada\n3. Arroz");
        int op = leerOpcion(1, 3);
        switch (op) {
            case 1: return "Papas Fritas";
            case 2: return "Ensalada";
            case 3: return "Arroz";
            default: return null;
        }
    }

    public String elegirExtra() {
        System.out.println("\nElige tu extra:");
        System.out.println("1. Helado Combinado\n2. Mayonesa Sachet\n3. Ají de la Casa");
        int op = leerOpcion(1, 3);
        switch (op) {
            case 1: return "Helado Combinado";
            case 2: return "Mayonesa Sachet";
            case 3: return "Ají de la Casa";
            default: return null;
        }
    }

    public void mostrarResumen(Combo combo) {
        System.out.println("\n" + combo.toString());
    }
}