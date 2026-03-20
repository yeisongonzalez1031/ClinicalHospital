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
    private ArrayList<Consulta> consulta;

    public Hospital() {
    }

    public Hospital(String Nombre, String Ciudad, ArrayList<Consulta> consulta) {
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.consulta = consulta;
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

    public ArrayList<Consulta> getConsulta() {
        return consulta;
    }

    public void setConsulta(ArrayList<Consulta> consulta) {
        this.consulta = consulta;
    }

    @Override
    public String toString() {
        return "Hospital{" + "Nombre=" + Nombre + ", Ciudad=" + Ciudad + ", consulta=" + consulta + '}';
    }
    
}
