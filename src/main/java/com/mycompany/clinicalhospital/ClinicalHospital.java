/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clinicalhospital;

import com.mycompany.clinicalhospital.Models.Consulta;
import com.mycompany.clinicalhospital.Models.Hospital;
import com.mycompany.clinicalhospital.Models.Medico;

/**
 *
 * @author ESCRITORIO
 */
public class ClinicalHospital {

public static void main(String []args){
    
    Hospital H=new Hospital();
    H.setNombre("Clinica Santa Maria");
    H.setCiudad("Cartagena");
        
    Consulta C1 = new Consulta("21/03/2014","incomodidad al caminar","cancer de pierna");
    Consulta C2 = new Consulta("16/07/2016","dolor articular, fatiga extrema","lupus");
    Consulta C3 = new Consulta("2/10/2020","perdida de conciencia","cuadro de ansiedad");    
        
    H.RegistrarConsulta(C1);
    H.RegistrarConsulta(C2);
    H.RegistrarConsulta(C3);
    System.out.println(H);
    
        
    Medico M1 = new Medico();
    M1.setNombre("Edward");
    M1.setEdad(25);
    M1.setCedula("32058960");
    M1.setEspecialidad("cirujano");
    M1.setTarjetaProfesional("NaN");
    M1.Atender(C1);
    System.out.println(M1+"Nombre: "+ M1.getNombre());
    
    Medico M2 = new Medico();
    M2.setNombre("house");
    M2.setEdad(53);
    M2.setCedula("28323516");
    M2.setEspecialidad("medicina general");
    M2.setTarjetaProfesional("clasificado");
    M2.Atender(C2);
    System.out.println(M2+"Nombre: "+ M2.getNombre());
      
    
    
    



    }

}

