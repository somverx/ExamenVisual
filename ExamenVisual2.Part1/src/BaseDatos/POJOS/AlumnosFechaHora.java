/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BaseDatos.POJOS;

import java.sql.Time;

/**
 *
 * @author Ivan
 */
public class AlumnosFechaHora {
    private int IdHora;
    private Time Hora;

    public AlumnosFechaHora() {
    }

    public AlumnosFechaHora(Time Hora) {
        
        this.Hora = Hora;
    }

    public int getIdHora() {
        return IdHora;
    }

    public void setIdHora(int IdHora) {
        this.IdHora = IdHora;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time Hora) {
        this.Hora = Hora;
    }


}
