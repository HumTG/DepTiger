/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.LoaiKhachHang;
import Repository.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LoaiKhachHangService implements Method<LoaiKhachHang> {

    String getALL = "Select * from LoaiKhachHang where AnSP = 0";
    String getTenLKH = "SELECT DISTINCT TenLoaiKhachHang FROM LoaiKhachHang;";
//    String getTenbyID = "select TenLoaiKhachHang from KhachHang join LoaiKhachHang \n"
//            + "on KhachHang.IDLoaiKH = LoaiKhachHang.IDLoaiKH where KhachHang.IDLoaiKH = ?";
    String getbyID = "select * from LoaiKhachHang where IDLoaiKH = ?";
    String Insert = "INSERT INTO [dbo].[LoaiKhachHang]\n"
            + "           ([TenLoaiKhachHang]\n"
            + "           ,[DacQuyen]\n"
            + "           ,[NgayTao]\n"
            + "           ,[TrangThai]\n"
            + "           ,[AnSP])\n"
            + "     VALUES\n"
            + "           (?,?,getdate(),?,0)";
    String Delete = "UPDATE [dbo].[LoaiKhachHang]\n"
            + "   SET [AnSP] = 1\n"
            + " WHERE IDLoaiKH = ?";
    String Update = "UPDATE [dbo].[LoaiKhachHang]\n"
            + "   SET [TenLoaiKhachHang] = ?\n"
            + "      ,[DacQuyen] = ?\n"
            + ",[TrangThai] = ? \n"
            + " WHERE IDLoaiKH = ?";

    @Override
    public void deleteEntity(int id) {
        JDBCHelper.excuteUpdate(Delete, id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<LoaiKhachHang> selectbySQL(String Sql, Object... orgs) {
        try {
            List<LoaiKhachHang> list = new ArrayList<>();
            ResultSet rs = JDBCHelper.executeQuery(Sql, orgs);
            while (rs.next()) {
                LoaiKhachHang lkh = new LoaiKhachHang();
                lkh.setID(rs.getInt("IDLoaiKH"));
                lkh.setTenLoaiKhachHang(rs.getString("TenLoaiKhachHang"));
                lkh.setDacQuyen(rs.getString("DacQuyen"));
                lkh.setTrangThai(rs.getString("TrangThai"));
                list.add(lkh);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
//        return null;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<LoaiKhachHang> getALL() {
        return selectbySQL(getALL);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public List<LoaiKhachHang> getTenLKH() {
        try {
            List<LoaiKhachHang> list = new ArrayList<>();
            ResultSet rs = JDBCHelper.executeQuery(getTenLKH);
            while (rs.next()) {
                LoaiKhachHang lkh = new LoaiKhachHang();
                lkh.setTenLoaiKhachHang(rs.getString("TenLoaiKhachHang"));
                list.add(lkh);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addEntity(LoaiKhachHang ett) {
        JDBCHelper.excuteUpdate(Insert, ett.getTenLoaiKhachHang(),ett.getDacQuyen(),ett.getTrangThai());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateEntity(LoaiKhachHang ett, int id) {
        JDBCHelper.excuteUpdate(Update, ett.getTenLoaiKhachHang(),ett.getDacQuyen(),ett.getTrangThai(),id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public LoaiKhachHang getbyID(int id) {
        List<LoaiKhachHang> list = selectbySQL(getbyID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<LoaiKhachHang> getALLresultPage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<LoaiKhachHang> getbyEntityhidden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<LoaiKhachHang> findEntity(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<LoaiKhachHang> findEntityhidden(String data) {
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
