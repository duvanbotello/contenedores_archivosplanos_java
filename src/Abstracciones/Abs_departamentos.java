/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */

package Abstracciones;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author DuvanBotello <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class Abs_departamentos {
    private String nombre;
    private long codigo;
    private Abs_empleados emple;
    private Date fecha_dirige;
    public LinkedList<Abs_proyectos> listaproyecto = new LinkedList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public Abs_empleados getEmple() {
        return emple;
    }

    public void setEmple(Abs_empleados emple) {
        this.emple = emple;
    }

    public Date getFecha_dirige() {
        return fecha_dirige;
    }

    public void setFecha_dirige(Date fecha_dirige) {
        this.fecha_dirige = fecha_dirige;
    }

    public LinkedList<Abs_proyectos> getListaproyecto() {
        return listaproyecto;
    }

    public void setListaproyecto(LinkedList<Abs_proyectos> listaproyecto) {
        this.listaproyecto = listaproyecto;
    }

    public Abs_departamentos(String nombre, long codigo, Abs_empleados emple, Date fecha_dirige, LinkedList listaproyecto) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.emple = emple;
        this.fecha_dirige = fecha_dirige;
        this.listaproyecto = listaproyecto;
    }
    
}
