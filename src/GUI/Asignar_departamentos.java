/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */
package GUI;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author DuvanBotello
 * <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class Asignar_departamentos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Asignar_departamentos
     */
    public Asignar_departamentos() {
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
        lb_nombre = new javax.swing.JLabel();
        txt_nombre_empleado = new javax.swing.JTextField();
        btm_buscar_empleado = new javax.swing.JButton();
        txt_documento_empleado = new javax.swing.JTextField();
        lb_nombre1 = new javax.swing.JLabel();
        txt_doc_empe = new javax.swing.JTextField();
        lb_nombre2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lb_nombre3 = new javax.swing.JLabel();
        txt_departamento = new javax.swing.JTextField();
        btm_buscar_depar = new javax.swing.JButton();
        txt_codigo_departamento = new javax.swing.JTextField();
        lb_nombre4 = new javax.swing.JLabel();
        txt_c_departamento = new javax.swing.JTextField();
        lb_nombre5 = new javax.swing.JLabel();
        btm_asignar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Asignar Departamentos");

        panel_titulo.setBackground(new java.awt.Color(51, 51, 51));
        panel_titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_titulo.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("Asignar Departamento");

        javax.swing.GroupLayout panel_tituloLayout = new javax.swing.GroupLayout(panel_titulo);
        panel_titulo.setLayout(panel_tituloLayout);
        panel_tituloLayout.setHorizontalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(lb_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_tituloLayout.setVerticalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addComponent(lb_titulo)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lb_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre.setText("Nombre Empleado:");

        txt_nombre_empleado.setEditable(false);
        txt_nombre_empleado.setBackground(new java.awt.Color(51, 153, 255));
        txt_nombre_empleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_nombre_empleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_nombre_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombre_empleadoKeyTyped(evt);
            }
        });

        btm_buscar_empleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btm_buscar_empleado.setForeground(new java.awt.Color(51, 153, 255));
        btm_buscar_empleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleados_icono.png"))); // NOI18N
        btm_buscar_empleado.setText("Buscar");
        btm_buscar_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_buscar_empleadoActionPerformed(evt);
            }
        });

        txt_documento_empleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_documento_empleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_documento_empleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_documento_empleadoKeyTyped(evt);
            }
        });

        lb_nombre1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre1.setText("Digete Documento:");

        txt_doc_empe.setEditable(false);
        txt_doc_empe.setBackground(new java.awt.Color(51, 153, 255));
        txt_doc_empe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_doc_empe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_doc_empe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_doc_empeKeyTyped(evt);
            }
        });

        lb_nombre2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre2.setText("Documento :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_nombre1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_documento_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btm_buscar_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lb_nombre)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_doc_empe, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lb_nombre2)))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_documento_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btm_buscar_empleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nombre)
                            .addComponent(lb_nombre2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_nombre_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_doc_empe, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Buscar Departamento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        lb_nombre3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre3.setText("Nombre Departamento:");

        txt_departamento.setEditable(false);
        txt_departamento.setBackground(new java.awt.Color(0, 204, 204));
        txt_departamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_departamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_departamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_departamentoKeyTyped(evt);
            }
        });

        btm_buscar_depar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btm_buscar_depar.setForeground(new java.awt.Color(0, 204, 204));
        btm_buscar_depar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/departamentos_icono.png"))); // NOI18N
        btm_buscar_depar.setText("Buscar");
        btm_buscar_depar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_buscar_deparActionPerformed(evt);
            }
        });

        txt_codigo_departamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_codigo_departamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_codigo_departamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_codigo_departamentoKeyTyped(evt);
            }
        });

        lb_nombre4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre4.setText("Digete Codigo D:");

        txt_c_departamento.setEditable(false);
        txt_c_departamento.setBackground(new java.awt.Color(0, 204, 204));
        txt_c_departamento.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_c_departamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_c_departamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_c_departamentoKeyTyped(evt);
            }
        });

        lb_nombre5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre5.setText("Codigo depar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lb_nombre4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_codigo_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btm_buscar_depar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_nombre3))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txt_c_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(lb_nombre5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_codigo_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nombre4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btm_buscar_depar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_nombre3)
                            .addComponent(lb_nombre5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_c_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btm_asignar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btm_asignar.setForeground(new java.awt.Color(0, 153, 102));
        btm_asignar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icono_elegir.png"))); // NOI18N
        btm_asignar.setText("Asignar");
        btm_asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btm_asignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btm_asignar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btm_asignar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombre_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombre_empleadoKeyTyped

    }//GEN-LAST:event_txt_nombre_empleadoKeyTyped

    private void txt_documento_empleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_documento_empleadoKeyTyped
        char teclaseleccionada = evt.getKeyChar();
        if (teclaseleccionada == KeyEvent.VK_ENTER || teclaseleccionada == KeyEvent.VK_I) {
            btm_buscar_empleado.doClick();
        }
    }//GEN-LAST:event_txt_documento_empleadoKeyTyped

    private void txt_doc_empeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_doc_empeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_doc_empeKeyTyped

    private void txt_departamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_departamentoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_departamentoKeyTyped

    private void txt_codigo_departamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_codigo_departamentoKeyTyped
        char teclaseleccionada = evt.getKeyChar();
        if (teclaseleccionada == KeyEvent.VK_ENTER || teclaseleccionada == KeyEvent.VK_I) {
            btm_buscar_depar.doClick();
        }
    }//GEN-LAST:event_txt_codigo_departamentoKeyTyped

    private void txt_c_departamentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_c_departamentoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_c_departamentoKeyTyped

    private void btm_buscar_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_buscar_empleadoActionPerformed

        if (!txt_documento_empleado.getText().isEmpty()) {
            boolean existe = false;
            long doc_emple = Long.parseLong(txt_documento_empleado.getText().trim());
            for (Abstracciones.Abs_empleados e : Metodos.metodos.lista_empleados) {
                if (e.getDocumento() == doc_emple) {
                    txt_nombre_empleado.setText(e.getNombre_emple());
                    txt_doc_empe.setText(Long.toString(e.getDocumento()));
                    existe = true;
                    JOptionPane.showMessageDialog(null, "EMPLEADO ENCONTRADO CON EXITO");
                    txt_documento_empleado.setText("");
                    break;
                }
            }
            if (existe == false) {
                JOptionPane.showMessageDialog(null, "EMPLEADO NO EXISTE");
            }
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE DOCUMENTO");
        }
    }//GEN-LAST:event_btm_buscar_empleadoActionPerformed

    private void btm_buscar_deparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_buscar_deparActionPerformed
        if (!txt_codigo_departamento.getText().isEmpty()) {
            boolean existe = false;
            long codigo_depar = Long.parseLong(txt_codigo_departamento.getText().trim());
            for (Abstracciones.Abs_departamentos d : Metodos.metodos.lista_departamentos) {
                if (d.getCodigo() == codigo_depar) {
                    txt_c_departamento.setText(Long.toString(d.getCodigo()));
                    txt_departamento.setText(d.getNombre());
                    existe = true;
                    JOptionPane.showMessageDialog(null, "DEPARTAMENTO ENCONTRADO CON EXITO");
                    txt_codigo_departamento.setText("");
                    break;
                }
            }
            if (existe == false) {
                JOptionPane.showMessageDialog(null, "DEPARTAMENTO NO EXISTE");
            }
        } else {
            JOptionPane.showMessageDialog(null, "INGRESE CODIGO DE DEPARTAMENTO");
        }
    }//GEN-LAST:event_btm_buscar_deparActionPerformed

    private void btm_asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btm_asignarActionPerformed
        if (!txt_nombre_empleado.getText().isEmpty()) {
            if (!txt_departamento.getText().isEmpty()) {
                long documento = Long.parseLong(txt_doc_empe.getText().trim());
                long depar = Long.parseLong(txt_c_departamento.getText().trim());
                for (Abstracciones.Abs_empleados e : Metodos.metodos.lista_empleados) {
                    if (documento == e.getDocumento()) {
                        e.setDepartamento_asignado(depar);
                        Metodos.metodos.guarda_modificacion_empleados();
                        txt_c_departamento.setText("");
                        txt_departamento.setText("");
                        txt_nombre_empleado.setText("");
                        txt_doc_empe.setText("");
                        JOptionPane.showMessageDialog(null, "DEPARTAMENTO ASIGNADO CON EXITO");
                        break;
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE DEPARTAMENTO");
            }
        } else {
            JOptionPane.showMessageDialog(null, "POR FAVOR INGRESE EMPLEADO");
        }
    }//GEN-LAST:event_btm_asignarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btm_asignar;
    private javax.swing.JButton btm_buscar_depar;
    private javax.swing.JButton btm_buscar_empleado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_nombre1;
    private javax.swing.JLabel lb_nombre2;
    private javax.swing.JLabel lb_nombre3;
    private javax.swing.JLabel lb_nombre4;
    private javax.swing.JLabel lb_nombre5;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel panel_titulo;
    private javax.swing.JTextField txt_c_departamento;
    private javax.swing.JTextField txt_codigo_departamento;
    private javax.swing.JTextField txt_departamento;
    private javax.swing.JTextField txt_doc_empe;
    private javax.swing.JTextField txt_documento_empleado;
    private javax.swing.JTextField txt_nombre_empleado;
    // End of variables declaration//GEN-END:variables
}
