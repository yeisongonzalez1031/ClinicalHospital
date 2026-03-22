/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicalhospital.Models;

/**
 *
 * @author ESCRITORIO
 */
public class Persona {
    
    private String Nombre;
    private int Edad;
    private String Cedula;
    private String Telefono;
    
    
    public Persona() {
    }

    public Persona(String Nombre, int Edad, String Cedula, String Telefono) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Cedula = Cedula;
        this.Telefono = Telefono;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    
    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Edad: " + Edad + ", Cedula: " + Cedula +", Telefono: "+ Telefono;
    }
    
    
}
