/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NhanVien;
import Repository.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienService implements NhanVienInterface {

    @Override
    public List<NhanVien> getAllNhanVien() {
        String sql = "SELECT [IDNhanVien]\n"
                + "      ,[HoTen]\n"
                + "      ,ChucVu.TenChucVu\n"
                + "	  ,ChucVu.Luong\n"
                + "      ,CaLam.TenCaLam\n"
                + "	  ,CaLam.ThoiGianBatDau\n"
                + "	  ,CaLam.ThoiGianKetThuc\n"
                + "      ,[GioiTinh]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[DiaChi]\n"
                + "      ,[Email]\n"
                + "      ,NhanVien.TrangThai\n"
                + "      ,NhanVien.AnSP\n"
                + "  FROM [dbo].[NhanVien] \n"
                + "	join CaLam on NhanVien.IDCaLam = CaLam.IDCaLam\n"
                + "	join ChucVu on NhanVien.IDChucVu = ChucVu.IDChucVu\n"
                + "	where NhanVien.AnSP = 0 ";
        List<NhanVien> listNhanVien = new ArrayList<>();
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12));
                listNhanVien.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNhanVien;
    }

    @Override
    public List<NhanVien> getShowThongTinNhanVien(int IDNV) {
        String sql = "SELECT [HoTen]\n"
                + "      ,ChucVu.TenChucVu\n"
                + "	  ,ChucVu.Luong\n"
                + "      ,CaLam.TenCaLam\n"
                + "	  ,CaLam.ThoiGianBatDau\n"
                + "	  ,CaLam.ThoiGianKetThuc\n"
                + "      ,[GioiTinh]\n"
                + "      ,[NgaySinh]\n"
                + "      ,[DiaChi]\n"
                + "      ,[Email]\n"
                + "      ,NhanVien.TrangThai\n"
                + "      ,NhanVien.AnSP\n"
                + "  FROM [dbo].[NhanVien] \n"
                + "	join CaLam on NhanVien.IDCaLam = CaLam.IDCaLam\n"
                + "	join ChucVu on NhanVien.IDChucVu = ChucVu.IDChucVu\n"
                + "	where NhanVien.AnSP = 0 and IDNhanVien = ?";
        List<NhanVien> listThongTinNhanVienID = new ArrayList<>();
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ps.setInt(1, IDNV);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien nvID = new NhanVien(IDNV, rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11));
                listThongTinNhanVienID.add(nvID);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listThongTinNhanVienID;
    }

    @Override
    public String xoaNhanVien(int IDNV) {
        String sql = "Update NhanVien set AnSP = 1 \n"
                + "where IDNhanVien = ?";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ps.setInt(1, IDNV);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Xóa thành công ";

    }

}
