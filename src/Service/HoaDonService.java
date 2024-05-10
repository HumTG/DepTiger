/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.HoaDon;
import Model.HoaDonChiTiet;
import Model.KhachHang;
import Repository.DateHelper;
import Repository.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonService implements Method<HoaDon> {

    String getALL = "Select * from HoaDon where AnSP = 0 and TrangThai = N'Chưa Thanh Toán' order by IDHoaDon desc";
    String getALLHD = "Select * from HoaDon where AnSP = 0 order by TrangThai desc";
    String Insert = "INSERT INTO [dbo].[HoaDon]\n"
            + "           ([TongTien]\n"
            + "           ,[IDNhanVien]\n"
            + "           ,[IDKhachHang]\n"
            + "           ,[IDPhuongThucThanhToan]\n"
            + "           ,[IDVanChuyen]\n"
            + "           ,[NgayTao]\n"
            + "           ,[TrangThai]\n"
            + "           ,[AnSP])\n"
            + "     VALUES (NULL,?,?,?,1,getdate(),N'Chưa Thanh Toán',0)";
    String InsertNotKH = "INSERT INTO [dbo].[HoaDon]\n"
            + "           ([TongTien]\n"
            + "           ,[IDNhanVien]\n"
            + "           ,[IDKhachHang]\n"
            + "           ,[IDPhuongThucThanhToan]\n"
            + "           ,[IDVanChuyen]\n"
            + "           ,[NgayTao]\n"
            + "           ,[TrangThai]\n"
            + "           ,[AnSP])\n"
            + "     VALUES (NULL,?,NULL,?,3,getdate(),N'Chưa Thanh Toán',0)";
    String Hidden = "Update HoaDon set AnSP = 1 where IDHoaDon = ?";
    String Update = "UPDATE [dbo].[HoaDon]\n"
            + "   SET [TrangThai] = ?,\n"
            + "       [TongTien] = ?\n"
            + " WHERE IDHoaDon = ?";
    String UpdateThongTin = "UPDATE [dbo].[HoaDon]\n"
            + "   SET [TongTien] = ?\n"
            + "      ,[IDNhanVien] = ?\n"
            + "      ,[IDKhachHang] = ?\n"
            + "      ,[IDPhuongThucThanhToan] = ?\n"
            + " WHERE IDHoaDon = ?";
    String UpdateThongTinNotKH = "UPDATE [dbo].[HoaDon]\n"
            + "   SET [TongTien] = ?\n"
            + "      ,[IDNhanVien] = ?\n"
            //            + "      ,[IDKhachHang] = ?\n"
            + "      ,[IDPhuongThucThanhToan] = ?\n"
            + " WHERE IDHoaDon = ?";
    String getbyID = "Select * From HoaDon where IDHoaDon = ? and AnSP = 0";
    String find = "select * from HoaDon where (NgayTao like ? or TongTien like ?) and AnSP = 0";
    String findCTT = "select * from HoaDon where (NgayTao like ? or TongTien like ?) and AnSP = 0 and TrangThai = N'Chưa Thanh Toán'";
    String coutHD = "select COUNT(*) as cout from HoaDon where AnSP = 0";
    String coutHDHT = "select COUNT(*) as cout from HoaDon where AnSP = 0 and TrangThai like N'Đã thanh toán'";
    String coutHDCHT = "select COUNT(*) as cout from HoaDon where AnSP = 0 and TrangThai like N'Chưa thanh toán'";
    String ThuNhap = "SELECT SUM(TongTienHoaDon) AS TongTienTatCaHoaDon\n"
            + "FROM (SELECT IDHoaDon, SUM(TongTien) AS TongTienHoaDon\n"
            + "    FROM HoaDon\n"
            + "    WHERE AnSP = 0 AND TrangThai = N'Đã Thanh Toán'\n"
            + "    GROUP BY IDHoaDon\n"
            + ") AS T";
    String CheckVaiTro = "";

    public HoaDonService() {
    }

    public int coutHD() {
        try {
            ResultSet rs = JDBCHelper.executeQuery(coutHD);
            int cout = Integer.valueOf(rs.getString("cout"));
            return cout;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int coutHDHT() {
        try {
            ResultSet rs = JDBCHelper.executeQuery(coutHDHT);
            int cout = Integer.valueOf(rs.getString("cout"));
            return cout;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int coutHDCHT() {
        try {
            ResultSet rs = JDBCHelper.executeQuery(coutHDCHT);
            int cout = Integer.valueOf(rs.getString("cout"));
            return cout;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public double thuNhap() {
        try {
            ResultSet rs = JDBCHelper.executeQuery(ThuNhap);
            double cout = Double.valueOf(rs.getString("TongTienTatCaHoaDon"));
            return cout;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<HoaDon> selectbySQL(String Sql, Object... orgs) {
        try {
            List<HoaDon> list = new ArrayList<>();
            ResultSet rs = JDBCHelper.executeQuery(Sql, orgs);
            while (rs.next()) {
                HoaDon hd = new HoaDon();
                hd.setTongTien(rs.getDouble("TongTien"));
                hd.setID(rs.getInt("IDHoaDon"));
                hd.setIDKH(rs.getInt("IDKhachHang"));
                hd.setIDNV(rs.getInt("IDNhanVien"));
                hd.setIDPTTT(rs.getInt("IDPhuongThucThanhToan"));
                hd.setNgayTao(rs.getDate("NgayTao"));
                hd.setTrangThai(rs.getString("TrangThai"));
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon> getALL() {
        return selectbySQL(getALL);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<HoaDon> getALLHD() {
        return selectbySQL(getALLHD);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon> getALLresultPage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon> getbyEntityhidden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon> findEntity(String data) {
        String Value = "%" + data + "%";
        return selectbySQL(find, Value, Value);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public List<HoaDon> findEntityCTT(String data) {
        String Value = "%" + data + "%";
        return selectbySQL(findCTT, Value, Value);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDon> findEntityhidden(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HoaDon getbyID(int id) {
        List<HoaDon> list = selectbySQL(getbyID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addEntity(HoaDon ett) {
        JDBCHelper.excuteUpdate(Insert, ett.getIDNV(), ett.getIDKH(), ett.getIDPTTT());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void addEntityNotKH(HoaDon ett) {
        JDBCHelper.excuteUpdate(InsertNotKH, ett.getIDNV(), ett.getIDPTTT());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteEntity(int id) {
        JDBCHelper.excuteUpdate(Hidden, id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateEntity(HoaDon ett, int id) {
        JDBCHelper.excuteUpdate(Update, ett.getTrangThai(), ett.getTongTien(), id);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void updateEntityThongTin(HoaDon ett, int id) {
        JDBCHelper.excuteUpdate(UpdateThongTin, ett.getTongTien(), ett.getIDNV(), ett.getIDKH(), ett.getIDPTTT(), id);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void updateEntityThongTinNotKH(HoaDon ett, int id) {
        JDBCHelper.excuteUpdate(UpdateThongTinNotKH, ett.getTongTien(), ett.getIDNV(), ett.getIDPTTT(), id);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void hiddenEntity(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void unhiddenEntity(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int resultPage(int page, int limit) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
