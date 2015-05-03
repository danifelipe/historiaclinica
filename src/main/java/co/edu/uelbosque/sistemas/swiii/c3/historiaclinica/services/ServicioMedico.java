/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.services;

import co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.repositories.RepositorioMedico;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Daniel
 */
@Component("servicioMedico")
public class ServicioMedico implements ServicioMedicoInt {
    @Autowired
    private RepositorioMedico rm;
    
    @PostConstruct
    public void load(){
         ServiciosDeAplicacionSpring.getServiciosDeAplicacionSpring().addServicio("servicioMedico", this);
    }

    /**
     * @return the rp
     */
    @Override
    public RepositorioMedico getRm() {
        return rm;
    }

    /**
     * @param rm the rm to set
     */

    @Override
    public void setRm(RepositorioMedico rm) {
        this.rm = rm;
    }

    
    
    
}
