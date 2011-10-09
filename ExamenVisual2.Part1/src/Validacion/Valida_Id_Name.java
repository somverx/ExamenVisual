/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Validacion;

/**
 *
 * @author Ivan
 */
public class Valida_Id_Name extends Validacion{    
    String Id;
    String Name;

    public Valida_Id_Name(String Id,String Name) {        
        this.Id = Id;
        this.Name = Name;
    }



    @Override
    public boolean valida() {
        if(!valida_id(Id) || !valida_name(Name))
            return false;
        return true;
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
