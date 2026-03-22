/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clinicalhospital.Models;

/**
 *
 * @author ESCRITORIO
 */
public class Consulta {
    
    private String Fecha;
    private String Motivo;
    private String Diagnostico;
    private int duracionC;

    public Consulta() {
    }

    public Consulta(String Fecha, String Motivo, String Diagnostico, int duracionC) {
        this.Fecha = Fecha;
        this.Motivo = Motivo;
        this.Diagnostico = Diagnostico;
        this.duracionC = duracionC;
    }

    

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public int getDuracionC() {
        return duracionC;
    }

    public void setDuracionC(int duracionC) {
        this.duracionC = duracionC;
    }
    
    @Override
    public String toString() {
        
        return "Consulta "+"{"+ "Fecha=" + Fecha + ", Motivo=" + Motivo + ", Diagnostico=" + Diagnostico + ", Duracion de consulta(minutos): "+ duracionC +'}'+"\n";
    }
}
