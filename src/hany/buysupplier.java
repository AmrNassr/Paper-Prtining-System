/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hany;

import Store.*;
import hany.*;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class buysupplier extends javax.swing.JInternalFrame {

     
    PreparedStatement pst;
    ResultSet rs;
    public Calendar cal;
    public int day;
    public int month;
    public int year;
    String dayyy;
    public String datee;
    public String fulldatee;

    public buysupplier() throws IOException {
        try {
            initComponents();
             
            String sql = "DELETE FROM battry.storebillitems WHERE mark='No'";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            pst.execute();

            supplier();
            types();
            auto_id();

            cal = new GregorianCalendar();
            int dayy = cal.get(Calendar.DAY_OF_MONTH);
            dayyy = String.valueOf(dayy);
            if (dayy == 1 || dayy == 2 || dayy == 3 || dayy == 4
                    || dayy == 5 || dayy == 6 || dayy == 7 || dayy == 8 || dayy == 9) {
                dayyy = String.valueOf(dayy);
                dayyy = "0" + dayyy;
            }
            int month = cal.get(Calendar.MONTH) + 1;
            int year = cal.get(Calendar.YEAR);
            date1.setText(year + "-" + month + "-" + dayyy);
            datee = date1.getText().toString();
            AutoCompleteDecorator.decorate(cmkind1);
            AutoCompleteDecorator.decorate(cmsupplier);
            TimeZone tz = TimeZone.getTimeZone("GMT+02");
            Calendar c = Calendar.getInstance(tz);
            String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                    + String.format("%02d", c.get(Calendar.MINUTE));
            fulldatee = datee + " " + time;
            TableCellRenderer rendererFromHeader = tdetails.getTableHeader().getDefaultRenderer();
            JLabel headerLabel = (JLabel) rendererFromHeader;
            headerLabel.setHorizontalAlignment(JLabel.CENTER);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            tdetails.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            tdetails.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            tdetails.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            tdetails.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);

        } catch (SQLException ex) {
            Logger.getLogger(buysupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        totalbill = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tdetails = new javax.swing.JTable();
        delete = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        remaining = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cmkind = new javax.swing.JComboBox();
        total = new javax.swing.JTextField();
        serial = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        save1 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        cmkind1 = new javax.swing.JComboBox();
        cmsupplier = new javax.swing.JComboBox();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        paid = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        supplierid = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1050, 730));
        setMinimumSize(new java.awt.Dimension(1050, 730));
        setPreferredSize(new java.awt.Dimension(1050, 730));

        jPanel1.setBackground(new java.awt.Color(57, 74, 81));
        jPanel1.setMaximumSize(new java.awt.Dimension(1050, 730));
        jPanel1.setMinimumSize(new java.awt.Dimension(1050, 730));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 730));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel20.setText("اجمالي الفاتورة");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 550, 130, 40));

        totalbill.setEditable(false);
        totalbill.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalbill.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(totalbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 110, 40));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel27.setText("سعر الشراء");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, 120, 40));

        price.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 80, 40));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel19.setText("الكلي");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 60, 40));

        tdetails.setBackground(new java.awt.Color(138, 203, 195));
        tdetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "السعر", "العدد", "اسم المنتج", "ID"
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
        jScrollPane2.setViewportView(tdetails);
        if (tdetails.getColumnModel().getColumnCount() > 0) {
            tdetails.getColumnModel().getColumn(0).setMinWidth(100);
            tdetails.getColumnModel().getColumn(0).setPreferredWidth(100);
            tdetails.getColumnModel().getColumn(0).setMaxWidth(100);
            tdetails.getColumnModel().getColumn(1).setMinWidth(100);
            tdetails.getColumnModel().getColumn(1).setPreferredWidth(100);
            tdetails.getColumnModel().getColumn(1).setMaxWidth(100);
            tdetails.getColumnModel().getColumn(3).setMinWidth(1);
            tdetails.getColumnModel().getColumn(3).setPreferredWidth(1);
            tdetails.getColumnModel().getColumn(3).setMaxWidth(1);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, 650, 200));

        delete.setBackground(new java.awt.Color(138, 203, 195));
        delete.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        delete.setText("مسح العنصر");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 480, 190, 40));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel22.setText("المتبقي");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 100, 40));

        remaining.setEditable(false);
        remaining.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        remaining.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(remaining, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 550, 110, 40));

        add.setBackground(new java.awt.Color(138, 203, 195));
        add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add.setText("اضافة");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 90, 40));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel18.setText("النوع");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 90, 40));

        cmkind.setEditable(true);
        cmkind.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmkind.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
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
        jPanel1.add(cmkind, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 230, 40));

        total.setEditable(false);
        total.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 90, 40));

        serial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        serial.setText("jLabel2");
        jPanel1.add(serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 40));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel12.setText("المورد");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 90, 30));

        save1.setBackground(new java.awt.Color(138, 203, 195));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setText("مسح");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel1.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, 190, 40));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel24.setText("المنتج");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 70, 40));

        cmkind1.setEditable(true);
        cmkind1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmkind1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmkind1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmkind1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmkind1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmkind1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmkind1MouseReleased(evt);
            }
        });
        cmkind1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmkind1ActionPerformed(evt);
            }
        });
        cmkind1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmkind1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmkind1KeyReleased(evt);
            }
        });
        jPanel1.add(cmkind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 230, 40));

        cmsupplier.setEditable(true);
        cmsupplier.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmsupplier.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jPanel1.add(cmsupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 230, 40));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel23.setText("العدد");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 50, 40));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21.setText("المدفوع");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 70, 40));

        paid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        paid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidKeyReleased(evt);
            }
        });
        jPanel1.add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, 110, 40));

        number.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number.setText("1");
        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberKeyReleased(evt);
            }
        });
        jPanel1.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, 70, 40));

        save.setBackground(new java.awt.Color(138, 203, 195));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setText("حفظ");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel1.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, 190, 40));

        jLabel1.setBackground(new java.awt.Color(57, 74, 81));
        jLabel1.setForeground(new java.awt.Color(57, 74, 81));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3_1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 730));

        userid.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        userid.setText("jLabel6");
        jPanel1.add(userid, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 200, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("رقم الورشه");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, -1, -1));

        supplierid.setText("jLabel6");
        jPanel1.add(supplierid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        date1.setText("jLabel2");
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, -1, -1));

        serialid.setText("jLabel2");
        jPanel1.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            float totalk = Float.parseFloat(totalbill.getText());
            float paidk = Float.parseFloat(paid.getText());
            float remainingk = totalk - paidk;
            if (totalk >= paidk) {
                String supplierr = cmsupplier.getSelectedItem().toString();
                String seriall = serial.getText();
                String sql = "INSERT INTO battry.bill (serial,supplier,amount,paid,remaining,datee,fulldate) VALUES"
                        + " ('" + seriall + "','" + supplierr + "','" + totalk + "','" + paidk + "','" + remainingk + "','" + datee + "','" + fulldatee + "')";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                pst.execute();

                String sqldaf = "SELECT * FROM battry.storesupplieramount where supplier='" + supplierr + "' ";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaf);
                rs = pst.executeQuery();
                if (rs.next()) {
                    String sqla = "UPDATE battry.storesupplieramount SET total = total+" + remainingk + " WHERE  supplier='" + supplierr + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla);
                    pst.executeUpdate();
                    String sqll3 = "INSERT INTO battry.storesupplierlogs (supplier,type,date,fulldate,amount) VALUES"
                            + " ('" + supplierr + "','متبقي','" + datee + "','" + fulldatee + "','" + remainingk + "')";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll3);
                    pst.execute();
                    String sqll33 = "INSERT INTO battry.storesupplierlogs (supplier,type,date,fulldate,amount) VALUES"
                            + " ('" + supplierr + "','دفع','" + datee + "','" + fulldatee + "','" + paidk + "')";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll33);
                    pst.execute();

                } else {
                    String sqla = "INSERT INTO battry.storesupplieramount (supplier,total) VALUES"
                            + " ('" + supplierr + "','" + remainingk + "')";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla);
                    pst.execute();
                    String sqll3 = "INSERT INTO battry.storesupplierlogs (supplier,type,date,fulldate,amount) VALUES"
                            + " ('" + supplierr + "','متبقي','" + datee + "','" + fulldatee + "','" + remainingk + "')";
                    String sqll33 = "INSERT INTO battry.storesupplierlogs (supplier,type,date,fulldate,amount) VALUES"
                            + " ('" + supplierr + "','دفع','" + datee + "','" + fulldatee + "','" + paidk + "')";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll33);
                    pst.execute();
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll3);
                    pst.execute();
                    String sqla1 = "UPDATE battry.bill SET mark ='Yes' WHERE  serial='" + seriall + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                    pst.executeUpdate();
                    String sqla2 = "UPDATE battry.storebillitems SET mark ='Yes' WHERE  serial='" + seriall + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla2);
                    pst.executeUpdate();

                }
                String sqldaf1 = "SELECT * FROM battry.storebillitems where serial='" + seriall + "' ";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaf1);
                rs = pst.executeQuery();
                while (rs.next()) {
                    String sqll33 = "INSERT INTO battry.storeitemlogs (name,supplier,number,type,date,fulldate,price) VALUES"
                            + " ('" + rs.getString("name") + "','" + supplierr + "','" + rs.getString("number") + "','اضافة','" + datee + "','" + fulldatee + "','" + rs.getString("price") + "')";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll33);
                    pst.execute();
                    String sqla1d = "UPDATE battry.items SET number =number+" + rs.getString("number") + " WHERE  name='" + rs.getString("name") + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1d);
                    pst.executeUpdate();
                }

                JOptionPane.showMessageDialog(this, "تم تسجيل الفاتوره بنجاح");
                clear2();
                auto_id();
                tablelord();
            } else {
                JOptionPane.showMessageDialog(this, "المدفوع اكبر من الكلي");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " ادخل مبلغ صحيح");
        }

    }//GEN-LAST:event_saveActionPerformed

    private void tdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tdetailsMouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) tdetails.getModel();
        int selectrowindex = tdetails.getSelectedRow();
        serialid.setText(tmodel.getValueAt(selectrowindex, 3).toString());
    }//GEN-LAST:event_tdetailsMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if (serialid.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "من فضلك اختر العنصر ");

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العملية", "رسالة تاكيد ؟ ", dialogButton);
            if (dialogResult == 0) {
                try {
                    String sql = "DELETE FROM battry.storebillitems WHERE id='" + serialid.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    pst.execute();
                    serialid.setText("");
                    tablelord();
                } catch (SQLException ex) {

                }
            } else {

                JOptionPane.showMessageDialog(this, " الغاء");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        float amount = 0;
        if (!cmkind1.getSelectedItem().toString().trim().isEmpty() && cmkind1.getSelectedIndex()!=0 &&  !cmsupplier.getSelectedItem().toString().trim().isEmpty() && !price.getText().trim().isEmpty() && !number.getText().trim().isEmpty()) {
            try {
                

                float numberr = Float.parseFloat(number.getText());
                float pricee = Float.parseFloat(price.getText());
                float totall = numberr * pricee;
                String itemm = cmkind1.getSelectedItem().toString();
                String supplierr = cmsupplier.getSelectedItem().toString();
                String seriall = serial.getText();
                String sqldaf = "SELECT * FROM battry.storebillitems where name='" + itemm + "' and datee='" + datee + "' and serial='" + seriall + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaf);
                rs = pst.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(rootPane, "العنصر تم اضافتة من قبل");
                    cmkind1.setSelectedItem("-");
                    cmkind1.requestFocus();
                    tablelord();
                    String sqld = "SELECT total FROM battry.storebillitems where datee='" + datee + "' and serial='" + seriall + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        amount = amount + (rs.getFloat("total"));
                    }
                    totalbill.setText("" + amount);

                } else {
                    String sql = "INSERT INTO battry.storebillitems (serial,name,supplier,price,number,total,datee,fulldate) VALUES"
                            + " ('" + seriall + "','" + itemm + "','" + supplierr + "','" + pricee + "','" + numberr + "','" + totall + "','" + datee + "','" + fulldatee + "')";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    pst.execute();
                    tablelord();
                    clear();
                    cmsupplier.setEnabled(false);
                    String sqld = "SELECT total FROM battry.storebillitems where datee='" + datee + "' and serial='" + seriall + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        amount = amount + (rs.getFloat("total"));
                    }
                    totalbill.setText("" + amount);

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex);

            }
        } else {
            if(cmkind1.getSelectedItem().toString().trim().isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "المنتج غير موجود");
            }
            else
            JOptionPane.showMessageDialog(rootPane, "اكمل البيانات");
        }
    }//GEN-LAST:event_addActionPerformed

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
        try {
            float numberr = Float.parseFloat(number.getText());
            float pricee = Float.parseFloat(price.getText());
            float totall = numberr * pricee;
            total.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_priceKeyReleased

    private void numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyReleased
        try {
            float numberr = Float.parseFloat(number.getText());
            float pricee = Float.parseFloat(price.getText());
            float totall = numberr * pricee;
            total.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_numberKeyReleased

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save1ActionPerformed

    private void paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyReleased
        try {
            float amount = Float.parseFloat(totalbill.getText());
            float paidd = Float.parseFloat(paid.getText());
            float totall = amount - paidd;
            remaining.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_paidKeyReleased

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
        Object obj = evt.getSource();
        if(obj==cmkind)
        {
            try {
                String sqll="SELECT *  FROM battry.items ";

                pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs=pst.executeQuery();

                while(rs.next()){

                    String name = rs.getString("name");

                    cmkind1.removeItem(name);

                }
            } catch (SQLException ex) {
            }
            try {
                String sqll="SELECT name  FROM battry.items where  type='"+cmkind.getSelectedItem().toString()+"'";

                pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs=pst.executeQuery();

                while(rs.next()){

                    String name = rs.getString("name");
                    cmkind1.addItem(name);

                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_cmkindActionPerformed

    private void cmkindKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmkindKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkindKeyPressed

    private void cmkindKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmkindKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkindKeyReleased

    private void cmkind1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkind1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind1MouseClicked

    private void cmkind1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkind1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind1MouseEntered

    private void cmkind1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkind1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind1MousePressed

    private void cmkind1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkind1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind1MouseReleased

    private void cmkind1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmkind1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind1ActionPerformed

    private void cmkind1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmkind1KeyPressed
        
    }//GEN-LAST:event_cmkind1KeyPressed

    private void cmkind1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmkind1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JComboBox cmkind;
    private javax.swing.JComboBox cmkind1;
    private javax.swing.JComboBox cmsupplier;
    private javax.swing.JLabel date1;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField number;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField price;
    private javax.swing.JTextField remaining;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JLabel serial;
    private javax.swing.JLabel serialid;
    private javax.swing.JLabel supplierid;
    private javax.swing.JTable tdetails;
    private javax.swing.JTextField total;
    private javax.swing.JTextField totalbill;
    private javax.swing.JLabel userid;
    // End of variables declaration//GEN-END:variables

    public void tablelord() {
        try {
            String sqll = "SELECT * FROM battry.storebillitems where serial='" + serial.getText() + "' AND datee='" + datee + "' order by id";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) tdetails.getModel();
            model.setRowCount(0);
            int x = 1;
            while (rs.next()) {
                Object row[] = {
                    
                    rs.getString("price"),
                    rs.getString("number"),
                    rs.getString("name"),
                    rs.getString("id"),};
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
        price.setText("");
        number.setText("");
        total.setText("0");
        cmkind1.setSelectedIndex(0);
    }

    public void clear2() {
        price.setText("");
        number.setText("1");
        total.setText("0");
        cmkind1.setSelectedIndex(0);
        cmsupplier.setSelectedIndex(0);
        cmsupplier.setEnabled(true);
        paid.setText("");
        remaining.setText("");
        totalbill.setText("");
        tablelord();
    }

    public void supplier() {
        try {
            String sql = "SELECT name  FROM battry.storesupplier order by name ";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");

                cmsupplier.addItem(name);

            }

        } catch (SQLException ex) {

        }
    }

    public void types() {
        try {
            String sql = "SELECT * FROM battry.itemtype where type='عدد'";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");

                cmkind.addItem(name);

            }

        } catch (SQLException ex) {

        }
    }

    public void auto_id() {

        try {
            String sqll = "SELECT serial FROM battry.bill where id=(select max(id)FROm battry.bill )";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs = pst.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("serial");
                int co = rnno.length();
                String txt = rnno.substring(0, 3);
                String num = rnno.substring(3, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                serial.setText(ftxt);
            } else {
                serial.setText("IN-1001");
            }
        } catch (SQLException ex) {

        }

    }

}
