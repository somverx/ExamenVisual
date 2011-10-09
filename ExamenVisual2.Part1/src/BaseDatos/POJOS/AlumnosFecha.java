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
public class AlumnosFecha {
    private int IdFecha;
    private Date fecha;
    private Set<AlumnosFechaHora> alumnfechahora = new HashSet<AlumnosFechaHora>(0);

    public AlumnosFecha() {
    }

    public AlumnosFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdFecha() {
        return IdFecha;
    }

    public void setIdFecha(int IdFecha) {
        this.IdFecha = IdFecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Set<AlumnosFechaHora> getAlumnfechahora() {
        return alumnfechahora;
    }

    public void setAlumnfechahora(Set<AlumnosFechaHora> alumnfechahora) {
        this.alumnfechahora = alumnfechahora;
    }
    

}
