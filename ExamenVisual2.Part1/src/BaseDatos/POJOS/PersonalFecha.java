/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BaseDatos.POJOS;

import BaseDatos.POJOS.ExternosFechaHora;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ivan
 */
public class PersonalFecha {
    private int idfecha;
    private Date fecha;
    private Set<PersonalFechaHora> perfechahora = new HashSet<PersonalFechaHora>(0);

    public PersonalFecha() {
    }

    public PersonalFecha(Date fecha) {
        
        this.fecha = fecha;
    }

    public int getIdfecha() {
        return idfecha;
    }

    public void setIdfecha(int idfecha) {
        this.idfecha = idfecha;
    }

    public Date getfecha() {
        return fecha;
    }

    public void setfecha(Date fecha) {
        this.fecha = fecha;
    }

    public Set<PersonalFechaHora> getPerfechahora() {
        return perfechahora;
    }

    public void setPerfechahora(Set<PersonalFechaHora> perfechahora) {
        this.perfechahora = perfechahora;
    }
    

}
