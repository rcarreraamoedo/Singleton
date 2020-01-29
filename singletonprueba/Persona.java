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
public class Persona {
    
    public String nombre;
    public int edad;
    public String apellido;
    private static Persona solo;

    private Persona() {
    }

    private Persona(String nombre, int edad, String apellido) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static Persona getSolo() {
        return solo;
    }

    public static void setSolo(Persona solo) {
        Persona.solo = solo;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", apellido=" + apellido;
    }

    public static Persona getInstance(String nombre, int edad, String apellido) {
        if (solo == null) {
            solo = new Persona(nombre,edad, apellido);

        } else {
            System.out.println("No es posible crear el objeto: "+nombre+apellido+edad);
        }
        return solo;
    }
}
