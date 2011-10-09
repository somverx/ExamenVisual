/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;

import BaseDatos.POJOS.Externos;
import BaseDatos.Transacciones.Transaccion;
import BaseDatos.Transacciones.Transacciones;
import Validacion.Valida_All_Campos;
import Validacion.Validacion;
import java.io.Serializable;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ivan
 */
public class ControladorFacade{
    private Validacion v;
    private Transaccion tx = new Transacciones();
    private Trabajador ta = new Trabajador();

    public void agregarexterno(Object[] o) {
        tx.Create(o);
    }

    public void buscar(String nombre,JTable j) {
        List <Externos> e = tx.Read(nombre);
        ta.rellenarcampos(j,e);
    }

    public void updatedate(String id) {
        tx.Update(Integer.valueOf(id));
    }

}
