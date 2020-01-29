/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonprueba;

/**
 *
 * @author usuario
 */
public class SingletonPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona obx1= Persona.getInstance("Pepe", 34, "Guerrero");
       Persona obx2=Persona.getInstance("Roberto",36,"DosSantos");
        System.out.println(obx1.getNombre());
        System.out.println(obx2.getNombre());
    }
}