/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import hany.DBConnect;
import hany.msrofatreport;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
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
public final class buyitems11 extends javax.swing.JInternalFrame {

    /**
     * Creates new form book
     */
     
    PreparedStatement pst;
    ResultSet rs;
    public String y;
    String dayyy;
    public String nameitem = null;

    public buyitems11() {
        try {
            initComponents();
             
            String sqll = "SELECT *  FROM battry.sellbattryitems WHERE mark='No'  ";

            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

            rs = pst.executeQuery();

            while (rs.next()) {
                String barcodee = rs.getString("item");
                String numberr = rs.getString("number");
                String sqla1d = "UPDATE battry.storeitemlist SET number =number+" + numberr + "   where barcode='" + barcodee + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1d);
                pst.executeUpdate();
            }
            String sql = "DELETE FROM battry.sellbattryitems WHERE mark='No'";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
            pst.execute();
            String sqlz = "DELETE FROM battry.storeitemlogs WHERE mark='DD'";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqlz);
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
            jTable1.getTableHeader().setFont(new Font("Arial", Font.BOLD, 20));
            jTable1.getTableHeader().setOpaque(false);
            jTable1.getTableHeader().setBackground(new Color(138, 203, 195));
            jTable1.getTableHeader().setForeground(new Color(0, 0, 0));
            jTable1.setRowHeight(40);

