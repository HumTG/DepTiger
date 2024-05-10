/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.HoaDonChiTiet;
import Model.NhanVien;
import Model.SanPham;
import Repository.JDBCHelper;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonCTService implements Method<HoaDonChiTiet> {

    String getALL = "select * from HoaDonChiTiet where IDHoaDon = ? and AnSP = 0";
    String getOne = "select * from HoaDonChiTiet where IDHoaDon = ? and IDSPCT = ? and AnSP = 0";
    String Insert = "INSERT INTO [dbo].[HoaDonChiTiet]\n"
            + "           ([IDSPCT]\n"
            + "           ,[IDHoaDon]\n"
            + "           ,[SoLuong]\n"
            + "           ,[GiaTien]\n"
            + "           ,[NgayTao]\n"
            + "           ,[TrangThai]\n"
            + "           ,[AnSP])\n"
            + "     VALUES(?,?,?,?,getdate(),N'Hoạt Động',0)";
    String Hidden = "delete HoaDonChiTiet where IDHoaDonCT = ?";
    String UpdateTT = "UPDATE [dbo].[HoaDonChiTiet]\n"
            + "   SET [SoLuong] = ?\n"
            + " WHERE IDSPCT = ?";
    String UpdateSLL = "UPDATE [dbo].[HoaDonChiTiet]\n"
            + "   SET [SoLuong] = ?\n"
            + " WHERE IDHoaDonCT = ?";
    String getbyID = "Select * From HoaDonChiTiet where IDHoaDonCT = ? and AnSP = 0";
    String find = "";
    String setSL = "UPDATE [dbo].[SanPham]\n"
            + "   SET [soLuongTonKho] = ?\n"
            + " WHERE IDSanPham = ?";
    String getbyIDSP = "Select * From SanPham where IDSanPham = ? and AnSP = 0";
    String getbyIDNV = "Select * From NhanVien where IDNhanVien = ? and AnSP = 0";

    public void setSLSP(int SLTK, int ID) {
        JDBCHelper.excuteUpdate(setSL, SLTK, ID);
    }

    public SanPham getbyIDSP(int id) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.executeQuery(getbyIDSP, id);
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setIdSanPham(rs.getInt("IDSanPham"));
                sp.setSoLuongTonKho(rs.getInt("soLuongTonKho"));
                list.add(sp);
            }
            return list.get(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public NhanVien getbyIDNV(int id) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.executeQuery(getbyIDNV, id);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setIdNhanVien(rs.getInt("IDNhanVien"));
                nv.setHoTenNhanVien(rs.getString("HoTen"));
                list.add(nv);
            }
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<HoaDonChiTiet> getALLbyIDHD(int ID) {
        return selectbySQL(getALL, ID);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public HoaDonChiTiet getbyOne(HoaDonChiTiet ett) {
        List<HoaDonChiTiet> list = selectbySQL(getOne, ett.getIDHD(), ett.getIDSP());
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDonChiTiet> selectbySQL(String Sql, Object... orgs) {
        try {
            List<HoaDonChiTiet> list = new ArrayList<>();
            ResultSet rs = JDBCHelper.executeQuery(Sql, orgs);
            while (rs.next()) {
                HoaDonChiTiet hdct = new HoaDonChiTiet();
                hdct.setID(rs.getInt("IDHoaDonCT"));
                hdct.setIDHD(rs.getInt("IDHoaDon"));
                hdct.setIDSP(rs.getInt("IDSPCT"));
                hdct.setSoLuong(rs.getInt("SoLuong"));
                hdct.setGia(rs.getBigDecimal("GiaTien"));
                hdct.setTrangThai(rs.getString("TrangThai"));
                list.add(hdct);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDonChiTiet> getALL() {
//        return selectbySQL(getALL);
        return null;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDonChiTiet> getALLresultPage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDonChiTiet> getbyEntityhidden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDonChiTiet> findEntity(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<HoaDonChiTiet> findEntityhidden(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HoaDonChiTiet getbyID(int id) {
//        List<HoaDonChiTiet> list = new ArrayList<>();
        List<HoaDonChiTiet> list = selectbySQL(getbyID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addEntity(HoaDonChiTiet ett) {
        JDBCHelper.excuteUpdate(Insert, ett.getIDSP(), ett.getIDHD(), ett.getSoLuong(), ett.getGia());
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteEntity(int id) {
        JDBCHelper.excuteUpdate(Hidden, id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateEntity(HoaDonChiTiet ett, int id) {
        JDBCHelper.excuteUpdate(UpdateTT, ett.getSoLuong() + 1, id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void updateSLL(HoaDonChiTiet ett, int id) {
        JDBCHelper.excuteUpdate(UpdateSLL, ett.getSoLuong(), id);
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
