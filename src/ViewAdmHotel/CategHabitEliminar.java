/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ViewAdmHotel;

import viewAdmSist.LoginView;
import bean.AuditoriaSistema;
import bean.CategHabitacion;
import bean.Habitacion;
import java.awt.Image;
import java.text.DateFormat;
import java.text.DecimalFormat;
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
public class CategHabitEliminar extends javax.swing.JFrame {
    private int resp;
    private char ch;
    private int fila;
    private CategHabitacion chab;
    Date fecha=new Date();
    DateFormat formato=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    DecimalFormat formatea = new DecimalFormat("###,###,###,###,###.##");
    /**
     * Creates new form CategHabitEliminar
     */
    public CategHabitEliminar() {
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

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("proyectoPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT ch FROM CategHabitacion ch");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        panel_EliminarCH = new javax.swing.JPanel();
        lbl_eliminarCH = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tf_codigo = new javax.swing.JTextField();
        lbl_costo = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        tf_costo = new javax.swing.JTextField();
        lbl_codigo = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_cancelar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        panel_buscarCH = new javax.swing.JPanel();
        tf_valor = new javax.swing.JTextField();
        lbl_valor = new javax.swing.JLabel();
        lbl_filtro = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_EliminarCH.setBackground(new java.awt.Color(0, 153, 255));
        panel_EliminarCH.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_eliminarCH.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        lbl_eliminarCH.setForeground(new java.awt.Color(255, 255, 255));
        lbl_eliminarCH.setText("Eliminar Categoría de Habitación");

        javax.swing.GroupLayout panel_EliminarCHLayout = new javax.swing.GroupLayout(panel_EliminarCH);
        panel_EliminarCH.setLayout(panel_EliminarCHLayout);
        panel_EliminarCHLayout.setHorizontalGroup(
            panel_EliminarCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_EliminarCHLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lbl_eliminarCH)
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panel_EliminarCHLayout.setVerticalGroup(
            panel_EliminarCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_EliminarCHLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_eliminarCH)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_codigo.setEditable(false);
        tf_codigo.setBackground(new java.awt.Color(0, 153, 255));
        tf_codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_codigo.setForeground(new java.awt.Color(255, 255, 255));

        lbl_costo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_costo.setText("Costo por noche (Gs):");

        lbl_nombre.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_nombre.setText("Nombre:");

        tf_costo.setEditable(false);
        tf_costo.setBackground(new java.awt.Color(0, 153, 255));
        tf_costo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_costo.setForeground(new java.awt.Color(255, 255, 255));

        lbl_codigo.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_codigo.setText("Código de Categoría:");

        tf_nombre.setEditable(false);
        tf_nombre.setBackground(new java.awt.Color(0, 153, 255));
        tf_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_nombre.setForeground(new java.awt.Color(255, 255, 255));
        tf_nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_nombreFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_costo)
                            .addComponent(lbl_nombre))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_codigo)
                        .addGap(18, 18, 18)
                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nombre))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_costo)
                    .addComponent(tf_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btn_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btn_cancelar)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        panel_buscarCH.setBackground(new java.awt.Color(204, 204, 204));
        panel_buscarCH.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panel_buscarCH.setForeground(new java.awt.Color(204, 204, 255));

        tf_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_valorKeyTyped(evt);
            }
        });

        lbl_valor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

        lbl_filtro.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_filtro.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Código", "Nombre", "Costo" }));

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

        javax.swing.GroupLayout panel_buscarCHLayout = new javax.swing.GroupLayout(panel_buscarCH);
        panel_buscarCH.setLayout(panel_buscarCHLayout);
        panel_buscarCHLayout.setHorizontalGroup(
            panel_buscarCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarCHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_filtro)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl_valor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btn_buscar)
                .addGap(21, 21, 21))
        );
        panel_buscarCHLayout.setVerticalGroup(
            panel_buscarCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscarCHLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_buscarCHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_filtro)
                    .addComponent(lbl_valor)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap())
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCategoria}"));
        columnBinding.setColumnName("Codigo Categoria");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${costoxnoche}"));
        columnBinding.setColumnName("Costoxnoche");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(masterTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_buscarCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(panel_EliminarCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(82, 82, 82)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_EliminarCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(panel_buscarCH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_nombreFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_tf_nombreFocusLost

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
         String valor;
         int i;
         if(tf_codigo.getText().length()==0){
              JOptionPane.showMessageDialog(null,"Seleccione una categoría", "Error",JOptionPane.ERROR_MESSAGE);
                 return;
         }
          query=entityManager.createNativeQuery("SELECT * FROM habitacion WHERE "
                        + "codigoCategoria= "
                        + "'"+tf_codigo.getText()+"'",Habitacion.class);
                List<Habitacion> h=query.getResultList();
                if(h.size()>=1){
                      JOptionPane.showMessageDialog(null, "Esta categoría tiene habitaciones asignadas"
                    + " si elimina perderá dichos registros","Aviso",JOptionPane.INFORMATION_MESSAGE );
                }
        
        resp=  JOptionPane.showConfirmDialog(null,"Esta seguro que desea eliminar?", "Confirmar Eliminación",JOptionPane.YES_NO_OPTION );
        if(resp==JOptionPane.YES_OPTION){
            entityManager.getTransaction().begin();
             //eliminamos las habitaciones que dependen de dicha categoria
                    for(i=0;i<h.size();i++){
                        valor=h.get(i).toString();
                        entityManager.remove(h.get(i));
                        registrarAuditoria("Habitacion",valor);
                    }
                    entityManager.flush();
                
                //
             CategHabitacion c=entityManager.find(CategHabitacion.class,Integer.parseInt(tf_codigo.getText()) );
             valor=c.toString();//guardamos el objeto antes de eliminar
             entityManager.remove(c);
             entityManager.flush();
             registrarAuditoria("Categoria de Habitacion",valor);
             entityManager.getTransaction().commit();
             //entityManager.close();
             JOptionPane.showMessageDialog(null, "Eliminación Exitosa");
             resetear();
             list.remove(c);
             
        }else{
                 this.dispose();
        }
       
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        if (list_filtros.getSelectedItem()=="Código" || list_filtros.getSelectedItem()=="Costo"){
            ch=evt.getKeyChar();
            if(!Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }
        else{
            ch=evt.getKeyChar();
            if(Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_tf_valorKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        int cod;
        if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            if (list_filtros.getSelectedItem()=="Código"){
                cod=Integer.parseInt(tf_valor.getText());
                query=entityManager.createNamedQuery("CategHabitacion.findByCodigoCategoria");
                query.setParameter("codigoCategoria", cod);
                List<CategHabitacion> ch=query.getResultList();
                if(ch.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Código de categoría inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(ch);
                return;
            }
            if(list_filtros.getSelectedItem()=="Nombre"){
                query = entityManager.createNativeQuery( "SELECT * FROM categ_habitacion WHERE nombre LIKE "
                    +"'%"+tf_valor.getText()+"%'", CategHabitacion.class);
                List<CategHabitacion> ch=query.getResultList();
                if(ch.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Nombre de categoría inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(ch);
                return;
            }
            if(list_filtros.getSelectedItem()=="Costo"){
                query = entityManager.createNativeQuery( "SELECT * FROM categ_habitacion WHERE costoxnoche>= "
                    +"'"+tf_valor.getText()+"'", CategHabitacion.class);
                List<CategHabitacion> ch=query.getResultList();
                if(ch.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Precio de categoría inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(ch);
                return;
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_buscarFocusLost
        // TODO add your handling code here:
        tf_valor.setText(null);
    }//GEN-LAST:event_btn_buscarFocusLost

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        // TODO add your handling code here:
        fila=masterTable.getSelectedRow();
         obtenerCategoria(fila);
         inicializarCategoria();  
    }//GEN-LAST:event_masterTableMouseClicked
      private void obtenerCategoria(int fila) {
            query = entityManager.createNamedQuery("CategHabitacion.findByCodigoCategoria");
            query.setParameter("codigoCategoria", Integer.parseInt(masterTable.getValueAt(fila, 0).toString()) );
           
            try{
               chab = (CategHabitacion)query.getSingleResult();
               System.out.println(chab);
            }catch(javax.persistence.NoResultException e){
                System.out.println(chab);
            }
      }
    private void inicializarCategoria(){
        tf_codigo.setText(Integer.toString(chab.getCodigoCategoria()));
        tf_nombre.setText(chab.getNombre());
        tf_costo.setText(formateador(chab.getCostoxnoche()));
     }
        private void resetear(){
        tf_nombre.setText(null);
        tf_costo.setText(null);
        tf_codigo.setText(null);
    }
    private void registrarAuditoria(String entidad,String valor){
            AuditoriaSistema as=new AuditoriaSistema();
            as.setAccion("Eliminación");
            as.setTabla(entidad);
            as.setFechaHora(formato.format(fecha));
            as.setUsuario(LoginView.nombreUsuario);
            as.setAntes(valor);
            as.setDespues("No hay modificaciones");
            entityManager.persist(as);
            entityManager.flush();
    }
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
            java.util.logging.Logger.getLogger(CategHabitEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategHabitEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategHabitEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategHabitEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new CategHabitEliminar();
                frame.setVisible(true);
                frame.setTitle("Eliminar Categoría de Habitación");
                Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                frame.setIconImage(icon);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }
       private String formateador(int num){
        String formateado;
        formateado=formatea.format(num);
        return formateado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_costo;
    private javax.swing.JLabel lbl_eliminarCH;
    private javax.swing.JLabel lbl_filtro;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_valor;
    private java.util.List<bean.CategHabitacion> list;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTable;
    private javax.swing.JPanel panel_EliminarCH;
    private javax.swing.JPanel panel_buscarCH;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_costo;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
