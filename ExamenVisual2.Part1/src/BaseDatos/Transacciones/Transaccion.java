/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BaseDatos.Transacciones;

import BaseDatos.POJOS.Externos;
import java.util.List;

/**
 *
 * @author Ivan
 */
public interface Transaccion {

    /*
     * CRUD (Create, Read, Update, Delete)
     */

    void Create(Object[] o);
    List <Externos> Read(String nombre);
    void Update(int id);
    void Delete(int id);
}
