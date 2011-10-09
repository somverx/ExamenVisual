/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package BaseDatos.Transacciones;

import BaseDatos.POJOS.Externos;
import BaseDatos.POJOS.ExternosFecha;
import BaseDatos.POJOS.ExternosFechaHora;
import ConfigurationFiles.ConfigurationHibernate.HibernateUtil;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JTable;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Ivan
 */
public class Transacciones implements Transaccion{       

    //<editor-fold desc="Create Externo">
    public void Create(Object[] objetos) {        
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        try{
            Date date = new Date();
            long milisegundos = date.getTime();
            java.sql.Date fecha = new java.sql.Date(milisegundos);
            java.sql.Time hora = new java.sql.Time(milisegundos);

            Externos e  = buildExterno(objetos);

            Set <ExternosFecha> extf = new HashSet<ExternosFecha>();
            ExternosFecha ef = new ExternosFecha(fecha);
            extf.add(ef);

            Set <ExternosFechaHora> extfh = new HashSet<ExternosFechaHora>();
            ExternosFechaHora efh = new ExternosFechaHora(hora);
            extfh.add(efh);

            //s.save(efh);
            ef.setExterfechahora(extfh);
            //s.save(ef);
            e.setExterfecha(extf);
            s.save(e);
            
            tx.commit();
        }
        catch(HibernateException he){
            tx.rollback();
            he.printStackTrace();
        }
        finally{            
            s.close();
        }
    }

    private Externos buildExterno(Object[] o) {
        Externos e = new Externos();        
        e.setNombre(o[0].toString());
        e.setEstatus(o[1].toString().charAt(0));
        e.setProcedencia(o[2].toString());
        e.setTelefono(o[3].toString());
        e.setMotivo(o[4].toString());
        e.setFoto("No hay");
        e.setDentro(true);        
        return e;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Read">
    public List<Externos> Read(String nombre) {
        List <Externos> res = null;
        try{
            Session s = HibernateUtil.getSessionFactory().openSession();
            s.beginTransaction();
            Criteria c = s.createCriteria(Externos.class);            
            c.add(Restrictions.eq("nombre", nombre));
            res  = (List<Externos>)c.list();
            s.getTransaction().commit();
            for(Externos e : res) {
                System.out.println("Externos:"+e.getNombre());                
            }
            
            s.close();
        }
        catch(HibernateException he){

            he.printStackTrace();
        }
        return res;
    }
    //</editor-fold>


    /*
     * Solo se va a actualizar la Fecha y/o Hora del acceso del Externo
     */
    public void Update(int id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try{            
            tx = s.beginTransaction();            
            Externos ex = (Externos)s.get(Externos.class, id,LockMode.UPGRADE);
            Set<ExternosFecha> exfe = ex.getExterfecha();
            int idexfetmp=0;
            for(ExternosFecha externosf : exfe){
                System.out.println("ide de fechas"+externosf.getIdFecha());
                idexfetmp = externosf.getIdFecha();
            }
            System.out.println("tamaño de hashcode:");
            ExternosFecha ef = (ExternosFecha)s.get(ExternosFecha.class, idexfetmp
                    ,LockMode.UPGRADE);
            
            ExternosFechaHora efh;
            ExternosFecha exf;
            if(ef.getfecha().equals(new java.sql.Date(new Date().getTime()))){
                exf  = new ExternosFecha(new java.sql.Date(new Date().getTime()));
                exfe.add(exf);
                Set <ExternosFechaHora> exfehotime = new HashSet<ExternosFechaHora>();
                efh = new ExternosFechaHora(new java.sql.Time(new Date().getTime()));
                exfehotime.add(efh);
                //s.save(efh);
                exf.setExterfechahora(exfehotime);
                //s.save(exf);
            }
            else{            
            Set <ExternosFechaHora> exfehotime = ef.getExterfechahora();
                efh = new ExternosFechaHora(new java.sql.Time(new Date().getTime()));
                exfehotime.add(efh);
                //s.save(efh);
                ef.setExterfechahora(exfehotime);
                s.update(ef);
            }            

            if(ex.isDentro())
                ex.setDentro(false);
            else
                ex.setDentro(true);

            s.update(ex);
            tx.commit();
        }
        catch(HibernateException he){
            tx.rollback();
            he.printStackTrace();
        }
        finally{
            
            s.close();
        }
    }

    public void Delete(int id) {
    
    }

    private boolean verifica_fecha() {
        return true;
    }
    

}
