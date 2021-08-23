/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hany;

import Store.storeHome;
import java.awt.ComponentOrientation;
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author amnassar
 */
public class MainPage extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    LoginForm l ;
    public  String LL=null;
    Connection con ;
    PreparedStatement pst ;
    ResultSet rs; 
    public String y; 
    public String type;
    private ImageIcon icon;
    public MainPage(String x) throws IOException {
        initComponents();
        icon = new ImageIcon(getClass().getResource("/Image/printing.png "));
        this.setIconImage(icon.getImage());
          
        name11.setText(x);
        name11.setVisible(true);
       checkusertype();
  }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        meall = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        type2 = new javax.swing.JLabel();
        name11 = new javax.swing.JLabel();
        type3 = new javax.swing.JLabel();
        name12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(17, 39, 37));
        setMinimumSize(new java.awt.Dimension(1200, 740));

        jPanel1.setBackground(new java.awt.Color(17, 39, 37));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 740));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 740));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 740));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meall.setBackground(new java.awt.Color(204, 255, 255));
        meall.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        meall.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/attend00.png"))); // NOI18N
        meall.setText("المطبعة");
        meall.setPreferredSize(new java.awt.Dimension(169, 89));
        meall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meallActionPerformed(evt);
            }
        });
        jPanel1.add(meall, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 190, 300, 150));

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-google-blog-search-64.png"))); // NOI18N
        jButton1.setText("تسجيل الخروج");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 220, 100));

        jButton3.setBackground(new java.awt.Color(204, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 3, 30)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Print_1.png"))); // NOI18N
        jButton3.setText("المخزن");
        jButton3.setPreferredSize(new java.awt.Dimension(169, 89));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 300, 150));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/myback.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1180, 710));
        jLabel2.setMinimumSize(new java.awt.Dimension(1180, 710));
        jLabel2.setPreferredSize(new java.awt.Dimension(1200, 740));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 740));

        type2.setForeground(new java.awt.Color(255, 255, 255));
        type2.setText("jLabel1");
        jPanel1.add(type2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 150, 30));

        name11.setBackground(new java.awt.Color(204, 153, 0));
        name11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name11.setForeground(new java.awt.Color(255, 255, 255));
        name11.setText("jLabel2");
        jPanel1.add(name11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 30));

        type3.setForeground(new java.awt.Color(255, 255, 255));
        type3.setText("jLabel1");
        jPanel1.add(type3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 150, 30));

        name12.setBackground(new java.awt.Color(204, 153, 0));
        name12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        name12.setForeground(new java.awt.Color(255, 255, 255));
        name12.setText("jLabel2");
        jPanel1.add(name12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 80, 30));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void meallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meallActionPerformed
        
        try {
            LL=name11.getText();
            
            try {
                new Home(LL).setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_meallActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

         LoginForm l = new LoginForm();
             l.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         try {
            LL=name11.getText();
            
             try {
                 new storeHome(LL).setVisible(true);
             } catch (ParseException ex) {
                 Logger.getLogger(MainPage.class.getName()).log(Level.SEVERE, null, ex);
             }
            this.dispose();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton meall;
    private javax.swing.JLabel name11;
    private javax.swing.JLabel name12;
    private javax.swing.JLabel type2;
    private javax.swing.JLabel type3;
    // End of variables declaration//GEN-END:variables

   public void checkusertype()
   {
         try {
            String sqll = "SELECT type from mrahmed.users WHERE username='"+name11.getText()+"'";
              pst=(PreparedStatement) DBConnect.con.prepareStatement(sqll);
            rs=pst.executeQuery();
         while (rs.next())
                {
                 type=rs.getString("type");
                 type2.setText(type);
                }
        }
        catch (SQLException ex) {
            
        }
   }
 

}
