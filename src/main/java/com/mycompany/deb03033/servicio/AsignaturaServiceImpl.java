package com.mycompany.deb03033.servicio;

import com.mycompany.deb03033.modelo.Asignatura;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Jose
 */
public class AsignaturaServiceImpl implements AsignaturaService {

    public List<Asignatura> asigList;

    @Override
    public void crear(Asignatura asignatura) {
        this.asigList.add(asignatura);
    }

    @Override
    public List<Asignatura> lista() {
        return this.asigList;
    }

}
