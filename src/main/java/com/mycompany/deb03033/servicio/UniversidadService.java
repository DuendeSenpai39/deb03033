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
public interface UniversidadService {

    public void crear(Universidad universidad);

    public List<Universidad> listar();
}
