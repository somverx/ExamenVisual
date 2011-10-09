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
public class PersonalFechaHora {
    private int idhora;
    private Time hora;

    public PersonalFechaHora() {
    }

    public PersonalFechaHora(Time hora) {
        
        this.hora = hora;
    }

 

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public int getIdhora() {
        return idhora;
    }

    public void setIdhora(int idhora) {
        this.idhora = idhora;
    }


}
