/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hany;

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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author amnassar
 */
public final class addtypes extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
     
    PreparedStatement pst;
    ResultSet rs;
    public String y;
    int day;
    int month;
    int year;

    public addtypes() {
        initComponents();
         
        tablelord();
        clear();
        TableCellRenderer rendererFromHeader = tdetails.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tdetails.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tdetails.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tdetails.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tdetails.getTableHeader().setFont(new Font("Arial", Font.BOLD, 20));
        tdetails.getTableHeader().setOpaque(false);
        tdetails.getTableHeader().setBackground(new Color(138, 203, 195));
        tdetails.getTableHeader().setForeground(new Color(0, 0, 0));
        tdetails.setRowHeight(40);
        Calendar cal = new GregorianCalendar();
        day = cal.get(Calendar.DAY_OF_MONTH);
        month = cal.get(Calendar.MONTH) + 1;
        year = cal.get(Calendar.YEAR);
        lname1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        Font bigFont = new Font("Arial", Font.BOLD, 30); // or whatever
        tdetails.getTableHeader().setFont(bigFont);
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
        jScrollPane5 = new javax.swing.JScrollPane();
        tdetails = new javax.swing.JTable();
        autoserial4 = new javax.swing.JLabel();
        cmkind = new javax.swing.JComboBox();
        jLabel37 = new javax.swing.JLabel();
        delete4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        lname1 = new javax.swing.JTextField();
        save4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        serialid4 = new javax.swing.JLabel();
        date4 = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/71847608-close-up-of-handshake-on-city-background-with-abstract-sunlight-partnership-concept-double-exposure.jpg"))); // NOI18N

        setMaximumSize(new java.awt.Dimension(1050, 730));
        setMinimumSize(new java.awt.Dimension(1050, 730));
        setPreferredSize(new java.awt.Dimension(1050, 730));

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.setMaximumSize(new java.awt.Dimension(1050, 730));
        jPanel14.setMinimumSize(new java.awt.Dimension(1050, 730));
        jPanel14.setPreferredSize(new java.awt.Dimension(1050, 730));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tdetails.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Serial", "نوع", "الاسم"
            }
        ));
        tdetails.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tdetails.setRowHeight(25);
        tdetails.setRowMargin(2);
        tdetails.setSelectionBackground(new java.awt.Color(204, 255, 255));
        tdetails.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tdetailsMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tdetails);
        if (tdetails.getColumnModel().getColumnCount() > 0) {
            tdetails.getColumnModel().getColumn(0).setMinWidth(1);
            tdetails.getColumnModel().getColumn(0).setPreferredWidth(1);
            tdetails.getColumnModel().getColumn(0).setMaxWidth(1);
        }

        jPanel14.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 510, 330));

        autoserial4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        autoserial4.setForeground(new java.awt.Color(255, 255, 255));
        autoserial4.setText("لإثسف");
        jPanel14.add(autoserial4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 170, 60));

        cmkind.setEditable(true);
        cmkind.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmkind.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "مقاس", "عدد" }));
        cmkind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmkindMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmkindMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmkindMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmkindMouseReleased(evt);
            }
        });
        cmkind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmkindActionPerformed(evt);
            }
        });
        cmkind.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmkindKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmkindKeyReleased(evt);
            }
        });
        jPanel14.add(cmkind, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 100, 30));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel37.setText("نوع");
        jPanel14.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 70, 40));

        delete4.setBackground(new java.awt.Color(138, 203, 195));
        delete4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        delete4.setText("مسح");
        delete4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete4ActionPerformed(evt);
            }
        });
        jPanel14.add(delete4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 610, 120, 40));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel15.setText("نوع المنتج");
        jPanel14.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 50, 140, 40));

        lname1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel14.add(lname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 230, 40));

        save4.setBackground(new java.awt.Color(138, 203, 195));
        save4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save4.setText("حفظ");
        save4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save4ActionPerformed(evt);
            }
        });
        jPanel14.add(save4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 120, 40));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 730));

        serialid4.setText("jLabel1");
        jPanel14.add(serialid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        date4.setText("jLabel1");
        jPanel14.add(date4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1050, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) tdetails.getModel();
        int selectrowindex = tdetails.getSelectedRow();
        serialid4.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        lname1.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        cmkind.setSelectedItem(tmodel.getValueAt(selectrowindex, 1).toString());
    }//GEN-LAST:event_tdetailsMouseClicked

    private void delete4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete4ActionPerformed
        if (serialid4.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "اختر النوع المراد مسحة");

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "حفظ العملية ؟", "رسالة تاكيد ", dialogButton);
            if (dialogResult == 0) {
                try {
                    String sql = "DELETE FROM battry.itemtype WHERE id='" + serialid4.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(rootPane, " تم مسح النوع بنجاح");
                    tablelord();
                    clear();
                } catch (SQLException ex) {

                }
                clear();
            } else {

                JOptionPane.showMessageDialog(this, "الغاء العملية ");
            }
        }
    }//GEN-LAST:event_delete4ActionPerformed

    private void save4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save4ActionPerformed
        try {
            String namee = lname1.getText();
             String type = cmkind.getSelectedItem().toString();
            if (serialid4.getText().trim().isEmpty()) {

                if (lname1.getText().trim().isEmpty()) {
                    JOptionPane.showMessageDialog(this, " من فضلك ادخل اسم النوع ");
                } else {
                    int dialogButton = JOptionPane.YES_NO_OPTION;
                    int dialogResult = JOptionPane.showConfirmDialog(this, "حفظ العملية ؟", "رسالة تاكيد ", dialogButton);
                    if (dialogResult == 0) {
                        try {
                            String sql = "INSERT INTO battry.itemtype (name,type) VALUES"
                                    + " ('" + namee + "','"+type+"')";
                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                            pst.execute();
                            JOptionPane.showMessageDialog(null, "تم اضافة النوع بنجاح");
                            tablelord();
                            clear();
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, "النوع مضاف من قبل");
                        }

                    } else {
                        JOptionPane.showMessageDialog(this, "الغاء العملية");

                    }
                }
            } else {
                String sqla = "UPDATE battry.itemtype SET name='" + namee + "',type='"+type+"' where id = '" + serialid4.getText() + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "تم التعديل علي اسم النوع");
                tablelord();
                clear();
                lname1.requestFocus();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " -- ");
        }
    }//GEN-LAST:event_save4ActionPerformed

    private void cmkindMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkindMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkindMouseClicked

    private void cmkindMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkindMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkindMouseEntered

    private void cmkindMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkindMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkindMousePressed

    private void cmkindMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkindMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkindMouseReleased

    private void cmkindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmkindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkindActionPerformed

    private void cmkindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmkindKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkindKeyPressed

    private void cmkindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmkindKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkindKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel autoserial4;
    private javax.swing.JComboBox cmkind;
    private javax.swing.JLabel date4;
    private javax.swing.JButton delete4;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField lname1;
    private javax.swing.JButton save4;
    private javax.swing.JLabel serialid4;
    private javax.swing.JTable tdetails;
    // End of variables declaration//GEN-END:variables

    public void tablelord() {
        try {
            String sqll = "SELECT * FROM battry.itemtype";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tdetails.getModel();
            model.setRowCount(0);
            int x = 1;
            while (rs.next()) {
                Object row[] = {
                    rs.getString("id"),
                    rs.getString("type"),
                    rs.getString("name"),};
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

    public void clear() {
        lname1.setText("");
        lname1.requestFocus();
        serialid4.setText("");
    }

}