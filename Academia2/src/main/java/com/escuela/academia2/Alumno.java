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
 * Alumno generated by hbm2java
 */
@Entity
@Table(name="alumno"
    ,catalog="academia"
)
public class Alumno  implements java.io.Serializable {


     private Integer idalumno;
     private Apoderado apoderado;
     private Trabajador trabajador;
     private String codigo;
     private String usuario;
     private String clave;
     private String nombre;
     private String apellido;
     private String dni;
     private Integer edad;
     private Set<AlumnoCurso> alumnoCursos = new HashSet<AlumnoCurso>(0);

    public Alumno() {
    }

    public Alumno(Apoderado apoderado, Trabajador trabajador, String codigo, String usuario, String clave, String nombre, String apellido, String dni, Integer edad, Set<AlumnoCurso> alumnoCursos) {
       this.apoderado = apoderado;
       this.trabajador = trabajador;
       this.codigo = codigo;
       this.usuario = usuario;
       this.clave = clave;
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
       this.edad = edad;
       this.alumnoCursos = alumnoCursos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="IDAlumno", unique=true, nullable=false)
    public Integer getIdalumno() {
        return this.idalumno;
    }
    
    public void setIdalumno(Integer idalumno) {
        this.idalumno = idalumno;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDApoderado")
    public Apoderado getApoderado() {
        return this.apoderado;
    }
    
    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="IDTrabajador")
    public Trabajador getTrabajador() {
        return this.trabajador;
    }
    
    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
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

    
    @Column(name="DNI", length=30)
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    
    @Column(name="Edad")
    public Integer getEdad() {
        return this.edad;
    }
    
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="alumno")
    public Set<AlumnoCurso> getAlumnoCursos() {
        return this.alumnoCursos;
    }
    
    public void setAlumnoCursos(Set<AlumnoCurso> alumnoCursos) {
        this.alumnoCursos = alumnoCursos;
    }




}


