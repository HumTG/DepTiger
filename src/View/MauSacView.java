/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.MauSac;
import Repository.MSGHeper;
import Service.MauSacService;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class MauSacView extends javax.swing.JFrame {

    MauSacService service = new MauSacService();
    DefaultTableModel mol = new DefaultTableModel();
    int index = -1;

    public MauSacView() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.fillTable(service.getAll());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txt_idMauSac = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_TenMau = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        txt_ngayTao = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbo_trangThai = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_mauSac = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý màu sắc ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 27, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, -1, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 97, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Sửa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));
        getContentPane().add(txt_idMauSac, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 94, 227, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        jLabel3.setText("Tên màu");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 138, -1, -1));
        getContentPane().add(txt_TenMau, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 135, 227, -1));

        jLabel4.setText("Ngày tạo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 183, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, -1, -1));
        getContentPane().add(txt_ngayTao, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 180, 227, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton5.setText("Hoàn Thành");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, 130, 30));

        jLabel5.setText("Trạng Thái");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 233, -1, -1));

        cbo_trangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hoạt động", "Không hoạt động" }));
        getContentPane().add(cbo_trangThai, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 230, -1, -1));

        tbl_mauSac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Tên Màu", "Ngày tạo", "Trạng thái"
            }
        ));
        tbl_mauSac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_mauSacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_mauSac);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 520, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // bút hoàn thành
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // nút thêm thông tin màu sắc
//        this.addMauSac();
        them();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // nút sửa thông tin màu sắc
//        this.setMauSac();
        sua();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // nút xóa thông tin màu sắc
//        this.xoaMauSac();
        xoa();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // nút reset thông tin màu sắc trên form 
//        this.resetMauSac();
        New();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbl_mauSacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_mauSacMouseClicked
        // Click hiện thông tin lên form 
//        this.clickDaTaForm();
        int index = tbl_mauSac.getSelectedRow();
        setForm(index);
    }//GEN-LAST:event_tbl_mauSacMouseClicked

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MauSacView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MauSacView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MauSacView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MauSacView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MauSacView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbo_trangThai;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_mauSac;
    private javax.swing.JTextField txt_TenMau;
    private javax.swing.JTextField txt_idMauSac;
    private javax.swing.JTextField txt_ngayTao;
    // End of variables declaration//GEN-END:variables

    // load form 
    private void fillTable(List<MauSac> list) {
        mol = (DefaultTableModel) tbl_mauSac.getModel();
        mol.setRowCount(0);
        for (MauSac x : list) {
            mol.addRow(new Object[]{
                x.getIDmau(), x.getTenMau(), x.getNgayTao(), x.getTrangThai()
            });
        }
    }

    // add màu sắc 
    private void addMauSac() {
    }

    // update màu sắc 
    private void setMauSac() {
    }

    // delete màu sắc
    private void xoaMauSac() {
    }

    // reset data form 
    private void resetMauSac() {
        txt_idMauSac.setText("");
        txt_TenMau.setText("");
        txt_ngayTao.setText("");
        cbo_trangThai.setSelectedIndex(0);

    }

    // Click data form 
    private void clickDaTaForm() {
        index = tbl_mauSac.getSelectedRow();
        MauSac ms = service.getAll().get(index);
        txt_idMauSac.setText(ms.getIDmau());
        txt_TenMau.setText(ms.getTenMau());
        txt_ngayTao.setText(ms.getNgayTao());
        cbo_trangThai.setSelectedItem(ms.getTrangThai());

    }

    MauSac getData() {
        MauSac ms = new MauSac();
        ms.setIDmau(txt_idMauSac.getText());
        ms.setTenMau(txt_TenMau.getText());
        ms.setNgayTao(txt_ngayTao.getText());
        ms.setTrangThai(cbo_trangThai.getSelectedItem().toString());
        return ms;
    }

    void setForm(int index) {
        MauSac ms = service.getAll().get(index);
        txt_idMauSac.setText(ms.getIDmau());
        txt_TenMau.setText(ms.getTenMau());
        txt_ngayTao.setText(ms.getNgayTao());
        cbo_trangThai.setSelectedItem(ms.getTrangThai());
    }

    void New() {
        txt_idMauSac.setText("");
        txt_ngayTao.setText("");
        txt_TenMau.setText("");
        cbo_trangThai.setSelectedIndex(0);
    }

    void them() {
        try {
            service.insert(getData());
            MSGHeper.alert(this, "Thêm Thành Công");
            this.fillTable(service.getAll());
        } catch (Exception e) {
            MSGHeper.alert(this, "Thêm Thất Bại");
        }
    }

    void xoa() {
        try {
            if (MSGHeper.confirm(this, "Bạn Có Chắc Chắn Muốn Xóa Không")) {
                service.delete(Integer.valueOf(tbl_mauSac.getValueAt(tbl_mauSac.getSelectedRow(), 0).toString()));
                MSGHeper.alert(this, "Xóa Thành Công");
                this.fillTable(service.getAll());
            }
        } catch (Exception e) {
            MSGHeper.alert(this, "Xóa Thành Công\nKiểm Tra Dòng Đang Chọn");
        }
    }

    void sua() {
        try {
            service.update(getData(), Integer.valueOf(tbl_mauSac.getValueAt(tbl_mauSac.getSelectedRow(), 0).toString()));
            MSGHeper.alert(this, "Sửa Thành Công");
            this.fillTable(service.getAll());
        } catch (Exception e) {
            MSGHeper.alert(this, "Sửa Thất Bại\nVui Lòng Kiểm Tra Dữ Liệu");
        }
    }
}