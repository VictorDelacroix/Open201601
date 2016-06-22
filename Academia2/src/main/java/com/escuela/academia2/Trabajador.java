package com.escuela.academia2;
// Generated 22/06/2016 05:24:11 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Trabajador generated by hbm2java
 */
@Entity
@Table(name="trabajador"
    ,catalog="academia"
)
public class Trabajador  implements java.io.Serializable {


     private Integer idtrabajador;
     private Administrador administrador;
     private String codigo;
     private String usuario;
     private String clave;
     private String nombre;
     private String apellido;
     private Set<Alumno> alumnos = new HashSet<Alumno>(0);

    public Trabajador() {
    }

    public Trabajador(Administrador administrador, String codigo, String usuario, String clave, String nombre, String apellido, Set<Alumno> alumnos) {
       this.administrador = administrador;
       this.codigo = codigo;
       this.usuario = usuario;
       this.clave = clave;
       this.nombre = nombre;
       this.apellido = apellido;
       this.alumnos = alumnos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="IDTrabajador", unique=true, nullable=false)
    public Integer getIdtrabajador() {
        return this.idtrabajador;
    }
    
    public void setIdtrabajador(Integer idtrabajador) {
        this.idtrabajador = idtrabajador;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDAdministrador")
    public Administrador getAdministrador() {
        return this.administrador;
    }
    
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    
    @Column(name="Codigo", length=30)
    public String getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    
    @Column(name="Usuario", length=30)
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    @Column(name="Clave", length=30)
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }

    
    @Column(name="Nombre", length=30)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="Apellido", length=30)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="trabajador")
    public Set<Alumno> getAlumnos() {
        return this.alumnos;
    }
    
    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }




}