            //***********************************************************************************************
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
        } catch (SQLException ex) {
            Logger.getLogger(buyitems11.class.getName()).log(Level.SEVERE, null, ex);
        }
        TableCellRenderer rendererFromHeader2 = jTable2.getTableHeader().getDefaultRenderer();
        JLabel headerLabel2 = (JLabel) rendererFromHeader2;
        headerLabel2.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
        centerRenderer2.setHorizontalAlignment(JLabel.CENTER);
        jTable2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer2);
        jTable2.getColumnModel().getColumn(1).setCellRenderer(centerRenderer2);
        jTable2.getColumnModel().getColumn(2).setCellRenderer(centerRenderer2);
        jTable2.getColumnModel().getColumn(3).setCellRenderer(centerRenderer2);
        jTable2.getColumnModel().getColumn(4).setCellRenderer(centerRenderer2);
        jTable2.getTableHeader().setFont(new Font("Arial", Font.BOLD, 20));
        jTable2.getTableHeader().setOpaque(false);
        jTable2.getTableHeader().setBackground(new Color(138, 203, 195));
        jTable2.getTableHeader().setForeground(new Color(0, 0, 0));
        jTable2.setRowHeight(40);
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
        jPanel16 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        totalbill1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        paid1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        remaining1 = new javax.swing.JTextField();
        price1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        save2 = new javax.swing.JButton();
        add5 = new javax.swing.JButton();
        save3 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        itemcode = new javax.swing.JTextField();
        delete1 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        day1 = new javax.swing.JTextField();
        s5 = new javax.swing.JLabel();
        month1 = new javax.swing.JTextField();
        s6 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        number = new javax.swing.JTextField();
        year1 = new javax.swing.JTextField();
        serialbuy1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        serialid5 = new javax.swing.JLabel();
        date5 = new javax.swing.JLabel();
        serialid1 = new javax.swing.JLabel();
        customerserial1 = new javax.swing.JLabel();
        typecustomer1 = new javax.swing.JLabel();
        itemname = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        totalbill = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        paid = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        remaining = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        save = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        day = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        cmcustomer = new javax.swing.JComboBox();
        s3 = new javax.swing.JLabel();
        month = new javax.swing.JTextField();
        s4 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        itemcode3 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        khsm = new javax.swing.JTextField();
        price3 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        add6 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        number3 = new javax.swing.JTextField();
        add4 = new javax.swing.JButton();
        year = new javax.swing.JTextField();
        serialbuy = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        serialid4 = new javax.swing.JLabel();
        date4 = new javax.swing.JLabel();
        serialid = new javax.swing.JLabel();
        customerserial = new javax.swing.JLabel();
        typecustomer = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        itemname3 = new javax.swing.JLabel();

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/71847608-close-up-of-handshake-on-city-background-with-abstract-sunlight-partnership-concept-double-exposure.jpg"))); // NOI18N

        jLabel1.setText("jLabel1");

        setMaximumSize(new java.awt.Dimension(980, 690));
        setMinimumSize(new java.awt.Dimension(980, 690));
        setPreferredSize(new java.awt.Dimension(980, 690));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setForeground(new java.awt.Color(255, 255, 255));
        jPanel16.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel16.setMinimumSize(new java.awt.Dimension(90, 34));
        jPanel16.setPreferredSize(new java.awt.Dimension(970, 690));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("السعر");
        jPanel16.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 90, 30));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel34.setText("اجمالي الفاتورة");
        jPanel16.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 130, 60));

        totalbill1.setEditable(false);
        totalbill1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalbill1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel16.add(totalbill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 110, 60));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel35.setText("المدفوع");
        jPanel16.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 70, 60));

        paid1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        paid1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paid1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paid1KeyReleased(evt);
            }
        });
        jPanel16.add(paid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 110, 60));

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel36.setText("المتبقي");
        jPanel16.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 100, 60));

        remaining1.setEditable(false);
        remaining1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        remaining1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel16.add(remaining1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 110, 60));

        price1.setEditable(false);
        price1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        price1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel16.add(price1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 90, 40));

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel41.setText("المنتج");
        jPanel16.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 70, 40));

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "المجموع", "العدد", "السعر", "المنتج", "ID"
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

        jPanel16.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 760, 160));

        save2.setBackground(new java.awt.Color(138, 203, 195));
        save2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save2.setText("حفظ");
        save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save2ActionPerformed(evt);
            }
        });
        jPanel16.add(save2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 520, 110, 40));

        add5.setBackground(new java.awt.Color(138, 203, 195));
        add5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add5.setText("....");
        add5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add5ActionPerformed(evt);
            }
        });
        jPanel16.add(add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 40, 40));

        save3.setBackground(new java.awt.Color(138, 203, 195));
        save3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save3.setText("مسح");
        save3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save3ActionPerformed(evt);
            }
        });
        jPanel16.add(save3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 110, 40));

        add3.setBackground(new java.awt.Color(138, 203, 195));
        add3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add3.setText("اضافة");
        add3.setEnabled(false);
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });
        jPanel16.add(add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 70, 40));

        itemcode.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        itemcode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        itemcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemcodeActionPerformed(evt);
            }
        });
        itemcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                itemcodeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemcodeKeyReleased(evt);
            }
        });
        jPanel16.add(itemcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 240, 40));

        delete1.setBackground(new java.awt.Color(138, 203, 195));
        delete1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        delete1.setText("مسح العنصر");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });
        jPanel16.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 120, 60));

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel48.setText("تاريخ");
        jPanel16.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 50, 30));

        day1.setEditable(false);
        day1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel16.add(day1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 60, 30));

        s5.setBackground(new java.awt.Color(255, 255, 255));
        s5.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        s5.setText("/");
        jPanel16.add(s5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 10, -1));

        month1.setEditable(false);
        month1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel16.add(month1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 60, 30));

        s6.setBackground(new java.awt.Color(255, 255, 255));
        s6.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        s6.setText("/");
        jPanel16.add(s6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 10, -1));

        jLabel51.setBackground(new java.awt.Color(255, 255, 255));
        jLabel51.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel51.setText("العدد");
        jPanel16.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, 70, 40));

        number.setEditable(false);
        number.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        number.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        number.setText("1");
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberKeyReleased(evt);
            }
        });
        jPanel16.add(number, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 70, 40));

        year1.setEditable(false);
        year1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel16.add(year1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, 30));

        serialbuy1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        serialbuy1.setText("لإثسف");
        jPanel16.add(serialbuy1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 50));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel16.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 720));

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

        itemname.setText("jLabel2");
        jPanel16.add(itemname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jTabbedPane1.addTab("قطاعي", jPanel16);

        jPanel15.setBackground(new java.awt.Color(0, 0, 0));
        jPanel15.setForeground(new java.awt.Color(255, 255, 255));
        jPanel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel15.setMinimumSize(new java.awt.Dimension(90, 34));
        jPanel15.setPreferredSize(new java.awt.Dimension(970, 690));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel20.setText("اجمالي الفاتورة");
        jPanel15.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 130, 50));

        totalbill.setEditable(false);
        totalbill.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalbill.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel15.add(totalbill, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, 110, 50));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel24.setText("المدفوع");
        jPanel15.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 70, 50));

        paid.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        paid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        paid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                paidKeyReleased(evt);
            }
        });
        jPanel15.add(paid, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 110, 50));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel31.setText("المتبقي");
        jPanel15.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 100, 50));

        remaining.setEditable(false);
        remaining.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        remaining.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel15.add(remaining, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 110, 50));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "المجموع", "العدد", "السعر", "المنتج", "ID"
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
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(100);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(4).setMinWidth(1);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(1);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(1);
        }

        jPanel15.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 760, 160));

        save.setBackground(new java.awt.Color(138, 203, 195));
        save.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save.setText("حفظ");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel15.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 110, 40));

        save1.setBackground(new java.awt.Color(138, 203, 195));
        save1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        save1.setText("مسح");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        jPanel15.add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 110, 40));

        delete.setBackground(new java.awt.Color(138, 203, 195));
        delete.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        delete.setText("مسح العنصر");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel15.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 120, 60));

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel21.setText("تاريخ");
        jPanel15.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 50, 30));

        day.setEditable(false);
        day.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel15.add(day, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 60, 30));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel22.setText("اسم العميل");
        jPanel15.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 140, 30));

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
        jPanel15.add(cmcustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 240, 30));

        s3.setBackground(new java.awt.Color(255, 255, 255));
        s3.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        s3.setText("/");
        jPanel15.add(s3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 10, -1));

        month.setEditable(false);
        month.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel15.add(month, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 60, 30));

        s4.setBackground(new java.awt.Color(255, 255, 255));
        s4.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        s4.setText("/");
        jPanel15.add(s4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 10, -1));

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel42.setText("المنتج");
        jPanel15.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 160, 70, 40));

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
        jPanel15.add(itemcode3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, 240, 40));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel26.setText("خصم");
        jPanel15.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 70, 50));

        khsm.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        khsm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        khsm.setText("0");
        khsm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                khsmKeyReleased(evt);
            }
        });
        jPanel15.add(khsm, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 70, 50));

        price3.setEditable(false);
        price3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        price3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel15.add(price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 90, 40));

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("السعر");
        jPanel15.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 120, 90, 30));

        add6.setBackground(new java.awt.Color(138, 203, 195));
        add6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add6.setText("....");
        add6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add6ActionPerformed(evt);
            }
        });
        jPanel15.add(add6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 40, 40));

        jLabel52.setBackground(new java.awt.Color(255, 255, 255));
        jLabel52.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel52.setText("العدد");
        jPanel15.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 70, 40));

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
        jPanel15.add(number3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 70, 40));

        add4.setBackground(new java.awt.Color(138, 203, 195));
        add4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        add4.setText("اضافة");
        add4.setEnabled(false);
        add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add4ActionPerformed(evt);
            }
        });
        jPanel15.add(add4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 70, 40));

        year.setEditable(false);
        year.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel15.add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, 30));

        serialbuy.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        serialbuy.setText("لإثسف");
        jPanel15.add(serialbuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 50));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/nYwGq3.jpg"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));
        jPanel15.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 720));

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

        typecustomer.setBackground(new java.awt.Color(255, 255, 255));
        typecustomer.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        typecustomer.setText("نوع");
        jPanel15.add(typecustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 140, 70, 40));

        jLabel53.setBackground(new java.awt.Color(255, 255, 255));
        jLabel53.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel53.setText("العدد");
        jPanel15.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 70, 40));

        itemname3.setText("jLabel2");
        jPanel15.add(itemname3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        jTabbedPane1.addTab("جملة", jPanel15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("جملة");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

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
                String sqll = "SELECT *  FROM battry.customer  where name='" + cmcustomer.getSelectedItem().toString() + "'  ";

                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);

                rs = pst.executeQuery();

                if (rs.next()) {
                    customerserial.setText(rs.getString("serial"));
                }
            } catch (Exception ex) {
            }

        }
    }//GEN-LAST:event_cmcustomerActionPerformed

    private void cmcustomerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmcustomerKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmcustomerKeyPressed

    private void cmcustomerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cmcustomerKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_cmcustomerKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) jTable1.getModel();
        int selectrowindex = jTable1.getSelectedRow();
        serialid.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        itemcode3.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        price3.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        number3.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        number3.setEditable(true);
        add4.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void paidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paidKeyReleased
        try {
            float amount = Float.parseFloat(totalbill.getText());
            float paidd = Float.parseFloat(paid.getText());
            float khasm = Float.parseFloat(khsm.getText());
            float totall = amount - paidd - khasm;
            remaining.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_paidKeyReleased

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        try {
            float totalk = Float.parseFloat(totalbill.getText());
            float paidk = Float.parseFloat(paid.getText());
            float khsmm = Float.parseFloat(khsm.getText());
            float remainingk = totalk - paidk - khsmm;
            if (totalk >= (paidk + khsmm) && !paid.getText().trim().isEmpty()) {
                if (cmcustomer.getSelectedIndex() != 0) {
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
                            + " ('" + seriall + "','" + customerseriall + "','" + totalk + "',"
                            + "'" + paidk + "','" + remainingk + "','" + datee1 + "','" + fulldatee + "','" + customername + "','" + khsmm + "')";
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
                    String sqla1 = "UPDATE battry.sellbattry SET mark ='Yes' WHERE  buyserial='" + seriall + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                    pst.executeUpdate();
                    String sqla2 = "UPDATE battry.sellbattryitems SET mark ='Yes' WHERE  buyserial='" + seriall + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla2);
                    pst.executeUpdate();
                    String sqla21 = "UPDATE battry.storeitemlogs SET mark ='Yes' WHERE  serial='" + seriall + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla21);
                    pst.executeUpdate();
                    String sqldaf1 = "SELECT * FROM battry.sellbattryitems where buyserial='" + seriall + "' ";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaf1);
                    rs = pst.executeQuery();
                    cmcustomer.setEnabled(true);
                    itemcode3.setText("");
                    itemcode3.requestFocus();
                    number3.setText("");
                    khsm.setText("0");
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
                            para.put("khsm", khsmm);

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
                    JOptionPane.showMessageDialog(this, "اختر اسم المورد");
                }
            } else {
                JOptionPane.showMessageDialog(this, "المدفوع اكبر من الكلي");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
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
                Logger.getLogger(buyitems11.class.getName()).log(Level.SEVERE, null, ex);
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
                    String seriall = serialbuy.getText();
                    String sql = "DELETE FROM battry.sellbattryitems WHERE id='" + serialid.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    pst.execute();
                    String sqld = "SELECT name FROM battry.storeitemlist where barcode='" + itemcode3.getText() + "' ";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        String nameee = rs.getString("name");
                        String sql1 = "DELETE FROM battry.storeitemlogs WHERE name='" + nameee + "' and serial = '" + seriall + "'";
                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sql1);
                        pst.execute();

                    }

                    String sqla1 = "UPDATE battry.storeitemlist SET number =number+" + number3.getText() + "   where barcode='" + itemcode3.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                    pst.executeUpdate();
                    serialid.setText("");
                    itemcode3.setText("");
                    itemcode3.requestFocus();
                    price3.setText("");
                    number3.setText("1");
                    tablelord();
                } catch (SQLException ex) {

                }
            } else {

                JOptionPane.showMessageDialog(this, " الغاء");
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void paid1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paid1KeyReleased
        try {
            float amount = Float.parseFloat(totalbill1.getText());
            float paidd = Float.parseFloat(paid1.getText());
            float totall = paidd - amount;
            remaining1.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_paid1KeyReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel tmodel = (DefaultTableModel) jTable2.getModel();
        int selectrowindex = jTable2.getSelectedRow();
        serialid1.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        itemcode.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        price1.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        number.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        number.setEditable(true);
        add3.setEnabled(true);
    }//GEN-LAST:event_jTable2MouseClicked

    private void save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save2ActionPerformed
        try {
            float totalk = Float.parseFloat(totalbill1.getText());
            float paidk = Float.parseFloat(paid1.getText());
            float remainingk = totalk - paidk;
            if (totalk <= paidk && !paid1.getText().trim().isEmpty()) {
                String customername = "-";
                String customerseriall = "-";
                String seriall = serialbuy1.getText();
                String datee1 = year1.getText() + "-" + month1.getText() + "-" + day1.getText();
                TimeZone tz = TimeZone.getTimeZone("GMT+02");
                Calendar c = Calendar.getInstance(tz);
                String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                        + String.format("%02d", c.get(Calendar.MINUTE));
                String fulldatee = datee1 + " " + time;
                String sql = "INSERT INTO  battry.sellbattry (buyserial,customerserial,total,paid,datee,fulldate,customername) VALUES"
                        + " ('" + seriall + "','" + customerseriall + "','" + totalk + "','" + paidk + "','" + datee1 + "','" + fulldatee + "','" + customername + "')";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                pst.execute();
                String sqla1 = "UPDATE battry.sellbattry SET mark ='Yes' WHERE  buyserial='" + seriall + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                pst.executeUpdate();
                String sqla2 = "UPDATE battry.sellbattryitems SET mark ='Yes' WHERE  buyserial='" + seriall + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla2);
                pst.executeUpdate();
                String sqla21 = "UPDATE battry.storeitemlogs SET mark ='Yes' WHERE  serial='" + seriall + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla21);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "تم تسجيل الفاتوره بنجاح");
                itemcode.setText("");
                itemcode.requestFocus();
                number.setText("");
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
                Logger.getLogger(buyitems11.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, " الغاء");
        }
    }//GEN-LAST:event_save3ActionPerformed

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        String available = null;
        float amount = 0;
        String seriall = serialbuy1.getText();
        String datee1 = year1.getText() + "-" + month1.getText() + "-" + day1.getText();
        TimeZone tz = TimeZone.getTimeZone("GMT+02");
        Calendar c = Calendar.getInstance(tz);
        String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                + String.format("%02d", c.get(Calendar.MINUTE));
        String fulldatee = datee1 + " " + time;

        try {
            float numbber = Float.parseFloat(number.getText());
            float pricee = Float.parseFloat(price1.getText());
            float total = numbber * pricee;
            String sqldaf = "SELECT * FROM battry.storeitemlist where name='" + itemcode.getText() + "' ";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaf);
            rs = pst.executeQuery();
            if (rs.next()) {
                price1.setText(rs.getString("price"));
                itemname.setText(rs.getString("name"));
                available = rs.getString("number");
                nameitem = rs.getString("name");
            }
            if (available.trim().equals("") || available.trim().equals("0") || Integer.parseInt(number.getText()) > Integer.parseInt(available)) {
                JOptionPane.showMessageDialog(rootPane, "لا يوجد عدد كافي");
            } else {

                try {
                    String sqla1d = "UPDATE battry.storeitemlist SET number =number-(" + number.getText() + "-1)   where barcode='" + itemcode.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1d);
                    pst.executeUpdate();
                    String sqla111 = "UPDATE battry.storeitemlogs SET number ='" + "-" + number.getText() + "'   where serial='" + seriall + "' and name = '" + nameitem + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla111);
                    pst.executeUpdate();
                    String sqla1 = "UPDATE battry.sellbattryitems SET number ='" + numbber + "',total='" + total + "'  WHERE  id='" + serialid1.getText() + "' and buyserial='" + serialbuy1.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                    pst.executeUpdate();
                    tablelord1();
                    String sqld = "SELECT total FROM battry.sellbattryitems where datee='" + datee1 + "' and buyserial='" + seriall + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        amount = amount + (rs.getFloat("total"));
                    }
                    totalbill1.setText("" + amount);
                    number.setEditable(false);
                    add3.setEnabled(false);
                    serialid1.setText("");
                    itemcode.setText("");
                    itemcode.requestFocus();
                    price1.setText("");
                    number.setText("1");
                } catch (SQLException ex) {
                    Logger.getLogger(buyitems11.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "ادخل رقم صحيح");
        }
    }//GEN-LAST:event_add3ActionPerformed

    private void itemcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemcodeActionPerformed

    private void itemcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemcodeKeyReleased


    }//GEN-LAST:event_itemcodeKeyReleased

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
        float amount = 0;
        String seriall = serialbuy1.getText();
        String datee1 = year1.getText() + "-" + month1.getText() + "-" + day1.getText();
        TimeZone tz = TimeZone.getTimeZone("GMT+02");
        Calendar c = Calendar.getInstance(tz);
        String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                + String.format("%02d", c.get(Calendar.MINUTE));
        String fulldatee = datee1 + " " + time;
        if (serialid1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "من فضلك اختر العنصر ");

        } else {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "هل تريد حفظ العملية", "رسالة تاكيد ؟ ", dialogButton);
            if (dialogResult == 0) {
                try {
                    String sql = "DELETE FROM battrybattry.sellbattryitems WHERE id='" + serialid1.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                    pst.execute();
                    String sqld = "SELECT name FROM battry.storeitemlist where barcode='" + itemcode.getText() + "' ";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        String nameee = rs.getString("name");
                        String sql1 = "DELETE FROM battry.storeitemlogs WHERE name='" + nameee + "' and serial = '" + seriall + "'";
                        pst = (PreparedStatement) DBConnect.con.prepareStatement(sql1);
                        pst.execute();

                    }
                    String sqla1 = "UPDATE battry.storeitemlist SET number =number+" + number.getText() + "   where barcode='" + itemcode.getText() + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                    pst.executeUpdate();
                    serialid1.setText("");
                    itemcode.setText("");
                    itemcode.requestFocus();
                    price1.setText("");
                    number.setText("1");
                    tablelord1();
                    String sqldd = "SELECT total FROM battry.sellbattryitems where datee='" + datee1 + "' and buyserial='" + seriall + "'";
                    pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldd);
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        amount = amount + (rs.getFloat("total"));
                    }
                    totalbill1.setText("" + amount);
                    number.setEditable(false);
                    add3.setEnabled(false);
                } catch (SQLException ex) {

                }
            } else {

                JOptionPane.showMessageDialog(this, " الغاء");
            }
        }
    }//GEN-LAST:event_delete1ActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_numberKeyReleased

    private void itemcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemcodeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String available = null;
                String seriall = serialbuy1.getText();
                String sqldaf = "SELECT * FROM battry.storeitemlist where barcode='" + itemcode.getText() + "' ";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaf);
                rs = pst.executeQuery();
                if (rs.next()) {
                    price1.setText(rs.getString("price"));
                    available = rs.getString("number");
                    itemname.setText(rs.getString("name"));
                    nameitem = rs.getString("name");
                }
                if (available.trim().equals("") || available.trim().equals("0")) {
                    JOptionPane.showMessageDialog(rootPane, "لا يوجد عدد كافي");
                } else {
                    auto_id();
                    float amount = 0;
                    if (itemcode.getText().toString().trim().isEmpty() || price1.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(rootPane, "اكمل البيانات");
                    } else {
                        try {
                            String datee1 = year1.getText() + "-" + month1.getText() + "-" + day1.getText();
                            TimeZone tz = TimeZone.getTimeZone("GMT+02");
                            Calendar c = Calendar.getInstance(tz);
                            String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                                    + String.format("%02d", c.get(Calendar.MINUTE));
                            String fulldatee = datee1 + " " + time;
                            String sqll = "SELECT * FROM battry.sellbattryitems where item='" + itemcode.getText() + "'  and datee='" + datee1 + "' and buyserial='" + seriall + "'";
                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
                            rs = pst.executeQuery();
                            if (rs.next()) {
                                String sqla11 = "UPDATE battry.storeitemlist SET number =number-1   where barcode='" + itemcode.getText() + "'";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla11);
                                pst.executeUpdate();
                                String sqla111 = "UPDATE battry.storeitemlogs SET number =number-1   where serial='" + seriall + "' and name = '" + nameitem + "'";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla111);
                                pst.executeUpdate();
                                String sqla1 = "UPDATE battry.sellbattryitems SET number =number+1 ,total=total+ " + price1.getText() + " where item='" + itemcode.getText() + "'  and datee='" + datee1 + "' and buyserial='" + seriall + "'";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                                pst.executeUpdate();

                                tablelord();
                                itemcode.setText("");
                                price1.setText("");
                                itemcode.requestFocus();
                                tablelord1();
                                String sqld = "SELECT total FROM battry.sellbattryitems where datee='" + datee1 + "' and buyserial='" + seriall + "'";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                                rs = pst.executeQuery();
                                while (rs.next()) {
                                    amount = amount + (rs.getFloat("total"));
                                }
                                totalbill1.setText("" + amount);

                            } else {
                                String sqla1 = "UPDATE battry.storeitemlist SET number =number-1   where barcode='" + itemcode.getText() + "'";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                                pst.executeUpdate();

                                String sql = "INSERT INTO battry.sellbattryitems (itemname,buyserial,item,customername,number,price,total,datee,fulldate,customerserial) VALUES"
                                        + " ('" + itemname.getText() + "','" + seriall + "','" + itemcode.getText() + "','-','" + number.getText() + "',"
                                        + "'" + price1.getText() + "','" + price1.getText() + "','" + datee1 + "','" + fulldatee + "','-')";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                                pst.execute();
                                String sqll33 = "INSERT INTO battry.storeitemlogs (serial,name,supplier,number,type,date,fulldate,price,mark) "
                                        + "VALUES('" + seriall + "','" + nameitem + "','-','" + "-" + number3.getText() + "','بيع','" + datee1 + "','" + fulldatee + "','" + price1.getText() + "','DD')";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll33);
                                pst.execute();
                                tablelord1();
                                String sqld = "SELECT total FROM battry.sellbattryitems where datee='" + datee1 + "' and buyserial='" + seriall + "'";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                                rs = pst.executeQuery();
                                while (rs.next()) {
                                    amount = amount + (rs.getFloat("total"));
                                }
                                totalbill1.setText("" + amount);
                                itemcode.setText("");
                                itemcode.requestFocus();
                                price1.setText("");

                            }
                            String sqla1 = "UPDATE battry.storeitemlist SET number =number-1   where barcode='" + itemcode.getText() + "'";
                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                            pst.executeUpdate();

                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(rootPane, ex);

                        }
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(buyitems11.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_itemcodeKeyPressed

    private void itemcode3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemcode3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemcode3ActionPerformed

    private void itemcode3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemcode3KeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {

                String available = null;
                String seriall = serialbuy.getText();
                String sqldaf = "SELECT * FROM battry.storeitemlist where barcode='" + itemcode3.getText() + "' ";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaf);
                rs = pst.executeQuery();
                if (rs.next()) {
                    price3.setText(rs.getString("gomla"));
                    available = rs.getString("number");
                    itemname3.setText(rs.getString("name"));
                    nameitem = rs.getString("name");
                }
                if (available.trim().equals("") || available.trim().equals("0")) {
                    JOptionPane.showMessageDialog(rootPane, "لا يوجد عدد كافي");
                } else {
                    auto_id();
                    float amount = 0;
                    if (itemcode3.getText().toString().trim().isEmpty() || cmcustomer.getSelectedIndex() == 0 || price3.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(rootPane, "اكمل البيانات");
                    } else {
                        try {
                            String datee1 = year.getText() + "-" + month.getText() + "-" + day.getText();
                            TimeZone tz = TimeZone.getTimeZone("GMT+02");
                            Calendar c = Calendar.getInstance(tz);
                            String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                                    + String.format("%02d", c.get(Calendar.MINUTE));
                            String fulldatee = datee1 + " " + time;
                            String sqll = "SELECT * FROM battry.sellbattryitems where item='" + itemcode3.getText() + "'  and datee='" + datee1 + "' and buyserial='" + seriall + "'";
                            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
                            rs = pst.executeQuery();
                            if (rs.next()) {
                                String sqla11 = "UPDATE battry.storeitemlist SET number =number-1   where barcode='" + itemcode3.getText() + "'";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla11);
                                pst.executeUpdate();
                                String sqla111 = "UPDATE battry.storeitemlogs SET number =number-1   where serial='" + seriall + "' and name = '" + nameitem + "'";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla111);
                                pst.executeUpdate();
//                              JOptionPane.showMessageDialog(rootPane, "العنصر تم اضافتة من قبل");
                                String sqla1 = "UPDATE battry.sellbattryitems SET number =number+1 ,total=total+ " + price3.getText() + " where item='" + itemcode3.getText() + "'  and datee='" + datee1 + "' and buyserial='" + seriall + "'";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                                pst.executeUpdate();
                                tablelord();
                                itemcode3.setText("");
                                price3.setText("");
                                itemcode3.requestFocus();
                                String sqld = "SELECT total FROM battry.sellbattryitems where datee='" + datee1 + "' and buyserial='" + seriall + "'";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                                rs = pst.executeQuery();
                                while (rs.next()) {
                                    amount = amount + (rs.getFloat("total"));
                                }
                                totalbill.setText("" + amount);

                            } else {
                                String sqla11 = "UPDATE battry.storeitemlist SET number =number-1   where barcode='" + itemcode3.getText() + "'";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla11);
                                pst.executeUpdate();

                                String sql = "INSERT INTO battry.sellbattryitems (itemname,buyserial,item,customername,number,price,total,datee,fulldate,customerserial) VALUES"
                                        + " ('" + itemname3.getText() + "','" + seriall + "','" + itemcode3.getText() + "','" + cmcustomer.getSelectedItem() + "','" + number3.getText() + "',"
                                        + "'" + price3.getText() + "','" + price3.getText() + "','" + datee1 + "','" + fulldatee + "','" + customerserial.getText() + "')";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sql);
                                pst.execute();
                                String sqll33 = "INSERT INTO battry.storeitemlogs (serial,name,supplier,number,type,date,fulldate,price,mark) "
                                        + "VALUES('" + seriall + "','" + nameitem + "','" + cmcustomer.getSelectedItem() + "','" + "-" + number.getText() + "','بيع','" + datee1 + "','" + fulldatee + "','" + price3.getText() + "','DD')";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll33);
                                pst.execute();
                                tablelord();
                                itemcode3.setText("");
                                price3.setText("");
                                String sqld = "SELECT total FROM battry.sellbattryitems where datee='" + datee1 + "' and buyserial='" + seriall + "'";
                                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                                rs = pst.executeQuery();
                                while (rs.next()) {
                                    amount = amount + (rs.getFloat("total"));
                                }
                                totalbill.setText("" + amount);
                                itemcode3.requestFocus();

                            }
                        } catch (Exception ex) {
                            JOptionPane.showMessageDialog(rootPane, ex);

                        }
                        cmcustomer.setEnabled(false);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(buyitems11.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        String available=null;
        float amount = 0;
        String seriall = serialbuy.getText();
        String datee1 = year.getText() + "-" + month.getText() + "-" + day.getText();
        TimeZone tz = TimeZone.getTimeZone("GMT+02");
        Calendar c = Calendar.getInstance(tz);
        String time = String.format("%02d", c.get(Calendar.HOUR_OF_DAY)) + ":"
                + String.format("%02d", c.get(Calendar.MINUTE));
        String fulldatee = datee1 + " " + time;

        try {
            String sqldaf = "SELECT * FROM battry.storeitemlist where name='" + itemcode3.getText() + "' ";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqldaf);
            rs = pst.executeQuery();
            if (rs.next()) {
                price3.setText(rs.getString("price"));
                itemname3.setText(rs.getString("name"));
                nameitem = rs.getString("name");
                 available = rs.getString("number");
            }
             if (available.trim().equals("") || available.trim().equals("0") || Integer.parseInt(number3.getText()) > Integer.parseInt(available)) {
                    JOptionPane.showMessageDialog(rootPane, "لا يوجد عدد كافي");
                } else {
                 
             
            float numbber = Float.parseFloat(number3.getText());
            float pricee = Float.parseFloat(price3.getText());
            float total = numbber * pricee;

            try {
                String sqla1d = "UPDATE battry.storeitemlist SET number =number-(" + number3.getText() + "-1)   where barcode='" + itemcode3.getText() + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1d);
                pst.executeUpdate();
                String sqla111 = "UPDATE battry.storeitemlogs SET number ='" + "-" + number3.getText() + "'   where serial='" + seriall + "' and name = '" + nameitem + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla111);
                pst.executeUpdate();
                String sqla1 = "UPDATE battry.sellbattryitems SET number ='" + numbber + "',total='" + total + "'  WHERE  id='" + serialid.getText() + "' and buyserial='" + serialbuy.getText() + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqla1);
                pst.executeUpdate();
                tablelord();
                String sqld = "SELECT total FROM battry.sellbattryitems where datee='" + datee1 + "' and buyserial='" + seriall + "'";
                pst = (PreparedStatement) DBConnect.con.prepareStatement(sqld);
                rs = pst.executeQuery();
                while (rs.next()) {
                    amount = amount + (rs.getFloat("total"));
                }
                totalbill.setText("" + amount);
                number3.setEditable(false);
                add4.setEnabled(false);
                serialid.setText("");
                itemcode3.setText("");
                itemcode3.requestFocus();
                price3.setText("");
                number3.setText("1");
            } catch (SQLException ex) {
                Logger.getLogger(buyitems11.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "ادخل رقم صحيح");
        }
    }//GEN-LAST:event_add4ActionPerformed

    private void add5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add5ActionPerformed
        try {
            searchitemm m = new searchitemm();
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(buyitems11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add5ActionPerformed

    private void add6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add6ActionPerformed
        try {
            searchitemm m = new searchitemm();
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(buyitems11.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_add6ActionPerformed

    private void khsmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_khsmKeyReleased
        try {
            float amount = Float.parseFloat(totalbill.getText());
            float paidd = Float.parseFloat(paid.getText());
            float khasm = Float.parseFloat(khsm.getText());
            float totall = amount - paidd - khasm;
            remaining.setText("" + totall);
        } catch (Exception e) {

        }
    }//GEN-LAST:event_khsmKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add3;
    private javax.swing.JButton add4;
    private javax.swing.JButton add5;
    private javax.swing.JButton add6;
    private javax.swing.JComboBox cmcustomer;
    private javax.swing.JLabel customerserial;
    private javax.swing.JLabel customerserial1;
    private javax.swing.JLabel date4;
    private javax.swing.JLabel date5;
    public javax.swing.JTextField day;
    public javax.swing.JTextField day1;
    private javax.swing.JButton delete;
    private javax.swing.JButton delete1;
    public javax.swing.JTextField itemcode;
    public javax.swing.JTextField itemcode3;
    private javax.swing.JLabel itemname;
    private javax.swing.JLabel itemname3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel48;
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
    public javax.swing.JTextField month;
    public javax.swing.JTextField month1;
    public javax.swing.JTextField number;
    public javax.swing.JTextField number3;
    private javax.swing.JTextField paid;
    private javax.swing.JTextField paid1;
    public javax.swing.JTextField price1;
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
    private javax.swing.JTextField totalbill;
    private javax.swing.JTextField totalbill1;
    private javax.swing.JLabel typecustomer;
    private javax.swing.JLabel typecustomer1;
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
                    rs.getString("itemname"),
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
                    + "AND  customername = '-' and datee='" + datee1 + "' order by id";
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
                    rs.getString("itemname"),
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
        price3.setText("");
        price1.setText("");
        cmcustomer.setSelectedIndex(0);
        cmcustomer.setEnabled(true);
        paid.setText("");
        remaining.setText("");
        totalbill.setText("");
        paid1.setText("");
        itemcode.setText("");
        remaining1.setText("");
        totalbill1.setText("");
        tablelord();
        tablelord1();
    }

    public void clear() {
        serialid4.setText("");
        price1.setText("");
        price3.setText("");
        itemcode.setText("");
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
