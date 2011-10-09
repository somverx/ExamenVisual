package BaseDatos.POJOS;
// Generated 2/10/2011 05:59:09 PM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;




/**
 * Alumnos generated by hbm2java
 */
public class Alumnos  implements java.io.Serializable {


     private int boleta;
     private String nombre;
     private char estatus;
     private String direccion;
     private String telefono;
     private String correo;
     private String foto;
     private boolean dentro;
     private Set <AlumnosFecha> alumnfecha = new HashSet<AlumnosFecha>(0);

    public Alumnos() {
    }

    public Alumnos(int boleta, String nombre, char estatus, String direccion, String telefono, String correo, String foto, boolean dentro) {
       this.boleta = boleta;
       this.nombre = nombre;
       this.estatus = estatus;
       this.direccion = direccion;
       this.telefono = telefono;
       this.correo = correo;
       this.foto = foto;
       this.dentro = dentro;
    }
   
    public int getBoleta() {
        return this.boleta;
    }
    
    public void setBoleta(int boleta) {
        this.boleta = boleta;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public char getEstatus() {
        return this.estatus;
    }
    
    public void setEstatus(char estatus) {
        this.estatus = estatus;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getFoto() {
        return this.foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public boolean isDentro() {
        return this.dentro;
    }
    
    public void setDentro(boolean dentro) {
        this.dentro = dentro;
    }

    public Set<AlumnosFecha> getAlumnfecha() {
        return alumnfecha;
    }

    public void setAlumnfecha(Set<AlumnosFecha> alumnfecha) {
        this.alumnfecha = alumnfecha;
    }




}


