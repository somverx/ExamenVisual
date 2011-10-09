/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BaseDatos.POJOS;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ivan
 */
public class ExternosFecha {
    private int IdFecha;
    private Date fecha;
    private Set<ExternosFechaHora> exterfechahora = new HashSet<ExternosFechaHora>(0);

    public ExternosFecha() {
    }

    public ExternosFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdFecha() {
        return IdFecha;
    }

    public void setIdFecha(int IdFecha) {
        this.IdFecha = IdFecha;
    }

    public Date getfecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Set<ExternosFechaHora> getExterfechahora() {
        return exterfechahora;
    }

    public void setExterfechahora(Set<ExternosFechaHora> extfechahora) {
        this.exterfechahora = extfechahora;
    }
    

}
