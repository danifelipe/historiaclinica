/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.view;

import co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.entities.Medico;
import co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.entities.Paciente;
import co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.services.ServicioMedicoInt;
import co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.services.ServicioPacienteInt;
import co.edu.uelbosque.sistemas.swiii.c3.historiaclinica.services.ServiciosDeAplicacionSpring;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.AjaxBehaviorEvent;
import org.primefaces.component.calendar.Calendar;
import org.primefaces.event.TabChangeEvent;
import org.primefaces.event.TabCloseEvent;

/**
 *
 * @author Daniel
 */
@ManagedBean
@SessionScoped
public class VistaMedico {
    
    @ManagedProperty(value = "#{medico}")
    private Medico medico;

    private transient   ServicioMedicoInt sm;

    public void cambioTab(TabChangeEvent event) {
        salvarMedico();
    }

    public void cerroTab(TabCloseEvent event) {
        salvarMedico();
    }

    private void salvarMedico() {

        //sm.getRm().save(sm); //.save(medico);
    }

    /**
     * @return the paciente
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the sp
     */
    public ServicioMedicoInt getSm() {
        return sm;
    }

    /**
     * @param sp the sp to set
     */
    public void setSp(ServicioMedicoInt sm) {
        this.sm = sm;
    }

    @PostConstruct
    public void injectSpringServiceManually() {
        String name = "servicioMedico";
        this.sm = ServiciosDeAplicacionSpring.getServiciosDeAplicacionSpring().getServicioMedico(name);
    }

    public void actualizarFechaNacimiento(AjaxBehaviorEvent event) {
        
        Calendar calendar =  (Calendar) event.getSource();
        Date d=(Date)calendar.getLocalValue();
        medico.setFechaNacimiento(d);
        
    }
    
}
