/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;
import java.sql.*;
import javax.swing.*;
import DAO.*;
import Object.*;
//import com.sun.glass.events.KeyEvent;
import java.awt.event.KeyEvent;
import java.awt.Color;

/**
 *
 * @author Nguyen Linh,minh
 */
public class QuanLyChiTietTraSach extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietTraSach
     */
    public static String sql = "select * from CTTS order by MAPHIEUTRA asc";
   
    public QuanLyChiTietTraSach() {
        initComponents();
        showtb();
         getContentPane().setBackground(Color.white); 
           setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
public final void showtb()
    {
    DuLieuBang.Load(sql, tbChiTietPhieuTraSach);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        ThemMoi = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        Xoa = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        CapNhat = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        LamMoi = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaPhieuTra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoNgayTraTre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTienPhat = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChiTietPhieuTraSach = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_root_server_40px.png"))); // NOI18N
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator5);

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
        CapNhat.setToolTipText("");
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
        LamMoi.setFocusable(false);
        LamMoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        LamMoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoiActionPerformed(evt);
            }
        });
        jToolBar1.add(LamMoi);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 305, 285, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), null));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("Mã phiếu trả");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setText("Mã sách");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setText("Số ngày trả trễ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel5.setText("Tiền phạt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienPhat, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSoNgayTraTre, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtMaPhieuTra, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaPhieuTra, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoNgayTraTre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTienPhat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 77, 730, 220));

        tbChiTietPhieuTraSach.setModel(new javax.swing.table.DefaultTableModel(
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
                "MÃ PHIẾU TRẢ", "MÃ SÁCH", "SỐ NGÀY TRẢ TRỄ", "TIỀN PHẠT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbChiTietPhieuTraSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbChiTietPhieuTraSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbChiTietPhieuTraSach);
        if (tbChiTietPhieuTraSach.getColumnModel().getColumnCount() > 0) {
            tbChiTietPhieuTraSach.getColumnModel().getColumn(0).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 367, 720, 203));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CHI TIẾT PHIẾU TRẢ SÁCH");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 730, -1));

        TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_search_30px.png"))); // NOI18N
        TimKiem.setFocusable(false);
        TimKiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        TimKiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimKiemActionPerformed(evt);
            }
        });
        getContentPane().add(TimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 319, 41, -1));

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });
        getContentPane().add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 319, 382, 36));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tbChiTietPhieuTraSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbChiTietPhieuTraSachMouseClicked
        // TODO add your handling code here:
        try{
            
           int row = this.tbChiTietPhieuTraSach.getSelectedRow();
           String MArow = (String) (this.tbChiTietPhieuTraSach.getModel().getValueAt(row, 0));
           String sql1 = " select * from CTTS where MAPHIEUTRA='"+MArow+"'";
           ResultSet rs = DuLieuBang.ShowTextField(sql1);
           
           if(rs.next())
           {
               
               this.txtMaPhieuTra.setText(rs.getString("MAPHIEUTRA"));
               this.txtMaSach.setText(rs.getString("MASACH"));               
               this.txtSoNgayTraTre.setText(rs.getString("SONGAYTRATRE"));
               this.txtTienPhat.setText(rs.getString("TIENPHAT"));
           
               
           }
           
    }                                      
 
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tbChiTietPhieuTraSachMouseClicked

    private void TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimKiemActionPerformed
        // TODO add your handling code here:
         if(this.txtMaPhieuTra.getText().length()!=0)
         {
            String sql1 = " select * from CTTS where MAPHIEUTRA like '%"+this.txtMaPhieuTra.getText()+"%' ";
            DuLieuBang.Load(sql1, tbChiTietPhieuTraSach);
         }
         else if(this.txtMaSach.getText().length()!=0)
         {
            String sql2 = " select * from CTTS where MASACH like '%"+this.txtMaSach.getText()+"%' ";
            DuLieuBang.Load(sql2, tbChiTietPhieuTraSach);
         }
         else if(this.txtTimKiem.getText().length()!=0)
         {
            String sql3 = " select * from CTTS where MASACH like '%"+this.txtTimKiem.getText()+"%'"
                    + "or MAPHIEUTRA like '%"+this.txtTimKiem.getText()+"%' ";
            DuLieuBang.Load(sql3, tbChiTietPhieuTraSach);
         }
         else
         {
              JOptionPane.showMessageDialog(null,"Bạn chưa nhập","Thông báo",1);
         }
       
        
    }//GEN-LAST:event_TimKiemActionPerformed

    private void ThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemMoiActionPerformed
        // TODO add your handling code here:
        if(this.txtMaPhieuTra.getText().length()==0)
            JOptionPane.showMessageDialog(null,"Bạn chưa nhập mã phiếu trả","Thông báo",1);
        else
            if(this.txtMaSach.getText().length()==0)
                JOptionPane.showMessageDialog(null,"Bạn chưa nhập mã sách","Thông báo",1);
        else
            {
        try
        {      int result = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn thêm phiếu trả sách này","Xác nhận",JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){      
            ChiTietTraSach ctts = new ChiTietTraSach();
            ctts.setmAPHIEUTRA(txtMaPhieuTra.getText());
            ctts.setmASACH(txtMaSach.getText());
            ctts.setsONGAYTRATRE(txtSoNgayTraTre.getText());
            ctts.settIENPHAt(txtTienPhat.getText());
            

            ChiTietTraSachDAO.InsertCTTS(ctts);           
            JOptionPane.showMessageDialog(null, "Mã phiếu trả được thêm vào thành công","Thông báo",1 );  
            showtb();
        }}
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Lỗi!"+ e.getMessage(),"Thông báo",1 );
                }
            }
    }//GEN-LAST:event_ThemMoiActionPerformed

    private void XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoaActionPerformed
        // TODO add your handling code here:
        if(this.txtMaPhieuTra.getText().length()==0)
           JOptionPane.showMessageDialog(null,"Bạn cần chọn mã phiếu trả sách để xóa","Thông báo",1);
        else
        {
        try{  
                
        int result = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn xóa phiếu trả sách này","Xác nhận",JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION){
            ChiTietTraSach ctts = new ChiTietTraSach();
            ctts.setmAPHIEUTRA(txtMaPhieuTra.getText());
            ctts.setmASACH(txtMaSach.getText());
        ChiTietTraSachDAO.DeleteCTTS(ctts);
        JOptionPane.showMessageDialog(null, "Phiếu trả sách xóa thành công!", "Thông báo",1);
        showtb();
        } else {
        JOptionPane.showMessageDialog(null, "Phiếu trả sách xóa thất bại!", "Thông báo",1);
        }
      } catch (Exception e){
          JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());
      }
      }
    }//GEN-LAST:event_XoaActionPerformed

    private void CapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapNhatActionPerformed
        // TODO add your handling code here:
        if(this.txtMaPhieuTra.getText().length()==0)
            JOptionPane.showMessageDialog(null,"Bạn chưa nhập mã phiếu trả","Thông báo",1);
    
        else
            {
        try
        {    
             int result = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn cập nhật phiếu trả sách này","Xác nhận",JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){
            ChiTietTraSach ctts = new ChiTietTraSach();
            ctts.setmAPHIEUTRA(txtMaPhieuTra.getText());
            ctts.setmASACH(txtMaSach.getText());
            ctts.setsONGAYTRATRE(txtSoNgayTraTre.getText());
            ctts.settIENPHAt(txtTienPhat.getText());
            
            ChiTietTraSachDAO dao = new ChiTietTraSachDAO();
            dao.UpdateCTTS(ctts);           
            JOptionPane.showMessageDialog(null, "Mã phiếu trả được sửa thành công","Thông báo",1 );    
            showtb();
        }}
        catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Lỗi!"+ e.getMessage(),"Thông báo",1 );
                }
            }
    }//GEN-LAST:event_CapNhatActionPerformed

    private void LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoiActionPerformed
        // TODO add your handling code here:
        txtMaPhieuTra.setText("");
        txtMaSach.setText("");
        txtSoNgayTraTre.setText("");
        txtTienPhat.setText("");
        txtTimKiem.setText("");
        showtb();
    }//GEN-LAST:event_LamMoiActionPerformed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String sql3 = " select * from CTTS where MASACH like '%"+this.txtTimKiem.getText()+"%'"
                    + "or MAPHIEUTRA like '%"+this.txtTimKiem.getText()+"%' ";
            DuLieuBang.Load(sql3, tbChiTietPhieuTraSach);
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
            java.util.logging.Logger.getLogger(QuanLyChiTietTraSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyChiTietTraSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyChiTietTraSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyChiTietTraSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyChiTietTraSach().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable tbChiTietPhieuTraSach;
    private javax.swing.JTextField txtMaPhieuTra;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtSoNgayTraTre;
    private javax.swing.JTextField txtTienPhat;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}