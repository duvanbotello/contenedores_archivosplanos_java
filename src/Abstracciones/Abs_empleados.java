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
public class Abs_empleados {
    
    private long documento;
    private String nombre_emple;
    private long num_seguridad_s;
    private String direccion;
    private float sueldo;
    private int genero;
    private int numero_hijos;
    private Date fecha_nacimiento;
    private long departamento_asignado;

    public long getDocumento() {
        return documento;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public String getNombre_emple() {
        return nombre_emple;
    }

    public void setNombre_emple(String nombre_emple) {
        this.nombre_emple = nombre_emple;
    }

    public long getNum_seguridad_s() {
        return num_seguridad_s;
    }

    public void setNum_seguridad_s(long num_seguridad_s) {
        this.num_seguridad_s = num_seguridad_s;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public int getNumero_hijos() {
        return numero_hijos;
    }

    public void setNumero_hijos(int numero_hijos) {
        this.numero_hijos = numero_hijos;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public long getDepartamento_asignado() {
        return departamento_asignado;
    }

    public void setDepartamento_asignado(long departamento_asignado) {
        this.departamento_asignado = departamento_asignado;
    }

    public Abs_empleados(long documento, String nombre_emple, long num_seguridad_s, String direccion, float sueldo, int genero, int numero_hijos, Date fecha_nacimiento, long departamento_asignado) {
        this.documento = documento;
        this.nombre_emple = nombre_emple;
        this.num_seguridad_s = num_seguridad_s;
        this.direccion = direccion;
        this.sueldo = sueldo;
        this.genero = genero;
        this.numero_hijos = numero_hijos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.departamento_asignado = departamento_asignado;
    }

   


    

}
