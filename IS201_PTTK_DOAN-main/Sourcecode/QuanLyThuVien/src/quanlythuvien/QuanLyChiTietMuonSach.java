/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;

import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import DAO.*;
import Object.*;
import java.awt.event.KeyEvent;

/**
 *
 * @author Nguyen Linh,minh
 */
public class QuanLyChiTietMuonSach extends javax.swing.JFrame {
    
    
    
  
    /**
     * Creates new form ChiTietMuonSach
     */
    public static String sql = "select * from CTMS order by MAPHIEUMUONSACH asc";
    public QuanLyChiTietMuonSach() {
        initComponents();
        showtb();
        getContentPane().setBackground(Color.white); 
          setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         
    }
    public final void showtb()
    {
    DuLieuBang.Load(sql, tbChiTietMuonSach);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaPhieuMuonSach = new javax.swing.JTextField();
        txtMaSach = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChiTietMuonSach = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        ThemMoi = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        Xoa = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        CapNhat = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        LamMoi = new javax.swing.JButton();
        TimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), null));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("Mã phiếu mượn sách");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setText("Mã sách");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtMaPhieuMuonSach, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(txtMaSach))
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaPhieuMuonSach, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 770, 190));

        tbChiTietMuonSach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbChiTietMuonSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MÃ PHIẾU MƯỢN SÁCH", "MÃ SÁCH"
            }
        ));
        tbChiTietMuonSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChiTietMuonSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbChiTietMuonSach);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 339, 763, 228));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHI TIẾT PHIẾU MƯỢN SÁCH");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 769, -1));

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_root_server_40px.png"))); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator4);

        ThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_plus_+_40px.png"))); // NOI18N
        ThemMoi.setFocusable(false);
        ThemMoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ThemMoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemMoiActionPerformed(evt);
            }
        });
        jToolBar1.add(ThemMoi);
        jToolBar1.add(jSeparator3);

        Xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_cancel_40px.png"))); // NOI18N
        Xoa.setFocusable(false);
        Xoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Xoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoaActionPerformed(evt);
            }
        });
        jToolBar1.add(Xoa);
        jToolBar1.add(jSeparator2);

        CapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_refresh_40px.png"))); // NOI18N
        CapNhat.setFocusable(false);
        CapNhat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        CapNhat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        CapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapNhatActionPerformed(evt);
            }
        });
        jToolBar1.add(CapNhat);
        jToolBar1.add(jSeparator1);

        LamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_restart_40px.png"))); // NOI18N
        LamMoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LamMoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoiActionPerformed(evt);
            }
        });
        jToolBar1.add(LamMoi);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 277, 292, 50));

        TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_search_30px.png"))); // NOI18N
        TimKiem.setFocusable(false);
        TimKiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TimKiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(723, 287, 43, 40));

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });
        getContentPane().add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 287, 364, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemActionPerformed
        // TODO add your handling code here:
        if(this.txtMaPhieuMuonSach.getText().length()!=0)    
        {
            String sql2 = " select * from CTMS where MAPHIEUMUONSACH like '%"+this.txtMaPhieuMuonSach.getText()+"%' ";
            DuLieuBang.Load(sql2, tbChiTietMuonSach);
        }
        else if(this.txtMaSach.getText().length()!=0)
            {
            String sql1 = " select * from CTMS where MASACH like '%"+this.txtMaSach.getText()+"%' ";
            DuLieuBang.Load(sql1, tbChiTietMuonSach);
            }
        else if(this.txtTimKiem.getText().length()!=0)
        {
            String sql3 = " select * from CTMS where MAPHIEUMUONSACH like '%"+this.txtTimKiem.getText()+"%'"
                    + "or MASACH like '%"+this.txtTimKiem.getText()+"%' ";
            DuLieuBang.Load(sql3, tbChiTietMuonSach);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Bạn chưa nhập","Thông báo",1);
        }

        
    }//GEN-LAST:event_TimKiemActionPerformed

    private void tbChiTietMuonSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChiTietMuonSachMouseClicked
        // TODO add your handling code here:
        try{
            
           int row = this.tbChiTietMuonSach.getSelectedRow();
           String MArow = (String) (this.tbChiTietMuonSach.getModel().getValueAt(row, 0));
           String sql1 = " select * from CTMS where MAPHIEUMUONSACH='"+MArow+"'";
           ResultSet rs = DuLieuBang.ShowTextField(sql1);
           
           if(rs.next())
           {
               
               this.txtMaPhieuMuonSach.setText(rs.getString("MAPHIEUMUONSACH"));
               this.txtMaSach.setText(rs.getString("MASACH"));
               
           }
           
    }                                      
 
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbChiTietMuonSachMouseClicked

    private void LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoiActionPerformed
        // TODO add your handling code here:
        txtMaPhieuMuonSach.setText("");
        txtMaSach.setText("");
        txtTimKiem.setText("");
        showtb();
    }//GEN-LAST:event_LamMoiActionPerformed

    private void ThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemMoiActionPerformed
        // TODO add your handling code here:
        if(this.txtMaPhieuMuonSach.getText().length()==0)
            JOptionPane.showMessageDialog(null,"Bạn chưa nhập mã phiếu mượn sách","Thông báo",1);
        else
            if(this.txtMaSach.getText().length()==0)
                JOptionPane.showMessageDialog(null,"Bạn chưa nhập mã sách","Thông báo",1);
        else
        {
            try{        
                int result = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn thêm phiếu mượn sách này","Xác nhận",JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){
                ChiTietMuonSach ctms = new ChiTietMuonSach();
                ctms.setmAPHIEUMUONSACH(txtMaPhieuMuonSach.getText());
                ctms.setmASACH(txtMaSach.getText());
                ChiTietMuonSachDAO.InsertCTMS(ctms);           
                JOptionPane.showMessageDialog(null, "Mã phiếu mượn sách được thêm vào thành công","Thông báo",1 );    
                showtb();
        }
            }
            catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Lỗi: "+ e.getMessage(),"Thông báo",1 );
                }    
            }
    }//GEN-LAST:event_ThemMoiActionPerformed

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        // TODO add your handling code here:
         if(this.txtMaPhieuMuonSach.getText().length()==0)
           JOptionPane.showMessageDialog(null,"Bạn cần chọn mã phiếu mượn sách để xóa","Thông báo",1);
        else
        {
        try{  
                
        int result = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn xóa phiếu mượn sách này","Xác nhận", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION){
            
                ChiTietMuonSach ctms = new ChiTietMuonSach();
                ctms.setmAPHIEUMUONSACH(txtMaPhieuMuonSach.getText());
                ctms.setmASACH(txtMaSach.getText());
        ChiTietMuonSachDAO.DeleteCTMS(ctms);
        JOptionPane.showMessageDialog(null, "Phiếu mượn sách xóa thành công!", "Thông báo",1);
        showtb();
        } else {
        JOptionPane.showMessageDialog(null, "Phiếu mượn sách xóa thất bại!", "Thông báo",1);
        }
      } catch (Exception e){
          JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
         
      }
        } 
    }//GEN-LAST:event_XoaActionPerformed

    private void CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapNhatActionPerformed
        // TODO add your handling code here:
        if(this.txtMaPhieuMuonSach.getText().length()==0)
            JOptionPane.showMessageDialog(null,"Bạn chưa nhập mã phiếu mượn sách","Thông báo",1);
        else
        {
            try{      
                int result = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn cập nhật phiếu mượn sách này","Xác nhận",JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){
                ChiTietMuonSach ctms = new ChiTietMuonSach();
                ctms.setmAPHIEUMUONSACH(txtMaPhieuMuonSach.getText());
                ctms.setmASACH(txtMaSach.getText());
                ChiTietMuonSachDAO dao = new ChiTietMuonSachDAO();
                dao.UpdateCTMS(ctms);           
                JOptionPane.showMessageDialog(null, "Mã phiếu mượn sách được sửa thành công","Thông báo",1 );       
                showtb();
        }
            }
            catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Lỗi: "+ e.getMessage(),"Thông báo",1 );
                }    
            }
    }//GEN-LAST:event_CapNhatActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String sql3 = " select * from CTMS where MAPHIEUMUONSACH like '%"+this.txtTimKiem.getText()+"%'"
                    + "or MASACH like '%"+this.txtTimKiem.getText()+"%' ";
            DuLieuBang.Load(sql3, tbChiTietMuonSach);
        }
    }//GEN-LAST:event_txtTimKiemKeyPressed

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
            java.util.logging.Logger.getLogger(QuanLyChiTietMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyChiTietMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyChiTietMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyChiTietMuonSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyChiTietMuonSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CapNhat;
    private javax.swing.JButton LamMoi;
    private javax.swing.JButton ThemMoi;
    private javax.swing.JButton TimKiem;
    private javax.swing.JButton Xoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tbChiTietMuonSach;
    private javax.swing.JTextField txtMaPhieuMuonSach;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}