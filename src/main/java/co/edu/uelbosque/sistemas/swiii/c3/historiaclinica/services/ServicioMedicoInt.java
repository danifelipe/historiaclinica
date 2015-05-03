/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.services;

import co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.repositories.RepositorioMedico;
import co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.repositories.RepositorioPaciente;

/**
 *
 * @author Daniel
 */
public interface ServicioMedicoInt {
    
     /**
     * @return the rp
     */
    RepositorioMedico getRm();

    /**
     * @param rm the rm to set
     */
    void setRm(RepositorioMedico rm);
    
}
