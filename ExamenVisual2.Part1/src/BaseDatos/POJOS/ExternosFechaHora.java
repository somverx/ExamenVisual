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
public class ExternosFechaHora {
    private int IdHora;
    private Time hora;

    public ExternosFechaHora() {
    }

    public ExternosFechaHora(Time hora) {
        
        this.hora = hora;
    }

    public int getIdHora() {
        return IdHora;
    }

    public void setIdHora(int IdHora) {
        this.IdHora = IdHora;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time time) {
        this.hora = time;
    }


}
