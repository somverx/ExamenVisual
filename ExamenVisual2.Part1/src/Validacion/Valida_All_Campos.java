/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Validacion;

/**
 *
 * @author Ivan
 */
public class Valida_All_Campos extends Validacion{

    String [] datos;
    public Valida_All_Campos(String []datos) {
        this.datos = datos;
    }

    Valida_Campos v_c = new Valida_Campos(datos);

    @Override
    public boolean valida() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean valida_id(String Id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean valida_name(String Name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
