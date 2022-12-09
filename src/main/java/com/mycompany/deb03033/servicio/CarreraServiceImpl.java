/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deb03033.servicio;

import com.mycompany.deb03033.modelo.Carrera;
import java.util.List;

/**
 *
 * @author Jose
 */
public class CarreraServiceImpl implements CarreraService {

    public List<Carrera> carreraList;

    @Override
    public void crear(Carrera carrera) {
        this.carreraList.add(carrera);
    }

    @Override
    public List<Carrera> listar() {
        return this.carreraList;
    }
}
