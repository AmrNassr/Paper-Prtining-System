/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import hany.*;
import java.awt.ComponentOrientation;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.io.File;
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
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author amnassar
 */
public class storeHome extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    LoginForm l;
     
    PreparedStatement pst;
    ResultSet rs;
    public String y;

    public String type;

    public storeHome(String x) throws IOException, ParseException {
        initComponents();
   
         
        name11.setText(x);
        name11.setVisible(true);
        jMenuBar1.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        y = x;
        checkusertype();
        System.out.print(type);
        if (type2.getText().equals("admin")) {
            jMenuItem3.setEnabled(true);
            jMenuItem4.setEnabled(true);
            jMenuItem5.setEnabled(true);
            jMenuItem8.setEnabled(true);
            jMenuItem7.setEnabled(true);
            jMenuItem9.setEnabled(true);
            jMenuItem10.setEnabled(true);
            jMenuItem11.setEnabled(true);
            jMenuItem12.setEnabled(true);
            jMenuItem15.setEnabled(true);
            jMenuItem16.setEnabled(true);
            jMenuItem18.setEnabled(true);
            jMenuItem17.setEnabled(true);
            jMenuItem19.setEnabled(true);

        }
        storeitems ad = new storeitems(y);
        jDesktopPane1.add(ad).setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jButton5 = new javax.swing.JButton();
        tkheen = new javax.swing.JButton();
        detailss = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tsken = new javax.swing.JButton();
        suppliers = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        name11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Homeee = new javax.swing.JMenu();
        additems = new javax.swing.JMenuItem();
        additems1 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(17, 39, 37));
        jPanel1.setMaximumSize(new java.awt.Dimension(1240, 790));
        jPanel1.setMinimumSize(new java.awt.Dimension(1240, 790));
        jPanel1.setPreferredSize(new java.awt.Dimension(1240, 790));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setPreferredSize(new java.awt.Dimension(980, 750));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 980, 660));

        jButton5.setBackground(new java.awt.Color(204, 255, 255));
        jButton5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/payment-64.png"))); // NOI18N
        jButton5.setText("مصروفات");
        jButton5.setPreferredSize(new java.awt.Dimension(169, 89));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 580, 230, 90));

        tkheen.setBackground(new java.awt.Color(204, 255, 255));
        tkheen.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tkheen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/loupe.png"))); // NOI18N
        tkheen.setText("بحث عن فتورة");
        tkheen.setPreferredSize(new java.awt.Dimension(169, 89));
        tkheen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkheenActionPerformed(evt);
            }
        });
        jPanel1.add(tkheen, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 470, 230, 90));

        detailss.setBackground(new java.awt.Color(204, 255, 255));
        detailss.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        detailss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/items.png"))); // NOI18N
        detailss.setText("المنتجات");
        detailss.setPreferredSize(new java.awt.Dimension(169, 89));
        detailss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                detailssActionPerformed(evt);
            }
        });
        jPanel1.add(detailss, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 30, 230, 90));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/shopping-cart.png"))); // NOI18N
        jButton1.setText("الشراء");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 140, 230, 90));

        tsken.setBackground(new java.awt.Color(204, 255, 255));
        tsken.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tsken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/rating.png"))); // NOI18N
        tsken.setText("العملاء");
        tsken.setPreferredSize(new java.awt.Dimension(169, 89));
        tsken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tskenActionPerformed(evt);
            }
        });
        jPanel1.add(tsken, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 360, 230, 90));

        suppliers.setBackground(new java.awt.Color(204, 255, 255));
        suppliers.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        suppliers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/selling.png"))); // NOI18N
        suppliers.setText("البيع ");
        suppliers.setPreferredSize(new java.awt.Dimension(169, 89));
        suppliers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suppliersActionPerformed(evt);
            }
        });
        jPanel1.add(suppliers, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 250, 230, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/images.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1240, 790));
        jLabel2.setMinimumSize(new java.awt.Dimension(1240, 790));
        jLabel2.setPreferredSize(new java.awt.Dimension(1240, 790));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 730));

        type2.setForeground(new java.awt.Color(255, 255, 255));
        type2.setText("jLabel1");
        jPanel1.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 150, 30));

        name11.setBackground(new java.awt.Color(204, 153, 0));
        name11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name11.setForeground(new java.awt.Color(255, 255, 255));
        name11.setText("jLabel2");
        jPanel1.add(name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 30));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(131, 28));

        Homeee.setText("الرئيسية");
        Homeee.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        Homeee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeeeActionPerformed(evt);
            }
        });

        additems.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        additems.setText("الموردين");
        additems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additemsActionPerformed(evt);
            }
        });
        Homeee.add(additems);

        additems1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        additems1.setText("المخازن");
        additems1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additems1ActionPerformed(evt);
            }
        });
        Homeee.add(additems1);

        jMenuItem15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem15.setText("استلام اموال من العملاء");
        jMenuItem15.setEnabled(false);
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        Homeee.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem16.setText("المستحقات الخارجية");
        jMenuItem16.setEnabled(false);
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        Homeee.add(jMenuItem16);

        jMenuItem8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem8.setText("دفع مديونات");
        jMenuItem8.setEnabled(false);
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        Homeee.add(jMenuItem8);

        jMenuItem11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem11.setText("المديونات");
        jMenuItem11.setEnabled(false);
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        Homeee.add(jMenuItem11);

        jMenuItem36.setText("الرئيسية");
        jMenuItem36.setActionCommand("");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        Homeee.add(jMenuItem36);

        jMenuBar1.add(Homeee);

        jMenu10.setText("تقارير");
        jMenu10.setAlignmentX(0.0F);
        jMenu10.setAlignmentY(0.0F);
        jMenu10.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu10ActionPerformed(evt);
            }
        });

        jMenuItem3.setText("حصر المخزون");
        jMenuItem3.setEnabled(false);
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem3);

        jMenuItem4.setText("تقرير مخزن");
        jMenuItem4.setEnabled(false);
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem4);

        jMenuItem5.setText("المشتريات");
        jMenuItem5.setEnabled(false);
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem5);

        jMenuItem7.setText("المبيعات");
        jMenuItem7.setEnabled(false);
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem7);

        jMenuItem17.setText("تفاصيل مستحقات العملاء");
        jMenuItem17.setEnabled(false);
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem17);

        jMenuItem18.setText("تفاصيل مدفوعات العملاء");
        jMenuItem18.setEnabled(false);
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem18);

        jMenuItem19.setText("تفاصيل مدفوعات عميل");
        jMenuItem19.setEnabled(false);
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem19);

        jMenuItem9.setText("تفاصيل مستحقات الموردين");
        jMenuItem9.setEnabled(false);
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem9);

        jMenuItem10.setText("تفاصيل مدفوعات الموردين");
        jMenuItem10.setEnabled(false);
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem10);

        jMenuItem12.setText("تفاصيل مدفوعات مورد");
        jMenuItem12.setEnabled(false);
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem12);

        jMenuItem6.setText("تقرير مصروفات");
        jMenuItem6.setActionCommand("");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem6);

        jMenuItem13.setText("تقريرنوع مصروفات");
        jMenuItem13.setActionCommand("");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem13);

        jMenuItem20.setText("متابعة منتج");
        jMenuItem20.setActionCommand("");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem20);

        jMenuBar1.add(jMenu10);

        jMenu9.setText("بحث");
        jMenu9.setAlignmentX(0.0F);
        jMenu9.setAlignmentY(0.0F);
        jMenu9.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        jMenu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu9ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1240, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jDesktopPane1.removeAll();
        msrofat addd = new msrofat();
        jDesktopPane1.add(addd).setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void detailssActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_detailssActionPerformed
        try {
            jDesktopPane1.removeAll();
            storeitems addd = new storeitems(y);
            jDesktopPane1.add(addd).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_detailssActionPerformed

    private void tskenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tskenActionPerformed
        jDesktopPane1.removeAll();
        customer addd = new customer();
        jDesktopPane1.add(addd).setVisible(true);

    }//GEN-LAST:event_tskenActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            jDesktopPane1.removeAll();
            additem addd = new additem();
            jDesktopPane1.add(addd).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void suppliersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suppliersActionPerformed
        jDesktopPane1.removeAll();
        buyitems11 addd = new buyitems11();
        jDesktopPane1.add(addd).setVisible(true);
    }//GEN-LAST:event_suppliersActionPerformed

    private void tkheenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkheenActionPerformed

        jDesktopPane1.removeAll();
        searchbill addd = new searchbill();
        jDesktopPane1.add(addd).setVisible(true);
    }//GEN-LAST:event_tkheenActionPerformed

    private void HomeeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeeeActionPerformed

    }//GEN-LAST:event_HomeeeActionPerformed

    private void jMenu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu9ActionPerformed

    }//GEN-LAST:event_jMenu9ActionPerformed

    private void additemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additemsActionPerformed
        try {
            addsupplier m = new addsupplier();
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_additemsActionPerformed

    private void jMenu10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu10ActionPerformed

    private void additems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additems1ActionPerformed
        try {
            addstore m = new addstore();
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_additems1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        InputStream in = null;
        try {

            in = this.getClass().getResourceAsStream("/reports/storeitems.jasper");
            String reportpath = "\\\\192.168.1.15\\sadam\\storeitems.jasper";
            Map<String, Object> para = new HashMap<String, Object>();
            JasperPrint j = JasperFillManager.fillReport(in, para,DBConnect.con);
            JasperViewer.viewReport(j, false);
        } catch (JRException ex) {

            JOptionPane.showMessageDialog(null, ex);
        } finally {
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        storetype m = new storetype();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        storebuyreport m = new storebuyreport();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        storesellreport m = new storesellreport();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        try {
            paysupplier m = new paysupplier();
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        supplieramountdetails m = new supplieramountdetails();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        supplieramountdetailspayed m = new supplieramountdetailspayed();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        InputStream in = null;
        try {

            in = this.getClass().getResourceAsStream("/reports/supplierneeded.jasper");
            String reportpath = "\\\\192.168.1.15\\sadam\\supplierneeded.jasper";
            Map<String, Object> para = new HashMap<String, Object>();
            JasperPrint j = JasperFillManager.fillReport(in, para,DBConnect.con);
            JasperViewer.viewReport(j, false);
        } catch (JRException ex) {

            JOptionPane.showMessageDialog(null, ex);
        } finally {
        }
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        supplierpayed m = new supplierpayed();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        msrofatreport m = new msrofatreport();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        msrofatreporttype m = new msrofatreporttype();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
         LoginForm l = new LoginForm();
             l.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        try {
            customerpay m = new customerpay();
            m.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(storeHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        InputStream in = null;
        try {

            in = this.getClass().getResourceAsStream("/reports/customerneeded.jasper");
            Map<String, Object> para = new HashMap<String, Object>();
            JasperPrint j = JasperFillManager.fillReport(in, para,DBConnect.con);
            JasperViewer.viewReport(j, false);
        } catch (JRException ex) {

            JOptionPane.showMessageDialog(null, ex);
        } finally {
        }
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        customeramountdetails m = new customeramountdetails();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed

        customeramountdetailspayed m = new customeramountdetailspayed();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        customerpayed m = new customerpayed();
        m.setVisible(true);

    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        itemfollowup m = new itemfollowup();
        m.setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Homeee;
    private javax.swing.JMenuItem additems;
    private javax.swing.JMenuItem additems1;
    public javax.swing.JButton detailss;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton5;
    public javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name11;
    public javax.swing.JButton suppliers;
    public javax.swing.JButton tkheen;
    public javax.swing.JButton tsken;
    private javax.swing.JLabel type2;
    // End of variables declaration//GEN-END:variables

    public void checkusertype() {
        try {
            String sqll = "SELECT type from battry.users WHERE username='" + name11.getText() + "'";
            pst = (PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs = pst.executeQuery();
            while (rs.next()) {
                type = rs.getString("type");
                type2.setText(type);
            }
        } catch (SQLException ex) {

        }
    }

}
