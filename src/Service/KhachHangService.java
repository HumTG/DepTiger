/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.KhachHang;
import Model.LoaiKhachHang;
import Repository.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class KhachHangService implements Method<KhachHang> {

    String getALL = "select * from KhachHang where AnSP = 0";
    String getOne = "Select * from KhachHang where AnSP = 0 order by IDKhachHang desc";
    String Insert = "INSERT INTO [dbo].[KhachHang]\n"
            + "           ([IDPhanHoiKH]\n"
            + "           ,[IDLoaiKH]\n"
            + "           ,[IDSoThichKH]\n"
            + "           ,[HoTen]\n"
            + "           ,[NgaySinh]\n"
            + "           ,[GioiTinh]\n"
            + "           ,[SDT]\n"
            + "           ,[DiaChi]\n"
            + "           ,[Email]\n"
            + "           ,[HinhAnh]\n"
            + "           ,[NgayTao]\n"
            + "           ,[TrangThai]\n"
            + "           ,[AnSP])\n"
            + "     VALUES\n"
            + "           (Null,?,Null,?,?,?,?,?,?,?,getdate(),N'Hoạt Động',0)";
    String Delete = "UPDATE [dbo].[KhachHang]\n"
            + "   SET [AnSP] = 1\n"
            + " WHERE IDKhachHang = ?";
    String Update = "UPDATE [dbo].[KhachHang]\n"
            + "   SET [IDLoaiKH] = ?\n"
            + "      ,[HoTen] = ?\n"
            + "      ,[NgaySinh] = ?\n"
            + "      ,[GioiTinh] = ?\n"
            + "      ,[SDT] = ?\n"
            + "      ,[DiaChi] = ?\n"
            + "      ,[Email] = ?\n"
            + "      ,[HinhAnh] = ?\n"
            + " WHERE IDKhachHang = ?";
    String getbyID = "select * from KhachHang where IDKhachHang = ? \n";
    String Find = "  select * from KhachHang where (HoTen like ? "
            + "or NgaySinh like ? or DiaChi like ? "
            + "or Email like ? or SDT like ?) and AnSP = 0";

//    public LoaiKhachHang getTenbyID(int id){
//        List<LoaiKhachHang> list = getbySQL(getTenbyID, id);
//        return null;
//    }
    public List<KhachHang> FindKH(String data) {
        String Value = "%"+data+"%";
        return selectbySQL(Find, Value, Value, Value, Value, Value);
    }

    @Override
    public List<KhachHang> getALL() {
        return selectbySQL(getALL);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addEntity(KhachHang ett) {
        JDBCHelper.excuteUpdate(Insert, ett.getIDLoaiKH(), ett.getHoTen(),
                ett.getNgaySinh(), ett.getGioiTinh(), ett.getSDT(),
                ett.getDiaChi(), ett.getEmail(), ett.getHinhAnh());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateEntity(KhachHang ett, int id) {
        JDBCHelper.excuteUpdate(Update, ett.getIDLoaiKH(),
                ett.getHoTen(), ett.getNgaySinh(), ett.getGioiTinh(), ett.getSDT(),
                ett.getDiaChi(), ett.getEmail(), ett.getHinhAnh(), id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteEntity(int id) {
        JDBCHelper.excuteUpdate(Delete, id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    @Override
    public KhachHang getbyID(int id) {
        List<KhachHang> list = selectbySQL(getbyID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public KhachHang getOne() {
        List<KhachHang> list = selectbySQL(getOne);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KhachHang> selectbySQL(String Sql, Object... orgs) {
        try {
            List<KhachHang> list = new ArrayList<>();
            ResultSet rs = JDBCHelper.executeQuery(Sql, orgs);
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setID(rs.getInt("IDKhachHang"));
                kh.setIDPhanHoiKH(rs.getInt("IDPhanHoiKH"));
                kh.setIDLoaiKH(rs.getInt("IDLoaiKH"));
                kh.setIDSoThich(rs.getInt("IDSoThichKH"));
                kh.setHoTen(rs.getString("HoTen"));
                kh.setNgaySinh(rs.getDate("NgaySinh"));
                kh.setGioiTinh(rs.getBoolean("GioiTinh"));
                kh.setSDT(rs.getString("SDT"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setEmail(rs.getString("Email"));
                kh.setHinhAnh(rs.getString("HinhAnh"));
                kh.setTrangThai(rs.getString("TrangThai"));
                list.add(kh);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        return null;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KhachHang> getALLresultPage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KhachHang> getbyEntityhidden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KhachHang> findEntity(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<KhachHang> findEntityhidden(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
