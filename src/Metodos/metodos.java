/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */
package Metodos;

import java.io.File;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import Abstracciones.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author DuvanBotello
 * <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class metodos {

    public static void cargar_datos(JFrame x) {
        x.setLocationRelativeTo(null);
        ImageIcon icono = new ImageIcon("src/Imagenes/icono_principal.png");
        x.setIconImage(icono.getImage());

    }

    public static void crear_archivos() {
        if (lista_departamentos.isEmpty()) {
            CargarLista_empleados();
        }
        if (lista_departamentos.isEmpty()) {
            CargarDepartamentos();
        }
        if (lista_proyectos.isEmpty()) {
            CargarLista_proyectos();
        }

        try {
            if (!fichero_empleados.exists()) {
                fichero_empleados.createNewFile();
                JOptionPane.showMessageDialog(null, "Archivo de empleados Registrado con Exito");
            }
            if (!fichero_administrador.exists()) {
                fichero_administrador.createNewFile();
                JOptionPane.showMessageDialog(null, "Archivo de administradores Registrado con Exito");
            }
            if (!fichero_departamentos.exists()) {
                fichero_departamentos.createNewFile();
                JOptionPane.showMessageDialog(null, "Archivo de departamentos Registrado con Exito");
            }
            if (!fichero_proyectos.exists()) {
                fichero_proyectos.createNewFile();
                JOptionPane.showMessageDialog(null, "Archivo de proyectos Registrado con Exito");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    /*
    METODOS DE EMPLEADOS
    METODOS DE EMPLEADOS
    METODOS DE EMPLEADOS
    METODOS DE EMPLEADOS
    METODOS DE EMPLEADOS
    
     */
    public static File fichero_empleados = new File("src/Archivos_Planos/REmpleados.txt");
    public static LinkedList<Abs_empleados> lista_empleados = new LinkedList<>();

    public static void agregar_empleado(Abs_empleados x) {
        lista_empleados.add(x);
    }

    public static boolean validar_si_empleado_existe(long x) {
        boolean existe = false;
        for (Abs_empleados d : lista_empleados) {
            if (d.getDocumento() == x) {
                existe = true;
            }
        }
        return existe;
    }

    public static void InsertarEmpleado(Abs_empleados e) {
        try {
            //SE EL OBJETO PARA ESCRIBIR EN EL FECHERO
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero_empleados, true), "utf-8"));
            //SE AGREGAN LOS DATOS AL FICHERO
            String fecha1 = new SimpleDateFormat("dd/MM/yyyy").format(e.getFecha_nacimiento());
            Fescribe.write(e.getDocumento() + "\t" + e.getNombre_emple() + "\t" + e.getNum_seguridad_s() + "\t" + e.getDireccion()
                    + "\t" + e.getSueldo() + "\t" + e.getGenero() + "\t" + e.getNumero_hijos() + "\t" + fecha1 + "\t" + e.getDepartamento_asignado() + "\r\n");
            JOptionPane.showMessageDialog(null, "Empleado Registrado");
            //SE CIERRA 
            Fescribe.close();
        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, f.getMessage());
        }

    }

    public static void CargarLista_empleados() {
        try {

            String line = null;
            //SE CREA EL OBJETO PARA LEER EL FECIHERO
            BufferedReader leerfichero = new BufferedReader(new FileReader(fichero_empleados));
            //igual lo que este en el fichero a la variable y digo que no tiene que estar vacia.
            while ((line = leerfichero.readLine()) != null) {
                //lee las tabulaciones y las ingresa en una variable
                StringTokenizer mistokens = new StringTokenizer(line, "\t");

                long documento = Long.parseLong(mistokens.nextToken().trim());
                String nombre = mistokens.nextToken().trim();
                long numero_social = Long.parseLong(mistokens.nextToken().trim());
                String direccion = mistokens.nextToken().trim();
                float salario = Float.parseFloat(mistokens.nextToken().trim());
                int genero = Integer.parseInt(mistokens.nextToken().trim());
                int numero_hijos = Integer.parseInt(mistokens.nextToken().trim());
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                Date fecha = formato.parse(mistokens.nextToken().trim());
                long departamento = Long.parseLong(mistokens.nextToken().trim());

                //guardo los datos en un contenedor
                lista_empleados.add(new Abs_empleados(documento, nombre, numero_social, direccion, salario, genero, numero_hijos, fecha, departamento));
            }
            leerfichero.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void guarda_modificacion_empleados() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero_empleados));
            for (Abs_empleados e : lista_empleados) {
                String fecha1 = new SimpleDateFormat("dd/MM/yyyy").format(e.getFecha_nacimiento());
                bw.write(e.getDocumento() + "\t" + e.getNombre_emple() + "\t" + e.getNum_seguridad_s() + "\t" + e.getDireccion()
                        + "\t" + e.getSueldo() + "\t" + e.getGenero() + "\t" + e.getNumero_hijos() + "\t" + fecha1 + "\t" + e.getDepartamento_asignado() + "\r\n");
            }
            bw.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    /*
    METODOS DE ADMINISTRACION
    METODOS DE ADMINISTRACION
    METODOS DE ADMINISTRACION
    METODOS DE ADMINISTRACION
    METODOS DE ADMINISTRACION
     */
    public static File fichero_administrador = new File("src/Archivos_Planos/Radmin.txt");
    public static LinkedList<Abs_Administradores> lista_admin = new LinkedList<>();

    public static void agregar_Admin(Abs_Administradores x) {
        lista_admin.add(x);
    }

    public static void InsertarAdmin(Abs_Administradores e) {
        try {
            //SE EL OBJETO PARA ESCRIBIR EN EL FECHERO
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero_administrador, true), "utf-8"));
            //SE AGREGAN LOS DATOS AL FICHERO

            Fescribe.write(e.getEmple() + "\t" + e.getNombre() + "\t" + e.getContraseña() + "\r\n");
            JOptionPane.showMessageDialog(null, "Administrador Registrado");
            //SE CIERRA 
            Fescribe.close();
        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, f.getMessage());
        }

    }

    public static void CargarLista_administradores() {
        try {

            String line = null;
            //SE CREA EL OBJETO PARA LEER EL FECIHERO
            BufferedReader leerfichero = new BufferedReader(new FileReader(fichero_administrador));
            //igual lo que este en el fichero a la variable y digo que no tiene que estar vacia.
            while ((line = leerfichero.readLine()) != null) {
                //lee las tabulaciones y las ingresa en una variable
                StringTokenizer mistokens = new StringTokenizer(line, "\t");

                String documento = mistokens.nextToken();
                String nombre = mistokens.nextToken();
                String contraseña = mistokens.nextToken();
                lista_admin.add(new Abs_Administradores(documento, nombre, contraseña));

                //guardo los datos en un contenedor
            }
            leerfichero.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    /*
    METODOS DE DEPARTAMENTOS
    METODOS DE DEPARTAMENTOS
    METODOS DE DEPARTAMENTOS
    METODOS DE DEPARTAMENTOS
    METODOS DE DEPARTAMENTOS
     */
    public static File fichero_departamentos = new File("src/Archivos_Planos/Rdepartamentos.txt");
    public static LinkedList<Abs_departamentos> lista_departamentos = new LinkedList<>();

    public static void agregar_departamento(Abs_departamentos x) {
        lista_departamentos.add(x);
    }

    public static void CargarDepartamentos() {
        try {

            String line = null;
            //SE CREA EL OBJETO PARA LEER EL FECIHERO

            BufferedReader leerfichero = new BufferedReader(new FileReader(fichero_departamentos));
            //igual lo que este en el fichero a la variable y digo que no tiene que estar vacia.
            while ((line = leerfichero.readLine()) != null) {
                //lee las tabulaciones y las ingresa en una variable
                StringTokenizer mistokens = new StringTokenizer(line, "\t");
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                String nombre = mistokens.nextToken();
                long codigo = Long.parseLong(mistokens.nextToken());
                long documento_emple = Long.parseLong(mistokens.nextToken());
                String nombre_emple = mistokens.nextToken();
                long num_segurida_emple = Long.parseLong(mistokens.nextToken());
                String direccion = mistokens.nextToken();
                float sueldo = Float.parseFloat(mistokens.nextToken());
                int genero = Integer.parseInt(mistokens.nextToken());
                int numero_hijos = Integer.parseInt(mistokens.nextToken());
                Date fecha_nacim = formato.parse(mistokens.nextToken());
                Date fecha_direge = formato.parse(mistokens.nextToken());
                long departamento_Asignado = Long.parseLong(mistokens.nextToken());

                //CREO UN OBJETO DE EMPLEADO
                Abs_empleados empleado = new Abs_empleados(documento_emple, nombre_emple, num_segurida_emple, direccion, sueldo, genero, numero_hijos, fecha_nacim, departamento_Asignado);

                //LEEO EL ARCHIVO PLANO RELACIONADO CON ESE DEPARTAMENTO
                File fichero_departamento1 = new File("src/Archivos_Planos/anidado_departamentos/" + nombre);
                BufferedReader leerfichero1 = new BufferedReader(new FileReader(fichero_departamento1));
                LinkedList<Abs_proyectos> lista_proyecto_temp = new LinkedList<>();
                //LEEO EL ARCHIVO PLANO PARA CARGARLOS A UN CONTENEDOR TEMPORAR
                while ((line = leerfichero1.readLine()) != null) {

                    StringTokenizer mistokens1 = new StringTokenizer(line, "\t");
                    long numero_empleados = Long.parseLong(mistokens1.nextToken());
                    String nombre_proyecto = mistokens1.nextToken();
                    String descripcion_proyecto = mistokens1.nextToken();
                    SimpleDateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha_i = formato1.parse(mistokens1.nextToken());
                    Date fecha_f = formato1.parse(mistokens1.nextToken());
                    long documento_emple1 = Long.parseLong(mistokens1.nextToken());
                    lista_proyecto_temp.add(new Abs_proyectos(numero_empleados, nombre_proyecto, descripcion_proyecto, fecha_i, fecha_f, documento_emple1));

                }
                leerfichero1.close();
                //CREO EL DEPARTAMENTO
                lista_departamentos.add(new Abs_departamentos(nombre, codigo, empleado, fecha_direge, lista_proyecto_temp));

                //guardo los datos en un contenedor
            }
            leerfichero.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public static void actulizar_listaanidada_departamentos(String x, long codigo) {
        File fichero_departamento1 = new File("src/Archivos_Planos/anidado_departamentos/" + x);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero_departamento1));
            for (Abs_departamentos d : metodos.lista_departamentos) {
                if (codigo == d.getCodigo()) {
                    for (Abs_proyectos p : d.getListaproyecto()) {
                        String fecha3 = new SimpleDateFormat("dd/MM/yyyy").format(p.getFecha_i());
                        String fecha4 = new SimpleDateFormat("dd/MM/yyyy").format(p.getFecha_f());
                        bw.write(p.getNumero_empleados() + "\t" + p.getNombre()
                                + "\t" + p.getDescripcion() + "\t" + fecha3 + "\t" + fecha4
                                + "\t" + p.getDoc_empleado() + "\r\n");
                    }
                    break;
                }
            }

            bw.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public static void guarda_modificacion_departaemntos() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero_departamentos));
            
            for (Abs_departamentos e : lista_departamentos) {

                String fecha1 = new SimpleDateFormat("dd/MM/yyyy").format(e.getEmple().getFecha_nacimiento());
                String fecha2 = new SimpleDateFormat("dd/MM/yyyy").format(e.getFecha_dirige());
                bw.write(e.getNombre() + "\t" + e.getCodigo() + "\t" + e.getEmple().getDocumento()
                        + "\t" + e.getEmple().getNombre_emple() + "\t" + e.getEmple().getNum_seguridad_s()
                        + "\t" + e.getEmple().getDireccion() + "\t" + e.getEmple().getSueldo()
                        + "\t" + e.getEmple().getGenero() + "\t" + e.getEmple().getNumero_hijos()
                        + "\t" + fecha1 + "\t" + fecha2 + "\t" + e.getEmple().getDepartamento_asignado() + "\r\n");

            }
            bw.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public static void InsertaDepartamento(Abs_departamentos e, String x) {

        File fichero_departamento1 = new File("src/Archivos_Planos/anidado_departamentos/" + x);
        try {
            //SE EL OBJETO PARA ESCRIBIR EN EL FECHERO
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero_departamentos, true), "utf-8"));
            String fecha1 = new SimpleDateFormat("dd/MM/yyyy").format(e.getEmple().getFecha_nacimiento());
            String fecha2 = new SimpleDateFormat("dd/MM/yyyy").format(e.getFecha_dirige());
            Fescribe.write(e.getNombre() + "\t" + e.getCodigo() + "\t" + e.getEmple().getDocumento()
                    + "\t" + e.getEmple().getNombre_emple() + "\t" + e.getEmple().getNum_seguridad_s()
                    + "\t" + e.getEmple().getDireccion() + "\t" + e.getEmple().getSueldo()
                    + "\t" + e.getEmple().getGenero() + "\t" + e.getEmple().getNumero_hijos()
                    + "\t" + fecha1 + "\t" + fecha2 + "\t" + e.getEmple().getDepartamento_asignado() + "\r\n");

            try {
                fichero_departamento1.createNewFile();
            } catch (Exception d) {
                JOptionPane.showMessageDialog(null, d.getMessage());
            }

            BufferedWriter Fescribes = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero_departamento1, true), "utf-8"));

            for (Abs_proyectos p : e.getListaproyecto()) {
                String fecha3 = new SimpleDateFormat("dd/MM/yyyy").format(p.getFecha_i());
                String fecha4 = new SimpleDateFormat("dd/MM/yyyy").format(p.getFecha_f());
                Fescribes.write(p.getNumero_empleados() + "\t" + p.getNombre()
                        + "\t" + p.getDescripcion() + "\t" + fecha3 + "\t" + fecha4
                        + "\t" + p.getDoc_empleado() + "\r\n");
            }

            JOptionPane.showMessageDialog(null, "Departamento Registrado");
            //SE CIERRA 
            Fescribe.close();
            Fescribes.close();
        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, f.getMessage());
        }

    }

    /*
    METODOS DE PROYECTOS
    METODOS DE PROYECTOS
    METODOS DE PROYECTOS
    METODOS DE PROYECTOS
    METODOS DE PROYECTOS
     */
    public static File fichero_proyectos = new File("src/Archivos_Planos/Rproyectos.txt");
    public static LinkedList<Abs_proyectos> lista_proyectos = new LinkedList<>();

    public static void agregar_proyecto(Abs_proyectos x) {
        lista_proyectos.add(x);
    }

    public static void InsertarProyecto(Abs_proyectos p) {
        try {
            //SE EL OBJETO PARA ESCRIBIR EN EL FECHERO
            BufferedWriter Fescribe = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fichero_proyectos, true), "utf-8"));
            //SE AGREGAN LOS DATOS AL FICHERO
            String fechai = new SimpleDateFormat("dd/MM/yyyy").format(p.getFecha_i());
            String fechaf = new SimpleDateFormat("dd/MM/yyyy").format(p.getFecha_f());
            Fescribe.write(p.getNumero_empleados() + "\t" + p.getNombre() + "\t" + p.getDescripcion() + "\t" + fechai + "\t" + fechaf
                    + "\t" + p.getDoc_empleado() + "\r\n");
            JOptionPane.showMessageDialog(null, "Proyecto Registrado");
            //SE CIERRA 
            Fescribe.close();
        } catch (Exception f) {
            JOptionPane.showMessageDialog(null, f.getMessage());
        }
    }

    public static void CargarLista_proyectos() {
        try {

            String line = null;
            //SE CREA EL OBJETO PARA LEER EL FECIHERO
            BufferedReader leerfichero = new BufferedReader(new FileReader(fichero_proyectos));
            //igual lo que este en el fichero a la variable y digo que no tiene que estar vacia.
            while ((line = leerfichero.readLine()) != null) {
                //lee las tabulaciones y las ingresa en una variable
                StringTokenizer mistokens = new StringTokenizer(line, "\t");
                SimpleDateFormat forme = new SimpleDateFormat("dd/MM/yyyy");

                long numero_empleado = Long.parseLong(mistokens.nextToken());
                String nombre = mistokens.nextToken();
                String descripcion = mistokens.nextToken();
                Date fecha_i = forme.parse(mistokens.nextToken());
                Date fecha_f = forme.parse(mistokens.nextToken());
                long documento_empleado = Long.parseLong(mistokens.nextToken());

                lista_proyectos.add(new Abs_proyectos(numero_empleado, nombre, descripcion, fecha_i, fecha_f, documento_empleado));

                //guardo los datos en un contenedor
            }
            leerfichero.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public static void guarda_modificacion_proyectos() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fichero_proyectos));
            for (Abs_proyectos p : lista_proyectos) {

                String fechai = new SimpleDateFormat("dd/MM/yyyy").format(p.getFecha_i());
                String fechaf = new SimpleDateFormat("dd/MM/yyyy").format(p.getFecha_f());
                bw.write(p.getNumero_empleados() + "\t" + p.getNombre() + "\t" + p.getDescripcion() + "\t" + fechai + "\t" + fechaf
                        + "\t" + p.getDoc_empleado() + "\r\n");

            }
            bw.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla   
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
