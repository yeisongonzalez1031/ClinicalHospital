/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicalhospital.Models;

import java.util.ArrayList;

/**
 *
 * @author ESCRITORIO
 */
public class Hospital {
    
    private String Nombre;
    private String Ciudad;
    private ArrayList<Consulta> consultas;

    public Hospital() {
        consultas = new ArrayList<>();
    }

    public Hospital(String Nombre, String Ciudad,ArrayList<Consulta> consultas) {
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.consultas = new ArrayList<>();
    }

    public void RegistrarConsulta(Consulta c){
        consultas.add(c);  
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public void ListarConsultas(){
        
        System.out.println("Consultas de la clinica: ");
        
        for(Consulta c: consultas){
        
            System.out.println(c);
            
        }
        
    }
    
    @Override
    public String toString() {
        return "Hospital: " + "Nombre: " + Nombre + ", Ciudad: " + Ciudad;
    }
    
}
