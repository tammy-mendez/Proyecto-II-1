/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package viewMenuRecep;

import bean.ConsumoProSer;
import bean.NumberToText;
import bean.Reserva;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
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
public class ConsumoResumen extends javax.swing.JFrame {
    private int fila;

    /**
     * Creates new form Consumo
     */
    public ConsumoResumen() {
        initComponents();
        reservaList.clear();
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
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Reserva r");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : query.getResultList();
        reservaRenderizar1 = new renderizar.ReservaRenderizar();
        reservaQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT r FROM Reserva r");
        reservaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(reservaQuery.getResultList());
        jPanel1 = new javax.swing.JPanel();
        btn_aceptar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panel_verConsumo = new javax.swing.JPanel();
        lbl_verConsumo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tf_categoria = new javax.swing.JTextField();
        tf_codigo = new javax.swing.JTextField();
        tf_nomApe = new javax.swing.JTextField();
        lbl_cedula = new javax.swing.JLabel();
        tf_cedula = new javax.swing.JTextField();
        lbl_codigo = new javax.swing.JLabel();
        tf_habitacion = new javax.swing.JTextField();
        lbl_habitación = new javax.swing.JLabel();
        lbl_nomApe = new javax.swing.JLabel();
        lbl_categoria = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tf_valor = new javax.swing.JTextField();
        lbl_valor = new javax.swing.JLabel();
        lbl_filtro = new javax.swing.JLabel();
        list_filtros = new javax.swing.JComboBox();
        btn_buscar = new javax.swing.JButton();

        reservaRenderizar1.setText("reservaRenderizar1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_aceptar.setBackground(new java.awt.Color(204, 204, 204));
        btn_aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/accept.png"))); // NOI18N
        btn_aceptar.setText("Aceptar");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_aceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_aceptar)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        panel_verConsumo.setBackground(new java.awt.Color(0, 153, 255));
        panel_verConsumo.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        lbl_verConsumo.setFont(new java.awt.Font("Corbel", 1, 25)); // NOI18N
        lbl_verConsumo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_verConsumo.setText("Ver Resumen Consumos");

        javax.swing.GroupLayout panel_verConsumoLayout = new javax.swing.GroupLayout(panel_verConsumo);
        panel_verConsumo.setLayout(panel_verConsumoLayout);
        panel_verConsumoLayout.setHorizontalGroup(
            panel_verConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_verConsumoLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(lbl_verConsumo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_verConsumoLayout.setVerticalGroup(
            panel_verConsumoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_verConsumoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_verConsumo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, reservaList, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoReserva}"));
        columnBinding.setColumnName(" Reserva");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numHabitacion.numero}"));
        columnBinding.setColumnName(" Habitacion");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numHabitacion.codigoCategoria.nombre}"));
        columnBinding.setColumnName("Categoría");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${checkIn}"));
        columnBinding.setColumnName("Check In");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${checkOut}"));
        columnBinding.setColumnName("Check Out");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCliente.cedula}"));
        columnBinding.setColumnName("CI Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCliente.nombre}"));
        columnBinding.setColumnName("Nombre");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${codigoCliente.apellido}"));
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
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(35);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(45);
            masterTable.getColumnModel().getColumn(5).setPreferredWidth(40);
            masterTable.getColumnModel().getColumn(6).setPreferredWidth(100);
            masterTable.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tf_categoria.setEditable(false);
        tf_categoria.setBackground(new java.awt.Color(0, 153, 255));
        tf_categoria.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_categoria.setForeground(new java.awt.Color(255, 255, 255));

        tf_codigo.setEditable(false);
        tf_codigo.setBackground(new java.awt.Color(0, 153, 255));
        tf_codigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_codigo.setForeground(new java.awt.Color(255, 255, 255));

        tf_nomApe.setEditable(false);
        tf_nomApe.setBackground(new java.awt.Color(0, 153, 255));
        tf_nomApe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_nomApe.setForeground(new java.awt.Color(255, 255, 255));

        lbl_cedula.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_cedula.setText("Cédula:");

        tf_cedula.setEditable(false);
        tf_cedula.setBackground(new java.awt.Color(0, 153, 255));
        tf_cedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_cedula.setForeground(new java.awt.Color(255, 255, 255));

        lbl_codigo.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_codigo.setText("Código Reserva:");

        tf_habitacion.setEditable(false);
        tf_habitacion.setBackground(new java.awt.Color(0, 153, 255));
        tf_habitacion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tf_habitacion.setForeground(new java.awt.Color(255, 255, 255));

        lbl_habitación.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_habitación.setText("Habitación:");

        lbl_nomApe.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_nomApe.setText("Nombre/Apellido:");

        lbl_categoria.setFont(new java.awt.Font("Candara", 0, 16)); // NOI18N
        lbl_categoria.setText("Categoría:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_codigo)
                        .addGap(18, 18, 18)
                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_habitación)
                        .addGap(42, 42, 42)
                        .addComponent(tf_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_categoria)
                        .addGap(31, 31, 31)
                        .addComponent(tf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_nomApe, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nomApe, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigo)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_habitación)
                    .addComponent(tf_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_categoria)
                    .addComponent(tf_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_cedula)
                    .addComponent(tf_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nomApe)
                    .addComponent(tf_nomApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setForeground(new java.awt.Color(204, 204, 255));

        tf_valor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_valorKeyTyped(evt);
            }
        });

        lbl_valor.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_valor.setText("Valor:");

        lbl_filtro.setFont(new java.awt.Font("Candara", 0, 14)); // NOI18N
        lbl_filtro.setText("Buscar por:");

        list_filtros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cedula", "Nombre", "Apellido", "Habitación", "CheckIn", "CheckOut" }));
        list_filtros.addFocusListener(new java.awt.event.FocusAdapter() {
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_filtro)
                .addGap(18, 18, 18)
                .addComponent(list_filtros, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(lbl_valor)
                .addGap(18, 18, 18)
                .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btn_buscar)
                .addGap(53, 53, 53))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(264, 264, 264))))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_verConsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panel_verConsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
        int total=0;
        String letras;
        if(tf_codigo.getText().length()==0){
              JOptionPane.showMessageDialog(null,"Seleccione una Reserva", "Error",JOptionPane.INFORMATION_MESSAGE);
              return;
        }
        int codigo=Integer.parseInt(tf_codigo.getText());
        query=entityManager.createNativeQuery("SELECT * FROM consumo_pro_ser  "
                    + "WHERE codigoReserva="
                    +"'"+codigo+"'"
                    +" AND numFactura is null", ConsumoProSer.class);
         List<ConsumoProSer>cps=query.getResultList();
         if(cps.isEmpty()){
             JOptionPane.showMessageDialog(null,"La reserva no tiene deudas hasta la fecha", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                   return;
                   
         }
         query=entityManager.createNativeQuery("SELECT SUM(total) FROM consumo_pro_ser  "
                    + "WHERE codigoReserva="
                    +"'"+codigo+"'"
                    +" AND numFactura is null GROUP BY(codigoReserva)");
                    Object resultado=query.getSingleResult();
                    total=Integer.parseInt(resultado.toString());
                    System.out.print(total);
                    //insertamos en la tabla factura
          if(total==0){
               JOptionPane.showMessageDialog(null,"La reserva no tiene deudas hasta la fecha", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                 return;
          }    
        try
        {
            //convertimos el numero en letras
            NumberToText nt=new NumberToText();
            letras=nt.convertirLetras(total);
            System.out.print(letras);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel db", "root", "user");
            HashMap par = new HashMap();//no definimos ningún parámetro por eso lo dejamos así
           // Map parametros=new HashMap();
            par.put("CodigoReserva",codigo );
            par.put("Letras", letras);
            JasperPrint jp = JasperFillManager.fillReport("C:/Proyecto-II/src/reportes/consumo.jasper", par,con);//el primer parámetro es el camino del archivo, se cambia esta dirección por la dirección del archivo .jasper
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Resumen de Consumos de  P/S");
             Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
             jv.setIconImage(icon);
            jv.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void masterTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_masterTableMouseClicked
        // TODO add your handling code here:
        int num;
        int cod;
         fila=masterTable.getSelectedRow();
        cod=(Integer)masterTable.getValueAt(fila, 0);
        num=(Integer)masterTable.getValueAt(fila, 1);
        tf_codigo.setText(Integer.toString(cod));
        tf_habitacion.setText(Integer.toString(num));
        tf_categoria.setText((String) masterTable.getValueAt(fila, 2));
        tf_cedula.setText((String) masterTable.getValueAt(fila, 5));
        tf_nomApe.setText(masterTable.getValueAt(fila, 6)+" "+masterTable.getValueAt(fila, 7));
    }//GEN-LAST:event_masterTableMouseClicked

    private void tf_valorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_valorKeyTyped
        // TODO add your handling code here:
        char ch;
        if (list_filtros.getSelectedItem()=="Habitación" || list_filtros.getSelectedItem()=="Reserva"){
            ch=evt.getKeyChar();
            if(!Character.isDigit(ch)){
                getToolkit().beep();
                evt.consume();
            }
        }

    }//GEN-LAST:event_tf_valorKeyTyped

    private void list_filtrosFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_list_filtrosFocusLost
        // TODO add your handling code here:
        if(list_filtros.getSelectedItem()=="CheckIn" || list_filtros.getSelectedItem()=="CheckOut"){
            Date fecha= new Date();
            DateFormat formato=new SimpleDateFormat("yyyy-MM-dd");
            tf_valor.setText(formato.format(fecha));
        }
    }//GEN-LAST:event_list_filtrosFocusLost

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
         tf_codigo.setText(null);
        tf_habitacion.setText(null);
        tf_categoria.setText(null);
        tf_cedula.setText(null);
        tf_nomApe.setText(null);
        if (tf_valor.getText().length()==0){
            JOptionPane.showMessageDialog(null,"Ingrese algún valor para efectuar la búsqueda", "Advertencia",JOptionPane.ERROR_MESSAGE);
            return;
        }
        else{
            if (list_filtros.getSelectedItem()=="Nombre"){
                reservaQuery = entityManager.createNativeQuery( "SELECT * FROM reserva r "
                    + "INNER JOIN cliente c "
                    + "on r.codigoCliente = c.codigoCliente "
                    + "WHERE r.checkIn<= date_format(now(),'%Y-%m-%d') and r.checkOut>=date_format(now(),'%Y-%m-%d') AND c.nombre LIKE "
                    +"'%"+tf_valor.getText()+"%'", Reserva.class);
                List<Reserva> r = reservaQuery.getResultList();
                if (r.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nombre inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                reservaList.clear();
                reservaList.addAll(r);
            }
            else if (list_filtros.getSelectedItem()=="Apellido"){
                reservaQuery = entityManager.createNativeQuery( "SELECT * FROM reserva r "
                    + "INNER JOIN cliente c "
                    + "on r.codigoCliente = c.codigoCliente "
                    + "WHERE r.checkIn<= date_format(now(),'%Y-%m-%d') and r.checkOut>=date_format(now(),'%Y-%m-%d') AND c.apellido LIKE "
                    +"'%"+tf_valor.getText()+"%'", Reserva.class);
                List<Reserva> r = reservaQuery.getResultList();
                if (r.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Apellido inexistente","Error",JOptionPane.ERROR_MESSAGE );
                    tf_valor.setText(null);
                    return;
                }
                reservaList.clear();
                reservaList.addAll(r);
            }
            else if(list_filtros.getSelectedItem()=="CheckIn"){
                reservaQuery=entityManager.createNativeQuery("SELECT * FROM reserva "
                    + "WHERE checkIn<= date_format(now(),'%Y-%m-%d') AND checkOut>=date_format(now(),'%Y-%m-%d') AND STR_TO_DATE(checkIn, '%Y-%m-%d')= "
                    +"'"+tf_valor.getText()+"'", Reserva.class);
                List<Reserva> a=reservaQuery.getResultList();
                if(a.size()==0){
                    JOptionPane.showMessageDialog(null,"No se han encontrado registros para la fecha", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                reservaList.clear();
                reservaList.addAll(a);
                return;
            }
            else if(list_filtros.getSelectedItem()=="CheckOut"){
                reservaQuery=entityManager.createNativeQuery("SELECT * FROM reserva "
                    + "WHERE checkIn<= date_format(now(),'%Y-%m-%d') and checkOut>=date_format(now(),'%Y-%m-%d') AND STR_TO_DATE(checkOut, '%Y-%m-%d')= "
                    +"'"+tf_valor.getText()+"'", Reserva.class);
                List<Reserva> a=reservaQuery.getResultList();
                if(a.size()==0){
                    JOptionPane.showMessageDialog(null,"No se han encontrado registros para la fecha", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                reservaList.clear();
                reservaList.addAll(a);
                return;
            }
            else if(list_filtros.getSelectedItem()=="Cedula"){
                reservaQuery=entityManager.createNativeQuery("SELECT * FROM reserva r "
                    +"INNER JOIN cliente c "
                    +"ON r.codigoCliente=c.codigoCliente "
                    + "WHERE r.checkIn<= date_format(now(),'%Y-%m-%d') AND r.checkOut>=date_format(now(),'%Y-%m-%d') AND c.cedula= "
                    +"'"+tf_valor.getText()+"'", Reserva.class);
                List<Reserva> a=reservaQuery.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Cédula Inexistente", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                reservaList.clear();
                reservaList.addAll(a);
                return;
            }
             else if(list_filtros.getSelectedItem()=="Habitación"){
                reservaQuery=entityManager.createNativeQuery("SELECT * FROM reserva r "
                    + "WHERE r.checkIn<= date_format(now(),'%Y-%m-%d') AND r.checkOut>=date_format(now(),'%Y-%m-%d') AND r.numHabitacion= "
                    +"'"+tf_valor.getText()+"'", Reserva.class);
                List<Reserva> a=reservaQuery.getResultList();
                if(a.isEmpty()){
                    JOptionPane.showMessageDialog(null,"No existen registros para dicha habitación", "Error",JOptionPane.ERROR_MESSAGE);
                    tf_valor.setText(null);
                    return;
                }
                reservaList.clear();
                reservaList.addAll(a);
                return;
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_buscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_buscarFocusLost
        // TODO add your handling code here:
        tf_valor.setText(null);
       /* tf_codigo.setText(null);
        tf_habitacion.setText(null);
        tf_categoria.setText(null);
        tf_cedula.setText(null);
        tf_nomApe.setText(null);*/
    }//GEN-LAST:event_btn_buscarFocusLost
private void inicializarLista(){
    reservaQuery=entityManager.createNativeQuery("select * from reserva  "
            + "where checkIn<= date_format(now(),'%Y-%m-%d') and checkOut>=date_format(now(),'%Y-%m-%d')",Reserva.class);
    List<Reserva> r=reservaQuery.getResultList();
    reservaList.addAll(r);
    
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
            java.util.logging.Logger.getLogger(ConsumoResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsumoResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsumoResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsumoResumen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame=new ConsumoResumen();
                frame.setVisible(true);
                Image icon = new ImageIcon(getClass().getResource("/imagenes/hotel2.png")).getImage();
                frame.setIconImage(icon);
                frame.setTitle("Generar resumen de consumo");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_buscar;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_categoria;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JLabel lbl_codigo;
    private javax.swing.JLabel lbl_filtro;
    private javax.swing.JLabel lbl_habitación;
    private javax.swing.JLabel lbl_nomApe;
    private javax.swing.JLabel lbl_valor;
    private javax.swing.JLabel lbl_verConsumo;
    private java.util.List<bean.Reserva> list;
    private javax.swing.JComboBox list_filtros;
    private javax.swing.JTable masterTable;
    private javax.swing.JPanel panel_verConsumo;
    private javax.persistence.Query query;
    private java.util.List<bean.Reserva> reservaList;
    private javax.persistence.Query reservaQuery;
    private renderizar.ReservaRenderizar reservaRenderizar1;
    private javax.swing.JTextField tf_categoria;
    private javax.swing.JTextField tf_cedula;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_habitacion;
    private javax.swing.JTextField tf_nomApe;
    private javax.swing.JTextField tf_valor;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}