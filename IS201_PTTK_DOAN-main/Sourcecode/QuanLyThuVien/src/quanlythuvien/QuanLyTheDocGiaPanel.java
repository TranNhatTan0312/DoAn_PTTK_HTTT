/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;

/**
 *
 * @author minh
 */
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
import DAO.*;
import Object.*;
//import com.sun.glass.events.KeyEvent;
import java.awt.event.KeyEvent;

public class QuanLyTheDocGiaPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyDocGia
     */
    public static String sql = "select * from DOCGIA order by MADOCGIA asc";
    public QuanLyTheDocGiaPanel() {
        initComponents();
        showtb();
        setBackground(Color.white); 
    }
    public final void showtb()
    {
    DuLieuBang.Load(sql, tbDocGia);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaDocGia = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtLoaiDG = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTinhTrang = new javax.swing.JTextField();
        jDateNgaySinh = new com.toedter.calendar.JDateChooser();
        jDateNgayLapThe = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDocGia = new javax.swing.JTable();
        btTimKiem = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btCapNhat = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btThemMoi = new javax.swing.JButton();
        btLamMoi = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 1000));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(309, 395));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel2.setText("Mã độc giả");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel3.setText("Họ tên");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel4.setText("Ngày sinh");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel5.setText("Loại độc giả");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel6.setText("Địa chỉ");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel8.setText("Ngày lập thẻ");

        txtMaDocGia.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMaDocGia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMaDocGiaKeyPressed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        jLabel9.setText("Tình trạng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoaiDG, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txtMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jDateNgayLapThe, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jDateNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jDateNgayLapThe, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoaiDG, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 900, 280));

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));

        jLabel1.setBackground(new java.awt.Color(255, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ THẺ ĐỘC GIẢ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), null));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jScrollPane1.setMinimumSize(new java.awt.Dimension(884, 270));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(884, 270));

        tbDocGia.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MÃ ĐỘC GIẢ", "HỌ TÊN", "NGÀY SINH", "LOẠI DG", "ĐỊA CHỈ", "EMAIL", "NGÀY LẬP THẺ"
            }
        ));
        tbDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDocGiaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDocGia);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 880, 220));

        btTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_search_30px.png"))); // NOI18N
        btTimKiem.setFocusable(false);
        btTimKiem.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btTimKiem.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemActionPerformed(evt);
            }
        });
        add(btTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, 45, 40));

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyPressed(evt);
            }
        });
        add(txtTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 475, 39));

        btCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_refresh_40px.png"))); // NOI18N
        btCapNhat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCapNhat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCapNhatActionPerformed(evt);
            }
        });
        add(btCapNhat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 50, 50));

        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_cancel_40px.png"))); // NOI18N
        btXoa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btXoa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });
        add(btXoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 50, 50));

        btThemMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_plus_+_40px.png"))); // NOI18N
        btThemMoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btThemMoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemMoiActionPerformed(evt);
            }
        });
        add(btThemMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 50, 50));

        btLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8_restart_40px.png"))); // NOI18N
        btLamMoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLamMoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLamMoiActionPerformed(evt);
            }
        });
        add(btLamMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 50, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void tbDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDocGiaMouseClicked
        // TODO add your handling code here:
        try{
            
           int row = this.tbDocGia.getSelectedRow();
           String MArow = (String) (this.tbDocGia.getModel().getValueAt(row, 0));
           String sql1 = " select * from DOCGIA where MADOCGIA='"+MArow+"'";
           ResultSet rs = DuLieuBang.ShowTextField(sql1);
           
           if(rs.next())
           {
               
               this.txtMaDocGia.setText(rs.getString("MADOCGIA"));
               this.txtHoTen.setText(rs.getString("HOTEN"));
               this.jDateNgaySinh.setDate(rs.getDate("NGAYSINH"));
               this.txtLoaiDG.setText(rs.getString("LOAIDG"));
               this.txtDiaChi.setText(rs.getString("DIACHI"));
               this.txtEmail.setText(rs.getString("EMAIL"));
               this.jDateNgayLapThe.setDate(rs.getDate("NGLAPTHE"));
               this.txtTinhTrang.setText(rs.getString("TINHTRANG"));
               
           }
           
    }                                      
 
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_tbDocGiaMouseClicked

    private void btLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLamMoiActionPerformed
        // TODO add your handling code here:
        txtMaDocGia.setText("");
        txtHoTen.setText("");
        jDateNgaySinh.setDate(null);
        txtDiaChi.setText("");
        txtLoaiDG.setText("");
        txtEmail.setText("");
        jDateNgayLapThe.setDate(null);
        txtTimKiem.setText("");
        txtTinhTrang.setText("");
        showtb();
    }//GEN-LAST:event_btLamMoiActionPerformed

    private void btCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCapNhatActionPerformed
        // TODO add your handling code here:
        if(this.txtMaDocGia.getText().length()==0)
        JOptionPane.showMessageDialog(null,"Bạn chưa nhập mã độc giả","Thông báo",1);
        else
        {
            try{
                int result = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn cập nhật độc giả này","Xác nhận",JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){
                DocGia dg = new DocGia();

                dg.setmADOCGIA(txtMaDocGia.getText());
                dg.sethOTEN(txtHoTen.getText());
                if(jDateNgaySinh.getDate() != null )
                {
                    java.util.Date utilStartDate = jDateNgaySinh.getDate();
                    java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
                    dg.setnGAYSINH(sqlStartDate);}
                //dg.setnGAYSINH((Date) jDateNgaySinh.getDate());
                dg.setlOAIDG(txtLoaiDG.getText());
                dg.setdIACHI(txtDiaChi.getText());
                dg.seteMAIL(txtEmail.getText());
                if(jDateNgayLapThe.getDate() != null )
                {
                    java.util.Date utilStartDate = jDateNgayLapThe.getDate();
                    java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
                    dg.setnGAYLAPTHE(sqlStartDate);}
                //dg.setnGAYLAPTHE((Date) jDateNgayLapThe.getDate());
                DocGiaDAO dao = new DocGiaDAO();
                dao.UpdateDocGia(dg);
                JOptionPane.showMessageDialog(null, "Độc giả được sửa thành công","Thông báo",1 );
                showtb();
            }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Lỗi!"+ e.getMessage(),"Thông báo",1 );
            }
        }
    }//GEN-LAST:event_btCapNhatActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        if(this.txtMaDocGia.getText().length()==0)
        JOptionPane.showMessageDialog(null,"Bạn cần chọn mã độc giả để xóa","Thông báo",1);
        else
        {
            try{

                int result = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn xóa độc giả này","Xác nhận",JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){
                    DocGiaDAO.DeleteDocGia(txtMaDocGia.getText());
                    JOptionPane.showMessageDialog(null, "Độc giả xóa thành công!", "Thông báo",1);
                    showtb();
                } else {
                    JOptionPane.showMessageDialog(null, "Độc giả xóa thất bại!", "Thông báo",1);
                }
            } catch (Exception e){
                JOptionPane.showMessageDialog(this, "Lỗi: " + e.getMessage());

            }
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemMoiActionPerformed
        // TODO add your handling code here:
        if(this.txtMaDocGia.getText().length()==0)
        JOptionPane.showMessageDialog(null,"Bạn chưa nhập mã độc giả","Thông báo",1);
        else
        if(this.txtHoTen.getText().length()==0)
        JOptionPane.showMessageDialog(null,"Bạn chưa nhập tên độc giả","Thông báo",1);
        else
        {
            try
            {
                 int result = JOptionPane.showConfirmDialog(this,"Bạn chắc chắn muốn thêm độc giả này","Xác nhận",JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION){
                DocGia dg = new DocGia();
                dg.setmADOCGIA(txtMaDocGia.getText());
                dg.sethOTEN(txtHoTen.getText());
                if(jDateNgaySinh.getDate() != null )
                {
                    java.util.Date utilStartDate = jDateNgaySinh.getDate();
                    java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
                    dg.setnGAYSINH(sqlStartDate);}
                //dg.setnGAYSINH((Date) jDateNgaySinh.getDate());
                dg.setlOAIDG(txtLoaiDG.getText());
                dg.setdIACHI(txtDiaChi.getText());
                dg.seteMAIL(txtEmail.getText());
                if(jDateNgayLapThe.getDate() != null )
                {
                    java.util.Date utilStartDate = jDateNgayLapThe.getDate();
                    java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());
                    dg.setnGAYLAPTHE(sqlStartDate);}
                //dg.setnGAYLAPTHE((Date) jDateNgayLapThe.getDate());
                DocGiaDAO.InsertDocGia(dg);
                JOptionPane.showMessageDialog(null, "Độc giả được thêm vào thành công","Thông báo",1 );
                showtb();
            }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Lỗi!"+ e.getMessage(),"Thông báo",1 );
            }
        }           
    }//GEN-LAST:event_btThemMoiActionPerformed

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        // TODO add your handling code here:
        if(this.txtMaDocGia.getText().length()!=0)
        {
            String sql2 = " select * from DOCGIA where MADOCGIA like '%"+this.txtMaDocGia.getText()+"%' ";
            DuLieuBang.Load(sql2, tbDocGia);
        }
        else if(this.txtHoTen.getText().length()!=0)
        {
            String sql1 = " select * from DOCGIA where HOTEN like '%"+this.txtHoTen.getText()+"%' ";
            DuLieuBang.Load(sql1, tbDocGia);
        }
        else if(this.txtTimKiem.getText().length()!=0)
        {
            String sql ="SELECT * FROM DOCGIA where MADOCGIA like'%"+this.txtTimKiem.getText()+"%' "
                    + "or HOTEN like '%"+this.txtTimKiem.getText()+"%'";
            DuLieuBang.Load(sql, tbDocGia);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Bạn chưa nhập","Thông báo",1);
        }
    }//GEN-LAST:event_btTimKiemActionPerformed

    private void txtMaDocGiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaDocGiaKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            txtHoTen.requestFocus();
        }
    }//GEN-LAST:event_txtMaDocGiaKeyPressed

    private void txtTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String sql ="SELECT * FROM DOCGIA where MADOCGIA like'%"+this.txtTimKiem.getText()+"%' "
                    + "or HOTEN like '%"+this.txtTimKiem.getText()+"%'";
            DuLieuBang.Load(sql, tbDocGia);
        }
    }//GEN-LAST:event_txtTimKiemKeyPressed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCapNhat;
    private javax.swing.JButton btLamMoi;
    private javax.swing.JButton btThemMoi;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btXoa;
    private com.toedter.calendar.JDateChooser jDateNgayLapThe;
    private com.toedter.calendar.JDateChooser jDateNgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDocGia;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtLoaiDG;
    private javax.swing.JTextField txtMaDocGia;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txtTinhTrang;
    // End of variables declaration//GEN-END:variables
}
