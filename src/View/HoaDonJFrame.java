/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.HoaDon;
import Model.HoaDonChiTiet;
import Model.KhachHang;
import Model.NhanVien;
import Model.SanPham;
import Service.HoaDonCTService;
import Service.HoaDonService;
import Service.KhachHangService;
import Service.SanPhamService;
import java.math.BigDecimal;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class HoaDonJFrame extends javax.swing.JFrame {

    /**
     * Creates new form HoaDonJFrem
     */
    private SanPhamService servicesp = new SanPhamService();
    public HoaDonService servicehd = new HoaDonService();
    public HoaDonCTService servicehdct = new HoaDonCTService();
    public KhachHangService servicekh = new KhachHangService();
    public DefaultTableModel model = new DefaultTableModel();
    int IDHD;

    public HoaDonJFrame(int IDHoaDon) {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocation(660, 125);
        IDHD = IDHoaDon;
        setResizable(false);
        setTitle("Thông Tin Hóa Đơn");
//        HoaDon hd = servicehd.getbyID(IDHoaDon);
//        KhachHang kh = servicekh.getbyID(hd.getIDKH());
//        NhanVien nv = servicehdct.getbyIDNV(hd.getIDNV());
        this.setdataTBLTTHD();
        this.setdataTBLHDCT(servicehdct.getALLbyIDHD(IDHD));
    }

    void setdataTBLTTHD() {
        model = (DefaultTableModel) tblTTHD.getModel();
        model.setRowCount(0);
        HoaDon hd = servicehd.getbyID(IDHD);
        KhachHang kh = servicekh.getbyID(hd.getIDKH());
        NhanVien nv = servicehdct.getbyIDNV(hd.getIDNV());
        model.addRow(new Object[]{
            kh == null ? "NULL" : kh.getHoTen(),
            nv == null ? "NULL" : nv.getHoTenNhanVien(),
            hd.getTongTien(),
            hd.getNgayTao(),
            hd.getTrangThai()
        });
    }

    void setdataTBLHDCT(List<HoaDonChiTiet> list) {
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) tblTTHDCT.getModel();
        model.setRowCount(0);
//        BigDecimal TongTien = new BigDecimal(0);
        for (HoaDonChiTiet hdct : list) {
            SanPham sp = servicesp.getbyID(hdct.getIDSP());
//            TongTien = (hdct.getGia().multiply(BigDecimal.valueOf(hdct.getSoLuong()))).add(TongTien);
            model.addRow(new Object[]{
//                hdct.getID(),
                sp == null ? "NULL":sp.getTenSanPham(),
                sp == null ? "NULL":sp.getChatLieu(),
                hdct.getSoLuong(),
                hdct.getGia()
            });
        }
//        txt_TongTienTT.setText(String.valueOf(TongTien));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTTHD = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTTHDCT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblTTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên KH", "Tên NV", "Tổng Tiền", "Ngày Tạo", "Trạng Thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTTHD);

        tblTTHDCT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên Sản Phẩm", "Chất Liệu", "Số Lượng", "Giá Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTTHDCT);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Thông Tin Hóa Đơn");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Thông Tin Hóa Đơn Chi Tiết");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
//            java.util.logging.Logger.getLogger(HoaDonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HoaDonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HoaDonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HoaDonJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HoaDonJFrame(4).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTTHD;
    private javax.swing.JTable tblTTHDCT;
    // End of variables declaration//GEN-END:variables
}
