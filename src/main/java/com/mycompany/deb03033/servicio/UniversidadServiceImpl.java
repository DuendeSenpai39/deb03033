/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.deb03033.servicio;

import com.mycompany.deb03033.modelo.Universidad;
import java.util.List;

/**
 *
 * @author Jose
 */
public class UniversidadServiceImpl implements UniversidadService {

    private List<Universidad> universidadList;

    @Override
    public void crear(Universidad universidad) {
        this.universidadList.add(universidad);
    }

    @Override
    public List<Universidad> listar() {
        return this.universidadList;
    }
}
