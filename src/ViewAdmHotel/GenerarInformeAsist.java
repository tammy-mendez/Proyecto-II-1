/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ViewAdmHotel;

import bean.Empleado;
import com.mxrck.autocompleter.TextAutoCompleter;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jorge
 */
public class GenerarInformeAsist extends javax.swing.JFrame {
    private char ch;
    private int limite=11;
     private final  TextAutoCompleter textAutoCompleter;
     private int fila;

    /**
     * Creates new form GenerarInformeAsist
     */
    public GenerarInformeAsist() {
        initComponents();
        this.textAutoCompleter = new TextAutoCompleter(tf_codEmpleado);
        //infijo
        this.textAutoCompleter.setMode(0);
        inicializarLista();
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT e  FROM Empleado e");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        jPanel3 = new javax.swing.JPanel();
        lbl_registrarC = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jm_mes = new com.toedter.calendar.JMonthChooser();
        lbl_año = new javax.swing.JLabel();
        tf_codEmpleado = new javax.swing.JTextField();
        lbl_mes = new javax.swing.JLabel();
        jy_año = new com.toedter.calendar.JYearChooser();
        lbl_empleado = new javax.swing.JLabel();
        tf_datosEmpleado = new javax.swing.JTextField();
        lbl_cedula = new javax.swing.JLabel();
        tf_cedula = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_generar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        tf_valor = new javax.swing.JTextField();
        lbl_valor = new javax.swing.JLabel();
        lbl_filtro = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 153, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_registrarC.setFont(new java.awt.Font("Corbel", 1, 28)); // NOI18N
        lbl_registrarC.setForeground(new java.awt.Color(255, 255, 255));
        lbl_registrarC.setText("Generar Informe de Asistencia");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(lbl_registrarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_registrarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbl_año.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        lbl_año.setText("Año:");

        tf_codEmpleado.setEditable(false);
        tf_codEmpleado.setBackground(new java.awt.Color(0, 153, 255));
        tf_codEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_codEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        tf_codEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_codEmpleadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_codEmpleadoKeyTyped(evt);
            }
        });

        lbl_mes.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        lbl_mes.setText("Mes:");

        lbl_empleado.setFont(new java.awt.Font("Candara", 1, 16)); // NOI18N
        lbl_empleado.setText("Empleado:");

        tf_datosEmpleado.setEditable(false);
        tf_datosEmpleado.setBackground(new java.awt.Color(0, 153, 255));
        tf_datosEmpleado.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_datosEmpleado.setForeground(new java.awt.Color(255, 255, 255));

        lbl_cedula.setFont(new java.awt.Font("Candara", 1, 14)); // NOI18N
        lbl_cedula.setText("Cedula:");

        tf_cedula.setEditable(false);
        tf_cedula.setBackground(new java.awt.Color(0, 153, 255));
        tf_cedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_cedula.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cedula)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_empleado)
                        .addGap(18, 18, 18)
                        .addComponent(tf_codEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_datosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lbl_mes)
                        .addGap(18, 18, 18)
                        .addComponent(jm_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(lbl_año)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jy_año, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_empleado)
                    .addComponent(tf_codEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_datosEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_cedula)
                    .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jm_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_año))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jy_año, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdf.png"))); // NOI18N
        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_generar)
                .addGap(33, 33, 33)
                .addComponent(btn_cancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_generar)
                    .addComponent(btn_cancelar))
                .addContainerGap())
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoEmpleado}"));
        columnBinding.setColumnName(" Empleado");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cedula}"));
        columnBinding.setColumnName("Cedula");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${apellido}"));
        columnBinding.setColumnName("Apellido");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCargo.nombre}"));
        columnBinding.setColumnName(" Cargo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoJefe.codigoEmpleado}"));
        columnBinding.setColumnName("Codigo Jefe");
        columnBinding.setColumnClass(Integer.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                masterTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            masterTable.getColumnModel().getColumn(4).setPreferredWidth(80);
        }

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(204, 204, 255));

        tf_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_valorKeyTyped(evt);
            }
        });

        lbl_valor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

        lbl_filtro.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_filtro.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Empleado", "Cedula", "Nombre", "Apellido", "Cargo", "Jefe" }));
        list_filtros.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                list_filtrosFocusGained(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_filtro)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(lbl_valor)
                .addGap(18, 18, 18)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(btn_buscar)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_filtro)
                    .addComponent(lbl_valor)
                    .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_codEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codEmpleadoKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_tf_codEmpleadoKeyTyped

    private void tf_codEmpleadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codEmpleadoKeyPressed
        // TODO add your handling code here:
 
    }//GEN-LAST:event_tf_codEmpleadoKeyPressed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        // TODO add your handling code here:
        int cod;
        int mes;
        int anho;
        String fecha;
        if(tf_codEmpleado.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Seleccione algún empleado", "Error",JOptionPane.ERROR_MESSAGE);
                return;
        }else{
                cod=Integer.parseInt(tf_codEmpleado.getText());
               
               mes=jm_mes.getMonth();
               mes=mes+1;
               anho=jy_año.getYear();
               fecha=mesLetra(mes)+" "+anho;
               /*System.out.println(mes);
               System.out.println(anho);
               System.out.println(fecha);*/
            try
           {
               
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel db", "root", "user");
                HashMap par = new HashMap();//no definimos ningún parámetro por eso lo dejamos así
                Map parametros=new HashMap();
                par.put("codigoEmpleado",cod);
                par.put("mes", mes);
                par.put("año", anho);
                par.put("fecha",fecha);
                JasperPrint jp = JasperFillManager.fillReport("C:/Proyecto-II/src/reportes/asistencia.jasper", par,con);//el primer parámetro es el camino del archivo, se cambia esta dirección por la dirección del archivo .jasper
                JasperViewer jv = new JasperViewer(jp,false);
                jv.setVisible(true);
                jv.setTitle("Informe de Asistencia de Empleado");
                Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                 jv.setIconImage(icon);
                jv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
                catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_generarActionPerformed

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        char ch;
        if (list_filtros.getSelectedItem()=="Empleado"){
            ch=evt.getKeyChar();
            if(!Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }
        if (list_filtros.getSelectedItem()=="Nombre"
            || list_filtros.getSelectedItem()=="Apellido"
            || list_filtros.getSelectedItem()=="Cargo" ){
            ch=evt.getKeyChar();
            if(Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }
    }//GEN-LAST:event_tf_valorKeyTyped

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
        if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            if (list_filtros.getSelectedItem()=="Nombre"){
                query = entityManager.createNativeQuery("SELECT * FROM empleado "
                    + "WHERE nombre LIKE '%"+tf_valor.getText()+"%'", Empleado.class);
                List<Empleado> r = query.getResultList();
                if (r.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nombre inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(r);
            }
            else if (list_filtros.getSelectedItem()=="Apellido"){
                query = entityManager.createNativeQuery("SELECT * FROM empleado "
                    + "WHERE apellido LIKE '%"+tf_valor.getText()+"%'", Empleado.class);
                List<Empleado> r = query.getResultList();
                if (r.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Apellido inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(r);
            }
            else if(list_filtros.getSelectedItem()=="Cedula"){
                query = entityManager.createNativeQuery("SELECT * FROM empleado "
                    + "WHERE cedula LIKE '%"+tf_valor.getText()+"%'", Empleado.class);
                List<Empleado> a=query.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Cedula Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(a);
                return;
            }
            else if(list_filtros.getSelectedItem()=="Empleado"){
                query=entityManager.createNamedQuery("Empleado.findByCodigoEmpleado");
                query.setParameter("codigoEmpleado", Integer.parseInt(tf_valor.getText()));
                List<Empleado> a=query.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Empleado Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(a);
                return;
            }
            else if(list_filtros.getSelectedItem()=="Cargo"){
                query = entityManager.createNativeQuery( "SELECT * FROM empleado e "
                    + "INNER JOIN cargo c "
                    + "on e.codigoCargo = c.codigoCargo "
                    + "WHERE c.nombre like '%"
                    +tf_valor.getText() + "%'", Empleado.class);
                List<Empleado> a=query.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"No se han encontrado registros para la fecha", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(a);
                return;
            }
            else if(list_filtros.getSelectedItem()=="Jefe"){
                query = entityManager.createNativeQuery( "SELECT * FROM empleado e "
                    + "INNER JOIN empleado j "
                    + "on e.codigoJefe = j.codigoEmpleado "
                    + "WHERE j.cedula like '%"
                    +tf_valor.getText() + "%'", Empleado.class);
                List<Empleado> a=query.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Cedula de jefe Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                list.clear();
                list.addAll(a);
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
        int codEmp;
        codEmp=(Integer)masterTable.getValueAt(fila, 0);
        fila=masterTable.getSelectedRow();
        tf_codEmpleado.setText(Integer.toString(codEmp));
        tf_cedula.setText((String) masterTable.getValueAt(fila, 1));
        tf_datosEmpleado.setText(masterTable.getValueAt(fila, 2)+" "+masterTable.getValueAt(fila, 3));
    }//GEN-LAST:event_masterTableMouseClicked

    private void list_filtrosFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_list_filtrosFocusGained
        // TODO add your handling code here:
        tf_valor.setText(null);
    }//GEN-LAST:event_list_filtrosFocusGained
    private void inicializarLista(){
        query = entityManager.createNamedQuery("Empleado.findAll");
        List<Empleado> e = query.getResultList();
        Iterator <Empleado> it = e.iterator();
        while (it.hasNext()){
            textAutoCompleter.addItem(it.next().getCodigoEmpleado());
        }
    }
      private String mesLetra(int mes) {
          String m=" ";
          switch(mes){
              case 1:
              {
                  m="Enero";
                  break;
              }
               case 2:
              {
                  m="Febrero";
                  break;
              }
               case 3:
              {
                  m="Marzo";
                  break;
              }
              case 4:
              {
                  m="Abril";
                  break;
              }
              case 5:
              {
                  m="Mayo";
                  break;
              }
               case 6:
              {
                  m="Junio";
                  break;
              }
              case 7:
              {
                  m="Julio";
                  break;
              }
               case 8:
              {
                  m="Agosto";
                  break;
              }
               case 9:
              {
                  m="Setiembre";
                  break;
              }
               case 10:
              {
                  m="Octubre";
                  break;
              }
              case 11:
              {
                  m="Noviembre";
                  break;
              }
              case 12:
              {
                  m="Diciembre";
                  break;
              }    
          }
        return m;
          
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
            java.util.logging.Logger.getLogger(GenerarInformeAsist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarInformeAsist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarInformeAsist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarInformeAsist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               JFrame frame= new GenerarInformeAsist(); 
               frame.setVisible(true);
               Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
               frame.setIconImage(icon);
               frame.setTitle("Generar Informe de Asistencia");
               frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_generar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JMonthChooser jm_mes;
    private com.toedter.calendar.JYearChooser jy_año;
    private javax.swing.JLabel lbl_año;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_empleado;
    private javax.swing.JLabel lbl_filtro;
    private javax.swing.JLabel lbl_mes;
    private javax.swing.JLabel lbl_registrarC;
    private javax.swing.JLabel lbl_valor;
    private java.util.List<bean.Empleado> list;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTable;
    private javax.persistence.Query query;
    private javax.swing.JTextField tf_cedula;
    private javax.swing.JTextField tf_codEmpleado;
    private javax.swing.JTextField tf_datosEmpleado;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
