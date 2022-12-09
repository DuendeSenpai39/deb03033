/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deb03033.controlador;

import com.mycompany.deb03033.modelo.Carrera;
import com.mycompany.deb03033.servicio.CarreraServiceImpl;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Jose
 */
public class CarreraControl {
    

    private CarreraServiceImpl carreraServiceImpl;

    
    public CarreraControl(){
    this.carreraServiceImpl=new  CarreraServiceImpl();
    
    }
    public String crear(String[] data, UniversidadControl listUniversidades) {
        var retorno = "No se puede crear la Carrera:";
        var nombre = data[0];
        var directorCarrera = data[1];
        var costoCiclo = Double.valueOf(data[2]).doubleValue();;
        var numCiclos = Integer.valueOf(data[3]).intValue();
        var universidad = data[7];

        if (costoCiclo < 0) {
            retorno += " El costo del ciclo no es valido ";
        } else {
            if (numCiclos < 2 || numCiclos > 15) {
                retorno += " El numero de ciclos es incorrecto ";
            } else {
                if (year > LocalDate.now().getYear()) {
                    retorno += " El año no es valido ";
                } else {
                    if (mes < 1 || mes > 12) {
                        retorno += " El mes no es valido ";
                    } else {
                        if (dia < 0 || dia > 31) {
                            retorno += " El dia no es valido ";
                        } else {
                            retorno += " Universidad fuera del registro ";
                            for (var nombreUniversidad : listUniversidades.listar()) {
                                if (universidad == nombreUniversidad.getNombre()) {
                                    var carrera1 = new Carrera(nombre, docente, numeroHoras, horasSemanales, costoHoras, cuposDisponibles, Carrera Carrera);
                                    this.carreraServiceImpl.crear(carrera1);

                                }
                            }

                        }

                    }

                }

            }

        }

        return retorno;
    }

    public List<Carrera> listar() {
        return this.carreraServiceImpl.listar();

    }
}

