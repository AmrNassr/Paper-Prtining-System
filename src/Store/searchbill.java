/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import hany.DBConnect;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author amnassar
 */
public final class searchbill extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
     
    PreparedStatement pst;
    ResultSet rs;
    public String y;
    int day;
    int month;
    int year;

    public searchbill() {
        initComponents();
         
        clear();
        serials();
        TableCellRenderer rendererFromHeader = jTable2.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
        jTable2.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);

        Calendar cal = new GregorianCalendar();
        day = cal.get(Calendar.DAY_OF_MONTH);
        month = cal.get(Calendar.MONTH) + 1;
        year = cal.get(Calendar.YEAR);
        namee.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        jTable2.getTableHeader().setFont(new Font("Arial", Font.BOLD, 20));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.getTableHeader().setBackground(new Color(138, 203, 195));
        jTable2.getTableHeader().setForeground(new Color(0, 0, 0));
        jTable2.setRowHeight(40);
        AutoCompleteDecorator.decorate(cmcode);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        namee = new javax.swing.JTextField();
        cmcode = new javax.swing.JComboBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        delete1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        number4 = new javax.swing.JTextField();
        itemcode3 = new javax.swing.JTextField();
        price3 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        number3 = new javax.swing.JTextField();
        add4 = new javax.swing.JButton();
        txttotal = new javax.swing.JLabel();
        autoserial4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        serialid4 = new javax.swing.JLabel();
        date4 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/71847608-close-up-of-handshake-on-city-background-with-abstract-sunlight-partnership-concept-double-exposure.jpg"))); // NOI18N

        setMaximumSize(new java.awt.Dimension(980, 690));
        setMinimumSize(new java.awt.Dimension(980, 690));
        setPreferredSize(new java.awt.Dimension(980, 690));

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.setMinimumSize(new java.awt.Dimension(90, 34));
        jPanel14.setPreferredSize(new java.awt.Dimension(970, 690));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel18.setText("اسم  العميل");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 140, 30));

        namee.setEditable(false);
        namee.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        namee.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jPanel14.add(namee, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 230, 30));

        cmcode.setEditable(true);
        cmcode.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmcode.setAutoscrolls(true);
        cmcode.setDoubleBuffered(true);
        cmcode.setFocusCycleRoot(true);
        cmcode.setFocusTraversalPolicyProvider(true);
        cmcode.setInheritsPopupMenu(true);
        cmcode.setRequestFocusEnabled(true);
        cmcode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmcodeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmcodeMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmcodeMousePressed(evt);
            }
        });
        cmcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmcodeActionPerformed(evt);
            }
        });
        cmcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmcodeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cmcodeKeyTyped(evt);
            }
        });
        jPanel14.add(cmcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 230, 30));

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "المجموع", "العدد", "السعر", "كود المنتج", "ID", "اسم المنتج"
            }
        ));
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setRowHeight(25);
        jTable2.setRowMargin(2);
        jTable2.setSelectionBackground(new java.awt.Color(204, 255, 255));
        jTable2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setMinWidth(100);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable2.getColumnModel().getColumn(1).setMinWidth(100);
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(100);
            jTable2.getColumnModel().getColumn(2).setMinWidth(100);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable2.getColumnModel().getColumn(4).setMinWidth(1);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(1);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(1);
        }

        jPanel14.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 760, 240));

        delete1.setBackground(new java.awt.Color(138, 203, 195));
        delete1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        delete1.setText("مسح العنصر");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel14.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 120, 60));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel17.setText("كود الفاتورة");
        jPanel14.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 140, 30));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel42.setText("المنتج");
        jPanel14.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 260, 70, 40));

        number4.setEditable(false);
        number4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        number4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number4.setText("1");
        number4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ActionPerformed(evt);
            }
        });
        number4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                number4KeyReleased(evt);
            }
        });
        jPanel14.add(number4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 630, -1, 10));

        itemcode3.setEditable(false);
        itemcode3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        itemcode3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        itemcode3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcode3ActionPerformed(evt);
            }
        });
        itemcode3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemcode3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemcode3KeyReleased(evt);
            }
        });
        jPanel14.add(itemcode3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 240, 40));

        price3.setEditable(false);
        price3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        price3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel14.add(price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 90, 40));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("السعر");
        jPanel14.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 90, 30));

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel52.setText("العدد");
        jPanel14.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 70, 40));

        number3.setEditable(false);
        number3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        number3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number3.setText("1");
        number3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ActionPerformed(evt);
            }
        });
        number3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                number3KeyReleased(evt);
            }
        });
        jPanel14.add(number3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 70, 40));

        add4.setBackground(new java.awt.Color(138, 203, 195));
        add4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add4.setText("تعديل");
        add4.setEnabled(false);
        add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add4ActionPerformed(evt);
            }
        });
        jPanel14.add(add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 70, 40));

        txttotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jPanel14.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 190, 70));

        autoserial4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        autoserial4.setForeground(new java.awt.Color(255, 255, 255));
        autoserial4.setText("لإثسف");
        jPanel14.add(autoserial4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 170, 60));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 720));

        serialid4.setText("jLabel1");
        jPanel14.add(serialid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        date4.setText("jLabel1");
        jPanel14.add(date4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, -1));

        serialid.setText("jLabel1");
        jPanel14.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 979, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 979, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmcodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmcodeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmcodeMouseClicked

    private void cmcodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmcodeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cmcodeMouseEntered

    private void cmcodeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmcodeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmcodeMousePressed

    private void cmcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmcodeActionPerformed
        Object obj = evt.getSource();
        if (obj == cmcode) {
            try {
                String sqll = "SELECT *  FROM battry.sellbattry where  buyserial='" + cmcode.getSelectedItem().toString() + "'";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                while (rs.next()) {

                    String name = rs.getString("total");

                    txttotal.setText(name);
                    namee.setText(rs.getString("customername"));

                }
                tablelord();
            } catch (SQLException ex) {
                Logger.getLogger(searchbill.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_cmcodeActionPerformed

    private void cmcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmcodeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmcodeKeyPressed

    private void cmcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmcodeKeyTyped

    }//GEN-LAST:event_cmcodeKeyTyped

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) jTable2.getModel();
        int selectrowindex = jTable2.getSelectedRow();
        serialid.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        itemcode3.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        price3.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        number3.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        number4.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        number3.setEditable(true);
        add4.setEnabled(true);
    }//GEN-LAST:event_jTable2MouseClicked

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        float amount = 0;
        String seriall = cmcode.getSelectedItem().toString();

        if (serialid.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "من فضلك اختر العنصر ");

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العملية", "رسالة تاكيد ؟ ", dialogButton);
            if (dialogResult == 0) {
                try {
                    String sql = "DELETE FROM battry.sellbattryitems WHERE id='" + serialid.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    pst.execute();
                    String sqla1 = "UPDATE battry.storeitemlist SET number =number+" + number3.getText() + "   where barcode='" + itemcode3.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                    pst.executeUpdate();
                    tablelord();
                    float totalx = 0;
                    String sqll = "SELECT total  FROM battry.sellbattryitems where  buyserial='" + cmcode.getSelectedItem().toString() + "'";

                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                    rs = pst.executeQuery();

                    while (rs.next()) {
                        totalx = totalx + Float.parseFloat(rs.getString("total"));
                    }
                    String sqla1e = "UPDATE battry.sellbattry SET total ='" + totalx + "'   where buyserial='" + cmcode.getSelectedItem().toString() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1e);
                    pst.executeUpdate();
                    txttotal.setText(""+totalx);
                } catch (SQLException ex) {

                }
            } else {

                JOptionPane.showMessageDialog(this, " الغاء");
            }
        }
    }//GEN-LAST:event_delete1ActionPerformed

    private void itemcode3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcode3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemcode3ActionPerformed

    private void itemcode3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemcode3KeyPressed
     
    }//GEN-LAST:event_itemcode3KeyPressed

    private void itemcode3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemcode3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_itemcode3KeyReleased

    private void number3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_number3ActionPerformed

    private void number3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_number3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_number3KeyReleased

    private void add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add4ActionPerformed
        float amount = 0;
        int totall=0;
        String seriall = cmcode.getSelectedItem().toString();

        try {
            float numbber = Float.parseFloat(number3.getText());
            float pricee = Float.parseFloat(price3.getText());
            float total = numbber * pricee;

            try {
                int firstnumber=Integer.parseInt(number4.getText());
                int secondnumber=Integer.parseInt(number3.getText());
                if(secondnumber > firstnumber)
                {
                    totall=secondnumber-firstnumber;
                    String sqla1d = "UPDATE battry.storeitemlist SET number =number-(" + totall + ")   where barcode='" + itemcode3.getText() + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1d);
                pst.executeUpdate();
                }
                if(secondnumber < firstnumber)
                {
                    totall=firstnumber-secondnumber;
                    String sqla1d = "UPDATE battry.storeitemlist SET number =number+(" + totall + ")   where barcode='" + itemcode3.getText() + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1d);
                pst.executeUpdate();
                }
                String sqla1 = "UPDATE battry.sellbattryitems SET number ='" + secondnumber + "',total='" + total + "'  WHERE  id='" + serialid.getText() + "' and buyserial='" + seriall + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                pst.executeUpdate();
                tablelord();
                 float totalx = 0;
                    String sqll = "SELECT total  FROM battry.sellbattryitems where  buyserial='" + cmcode.getSelectedItem().toString() + "'";

                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                    rs = pst.executeQuery();

                    while (rs.next()) {
                        totalx = totalx + Float.parseFloat(rs.getString("total"));
                    }
                    String sqla1e = "UPDATE battry.sellbattry SET total ='" + totalx + "'   where buyserial='" + cmcode.getSelectedItem().toString() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1e);
                    pst.executeUpdate();
                    txttotal.setText(""+totalx);
                number3.setEditable(false);
                add4.setEnabled(false);
                serialid.setText("");
                itemcode3.setText("");
                itemcode3.requestFocus();
                price3.setText("");
                number3.setText("1");
            } catch (SQLException ex) {
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "ادخل رقم صحيح");
        }
    }//GEN-LAST:event_add4ActionPerformed

    private void number4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_number4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_number4ActionPerformed

    private void number4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_number4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_number4KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add4;
    private javax.swing.JLabel autoserial4;
    private javax.swing.JComboBox cmcode;
    private javax.swing.JLabel date4;
    private javax.swing.JButton delete1;
    public javax.swing.JTextField itemcode3;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField namee;
    public javax.swing.JTextField number3;
    public javax.swing.JTextField number4;
    public javax.swing.JTextField price3;
    private javax.swing.JLabel serialid;
    private javax.swing.JLabel serialid4;
    private javax.swing.JLabel txttotal;
    // End of variables declaration//GEN-END:variables

    public void clear() {
        namee.setText("");
        serialid4.setText("");
        cmcode.setSelectedIndex(0);
    }

    public void tablelord() {
        try {
            String sqll = "SELECT * FROM battry.sellbattryitems where buyserial='" + cmcode.getSelectedItem().toString() + "' order by id";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            int x = 1;
            while (rs.next()) {
                Object row[] = {
                    rs.getString("total"),
                    rs.getString("number"),
                    rs.getString("price"),
                    rs.getString("item"),
                    rs.getString("id"),
                    rs.getString("itemname"),};
                model.addRow(row);
                x++;

            }
            if (x >= 11) {
            } else {
                for (int z = x; z < 13; z++) {
                    Object rowData[] = {
                        "", "", "", "", "",};
                    model.addRow(rowData);
                }
            }
        } catch (SQLException ex) {

        }
    }

    public void serials() {
        try {
            String sql = "SELECT buyserial  FROM battry.sellbattry  order by buyserial";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String namee = rs.getString("buyserial");

                cmcode.addItem(namee);

            }

        } catch (SQLException ex) {

        }
    }
}
