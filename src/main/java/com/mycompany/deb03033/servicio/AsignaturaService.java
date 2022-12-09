/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deb03033.servicio;

import com.mycompany.deb03033.modelo.Asignatura;
import java.util.List;

/**
 *
 * @author Jose
 */
public interface AsignaturaService {

    public void crear(Asignatura asignatura);

    public List<Asignatura> lista();
}
