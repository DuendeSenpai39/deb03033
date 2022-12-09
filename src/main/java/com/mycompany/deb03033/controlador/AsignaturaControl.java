/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deb03033.controlador;

import com.mycompany.deb03033.modelo.Asignatura;
import com.mycompany.deb03033.modelo.Carrera;
import com.mycompany.deb03033.servicio.AsignaturaServiceImpl;
import java.util.List;

/**
 *
 * @author Jose
 */
public class AsignaturaControl {
      private final AsignaturaServiceImpl asignaturaServiceImpl;

    
    public AsignaturaControl(){
    this.asignaturaServiceImpl = new AsignaturaServiceImpl(); 
    }
    public String crear(String[] data, CarreraControl carreraList) {
        var retorno = "No se puede crear la Asignatura:";
        var nombre = data[0];
        var docente = data[1];
        var numeroHoras = Integer.valueOf(data[2]).intValue();
        var horasSemanales = Integer.valueOf(data[3]).intValue();
        var costoHoras = Double.valueOf(data[4]).doubleValue();
        var cuposDisponibles = Integer.valueOf(data[5]).intValue();
        var carrera = data[6];
        var modalidad= data[7];

        if (numeroHoras < 0) {
            retorno += " El numero de Horas no son validos ";
        } else {
            if (horasSemanales <= 0 || horasSemanales > 24) {
                retorno += " El numero de horas semanales es incorrecto ";
            } else {
                if (costoHoras < 0) {
                    retorno += " El costo por horas no es valido";
                } else {
                        retorno += " Carrera no valida";
                        for (var nombreCarrera = carreraList.listar();{
                            if (carrera == nombreCarrera.getNombre()) {
                                var asignatura1 = new Asignatura(nombre, docente, numeroHoras, horasSemanales, costoHoras, cuposDisponibles, Carrera Carrera);
                                this.asignaturaServiceImpl.crear(asignatura1);

                            }

                        }

                    }

                }

            }
        return retorno;
    }  
}

