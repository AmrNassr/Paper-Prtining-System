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
import java.io.InputStream;
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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author amnassar
 */
public final class buyitems extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
     
    PreparedStatement pst;
    ResultSet rs;
    public String y;
    String dayyy;

    public buyitems() {
        try {
            initComponents();
             
            String sql = "DELETE FROM battry.sellbattryitems WHERE mark='No'";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            pst.execute();
            TableCellRenderer rendererFromHeader = jTable1.getTableHeader().getDefaultRenderer();
            JLabel headerLabel = (JLabel) rendererFromHeader;
            headerLabel.setHorizontalAlignment(JLabel.CENTER);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);
            jTable1.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
            jTable1.getTableHeader().setFont(new Font("Arial", Font.BOLD, 20));
            jTable1.getTableHeader().setOpaque(false);
            jTable1.getTableHeader().setBackground(new Color(138, 203, 195));
            jTable1.getTableHeader().setForeground(new Color(0, 0, 0));
            jTable1.setRowHeight(30);
            TableCellRenderer rendererFromHeader1 = jTable2.getTableHeader().getDefaultRenderer();
            JLabel headerLabel1 = (JLabel) rendererFromHeader1;
            headerLabel1.setHorizontalAlignment(JLabel.CENTER);
            DefaultTableCellRenderer centerRenderer1 = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer1);
            jTable2.getColumnModel().getColumn(1).setCellRenderer(centerRenderer1);
            jTable2.getColumnModel().getColumn(2).setCellRenderer(centerRenderer1);
            jTable2.getColumnModel().getColumn(3).setCellRenderer(centerRenderer1);
            jTable2.getColumnModel().getColumn(4).setCellRenderer(centerRenderer1);
            jTable2.getColumnModel().getColumn(5).setCellRenderer(centerRenderer1);
            jTable2.getTableHeader().setFont(new Font("Arial", Font.BOLD, 20));
            jTable2.getTableHeader().setOpaque(false);
            jTable2.getTableHeader().setBackground(new Color(138, 203, 195));
            jTable2.getTableHeader().setForeground(new Color(0, 0, 0));
            jTable2.setRowHeight(30);
            Calendar cal = new GregorianCalendar();
            int monthh = cal.get(Calendar.MONTH) + 1;
            int yearr = cal.get(Calendar.YEAR);
            int dayy = cal.get(Calendar.DAY_OF_MONTH);
            dayyy = String.valueOf(dayy);
            if (dayy == 1 || dayy == 2 || dayy == 3 || dayy == 4
                    || dayy == 5 || dayy == 6 || dayy == 7 || dayy == 8 || dayy == 9) {
                dayyy = String.valueOf(dayy);
                dayyy = "0" + dayyy;
            }
            day.setText(dayyy);
            month.setText(Integer.toString(monthh));
            year.setText(Integer.toString(yearr));
            day1.setText(dayyy);
            month1.setText(Integer.toString(monthh));
            year1.setText(Integer.toString(yearr));
            auto_id();
            customer();
            clear();
            mkas();
            adad();
        } catch (SQLException ex) {
            Logger.getLogger(buyitems.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        kindd = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        totalbill = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        paid = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        remaining = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        cmkind = new javax.swing.JComboBox();
        jLabel52 = new javax.swing.JLabel();
        number2 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel38 = new javax.swing.JLabel();
        cmkind1 = new javax.swing.JComboBox();
        cmtype1 = new javax.swing.JComboBox();
        price2 = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        total1 = new javax.swing.JTextField();
        add1 = new javax.swing.JButton();
        save = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        total = new javax.swing.JTextField();
        cmtype = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        width = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        height = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        khsm = new javax.swing.JTextField();
        day = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cmcustomer = new javax.swing.JComboBox();
        s3 = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        s4 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        serialbuy = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        serialid4 = new javax.swing.JLabel();
        date4 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();
        customerserial = new javax.swing.JLabel();
        kind1 = new javax.swing.JLabel();
        type1 = new javax.swing.JLabel();
        typecustomer = new javax.swing.JLabel();
        numberr1 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        totalbill1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        paid1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        remaining1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        price1 = new javax.swing.JTextField();
        cmkind2 = new javax.swing.JComboBox();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        phone = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        cmkind3 = new javax.swing.JComboBox();
        cmtype2 = new javax.swing.JComboBox();
        price3 = new javax.swing.JTextField();
        number1 = new javax.swing.JTextField();
        total2 = new javax.swing.JTextField();
        add2 = new javax.swing.JButton();
        save2 = new javax.swing.JButton();
        save3 = new javax.swing.JButton();
        total3 = new javax.swing.JTextField();
        cmtype3 = new javax.swing.JComboBox();
        jLabel43 = new javax.swing.JLabel();
        width1 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        add3 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        number3 = new javax.swing.JTextField();
        height1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        delete1 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        day1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        s5 = new javax.swing.JLabel();
        month1 = new javax.swing.JTextField();
        s6 = new javax.swing.JLabel();
        year1 = new javax.swing.JTextField();
        serialbuy1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        serialid5 = new javax.swing.JLabel();
        date5 = new javax.swing.JLabel();
        serialid1 = new javax.swing.JLabel();
        customerserial1 = new javax.swing.JLabel();
        typecustomer1 = new javax.swing.JLabel();
        kind2 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        numberr2 = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/71847608-close-up-of-handshake-on-city-background-with-abstract-sunlight-partnership-concept-double-exposure.jpg"))); // NOI18N

        jLabel1.setText("jLabel1");

        setMaximumSize(new java.awt.Dimension(1050, 730));
        setMinimumSize(new java.awt.Dimension(1050, 730));
        setPreferredSize(new java.awt.Dimension(1050, 730));

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel15.setMaximumSize(new java.awt.Dimension(1050, 730));
        jPanel15.setMinimumSize(new java.awt.Dimension(1050, 730));
        jPanel15.setPreferredSize(new java.awt.Dimension(1050, 730));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kindd.setEditable(false);
        kindd.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        kindd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel15.add(kindd, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 70, 30));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel28.setText("السعر");
        jPanel15.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, 60, 30));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel20.setText("اجمالي الفاتورة");
        jPanel15.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 520, 130, 30));

        totalbill.setEditable(false);
        totalbill.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalbill.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel15.add(totalbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 110, 30));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel24.setText("المدفوع");
        jPanel15.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, 70, 30));

        paid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        paid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidKeyReleased(evt);
            }
        });
        jPanel15.add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 110, 30));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel31.setText("المتبقي");
        jPanel15.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 100, 30));

        remaining.setEditable(false);
        remaining.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        remaining.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel15.add(remaining, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 110, 30));

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel29.setText("السعر");
        jPanel15.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 60, 30));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel30.setText("العدد");
        jPanel15.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 70, 30));

        price.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                priceKeyReleased(evt);
            }
        });
        jPanel15.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 70, 30));

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
        jPanel15.add(cmkind, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 160, 110, 30));

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel52.setText("العدد");
        jPanel15.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 70, 30));

        number2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        number2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number2.setText("1");
        number2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                number2KeyReleased(evt);
            }
        });
        jPanel15.add(number2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 60, 30));

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel37.setText("نوع");
        jPanel15.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 70, 40));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "المجموع", "العدد", "السعر", "المقاس", "النوع", "المنتج", "ID"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setRowHeight(25);
        jTable1.setRowMargin(2);
        jTable1.setSelectionBackground(new java.awt.Color(204, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(6).setMinWidth(1);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(6).setMaxWidth(1);
        }

        jPanel15.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 800, 180));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel38.setText("نوع");
        jPanel15.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 240, 70, 40));

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
        jPanel15.add(cmkind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 110, 30));

        cmtype1.setEditable(true);
        cmtype1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmtype1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmtype1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmtype1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmtype1MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmtype1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmtype1MouseReleased(evt);
            }
        });
        cmtype1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmtype1ActionPerformed(evt);
            }
        });
        cmtype1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmtype1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmtype1KeyReleased(evt);
            }
        });
        jPanel15.add(cmtype1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 110, 30));

        price2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        price2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                price2KeyReleased(evt);
            }
        });
        jPanel15.add(price2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 70, 30));

        number.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number.setText("1");
        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberKeyReleased(evt);
            }
        });
        jPanel15.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 60, 30));

        total1.setEditable(false);
        total1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        total1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel15.add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 130, 30));

        add1.setBackground(new java.awt.Color(138, 203, 195));
        add1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add1.setText("اضافة");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });
        jPanel15.add(add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 70, 30));

        save.setBackground(new java.awt.Color(138, 203, 195));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setText("حفظ");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel15.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 580, 110, 40));

        save1.setBackground(new java.awt.Color(138, 203, 195));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setText("مسح");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel15.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 110, 40));

        total.setEditable(false);
        total.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel15.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 130, 30));

        cmtype.setEditable(true);
        cmtype.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmtype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmtypeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmtypeMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmtypeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmtypeMouseReleased(evt);
            }
        });
        cmtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmtypeActionPerformed(evt);
            }
        });
        cmtype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmtypeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmtypeKeyReleased(evt);
            }
        });
        jPanel15.add(cmtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, 110, 30));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("=");
        jPanel15.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 40, 30));

        width.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        width.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        width.setText("1");
        width.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthActionPerformed(evt);
            }
        });
        width.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                widthKeyReleased(evt);
            }
        });
        jPanel15.add(width, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 60, 30));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("=");
        jPanel15.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 40, 30));

        add.setBackground(new java.awt.Color(138, 203, 195));
        add.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add.setText("اضافة");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel15.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 70, 30));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("*");
        jPanel15.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 40, 50));

        height.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        height.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        height.setText("1");
        height.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightActionPerformed(evt);
            }
        });
        height.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                heightKeyReleased(evt);
            }
        });
        jPanel15.add(height, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 60, 30));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel23.setText("عرض");
        jPanel15.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 60, 30));

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel25.setText("طول");
        jPanel15.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 70, 30));

        delete.setBackground(new java.awt.Color(138, 203, 195));
        delete.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        delete.setText("مسح العنصر");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel15.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 120, 60));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21.setText("تاريخ");
        jPanel15.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 50, 30));

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel51.setText("خصم");
        jPanel15.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 520, 70, 30));

        khsm.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        khsm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        khsm.setText("0");
        khsm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                khsmKeyReleased(evt);
            }
        });
        jPanel15.add(khsm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 110, 30));

        day.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel15.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 60, 30));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel22.setText("اسم العميل");
        jPanel15.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 140, 30));

        cmcustomer.setEditable(true);
        cmcustomer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmcustomer.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmcustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmcustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmcustomerMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmcustomerMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmcustomerMouseReleased(evt);
            }
        });
        cmcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmcustomerActionPerformed(evt);
            }
        });
        cmcustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmcustomerKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmcustomerKeyReleased(evt);
            }
        });
        jPanel15.add(cmcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 240, 30));

        s3.setBackground(new java.awt.Color(255, 255, 255));
        s3.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        s3.setText("/");
        jPanel15.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 10, -1));

        month.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel15.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 60, 30));

        s4.setBackground(new java.awt.Color(255, 255, 255));
        s4.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        s4.setText("/");
        jPanel15.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 10, -1));

        year.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel15.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 60, 30));

        serialbuy.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        serialbuy.setText("لإثسف");
        jPanel15.add(serialbuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 50));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel15.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 730));

        serialid4.setText("jLabel1");
        jPanel15.add(serialid4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        date4.setText("jLabel1");
        jPanel15.add(date4, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, -1));

        serialid.setBackground(new java.awt.Color(255, 255, 255));
        serialid.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        serialid.setText("اسم العميل");
        jPanel15.add(serialid, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 140, 30));

        customerserial.setBackground(new java.awt.Color(255, 255, 255));
        customerserial.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        customerserial.setText("طول");
        jPanel15.add(customerserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 70, 30));

        kind1.setText("jLabel2");
        jPanel15.add(kind1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 580, -1, -1));

        type1.setText("jLabel3");
        jPanel15.add(type1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, -1, -1));

        typecustomer.setBackground(new java.awt.Color(255, 255, 255));
        typecustomer.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        typecustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel15.add(typecustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 90, 30));

        numberr1.setText("jLabel2");
        jPanel15.add(numberr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 640, -1, -1));

        jTabbedPane1.addTab("خطاط - استوديو", jPanel15);

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel16.setMaximumSize(new java.awt.Dimension(1050, 730));
        jPanel16.setMinimumSize(new java.awt.Dimension(1050, 730));
        jPanel16.setPreferredSize(new java.awt.Dimension(1050, 730));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel33.setText("السعر");
        jPanel16.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 60, 30));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel34.setText("اجمالي الفاتورة");
        jPanel16.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 530, 130, 30));

        totalbill1.setEditable(false);
        totalbill1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalbill1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel16.add(totalbill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 110, 30));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel35.setText("المدفوع");
        jPanel16.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 530, 70, 30));

        paid1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        paid1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paid1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paid1KeyReleased(evt);
            }
        });
        jPanel16.add(paid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 530, 110, 30));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel36.setText("المتبقي");
        jPanel16.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 530, 100, 30));

        remaining1.setEditable(false);
        remaining1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        remaining1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel16.add(remaining1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 110, 30));

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel39.setText("السعر");
        jPanel16.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 210, 60, 30));

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel40.setText("العدد");
        jPanel16.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 70, 30));

        price1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        price1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                price1KeyReleased(evt);
            }
        });
        jPanel16.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 70, 30));

        cmkind2.setEditable(true);
        cmkind2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmkind2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmkind2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmkind2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmkind2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmkind2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmkind2MouseReleased(evt);
            }
        });
        cmkind2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmkind2ActionPerformed(evt);
            }
        });
        cmkind2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmkind2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmkind2KeyReleased(evt);
            }
        });
        jPanel16.add(cmkind2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 110, 30));

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel41.setText("نوع");
        jPanel16.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, 70, 40));

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "المجموع", "العدد", "السعر", "المقاس", "النوع", "المنتج", "ID"
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
            jTable2.getColumnModel().getColumn(6).setMinWidth(1);
            jTable2.getColumnModel().getColumn(6).setPreferredWidth(1);
            jTable2.getColumnModel().getColumn(6).setMaxWidth(1);
        }

        jPanel16.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 800, 200));

        phone.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        phone.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phoneKeyReleased(evt);
            }
        });
        jPanel16.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 180, 30));

        name.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        jPanel16.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 180, 30));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel42.setText("نوع");
        jPanel16.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 240, 70, 40));

        cmkind3.setEditable(true);
        cmkind3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmkind3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmkind3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmkind3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmkind3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmkind3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmkind3MouseReleased(evt);
            }
        });
        cmkind3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmkind3ActionPerformed(evt);
            }
        });
        cmkind3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmkind3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmkind3KeyReleased(evt);
            }
        });
        jPanel16.add(cmkind3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, 110, 30));

        cmtype2.setEditable(true);
        cmtype2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmtype2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmtype2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmtype2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmtype2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmtype2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmtype2MouseReleased(evt);
            }
        });
        cmtype2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmtype2ActionPerformed(evt);
            }
        });
        cmtype2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmtype2KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmtype2KeyReleased(evt);
            }
        });
        jPanel16.add(cmtype2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 110, 30));

        price3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        price3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                price3KeyReleased(evt);
            }
        });
        jPanel16.add(price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 250, 70, 30));

        number1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        number1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number1.setText("1");
        number1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                number1KeyReleased(evt);
            }
        });
        jPanel16.add(number1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 60, 30));

        total2.setEditable(false);
        total2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        total2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel16.add(total2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, 100, 30));

        add2.setBackground(new java.awt.Color(138, 203, 195));
        add2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add2.setText("اضافة");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });
        jPanel16.add(add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 70, 30));

        save2.setBackground(new java.awt.Color(138, 203, 195));
        save2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save2.setText("حفظ");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        jPanel16.add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 110, 40));

        save3.setBackground(new java.awt.Color(138, 203, 195));
        save3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save3.setText("مسح");
        save3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save3ActionPerformed(evt);
            }
        });
        jPanel16.add(save3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 580, 110, 40));

        total3.setEditable(false);
        total3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        total3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel16.add(total3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 100, 30));

        cmtype3.setEditable(true);
        cmtype3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cmtype3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cmtype3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmtype3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmtype3MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmtype3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmtype3MouseReleased(evt);
            }
        });
        cmtype3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmtype3ActionPerformed(evt);
            }
        });
        cmtype3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cmtype3KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cmtype3KeyReleased(evt);
            }
        });
        jPanel16.add(cmtype3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 110, 30));

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("=");
        jPanel16.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 40, 30));

        width1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        width1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        width1.setText("1");
        width1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                width1ActionPerformed(evt);
            }
        });
        width1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                width1KeyReleased(evt);
            }
        });
        jPanel16.add(width1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 60, 30));

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel50.setText("رقم الهاتف");
        jPanel16.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 140, 30));

        jLabel44.setBackground(new java.awt.Color(255, 255, 255));
        jLabel44.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("=");
        jPanel16.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 40, 30));

        add3.setBackground(new java.awt.Color(138, 203, 195));
        add3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add3.setText("اضافة");
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });
        jPanel16.add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 70, 30));

        jLabel45.setBackground(new java.awt.Color(255, 255, 255));
        jLabel45.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("*");
        jPanel16.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 40, 50));

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel53.setText("العدد");
        jPanel16.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 70, 30));

        number3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        number3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number3.setText("1");
        number3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                number3KeyReleased(evt);
            }
        });
        jPanel16.add(number3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 60, 30));

        height1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        height1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        height1.setText("1");
        height1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                height1ActionPerformed(evt);
            }
        });
        height1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                height1KeyReleased(evt);
            }
        });
        jPanel16.add(height1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 60, 30));

        jLabel46.setBackground(new java.awt.Color(255, 255, 255));
        jLabel46.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel46.setText("عرض");
        jPanel16.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 60, 30));

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel47.setText("طول");
        jPanel16.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 70, 30));

        delete1.setBackground(new java.awt.Color(138, 203, 195));
        delete1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        delete1.setText("مسح العنصر");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel16.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 120, 60));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel48.setText("تاريخ");
        jPanel16.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 50, 30));

        day1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel16.add(day1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 60, 30));

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel49.setText("اسم العميل");
        jPanel16.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 60, 140, 30));

        s5.setBackground(new java.awt.Color(255, 255, 255));
        s5.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        s5.setText("/");
        jPanel16.add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 10, -1));

        month1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel16.add(month1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 60, 30));

        s6.setBackground(new java.awt.Color(255, 255, 255));
        s6.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        s6.setText("/");
        jPanel16.add(s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 10, -1));

        year1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel16.add(year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, 30));

        serialbuy1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        serialbuy1.setText("لإثسف");
        jPanel16.add(serialbuy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 50));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel16.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 730));

        serialid5.setText("jLabel1");
        jPanel16.add(serialid5, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 650, -1, -1));

        date5.setText("jLabel1");
        jPanel16.add(date5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 170, -1, -1));

        serialid1.setBackground(new java.awt.Color(255, 255, 255));
        serialid1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        serialid1.setText("اسم العميل");
        jPanel16.add(serialid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 140, 30));

        customerserial1.setBackground(new java.awt.Color(255, 255, 255));
        customerserial1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        customerserial1.setText("طول");
        jPanel16.add(customerserial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 70, 30));

        typecustomer1.setBackground(new java.awt.Color(255, 255, 255));
        typecustomer1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        typecustomer1.setText("نوع");
        jPanel16.add(typecustomer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 70, 40));

        kind2.setText("jLabel2");
        jPanel16.add(kind2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 610, -1, -1));

        type2.setText("jLabel3");
        jPanel16.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 590, -1, -1));

        numberr2.setText("jLabel2");
        jPanel16.add(numberr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 610, -1, -1));

        jTabbedPane1.addTab("عميل عادي", jPanel16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1055, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 758, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmcustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmcustomerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmcustomerMouseClicked

    private void cmcustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmcustomerMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cmcustomerMouseEntered

    private void cmcustomerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmcustomerMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmcustomerMousePressed

    private void cmcustomerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmcustomerMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmcustomerMouseReleased

    private void cmcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmcustomerActionPerformed
        Object obj = evt.getSource();
        if (obj == cmcustomer) {
            try {
                String sqll = "SELECT *  FROM battry.customer where name = '" + cmcustomer.getSelectedItem().toString() + "'";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                while (rs.next()) {
                    customerserial.setText(rs.getString("serial"));
                    typecustomer.setText(rs.getString("type"));
                    kindd.setText(rs.getString("kind"));
                    if(rs.getString("kind").equals("بلوك"))
                    {
                        kindd.setBackground(Color.RED);
                    }
                   else if(rs.getString("kind").equals("مميز"))
                    {
                        kindd.setBackground(Color.GREEN);
                    }
                    else
                   {
                       kindd.setBackground(Color.WHITE);
                   }
                }
            } catch (Exception ex) {
            }
            String typecustomerrr = null;

            String z = typecustomer.getText();
            if (z.equals("خطاط")) {
                typecustomerrr = "khtatprice";
            }
            if (z.equals("استوديو")) {
                typecustomerrr = "studioprice";
            }
            try {
                String sqll = "SELECT " + typecustomerrr + "  FROM battry.items  where name='" + cmtype.getSelectedItem().toString() + "' and type='" + cmkind.getSelectedItem().toString() + "' ";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                if (rs.next()) {
                    price.setText(rs.getString(typecustomerrr));
                }
            } catch (Exception ex) {
            }
            try {
                float pricee = Float.parseFloat(price.getText());
                float widthh = Float.parseFloat(width.getText());
                float heightt = Float.parseFloat(height.getText());
                float totall = heightt * widthh * pricee;
                total.setText("" + totall);
            } catch (Exception e) {
            }
            String typecustomerrr1 = null;

            String zz = typecustomer.getText();
            if (zz.equals("خطاط")) {
                typecustomerrr1 = "khtatprice";
            }
            if (zz.equals("استوديو")) {
                typecustomerrr1 = "studioprice";
            }
            try {
                String sqll = "SELECT " + typecustomerrr1 + "  FROM battry.items  where name='" + cmtype1.getSelectedItem().toString() + "' and type='" + cmkind1.getSelectedItem().toString() + "' ";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                if (rs.next()) {
                    price2.setText(rs.getString(typecustomerrr1));
                }
            } catch (Exception ex) {
            }
            try {
                float pricee1 = Float.parseFloat(price2.getText());
                float numberr = Float.parseFloat(number.getText());
                float totall = pricee1 * numberr;
                total1.setText("" + totall);
            } catch (Exception e) {

            }

        }
    }//GEN-LAST:event_cmcustomerActionPerformed

    private void cmcustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmcustomerKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmcustomerKeyPressed

    private void cmcustomerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmcustomerKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmcustomerKeyReleased

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
        if (obj == cmkind) {
            try {
                String sqll = "SELECT name  FROM battry.items ";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                while (rs.next()) {

                    String name = rs.getString("name");

                    cmtype.removeItem(name);

                }
            } catch (SQLException ex) {
            }
            try {
                String sqll = "SELECT name  FROM battry.items where  type='" + cmkind.getSelectedItem().toString() + "'";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                while (rs.next()) {

                    String name = rs.getString("name");
                    cmtype.addItem(name);

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

    private void cmtypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtypeMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtypeMouseClicked

    private void cmtypeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtypeMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtypeMouseEntered

    private void cmtypeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtypeMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtypeMousePressed

    private void cmtypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtypeMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtypeMouseReleased

    private void cmtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmtypeActionPerformed
        String typecustomerrr = null;
        Object obj = evt.getSource();
        if (obj == cmtype) {
            String z = typecustomer.getText();
            if (z.equals("خطاط")) {
                typecustomerrr = "khtatprice";
            }
            if (z.equals("استوديو")) {
                typecustomerrr = "studioprice";
            }
            try {
                String sqll = "SELECT " + typecustomerrr + "  FROM battry.items  where name='" + cmtype.getSelectedItem().toString() + "' and type='" + cmkind.getSelectedItem().toString() + "' ";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                if (rs.next()) {
                    price.setText(rs.getString(typecustomerrr));
                }
            } catch (Exception ex) {
            }
            try {
                float pricee = Float.parseFloat(price.getText());
                float widthh = Float.parseFloat(width.getText());
                float heightt = Float.parseFloat(height.getText());
                float totall = heightt * widthh * pricee;
                total.setText("" + totall);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_cmtypeActionPerformed

    private void cmtypeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmtypeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtypeKeyPressed

    private void cmtypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmtypeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtypeKeyReleased

    private void widthKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_widthKeyReleased
        try {
            float pricee = Float.parseFloat(price.getText());
            float numberr = Float.parseFloat(number2.getText());
            float widthh = Float.parseFloat(width.getText());
            float heightt = Float.parseFloat(height.getText());
            float totall = heightt * widthh * pricee*numberr;
            total.setText("" + totall);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_widthKeyReleased

    private void heightKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heightKeyReleased
       try {
            float pricee = Float.parseFloat(price.getText());
            float numberr = Float.parseFloat(number2.getText());
            float widthh = Float.parseFloat(width.getText());
            float heightt = Float.parseFloat(height.getText());
            float totall = heightt * widthh * pricee*numberr;
            total.setText("" + totall);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_heightKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) jTable1.getModel();
        int selectrowindex = jTable1.getSelectedRow();
        serialid.setText(tmodel.getValueAt(selectrowindex, 6).toString());
        type1.setText(tmodel.getValueAt(selectrowindex, 5).toString());
        kind1.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        numberr1.setText(tmodel.getValueAt(selectrowindex, 1).toString());
    }//GEN-LAST:event_jTable1MouseClicked

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
        Object obj = evt.getSource();
        if (obj == cmkind1) {
            try {
                String sqll = "SELECT name  FROM battry.items ";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                while (rs.next()) {

                    String name = rs.getString("name");

                    cmtype1.removeItem(name);

                }
            } catch (SQLException ex) {
            }
            try {
                String sqll = "SELECT name  FROM battry.items where  type='" + cmkind1.getSelectedItem().toString() + "'";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                while (rs.next()) {

                    String name = rs.getString("name");
                    cmtype1.addItem(name);

                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_cmkind1ActionPerformed

    private void cmkind1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmkind1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind1KeyPressed

    private void cmkind1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmkind1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind1KeyReleased

    private void cmtype1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtype1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype1MouseClicked

    private void cmtype1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtype1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype1MouseEntered

    private void cmtype1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtype1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype1MousePressed

    private void cmtype1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtype1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype1MouseReleased

    private void cmtype1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmtype1ActionPerformed
        String typecustomerrr = null;
        Object obj = evt.getSource();
        if (obj == cmtype1) {
            String z = typecustomer.getText();
            if (z.equals("خطاط")) {
                typecustomerrr = "khtatprice";
            }
            if (z.equals("استوديو")) {
                typecustomerrr = "studioprice";
            }
            try {
                String sqll = "SELECT " + typecustomerrr + "  FROM battry.items  where name='" + cmtype1.getSelectedItem().toString() + "' and type='" + cmkind1.getSelectedItem().toString() + "' ";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                if (rs.next()) {
                    price2.setText(rs.getString(typecustomerrr));
                }
            } catch (Exception ex) {
            }
            try {
                float pricee1 = Float.parseFloat(price2.getText());
                float numberr = Float.parseFloat(number.getText());
                float totall = pricee1 * numberr;
                total1.setText("" + totall);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_cmtype1ActionPerformed

    private void cmtype1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmtype1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype1KeyPressed

    private void cmtype1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmtype1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype1KeyReleased

    private void numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyReleased
        try {
            float pricee1 = Float.parseFloat(price2.getText());
            float numberr = Float.parseFloat(number.getText());
            float totall = pricee1 * numberr;
            total1.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_numberKeyReleased

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        auto_id();
        float totalnumber = 0;
        float amount = 0;
        if (cmcustomer.getSelectedIndex() == 0 || cmkind1.getSelectedIndex() == 0 || cmtype1.getSelectedIndex() == 0 || price2.getText().trim().isEmpty() || number.getText().trim().isEmpty()
                || number.getText().equals("0")) {
            JOptionPane.showMessageDialog(rootPane, "اكمل البيانات");
        } else {
            try {
                String sqldy = "SELECT * FROM battry.items where type='" + cmkind1.getSelectedItem() + "' and name='" + cmtype1.getSelectedItem() + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldy);
                rs = pst.executeQuery();
                while (rs.next()) {
                    totalnumber = Float.parseFloat(rs.getString("number"));
                }
                String datee1 = year.getText() + "-" + month.getText() + "-" + day.getText();
                TimeZone tz = TimeZone.getTimeZone("GMT+02");
                Calendar c = Calendar.getInstance(tz);
                String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                        + String.format("%02d", c.get(Calendar.MINUTE));
                String fulldatee = datee1 + " " + time;
                float pricee = Float.parseFloat(price2.getText());
                float numberr = Float.parseFloat(number.getText());
                float totall = Float.parseFloat(total1.getText());
                String customernamee = cmcustomer.getSelectedItem().toString();
                String kind = cmkind1.getSelectedItem().toString();
                String type = cmtype1.getSelectedItem().toString();
                String seriall = serialbuy.getText();
                if (totalnumber < numberr) {
                    JOptionPane.showMessageDialog(rootPane, " لا يوجد عدد كافي بالمخزن");
                } else {
               
                        String sql = "INSERT INTO battry.sellbattryitems (buyserial,item,customername,type,number,price,total,datee,fulldate,customerserial) VALUES"
                                + " ('" + seriall + "','" + type + "','" + customernamee + "','" + kind + "','" + numberr + "',"
                                + "'" + pricee + "','" + totall + "','" + datee1 + "','" + fulldatee + "','" + customerserial.getText() + "')";
                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                        pst.execute();
                        String sqla1d = "UPDATE battry.items SET number =number-(" + number.getText() + ")  where type='" + cmkind1.getSelectedItem() + "' and name='" + cmtype1.getSelectedItem() + "'";
                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1d);
                        pst.executeUpdate();
                        tablelord();
                        try {
                            float amountt = Float.parseFloat(totalbill.getText());
                            float paidd = Float.parseFloat(paid.getText());
                            float khsmk = Float.parseFloat(khsm.getText());
                            float totall1 = amountt - (paidd + khsmk);
                            remaining.setText("" + totall1);
                        } catch (Exception e) {

                        }
                        clear();
                        cmcustomer.setEnabled(false);
                        String sqld = "SELECT total FROM battry.sellbattryitems where datee='" + datee1 + "' and buyserial='" + seriall + "'";
                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            amount = amount + (rs.getFloat("total"));
                        }
                        totalbill.setText("" + amount);

                    
                    try {
                        float amountt = Float.parseFloat(totalbill.getText());
                        float paidd = Float.parseFloat(paid.getText());
                        float khsmk = Float.parseFloat(khsm.getText());
                        float totall1 = amountt - (paidd + khsmk);
                        remaining.setText("" + totall1);
                    } catch (Exception e) {

                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex);

            }
        }
    }//GEN-LAST:event_add1ActionPerformed

    private void paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyReleased
        try {
            float amount = Float.parseFloat(totalbill.getText());
            float paidd = Float.parseFloat(paid.getText());
            float khsmk = Float.parseFloat(khsm.getText());
            float totall = amount - (paidd + khsmk);
            remaining.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_paidKeyReleased

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            float totalk = Float.parseFloat(totalbill.getText());
            float paidk = Float.parseFloat(paid.getText());
            float khsmk = Float.parseFloat(khsm.getText());
            float remainingk = totalk - (paidk + khsmk);
            if (totalk > paidk && !paid.getText().trim().isEmpty()) {
                String customername = cmcustomer.getSelectedItem().toString();
                String customerseriall = customerserial.getText();
                String seriall = serialbuy.getText();
                String datee1 = year.getText() + "-" + month.getText() + "-" + day.getText();
                TimeZone tz = TimeZone.getTimeZone("GMT+02");
                Calendar c = Calendar.getInstance(tz);
                String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                        + String.format("%02d", c.get(Calendar.MINUTE));
                String fulldatee = datee1 + " " + time;
                String sql = "INSERT INTO battry.sellbattry (buyserial,customerserial,total,paid,remaining,datee,fulldate,customername,khsm) VALUES"
                        + " ('" + seriall + "','" + customerseriall + "','" + totalk + "','" + paidk + "','" + remainingk + "','" + datee1 + "','" + fulldatee + "','" + customername + "','" + khsmk + "')";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                pst.execute();

                String sqldaf = "SELECT * FROM battry.customeramount where name='" + customername + "' ";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaf);
                rs = pst.executeQuery();
                if (rs.next()) {
                    String sqla = "UPDATE battry.customeramount SET total = total+" + remainingk + " WHERE  name='" + customername + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla);
                    pst.executeUpdate();
                    String sqll3 = "INSERT INTO battry.customerlogs (name,type,date,fulldate,amount) VALUES"
                            + " ('" + customername + "','متبقي','" + datee1 + "','" + fulldatee + "','" + remainingk + "')";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll3);
                    pst.execute();
                    if (paidk > 0) {
                        String sqll33 = "INSERT INTO battry.customerlogs (name,type,date,fulldate,amount) VALUES"
                                + " ('" + customername + "','دفع','" + datee1 + "','" + fulldatee + "','" + paidk + "')";
                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll33);
                        pst.execute();
                    }

                } else {
                    String sqla = "INSERT INTO battry.customeramount (name,total) VALUES"
                            + " ('" + customername + "','" + remainingk + "')";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla);
                    pst.execute();
                    String sqll3 = "INSERT INTO battry.customerlogs (name,type,date,fulldate,amount) VALUES"
                            + " ('" + customername + "','متبقي','" + datee1 + "','" + fulldatee + "','" + remainingk + "')";
                    String sqll33 = "INSERT INTO battry.customerlogs (name,type,date,fulldate,amount) VALUES"
                            + " ('" + customername + "','دفع','" + datee1 + "','" + fulldatee + "','" + paidk + "')";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll33);
                    pst.execute();
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll3);
                    pst.execute();

                }
                String sqldaf1 = "SELECT * FROM battry.sellbattryitems where buyserial='" + seriall + "' ";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaf1);
                rs = pst.executeQuery();
                String sqla1 = "UPDATE battry.sellbattry SET mark ='Yes' WHERE  buyserial='" + seriall + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                pst.executeUpdate();
                String sqla2 = "UPDATE battry.sellbattryitems SET mark ='Yes' WHERE  buyserial='" + seriall + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla2);
                pst.executeUpdate();
                int dialogButton = JOptionPane.YES_NO_OPTION;
                int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد طباعه الفاتورة ", "رسالة تاكيد ؟ ", dialogButton);
                if (dialogResult == 0) {
                    InputStream in = null;
                    try {

                        in = this.getClass().getResourceAsStream("/reports/bill.jasper");
                        Map<String, Object> para = new HashMap<String, Object>();
                        para.put("serial", seriall);
                        para.put("paid", paidk);
                        para.put("remaining", remainingk);
                        para.put("billprice", totalk);
                        para.put("khsmx", khsmk);

                        JasperPrint j = JasperFillManager.fillReport(in, para,DBConnect.con);
                        JasperViewer.viewReport(j, false);
                    } catch (JRException ex) {

                        JOptionPane.showMessageDialog(null, ex);
                    } finally {
                    }
                }
                clear2();
                auto_id();
                tablelord();
                Calendar cal = new GregorianCalendar();
                int monthh = cal.get(Calendar.MONTH) + 1;
                int yearr = cal.get(Calendar.YEAR);
                int dayy = cal.get(Calendar.DAY_OF_MONTH);
                dayyy = String.valueOf(dayy);
                if (dayy == 1 || dayy == 2 || dayy == 3 || dayy == 4
                        || dayy == 5 || dayy == 6 || dayy == 7 || dayy == 8 || dayy == 9) {
                    dayyy = String.valueOf(dayy);
                    dayyy = "0" + dayyy;
                }
                day.setText(dayyy);
                month.setText(Integer.toString(monthh));
                year.setText(Integer.toString(yearr));
            } else {
                JOptionPane.showMessageDialog(this, "المدفوع اكبر من الكلي");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " ادخل مبلغ صحيح");
        }
    }//GEN-LAST:event_saveActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العملية", "رسالة تاكيد ؟ ", dialogButton);
        if (dialogResult == 0) {
            try {
                String sql = "DELETE FROM battry.sellbattryitems WHERE buyserial='" + serialbuy.getText() + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                pst.execute();
                String sql1 = "DELETE FROM battry.sellbattry WHERE  buyserial='" + serialbuy.getText() + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sql1);
                pst.execute();
                clear2();
                JOptionPane.showMessageDialog(rootPane, "تم مسح الفاتورة");
            } catch (SQLException ex) {
                Logger.getLogger(buyitems.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, " الغاء");
        }

    }//GEN-LAST:event_save1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
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
                    String sqla1 = "UPDATE battry.items SET number =number+" + numberr1.getText() + "   where name='" + type1.getText() + "' and type='" + kind1.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                    pst.executeUpdate();
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
        auto_id();
        float amount = 0;
        if (cmcustomer.getSelectedIndex() == 0 || cmkind.getSelectedIndex() == 0 || cmtype.getSelectedIndex() == 0 || price.getText().trim().isEmpty() || height.getText().trim().isEmpty()
                || height.getText().equals("0") || width.getText().trim().isEmpty() || width.getText().equals("0")) {
            JOptionPane.showMessageDialog(rootPane, "اكمل البيانات");
        } else {
            try {
                String datee1 = year.getText() + "-" + month.getText() + "-" + day.getText();
                TimeZone tz = TimeZone.getTimeZone("GMT+02");
                Calendar c = Calendar.getInstance(tz);
                String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                        + String.format("%02d", c.get(Calendar.MINUTE));
                String fulldatee = datee1 + " " + time;
                float pricee = Float.parseFloat(price.getText());
                float heightt = Float.parseFloat(height.getText());
                float widthh = Float.parseFloat(width.getText());
                String sizee = "" + height.getText() + ":" + width.getText();
                String numberrr=number.getText();
                float totall = Float.parseFloat(total.getText());
                String customernamee = cmcustomer.getSelectedItem().toString();
                String kind = cmkind.getSelectedItem().toString();
                String type = cmtype.getSelectedItem().toString();
                String seriall = serialbuy.getText();
             
                    String sql = "INSERT INTO battry.sellbattryitems (buyserial,item,customername,type,size,number,price,total,datee,fulldate,customerserial) VALUES"
                            + " ('" + seriall + "','" + type + "','" + customernamee + "','" + kind + "','"+sizee+"','" + numberrr + "',"
                            + "'" + pricee + "','" + totall + "','" + datee1 + "','" + fulldatee + "','" + customerserial.getText() + "')";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    pst.execute();
                    tablelord();

                    clear();
                    cmcustomer.setEnabled(false);
                    String sqld = "SELECT total FROM battry.sellbattryitems where datee='" + datee1 + "' and buyserial='" + seriall + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        amount = amount + (rs.getFloat("total"));
                    }
                    totalbill.setText("" + amount);

                
                try {
                    float amountt = Float.parseFloat(totalbill.getText());
                    float paidd = Float.parseFloat(paid.getText());
                    float khsmk = Float.parseFloat(khsm.getText());
                    float totall1 = amountt - (paidd + khsmk);
                    remaining.setText("" + totall1);
                } catch (Exception e) {

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex);

            }
        }
    }//GEN-LAST:event_addActionPerformed

    private void heightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightActionPerformed

    private void widthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_widthActionPerformed

    private void paid1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paid1KeyReleased
        try {
            float amount = Float.parseFloat(totalbill1.getText());
            float paidd = Float.parseFloat(paid1.getText());
            float totall = amount - paidd;
            remaining1.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_paid1KeyReleased

    private void cmkind2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkind2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind2MouseClicked

    private void cmkind2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkind2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind2MouseEntered

    private void cmkind2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkind2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind2MousePressed

    private void cmkind2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkind2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind2MouseReleased

    private void cmkind2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmkind2ActionPerformed
        Object obj = evt.getSource();
        if (obj == cmkind2) {
            try {
                String sqll = "SELECT name  FROM battry.items ";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                while (rs.next()) {

                    String name = rs.getString("name");

                    cmtype2.removeItem(name);

                }
            } catch (SQLException ex) {
            }
            try {
                String sqll = "SELECT name  FROM battry.items where  type='" + cmkind2.getSelectedItem().toString() + "'";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                while (rs.next()) {

                    String name = rs.getString("name");
                    cmtype2.addItem(name);

                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_cmkind2ActionPerformed

    private void cmkind2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmkind2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind2KeyPressed

    private void cmkind2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmkind2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind2KeyReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) jTable2.getModel();
        int selectrowindex = jTable2.getSelectedRow();
        serialid1.setText(tmodel.getValueAt(selectrowindex, 6).toString());
        type2.setText(tmodel.getValueAt(selectrowindex, 5).toString());
        kind2.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        numberr2.setText(tmodel.getValueAt(selectrowindex, 1).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    private void cmkind3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkind3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind3MouseClicked

    private void cmkind3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkind3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind3MouseEntered

    private void cmkind3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkind3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind3MousePressed

    private void cmkind3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmkind3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind3MouseReleased

    private void cmkind3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmkind3ActionPerformed
        Object obj = evt.getSource();
        if (obj == cmkind3) {
            try {
                String sqll = "SELECT name  FROM battry.items ";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                while (rs.next()) {

                    String name = rs.getString("name");

                    cmtype3.removeItem(name);

                }
            } catch (SQLException ex) {
            }
            try {
                String sqll = "SELECT name  FROM battry.items where  type='" + cmkind3.getSelectedItem().toString() + "'";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                while (rs.next()) {

                    String name = rs.getString("name");
                    cmtype3.addItem(name);

                }
            } catch (SQLException ex) {
            }
        }
    }//GEN-LAST:event_cmkind3ActionPerformed

    private void cmkind3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmkind3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind3KeyPressed

    private void cmkind3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmkind3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmkind3KeyReleased

    private void cmtype2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtype2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype2MouseClicked

    private void cmtype2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtype2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype2MouseEntered

    private void cmtype2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtype2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype2MousePressed

    private void cmtype2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtype2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype2MouseReleased

    private void cmtype2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmtype2ActionPerformed
        String typecustomerrr = null;
        Object obj = evt.getSource();
        if (obj == cmtype2) {

            try {
                String sqll = "SELECT customerprice  FROM battry.items  where name='" + cmtype2.getSelectedItem().toString() + "' and type='" + cmkind2.getSelectedItem().toString() + "' ";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                if (rs.next()) {
                    price1.setText(rs.getString("customerprice"));
                }
            } catch (Exception ex) {
            }
            try {
                float pricee = Float.parseFloat(price1.getText());
                float widthh = Float.parseFloat(width1.getText());
                float heightt = Float.parseFloat(height1.getText());
                float totall = heightt * widthh * pricee;
                total3.setText("" + totall);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_cmtype2ActionPerformed

    private void cmtype2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmtype2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype2KeyPressed

    private void cmtype2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmtype2KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype2KeyReleased

    private void number1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_number1KeyReleased
        try {
            float pricee1 = Float.parseFloat(price3.getText());
            float numberr = Float.parseFloat(number1.getText());
            float totall = pricee1 * numberr;
            total2.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_number1KeyReleased

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed

        float totalnumber = 0;
        auto_id();
        float amount = 0;
        if (name.getText().trim().isEmpty() || cmkind3.getSelectedIndex() == 0 || cmtype3.getSelectedIndex() == 0 || price3.getText().trim().isEmpty() || number1.getText().trim().isEmpty()
                || number1.getText().equals("0")) {
            JOptionPane.showMessageDialog(rootPane, "اكمل البيانات");
        } else {
            try {
                String sqldy = "SELECT * FROM battry.items where type='" + cmkind3.getSelectedItem() + "' and name='" + cmtype3.getSelectedItem() + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldy);
                rs = pst.executeQuery();
                while (rs.next()) {
                    totalnumber = Integer.parseInt(rs.getString("number"));
                }
                String datee1 = year1.getText() + "-" + month1.getText() + "-" + day1.getText();
                TimeZone tz = TimeZone.getTimeZone("GMT+02");
                Calendar c = Calendar.getInstance(tz);
                String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                        + String.format("%02d", c.get(Calendar.MINUTE));
                String fulldatee = datee1 + " " + time;
                float pricee = Float.parseFloat(price3.getText());
                float numberr = Float.parseFloat(number1.getText());
                float totall = Float.parseFloat(total2.getText());
                String customernamee = name.getText();
                String kind = cmkind3.getSelectedItem().toString();
                String type = cmtype3.getSelectedItem().toString();
                String seriall = serialbuy1.getText();
                if (totalnumber < numberr) {
                    JOptionPane.showMessageDialog(rootPane, " لا يوجد عدد كافي بالمخزن");
                } else {
                        String sql = "INSERT INTO battry.sellbattryitems (buyserial,item,customername,type,number,price,total,datee,fulldate,customerserial) VALUES"
                                + " ('" + seriall + "','" + type + "','" + customernamee + "','" + kind + "','" + numberr + "',"
                                + "'" + pricee + "','" + totall + "','" + datee1 + "','" + fulldatee + "','" + phone.getText() + "')";
                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                        pst.execute();
                        String sqla1d = "UPDATE battry.items SET number =number-(" + number1.getText() + ")  where type='" + cmkind2.getSelectedItem() + "' and name='" + cmtype2.getSelectedItem() + "'";
                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1d);
                        pst.executeUpdate();
                        tablelord1();

                        clear();

                        name.setEnabled(false);
                        String sqld = "SELECT total FROM battry.sellbattryitems where datee='" + datee1 + "' and buyserial='" + seriall + "'";
                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                        rs = pst.executeQuery();
                        while (rs.next()) {
                            amount = amount + (rs.getFloat("total"));
                        }
                        totalbill1.setText("" + amount);

                    
                    try {
                        float amountt = Float.parseFloat(totalbill1.getText());
                        float paidd = Float.parseFloat(paid1.getText());
                        float totall1 = amountt - (paidd);
                        remaining1.setText("" + totall1);
                    } catch (Exception e) {

                    }
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex);

            }
        }
    }//GEN-LAST:event_add2ActionPerformed

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        try {
            float totalk = Float.parseFloat(totalbill1.getText());
            float paidk = Float.parseFloat(paid1.getText());
            float remainingk = totalk - paidk;
            if (totalk == paidk && !paid1.getText().trim().isEmpty()) {
                String customername = name.getText();
                String customerseriall = phone.getText();
                String seriall = serialbuy1.getText();
                String datee1 = year1.getText() + "-" + month1.getText() + "-" + day1.getText();
                TimeZone tz = TimeZone.getTimeZone("GMT+02");
                Calendar c = Calendar.getInstance(tz);
                String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                        + String.format("%02d", c.get(Calendar.MINUTE));
                String fulldatee = datee1 + " " + time;
                String sql = "INSERT INTO battry.sellbattry (buyserial,customerserial,total,paid,remaining,datee,fulldate,customername) VALUES"
                        + " ('" + seriall + "','" + customerseriall + "','" + totalk + "','" + paidk + "','" + remainingk + "','" + datee1 + "','" + fulldatee + "','" + customername + "')";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this, "تم تسجيل الفاتوره بنجاح");
                clear2();
                auto_id();
                tablelord1();
                Calendar cal = new GregorianCalendar();
                int monthh = cal.get(Calendar.MONTH) + 1;
                int yearr = cal.get(Calendar.YEAR);
                int dayy = cal.get(Calendar.DAY_OF_MONTH);
                dayyy = String.valueOf(dayy);
                if (dayy == 1 || dayy == 2 || dayy == 3 || dayy == 4
                        || dayy == 5 || dayy == 6 || dayy == 7 || dayy == 8 || dayy == 9) {
                    dayyy = String.valueOf(dayy);
                    dayyy = "0" + dayyy;
                }
                day1.setText(dayyy);
                month1.setText(Integer.toString(monthh));
                year1.setText(Integer.toString(yearr));
            } else {
                JOptionPane.showMessageDialog(this, "المدفوع لا يساوي الكلي");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " ادخل مبلغ صحيح");
        }
    }//GEN-LAST:event_save2ActionPerformed

    private void save3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save3ActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العملية", "رسالة تاكيد ؟ ", dialogButton);
        if (dialogResult == 0) {
            try {
                String sql = "DELETE FROM battry.sellbattryitems WHERE buyserial='" + serialbuy1.getText() + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                pst.execute();
                String sql1 = "DELETE FROM battry.sellbattry WHERE  buyserial='" + serialbuy1.getText() + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sql1);
                pst.execute();
                clear2();
                JOptionPane.showMessageDialog(rootPane, "تم مسح الفاتورة");
            } catch (SQLException ex) {
                Logger.getLogger(buyitems.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, " الغاء");
        }
    }//GEN-LAST:event_save3ActionPerformed

    private void cmtype3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtype3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype3MouseClicked

    private void cmtype3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtype3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype3MouseEntered

    private void cmtype3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtype3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype3MousePressed

    private void cmtype3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmtype3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype3MouseReleased

    private void cmtype3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmtype3ActionPerformed
        String typecustomerrr = null;
        Object obj = evt.getSource();
        if (obj == cmtype3) {

            try {
                String sqll = "SELECT customerprice  FROM battry.items  where name='" + cmtype3.getSelectedItem().toString() + "' and type='" + cmkind3.getSelectedItem().toString() + "' ";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                if (rs.next()) {
                    price3.setText(rs.getString("customerprice"));
                }
            } catch (Exception ex) {
            }
            try {
                float pricee1 = Float.parseFloat(price3.getText());
                float numberr = Float.parseFloat(number1.getText());
                float totall = pricee1 * numberr;
                total2.setText("" + totall);
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_cmtype3ActionPerformed

    private void cmtype3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmtype3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype3KeyPressed

    private void cmtype3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmtype3KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmtype3KeyReleased

    private void width1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_width1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_width1ActionPerformed

    private void width1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_width1KeyReleased
        try {
            float pricee = Float.parseFloat(price1.getText());
            float number = Float.parseFloat(number3.getText());
            float widthh = Float.parseFloat(width1.getText());
            float heightt = Float.parseFloat(height1.getText());
            float totall = heightt * widthh * pricee*number;
            total3.setText("" + totall);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_width1KeyReleased

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        auto_id();
        float amount = 0;
        if (name.getText().toString().trim().isEmpty() || cmkind2.getSelectedIndex() == 0 || cmtype2.getSelectedIndex() == 0 || price1.getText().trim().isEmpty() || height1.getText().trim().isEmpty()
                || height1.getText().equals("0") || width1.getText().trim().isEmpty() || width1.getText().equals("0")) {
            JOptionPane.showMessageDialog(rootPane, "اكمل البيانات");
        } else {
            try {
                String datee1 = year1.getText() + "-" + month1.getText() + "-" + day1.getText();
                TimeZone tz = TimeZone.getTimeZone("GMT+02");
                Calendar c = Calendar.getInstance(tz);
                String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                        + String.format("%02d", c.get(Calendar.MINUTE));
                String fulldatee = datee1 + " " + time;
                float pricee = Float.parseFloat(price1.getText());
                float heightt = Float.parseFloat(height1.getText());
                float widthh = Float.parseFloat(width1.getText());
                String sizee = "" + height1.getText() + ":" + width1.getText();
                String numberr3=number3.getText();
                float totall = Float.parseFloat(total3.getText());
                String customernamee = name.getText();
                String kind = cmkind2.getSelectedItem().toString();
                String type = cmtype2.getSelectedItem().toString();
                String seriall = serialbuy1.getText();
             
                    String sql = "INSERT INTO battry.sellbattryitems (buyserial,item,customername,type,size,number,price,total,datee,fulldate,customerserial) VALUES"
                            + " ('" + seriall + "','" + type + "','" + customernamee + "','" + kind + "','" + sizee + "','"+numberr3+"',"
                            + "'" + pricee + "','" + totall + "','" + datee1 + "','" + fulldatee + "','" + phone.getText() + "')";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    pst.execute();
                    tablelord1();
                    clear();
                    name.setEnabled(false);
                    String sqld = "SELECT total FROM battry.sellbattryitems where datee='" + datee1 + "' and buyserial='" + seriall + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        amount = amount + (rs.getFloat("total"));
                    }
                    totalbill1.setText("" + amount);

                
                try {
                    float amountt = Float.parseFloat(totalbill1.getText());
                    float paidd = Float.parseFloat(paid1.getText());
                    float totall1 = amountt - (paidd);
                    remaining1.setText("" + totall1);
                } catch (Exception e) {

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(rootPane, ex);

            }
        }
    }//GEN-LAST:event_add3ActionPerformed

    private void height1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_height1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_height1ActionPerformed

    private void height1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_height1KeyReleased
        try {
            float pricee = Float.parseFloat(price1.getText());
            float number = Float.parseFloat(number3.getText());
            float widthh = Float.parseFloat(width1.getText());
            float heightt = Float.parseFloat(height1.getText());
            float totall = heightt * widthh * pricee*number;
            total3.setText("" + totall);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_height1KeyReleased

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        if (serialid1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "من فضلك اختر العنصر ");

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العملية", "رسالة تاكيد ؟ ", dialogButton);
            if (dialogResult == 0) {
                try {
                    String sql = "DELETE FROM battry.sellbattryitems WHERE id='" + serialid1.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    pst.execute();
                    String sqla1 = "UPDATE battry.items SET number =number+" + numberr2.getText() + "   where name='" + type2.getText() + "' and type='" + kind2.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                    pst.executeUpdate();
                    serialid1.setText("");
                    tablelord1();
                } catch (SQLException ex) {

                }
            } else {

                JOptionPane.showMessageDialog(this, " الغاء");
            }
        }
    }//GEN-LAST:event_delete1ActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void phoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneKeyReleased

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyReleased

    private void khsmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_khsmKeyReleased
        try {
            float amount = Float.parseFloat(totalbill.getText());
            float paidd = Float.parseFloat(paid.getText());
            float khsmk = Float.parseFloat(khsm.getText());
            float totall = amount - (paidd + khsmk);
            remaining.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_khsmKeyReleased

    private void priceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyReleased
        try {
            float pricee = Float.parseFloat(price.getText());
            float numberr = Float.parseFloat(number2.getText());
            float widthh = Float.parseFloat(width.getText());
            float heightt = Float.parseFloat(height.getText());
            float totall = heightt * widthh * pricee*numberr;
            total.setText("" + totall);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_priceKeyReleased

    private void price2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price2KeyReleased
        try {
            float pricee1 = Float.parseFloat(price2.getText());
            float numberr = Float.parseFloat(number.getText());
            float totall = pricee1 * numberr;
            total1.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_price2KeyReleased

    private void price1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price1KeyReleased
        try {
            float pricee = Float.parseFloat(price1.getText());
            float number = Float.parseFloat(number3.getText());
            float widthh = Float.parseFloat(width1.getText());
            float heightt = Float.parseFloat(height1.getText());
            float totall = heightt * widthh * pricee*number;
            total3.setText("" + totall);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_price1KeyReleased

    private void price3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price3KeyReleased
        try {
            float pricee1 = Float.parseFloat(price3.getText());
            float numberr = Float.parseFloat(number1.getText());
            float totall = pricee1 * numberr;
            total2.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_price3KeyReleased

    private void number2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_number2KeyReleased
 try {
            float pricee = Float.parseFloat(price.getText());
            float numberr = Float.parseFloat(number2.getText());
            float widthh = Float.parseFloat(width.getText());
            float heightt = Float.parseFloat(height.getText());
            float totall = heightt * widthh * pricee*numberr;
            total.setText("" + totall);
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_number2KeyReleased

    private void number3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_number3KeyReleased
try {
            float pricee = Float.parseFloat(price1.getText());
            float number = Float.parseFloat(number3.getText());
            float widthh = Float.parseFloat(width1.getText());
            float heightt = Float.parseFloat(height1.getText());
            float totall = heightt * widthh * pricee*number;
            total3.setText("" + totall);
        } catch (Exception e) {
        }        // TODO add your handling code here:
    }//GEN-LAST:event_number3KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton add1;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JComboBox cmcustomer;
    private javax.swing.JComboBox cmkind;
    private javax.swing.JComboBox cmkind1;
    private javax.swing.JComboBox cmkind2;
    private javax.swing.JComboBox cmkind3;
    private javax.swing.JComboBox cmtype;
    private javax.swing.JComboBox cmtype1;
    private javax.swing.JComboBox cmtype2;
    private javax.swing.JComboBox cmtype3;
    private javax.swing.JLabel customerserial;
    private javax.swing.JLabel customerserial1;
    private javax.swing.JLabel date4;
    private javax.swing.JLabel date5;
    public javax.swing.JTextField day;
    public javax.swing.JTextField day1;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    public javax.swing.JTextField height;
    public javax.swing.JTextField height1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField khsm;
    private javax.swing.JLabel kind1;
    private javax.swing.JLabel kind2;
    private javax.swing.JTextField kindd;
    public javax.swing.JTextField month;
    public javax.swing.JTextField month1;
    public javax.swing.JTextField name;
    public javax.swing.JTextField number;
    public javax.swing.JTextField number1;
    public javax.swing.JTextField number2;
    public javax.swing.JTextField number3;
    private javax.swing.JLabel numberr1;
    private javax.swing.JLabel numberr2;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField paid1;
    public javax.swing.JTextField phone;
    public javax.swing.JTextField price;
    public javax.swing.JTextField price1;
    public javax.swing.JTextField price2;
    public javax.swing.JTextField price3;
    private javax.swing.JTextField remaining;
    private javax.swing.JTextField remaining1;
    private javax.swing.JLabel s3;
    private javax.swing.JLabel s4;
    private javax.swing.JLabel s5;
    private javax.swing.JLabel s6;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JButton save2;
    private javax.swing.JButton save3;
    private javax.swing.JLabel serialbuy;
    private javax.swing.JLabel serialbuy1;
    private javax.swing.JLabel serialid;
    private javax.swing.JLabel serialid1;
    private javax.swing.JLabel serialid4;
    private javax.swing.JLabel serialid5;
    public javax.swing.JTextField total;
    public javax.swing.JTextField total1;
    public javax.swing.JTextField total2;
    public javax.swing.JTextField total3;
    private javax.swing.JTextField totalbill;
    private javax.swing.JTextField totalbill1;
    private javax.swing.JLabel type1;
    private javax.swing.JLabel type2;
    private javax.swing.JLabel typecustomer;
    private javax.swing.JLabel typecustomer1;
    public javax.swing.JTextField width;
    public javax.swing.JTextField width1;
    public javax.swing.JTextField year;
    public javax.swing.JTextField year1;
    // End of variables declaration//GEN-END:variables

    public void tablelord() {
        try {
            String datee1 = year.getText() + "-" + month.getText() + "-" + day.getText();
            String sqll = "SELECT * FROM battry.sellbattryitems where buyserial='" + serialbuy.getText() + "' "
                    + "AND  customername = '" + cmcustomer.getSelectedItem().toString() + "' and datee='" + datee1 + "' order by id";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs = pst.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            int x = 1;
            while (rs.next()) {
                Object row[] = {
                    rs.getString("total"),
                    rs.getString("number"),
                    rs.getString("price"),
                    rs.getString("size"),
                    rs.getString("type"),
                    rs.getString("item"),
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

    public void tablelord1() {
        try {
            String datee1 = year1.getText() + "-" + month1.getText() + "-" + day1.getText();
            String sqll = "SELECT * FROM battry.sellbattryitems where buyserial='" + serialbuy1.getText() + "' "
                    + "AND  customername = '" + name.getText() + "' and datee='" + datee1 + "' order by id";
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
                    rs.getString("size"),
                    rs.getString("type"),
                    rs.getString("item"),
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

    public void clear2() {
        price.setText("");
        phone.setText("");
        name.setEnabled(true);
        price2.setText("");
        price1.setText("");
        price3.setText("");
        total1.setText("0");
        number.setText("1");
        total.setText("0");
        cmkind.setSelectedIndex(0);
        cmtype.setSelectedIndex(0);
        total2.setText("0");
        number1.setText("1");
        total3.setText("0");
        cmkind2.setSelectedIndex(0);
        cmtype2.setSelectedIndex(0);
        cmcustomer.setSelectedIndex(0);
        name.setText("");
        name.setEditable(true);
        cmcustomer.setEnabled(true);
        paid.setText("");
        height.setText("1");
        width.setText("1");
        remaining.setText("");
        totalbill.setText("");
        paid1.setText("");
        height1.setText("1");
        width1.setText("1");
        remaining1.setText("");
        totalbill1.setText("");
        tablelord();
        tablelord1();
    }

    public void clear() {
        serialid4.setText("");
        price1.setText("");
        cmtype.setSelectedIndex(0);
        cmtype1.setSelectedIndex(0);
        price.setText("");
        total.setText("0");
        height.setText("1");
        width.setText("1");
        cmtype2.setSelectedIndex(0);
        cmtype3.setSelectedIndex(0);
        price2.setText("");
        total2.setText("0");
        height1.setText("1");
        width1.setText("1");
        number1.setText("1");
        total3.setText("0");
        price3.setText("");
    }

    public void customer() {
        try {
            String sql = "SELECT name  FROM battry.customer  order by name";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String namee = rs.getString("name");

                cmcustomer.addItem(namee);

            }

        } catch (SQLException ex) {

        }
    }

    public void mkas() {
        try {
            String sql = "SELECT name  FROM battry.itemtype where type='مقاس' order by id";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String namee = rs.getString("name");

                cmkind.addItem(namee);
                cmkind2.addItem(namee);

            }

        } catch (SQLException ex) {

        }
    }

    public void adad() {
        try {
            String sql = "SELECT name  FROM battry.itemtype where type='عدد' order by id";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            rs = pst.executeQuery();
            while (rs.next()) {
                String namee = rs.getString("name");

                cmkind1.addItem(namee);
                cmkind3.addItem(namee);

            }

        } catch (SQLException ex) {

        }
    }

    public void auto_id() {

        try {
            String sqll = "SELECT buyserial FROM battry.sellbattry where id=(select max(id)FROM battry.sellbattry )";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs = pst.executeQuery();
            if (rs.next()) {
                String rnno = rs.getString("buyserial");
                int co = rnno.length();
                String txt = rnno.substring(0, 3);
                String num = rnno.substring(3, co);
                int n = Integer.parseInt(num);
                n++;
                String snum = Integer.toString(n);
                String ftxt = txt + snum;
                serialbuy.setText(ftxt);
                serialbuy1.setText(ftxt);
            } else {
                serialbuy.setText("BN-1001");
                serialbuy1.setText("BN-1001");
            }
        } catch (SQLException ex) {

        }

    }

}
