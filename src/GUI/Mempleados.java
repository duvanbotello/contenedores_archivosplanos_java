/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */
package GUI;

import Metodos.metodos;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import Abstracciones.*;
import java.text.SimpleDateFormat;

/**
 *
 * @author DuvanBotello
 * <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class Mempleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form Mempleados
     */
    public Mempleados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_titulo = new javax.swing.JPanel();
        lb_titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txt_doc = new javax.swing.JTextField();
        lb_nombre = new javax.swing.JLabel();
        lb_nombre7 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_salario = new javax.swing.JTextField();
        lb_nombre2 = new javax.swing.JLabel();
        txt_genero = new javax.swing.JComboBox<>();
        lb_nombre4 = new javax.swing.JLabel();
        lb_nombre1 = new javax.swing.JLabel();
        txt_numero_social = new javax.swing.JTextField();
        lb_nombre3 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_hijos = new javax.swing.JTextField();
        lb_nombre5 = new javax.swing.JLabel();
        txt_fecha = new com.toedter.calendar.JDateChooser();
        lb_nombre6 = new javax.swing.JLabel();
        btm_registrar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Modificar Empleado");

        panel_titulo.setBackground(new java.awt.Color(255, 102, 102));
        panel_titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_titulo.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("Modificar Empleados");

        javax.swing.GroupLayout panel_tituloLayout = new javax.swing.GroupLayout(panel_titulo);
        panel_titulo.setLayout(panel_tituloLayout);
        panel_tituloLayout.setHorizontalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_tituloLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_titulo)
                .addGap(88, 88, 88))
        );
        panel_tituloLayout.setVerticalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addComponent(lb_titulo)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Edicion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        txt_doc.setEditable(false);
        txt_doc.setBackground(new java.awt.Color(0, 153, 51));
        txt_doc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_doc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_doc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_docKeyTyped(evt);
            }
        });

        lb_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre.setText("Doc:");

        lb_nombre7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre7.setText("Nombre:");

        txt_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_salario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_salario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_salarioKeyTyped(evt);
            }
        });

        lb_nombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre2.setText("Salario :");

        txt_genero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "MASCULINO", "FEMENINO" }));

        lb_nombre4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre4.setText("Genero:");

        lb_nombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre1.setText("Numero de Seguridad Social:");

        txt_numero_social.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_numero_social.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_numero_social.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_numero_socialKeyTyped(evt);
            }
        });

        lb_nombre3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre3.setText("Direccion:");

        txt_direccion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_direccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txt_hijos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_hijos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_hijos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_hijosKeyTyped(evt);
            }
        });

        lb_nombre5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre5.setText("Numero De Hijos:");

        lb_nombre6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre6.setText("Fecha De Nacimiento:");

        btm_registrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btm_registrar.setForeground(new java.awt.Color(255, 51, 51));
        btm_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleados_icono.png"))); // NOI18N
        btm_registrar.setText("Modificar Empleado");
        btm_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lb_nombre4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lb_nombre2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(51, 51, 51)
                                        .addComponent(lb_nombre1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_numero_social, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(lb_nombre3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_nombre7)
                                    .addComponent(lb_nombre, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lb_nombre6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lb_nombre5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_hijos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(19, 19, 19))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btm_registrar)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nombre)
                            .addComponent(txt_doc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nombre7)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nombre2)
                            .addComponent(txt_salario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nombre5)
                            .addComponent(txt_hijos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_nombre6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre4)
                    .addComponent(txt_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre1)
                    .addComponent(txt_numero_social, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_nombre3)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btm_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_docKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_docKeyTyped
        char teclaseleccionada = evt.getKeyChar();
        if (teclaseleccionada == KeyEvent.VK_ENTER || teclaseleccionada == KeyEvent.VK_I) {
            btm_registrar.doClick();
        }

        if (Character.isLetter(teclaseleccionada)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR NUMEROS EN EL CAMPO");
        }
    }//GEN-LAST:event_txt_docKeyTyped

    private void txt_salarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_salarioKeyTyped
        char teclaseleccionada = evt.getKeyChar();
        if (teclaseleccionada == KeyEvent.VK_ENTER || teclaseleccionada == KeyEvent.VK_I) {
            btm_registrar.doClick();
        }

        if (Character.isLetter(teclaseleccionada)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR NUMEROS EN EL CAMPO");
        }
    }//GEN-LAST:event_txt_salarioKeyTyped

    private void txt_numero_socialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_numero_socialKeyTyped
        char teclaseleccionada = evt.getKeyChar();
        if (teclaseleccionada == KeyEvent.VK_ENTER || teclaseleccionada == KeyEvent.VK_I) {
            btm_registrar.doClick();
        }

        if (Character.isLetter(teclaseleccionada)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR NUMEROS EN EL CAMPO");
        }
    }//GEN-LAST:event_txt_numero_socialKeyTyped

    private void txt_hijosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_hijosKeyTyped
        char teclaseleccionada = evt.getKeyChar();
        if (teclaseleccionada == KeyEvent.VK_ENTER || teclaseleccionada == KeyEvent.VK_I) {
            btm_registrar.doClick();
        }

        if (Character.isLetter(teclaseleccionada)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(null, "SOLO SE PUEDEN INGRESAR NUMEROS EN EL CAMPO");
        }
    }//GEN-LAST:event_txt_hijosKeyTyped

    private void btm_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_registrarActionPerformed
        boolean validar_campos = validar_campos();
        if (validar_campos == true) {
            /*PARSEO*/
            long documento = Long.parseLong(txt_doc.getText().trim());
            String nombre = txt_nombre.getText().trim();
            String direccion = txt_direccion.getText().trim();
            int genero = tipo_genero();
            int numero_hijos = Integer.parseInt(txt_hijos.getText().trim());
            long numero_social = Long.parseLong(txt_numero_social.getText());
            float salario = Float.parseFloat(txt_salario.getText());
            Date fecha = txt_fecha.getDate();
            /*MODIFICACION DE EMPLEADOS*/
            boolean existe = false;
            for (Abs_empleados em : metodos.lista_empleados) {
                //BUSCAR EL EMPLEADO
                if (documento == em.getDocumento()) {
                    int eleccion = confirmacion_modifica_emple();
                    //VERIFICA SI DE VERDAD QUIERE SER MODIFICADO
                    if (eleccion == JOptionPane.YES_OPTION) {
                        em.setDocumento(documento);
                        em.setNombre_emple(nombre);
                        em.setDireccion(direccion);
                        em.setGenero(genero);
                        em.setNumero_hijos(numero_hijos);
                        em.setNum_seguridad_s(numero_social);
                        em.setSueldo(salario);
                        em.setFecha_nacimiento(fecha);
                        metodos.guarda_modificacion_empleados();

                        JOptionPane.showMessageDialog(null, "Documento Editado Con Exito");
                        Mantenimiento.btm_actualizar22.doClick();
                    }
                    existe = true;
                    break;
                }
            }
            if (existe = false) {
                JOptionPane.showMessageDialog(null, "Documento no Existe");
            }
        }

    }//GEN-LAST:event_btm_registrarActionPerformed
    private boolean validar_campos() {
        boolean valido = false;
        if (!txt_doc.getText().isEmpty()) {
            if (!txt_nombre.getText().isEmpty()) {
                if (!txt_direccion.getText().isEmpty()) {
                    if (txt_genero.getSelectedIndex() != 0) {
                        if (!txt_hijos.getText().isEmpty()) {
                            if (!txt_numero_social.getText().isEmpty()) {
                                if (!txt_salario.getText().isEmpty()) {
                                    if (txt_fecha.getDate() != null) {
                                        valido = true;

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Por favor ingrese una fecha");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Por favor ingrese un $Salario ");
                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "Por favor ingrese numero social ");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Por favor ingrese #hijos");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor Seleccione un Genero");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese Direccion ");
                }

            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese Nombre ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor ingrese Documento ");
        }
        return valido;
    }

    private int confirmacion_modifica_emple() {
        String botones[] = {"Modificar", "Cancelar"};
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        int eleccion = JOptionPane.showOptionDialog(this, "¿Seguro que deseas Modificar?" + "\n DOCUMENTO: " + txt_doc.getText()
                + "\n NOMBRE: " + txt_nombre.getText() + "\n DIRECCION: " + txt_direccion.getText() + "\n GENERO: " + txt_genero.getSelectedItem().toString()
                + "\n NUMERO DE HIJOS: " + txt_hijos.getText() + "\n NUMERO SOCIAL: " + txt_numero_social.getText()
                + "\n SALARIO: " + txt_salario.getText() + "\n FECHA DE NACIMIENTIO: " + formato.format(txt_fecha.getDate()),
                "Advertencia", 0, 0, null, botones, this);
        return eleccion;
    }

    private int tipo_genero() {
        switch (txt_genero.getSelectedIndex()) {
            case 1:
                return 1; //masculino
            case 2:
                return 2; //femenino
            default:
                return 0; //no
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_registrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_nombre1;
    private javax.swing.JLabel lb_nombre2;
    private javax.swing.JLabel lb_nombre3;
    private javax.swing.JLabel lb_nombre4;
    private javax.swing.JLabel lb_nombre5;
    private javax.swing.JLabel lb_nombre6;
    private javax.swing.JLabel lb_nombre7;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel panel_titulo;
    public static javax.swing.JTextField txt_direccion;
    public static javax.swing.JTextField txt_doc;
    public static com.toedter.calendar.JDateChooser txt_fecha;
    public static javax.swing.JComboBox<String> txt_genero;
    public static javax.swing.JTextField txt_hijos;
    public static javax.swing.JTextField txt_nombre;
    public static javax.swing.JTextField txt_numero_social;
    public static javax.swing.JTextField txt_salario;
    // End of variables declaration//GEN-END:variables
}
