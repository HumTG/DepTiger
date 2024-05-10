/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.KieuDang;
import java.util.List;
import Repository.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class KieuDangService implements KieuDangInterface {

    @Override
    public List<KieuDang> getAll() {
        List<KieuDang> listKD = new ArrayList<>();
        String sql = "SELECT [IDKieuDang]\n"
                + "      ,[TenKieuDang]\n"
                + "      ,[NgayTao]\n"
                + "      ,[TrangThai]\n"
                + "      ,[AnSP]\n"
                + "  FROM [dbo].[KieuDang] where AnSP = 0 ";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KieuDang kd = new KieuDang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                listKD.add(kd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listKD;
    }

    @Override
    public String xoaKieuDang(String maKD) {
        String sql = "update KieuDang set AnSP = 1 where IDKieuDang = ?";
        if (maKD != "") {
            try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
                ps.setString(1, maKD);
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "Xóa thành công ";
        } else {
            return "Xóa thất bại !";
        }
    }

    @Override
    public String addKieuDang(KieuDang kd) {
        String sql = "INSERT INTO [dbo].[KieuDang]\n"
                + "           ([TenKieuDang]\n"
                + "           ,[NgayTao]\n"
                + "           ,[TrangThai]\n"
                + "           ,[AnSP])\n"
                + "     VALUES\n"
                + "           (?\n"
                + "           ,?\n"
                + "           ,?\n"
                + "           ,0)";
        if (kd != null) {
            try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
                ps.setString(1, kd.getTenKieuDang());
                ps.setString(2, kd.getNgayTao());
                ps.setString(3, kd.getTrangThai());
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "Thêm thành công ";
        } else {
            return "Xóa thất bại ";
        }
    }

    @Override
    public String suaKieuDang(KieuDang kd, int index) {
        String sql = "UPDATE [dbo].[KieuDang]\n"
                + "   SET [TenKieuDang] = ?\n"
                + "      ,[NgayTao] =	?\n"
                + "      ,[TrangThai] = ?\n"
                + "      ,[AnSP] = 0\n"
                + " WHERE IDKieuDang = ?";
        if (index >= 0 && kd != null) {
            try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
                ps.setString(1, kd.getTenKieuDang());
                ps.setString(2, kd.getNgayTao());
                ps.setString(3, kd.getTrangThai());
                ps.setString(4, kd.getIdTenKieuDang());
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "Sửa thành công ";
        } else {
            return "Sửa thất bại ";
        }
    }

}
