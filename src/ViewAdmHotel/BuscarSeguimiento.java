/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ViewAdmHotel;

import bean.Actividad;
import bean.SeguimientoActividad;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge
 */
public class BuscarSeguimiento extends javax.swing.JFrame {
    private char ch;
    private int fila;
    private int codSeg;
    private String fecha;

    /**
     * Creates new form BuscarSeguimiento
     */
    public BuscarSeguimiento() {
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
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        EntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        Query = java.beans.Beans.isDesignTime() ? null : EntityManager.createQuery("SELECT s FROM SeguimientoActividad s");
        List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(Query.getResultList());
        panel_BuscarAct = new javax.swing.JPanel();
        lbl_BuscarAct = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        tf_valor = new javax.swing.JTextField();
        lbl_valor = new javax.swing.JLabel();
        lbl_filtro = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_BuscarAct.setBackground(new java.awt.Color(0, 153, 255));
        panel_BuscarAct.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_BuscarAct.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        lbl_BuscarAct.setForeground(new java.awt.Color(255, 255, 255));
        lbl_BuscarAct.setText("Buscar Seguimiento de Actividad");

        javax.swing.GroupLayout panel_BuscarActLayout = new javax.swing.GroupLayout(panel_BuscarAct);
        panel_BuscarAct.setLayout(panel_BuscarActLayout);
        panel_BuscarActLayout.setHorizontalGroup(
            panel_BuscarActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarActLayout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(lbl_BuscarAct)
                .addContainerGap(110, Short.MAX_VALUE))
        );
        panel_BuscarActLayout.setVerticalGroup(
            panel_BuscarActLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_BuscarActLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_BuscarAct)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));

        tf_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_valorKeyTyped(evt);
            }
        });

        lbl_valor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

        lbl_filtro.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_filtro.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código Seguimiento", "Actividad", "Lugar", "Fecha", "Código Empleado", "Nombre", "Apellido", " " }));
        list_filtros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_filtrosActionPerformed(evt);
            }
        });
        list_filtros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                list_filtrosFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                list_filtrosFocusLost(evt);
            }
        });

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom.png"))); // NOI18N
        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        btn_buscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                btn_buscarFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_filtro)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(lbl_valor)
                .addGap(18, 18, 18)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_buscar)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_filtro)
                    .addComponent(lbl_valor)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap())
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, List, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoSeguimiento}"));
        columnBinding.setColumnName("Seguimiento");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${actividad.nombre}"));
        columnBinding.setColumnName("Actividad");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${lugar.nombre}"));
        columnBinding.setColumnName("Lugar");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fechaHora}"));
        columnBinding.setColumnName("Fecha Hora");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoEmpleado.codigoEmpleado}"));
        columnBinding.setColumnName("Codigo Empleado");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoEmpleado.nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoEmpleado.apellido}"));
        columnBinding.setColumnName("Apellido");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            masterTable.getColumnModel().getColumn(4).setPreferredWidth(60);
            masterTable.getColumnModel().getColumn(5).setPreferredWidth(60);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(btn_cancelar)
                .addContainerGap(432, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_BuscarAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_BuscarAct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cancelar)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        if (list_filtros.getSelectedItem()=="Código Seguimiento" || list_filtros.getSelectedItem()=="Código Empleado"){
            ch=evt.getKeyChar();
            if(!Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }
        else{
                if(list_filtros.getSelectedItem()=="Actividad" || list_filtros.getSelectedItem()=="Nombre" || list_filtros.getSelectedItem()=="Apellido"){
                     ch=evt.getKeyChar();
                    if(Character.isDigit(ch)){
                        getToolkit().beep();
                        evt.consume();
                    }
           
                }
        }
    }//GEN-LAST:event_tf_valorKeyTyped

    private void list_filtrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_filtrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_list_filtrosActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
      // TODO add your handling code here:
        int id;
        if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            if (list_filtros.getSelectedItem()=="Código Seguimiento"){
                id=Integer.parseInt(tf_valor.getText());
                Query = EntityManager.createNamedQuery("SeguimientoActividad.findByCodigoSeguimiento");
                Query.setParameter("codigoSeguimiento",id);
                List<SeguimientoActividad> s = Query.getResultList();
                if (s.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Código de Seguimiento de Actividad inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                List.clear();
                List.addAll(s);
            }
            else if(list_filtros.getSelectedItem()=="Actividad"){
                Query = EntityManager.createNativeQuery( "SELECT * FROM seguimiento_actividad s "
                        + "INNER JOIN actividad a "
                        + "ON s.actividad=a.codActividad "
                        +"WHERE a.nombre LIKE "
                        +"'%"+tf_valor.getText()+"%'", SeguimientoActividad.class);
                List<SeguimientoActividad> s = Query.getResultList();
                if (s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Descripción de actividad inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                List.clear();
                List.addAll(s);
            }
             else if(list_filtros.getSelectedItem()=="Lugar"){
                Query = EntityManager.createNativeQuery( "SELECT * FROM seguimiento_actividad s "
                        + "INNER JOIN lugar l "
                        + "ON s.lugar=l.codLugar "
                        +"WHERE l.nombre LIKE "
                        +"'%"+tf_valor.getText()+"%'", SeguimientoActividad.class);
                List<SeguimientoActividad> s = Query.getResultList();
                if (s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Lugar de actividad inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                List.clear();
                List.addAll(s);
            }
            else if(list_filtros.getSelectedItem()=="Fecha"){
                Query = EntityManager.createNativeQuery( "SELECT * FROM seguimiento_actividad  "
                        +"WHERE fechaHora LIKE "
                        +"'%"+tf_valor.getText()+"%'", SeguimientoActividad.class);
                List<SeguimientoActividad> s = Query.getResultList();
                if (s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No existen registros para dicha fecha","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                List.clear();
                List.addAll(s);
            }
            else if(list_filtros.getSelectedItem()=="Nombre"){
                Query = EntityManager.createNativeQuery( "SELECT * FROM seguimiento_actividad s "
                        + "INNER JOIN empleado e "
                        + "ON s.codigoEmpleado=e.codigoEmpleado "
                        +"WHERE e.nombre LIKE "
                        +"'%"+tf_valor.getText()+"%'", SeguimientoActividad.class);
                List<SeguimientoActividad> s = Query.getResultList();
                if (s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No existen registros para dicho empleado","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                List.clear();
                List.addAll(s);
            }
             else if(list_filtros.getSelectedItem()=="Apellido"){
                Query = EntityManager.createNativeQuery( "SELECT * FROM seguimiento_actividad s "
                    + "INNER JOIN empleado e "
                    + "ON s.codigoEmpleado=e.codigoEmpleado "
                    +"WHERE e.apellido LIKE "
                    +"'%"+tf_valor.getText()+"%'", SeguimientoActividad.class);
                List<SeguimientoActividad> s = Query.getResultList();
                if (s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No existen registros para dicho empleado","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                List.clear();
                List.addAll(s);
            }
             else if(list_filtros.getSelectedItem()=="Código Empleado"){
                Query = EntityManager.createNativeQuery( "SELECT * FROM seguimiento_actividad  "
                        +"WHERE codigoEmpleado="
                        +"'"+tf_valor.getText()+"'", SeguimientoActividad.class);
                List<SeguimientoActividad> s = Query.getResultList();
                if (s.isEmpty()){
                    JOptionPane.showMessageDialog(null, "No existen registros para dicho empleado","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                List.clear();
                List.addAll(s);
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_buscarFocusLost
        // TODO add your handling code here:
        tf_valor.setText(null);
    }//GEN-LAST:event_btn_buscarFocusLost

    private void list_filtrosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_list_filtrosFocusLost
        // TODO add your handling code here:
        if(list_filtros.getSelectedItem()=="Fecha"){
             Date fecha= new Date(); 
            DateFormat formato=new SimpleDateFormat("dd-MM-yyyy");
            tf_valor.setText(formato.format(fecha));   
         }
    }//GEN-LAST:event_list_filtrosFocusLost

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_masterTableMouseClicked

    private void list_filtrosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_list_filtrosFocusGained
        // TODO add your handling code here:
        tf_valor.setText(null);
    }//GEN-LAST:event_list_filtrosFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarSeguimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new BuscarSeguimiento();
                frame.setVisible(true);
                frame.setTitle("Buscar Seguimiento de Actividad");
                 Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                frame.setIconImage(icon);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager EntityManager;
    private java.util.List<bean.SeguimientoActividad> List;
    private javax.persistence.Query Query;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_BuscarAct;
    private javax.swing.JLabel lbl_filtro;
    private javax.swing.JLabel lbl_valor;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTable;
    private javax.swing.JPanel panel_BuscarAct;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}