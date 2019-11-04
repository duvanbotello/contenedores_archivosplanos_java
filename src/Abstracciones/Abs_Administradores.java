/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */

package Abstracciones;


/**
 *
 * @author DuvanBotello <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class Abs_Administradores {
    private String emple;
    private String nombre;
    private String contraseña;

    public Abs_Administradores(String emple, String nombre, String contraseña) {
        this.emple = emple;
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getEmple() {
        return emple;
    }

    public void setEmple(String emple) {
        this.emple = emple;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    

   
    
   
}
