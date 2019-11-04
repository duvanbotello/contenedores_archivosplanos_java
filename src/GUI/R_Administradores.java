/*
 * Este codigo fue creado por @DuvanBotello
 *  <"Sin lógica no hay paraíso">
 */
package GUI;

import javax.swing.table.DefaultTableModel;
import Abstracciones.*;
import Metodos.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author DuvanBotello
 * <http://yoaprendo-informatica.blogspot.com.co/ - duvanbotello1008@gmail.com>
 */
public class R_Administradores extends javax.swing.JInternalFrame {
    private String documento;
    private String nombre;
    DefaultTableModel modelo_tadmin = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    private TableRowSorter<TableModel> trs;

    /**
     * Creates new form R_Administradores
     */
    public R_Administradores() {
        initComponents();
        cargar();
    }

    private void cargar() {
        tb1.setModel(modelo_tadmin);
        modelo_tadmin.setRowCount(0);
        tb1.setRowHeight(30);
        tb1.setDefaultRenderer(Object.class, new Render());
        JButton btn1 = new JButton("Administrador");
        btn1.setName("btm_admin");

        modelo_tadmin.addColumn("Documento");
        modelo_tadmin.addColumn("Nombre");
        modelo_tadmin.addColumn("Acender");

        Object[] file = new Object[tb1.getColumnCount()];
        for (Abs_empleados e : metodos.lista_empleados) {
            file[0] = e.getDocumento();
            file[1] = e.getNombre_emple();
            file[2] = btn1;
            modelo_tadmin.addRow(file);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        lb_nombre = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        combo_busqueda = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro Administradores");

        panel_titulo.setBackground(new java.awt.Color(51, 51, 51));
        panel_titulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_titulo.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        lb_titulo.setForeground(new java.awt.Color(255, 255, 255));
        lb_titulo.setText("Asignar Rol");

        javax.swing.GroupLayout panel_tituloLayout = new javax.swing.GroupLayout(panel_titulo);
        panel_titulo.setLayout(panel_tituloLayout);
        panel_tituloLayout.setHorizontalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(lb_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_tituloLayout.setVerticalGroup(
            panel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_tituloLayout.createSequentialGroup()
                .addComponent(lb_titulo)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb1);

        lb_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_nombre.setText("Buscar por:");

        txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtKeyTyped(evt);
            }
        });

        combo_busqueda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        combo_busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECCIONE--", "DOCUMENTO", "NOMBRE" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lb_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_nombre)
                    .addComponent(combo_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb1MouseClicked
       int seleccion = tb1.rowAtPoint(evt.getPoint());
       documento = String.valueOf(tb1.getValueAt(seleccion, 0));
       nombre = String.valueOf(tb1.getValueAt(seleccion, 1));

        //CON ESTO AGARRO LA POSICION X Y LA Y PARA SABER LA UBICACION
        int column = tb1.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tb1.getRowHeight();

        if (row < tb1.getRowCount() && row >= 0 && column < tb1.getColumnCount() && column >= 0) {
            Object value = tb1.getValueAt(row, column);
            //SI LA POCICION DONDE SE DIO CLIK ES UN BOTON SE PUEDE EJECUTAR EL CODIGO
            if (value instanceof JButton) {
                ((JButton) value).doClick();
                JButton boton = (JButton) value;

                if (boton.getName().equals("btm_admin")) {
                    Admin_Contraseña d = new Admin_Contraseña();                 
                    Principal.escritorio.add(d);
                    d.show();
                    Admin_Contraseña.txt_admin_doc.setText(documento);
                    Admin_Contraseña.txt_admin_nombre.setText(nombre);
                    
                }
            }
           
        }
    }//GEN-LAST:event_tb1MouseClicked

    private void txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyTyped

        switch (combo_busqueda.getSelectedIndex()) {
            case 1:

                txt.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyReleased(KeyEvent e) {
                        trs.setRowFilter(RowFilter.regexFilter("(?i)" + txt.getText(), 0));
                    }

                });
                trs = new TableRowSorter<>(tb1.getModel());
                tb1.setRowSorter(trs);
                break;
            case 2:
                txt.addKeyListener(new KeyAdapter() {
                    @Override
                    public void keyReleased(KeyEvent e) {
                        trs.setRowFilter(RowFilter.regexFilter("(?i)" + txt.getText(), 1));
                    }

                });
                trs = new TableRowSorter<>(tb1.getModel());
                tb1.setRowSorter(trs);

                break;
            default:
                JOptionPane.showMessageDialog(null, "Por favor seleccione un tipo de busqueda");
                
                break;
        }

    }//GEN-LAST:event_txtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_busqueda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_nombre;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel panel_titulo;
    private javax.swing.JTable tb1;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}
