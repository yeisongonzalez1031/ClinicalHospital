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
    private int Consultorio;
    
    public Medico() {
    }

    public Medico(String Especialidad, String TarjetaProfesional, int Consultorio) {
        this.Especialidad = Especialidad;
        this.TarjetaProfesional = TarjetaProfesional;
        this.Consultorio = Consultorio;
    }

    public Medico(String Especialidad, String TarjetaProfesional, int Consultorio, String Nombre, int Edad, String Cedula, String Telefono) {
        super(Nombre, Edad, Cedula, Telefono);
        this.Especialidad = Especialidad;
        this.TarjetaProfesional = TarjetaProfesional;
        this.Consultorio = Consultorio;
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

    public int getConsultorio() {
        return Consultorio;
    }

    public void setConsultorio(int Consultorio) {
        this.Consultorio = Consultorio;
    }
    
    public void Atender(Consulta c){
        
        System.out.println("Atendiendo consulta:");
        System.out.println("Fecha: " + c.getFecha());
        System.out.println("Motivo: " + c.getMotivo());
        System.out.println("Diagnostico: " + c.getDiagnostico());
    }

    @Override
    public String toString() {
        
        return "Consultorio: "+ Consultorio +"\n"+"Medico{" + super.toString() +", Especialidad: " + Especialidad + ", TarjetaProfesional: " + TarjetaProfesional + '}';
    }
    
    
    
}
