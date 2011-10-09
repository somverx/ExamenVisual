package BaseDatos.POJOS;
// Generated 2/10/2011 05:59:09 PM by Hibernate Tools 3.2.1.GA

import java.util.HashSet;
import java.util.Set;




/**
 * Personal generated by hbm2java
 */
public class Personal  implements java.io.Serializable {


     private int id;
     private String nombre;
     private char estatus;
     private String departamento;
     private String direccion;
     private String telefono;
     private String foto;
     private boolean dentro;
     private Set <PersonalFecha> perfecha = new HashSet<PersonalFecha>(0);

    public Personal() {
    }

	
    public Personal(int id, String nombre, char estatus, String departamento, String direccion, String foto, boolean dentro) {
        this.id = id;
        this.nombre = nombre;
        this.estatus = estatus;
        this.departamento = departamento;
        this.direccion = direccion;
        this.foto = foto;
        this.dentro = dentro;
    }
    public Personal(int id, String nombre, char estatus, String departamento, String direccion, String telefono, String foto, boolean dentro) {
       this.id = id;
       this.nombre = nombre;
       this.estatus = estatus;
       this.departamento = departamento;
       this.direccion = direccion;
       this.telefono = telefono;
       this.foto = foto;
       this.dentro = dentro;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
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
    public String getDepartamento() {
        return this.departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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

    public Set<PersonalFecha> getPerfecha() {
        return perfecha;
    }

    public void setPerfecha(Set<PersonalFecha> perfecha) {
        this.perfecha = perfecha;
    }




}

