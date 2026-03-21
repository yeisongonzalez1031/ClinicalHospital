/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicalhospital.Models;

/**
 *
 * @author ESCRITORIO
 */
public class Medico extends Persona{
    
    private String Especialidad;
    private String TarjetaProfesional;
    
    public Medico() {
    }

    public Medico(String Especialidad, String TarjetaProfesional) {
        this.Especialidad = Especialidad;
        this.TarjetaProfesional = TarjetaProfesional;
    }

    public Medico(String Especialidad, String TarjetaProfesional, String Nombre, int Edad, String Cedula) {
        super(Nombre, Edad, Cedula);
        this.Especialidad = Especialidad;
        this.TarjetaProfesional = TarjetaProfesional;
    }
    
    
    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getTarjetaProfesional() {
        return TarjetaProfesional;
    }

    public void setTarjetaProfesional(String TarjetaProfesional) {
        this.TarjetaProfesional = TarjetaProfesional;
    }

    @Override
    public String toString() {
        return "Medico{" + "Especialidad=" + Especialidad + ", TarjetaProfesional=" + TarjetaProfesional + '}';
    }
    
}
