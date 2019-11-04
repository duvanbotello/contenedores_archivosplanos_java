/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */

package Abstracciones;

import java.util.Date;

/**
 *
 * @author DuvanBotello <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class Abs_proyectos {
    private long numero_empleados;
    private String nombre;
    private String descripcion;
    private Date fecha_i;
    private Date fecha_f;
    private long doc_empleado;

    public long getNumero_empleados() {
        return numero_empleados;
    }

    public void setNumero_empleados(long numero_empleados) {
        this.numero_empleados = numero_empleados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_i() {
        return fecha_i;
    }

    public void setFecha_i(Date fecha_i) {
        this.fecha_i = fecha_i;
    }

    public Date getFecha_f() {
        return fecha_f;
    }

    public void setFecha_f(Date fecha_f) {
        this.fecha_f = fecha_f;
    }

    public long getDoc_empleado() {
        return doc_empleado;
    }

    public void setDoc_empleado(long doc_empleado) {
        this.doc_empleado = doc_empleado;
    }

    public Abs_proyectos(long numero_empleados, String nombre, String descripcion, Date fecha_i, Date fecha_f, long doc_empleado) {
        this.numero_empleados = numero_empleados;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_i = fecha_i;
        this.fecha_f = fecha_f;
        this.doc_empleado = doc_empleado;
    }

    
    
    

}
