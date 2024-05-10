/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.BangThongTinSP;
import Model.SanPham;
import Repository.DBconnect;
import Repository.JDBCHelper;
import static java.awt.image.ImageObserver.SOMEBITS;
import static java.awt.image.ImageObserver.WIDTH;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class SanPhamService implements SanPhamInterface {

    @Override
    public List<SanPham> getAll(String data) {
        List<SanPham> ListSP = new ArrayList<>();
        
        String sql = "SELECT [IDSanPham],\n"
                + "	   [TenSP]\n"
                + "      ,KieuDang.TenKieuDang\n"
                + "      ,MauSP.TenMau\n"
                + "      ,SizeSP.SIze\n"
                + "      ,NSXSP.TenNSX\n"
                + "      ,[ChatLieu]\n"
                + "      ,ThuongHieuSP.TenChatLieu\n"
                + "      ,LoaiDeDep.TenLoaiDeDep\n"
                + "      ,[soLuongTonKho]\n"
                + "      ,[GiaNhapSP]\n"
                + "      ,[GiaBanSP]\n"
                + "      ,[MucDichSuDung]\n"
                + "      ,[NgayNhap]\n"
                + "      ,[HinhAnh]\n"
                + "      ,[MoTa]\n"
                + "      ,SanPham.TrangThai\n"
                + "      ,SanPham.AnSP\n"
                + "  FROM [dbo].[SanPham]\n"
                + "  join KieuDang on SanPham.IDKieuDang = KieuDang.IDKieuDang\n"
                + "  join MauSP on SanPham.IDMauSP = MauSP.IDMauSP	\n"
                + "  join SizeSP on SanPham.IDSizeSP = SizeSP.IDSizeSP\n"
                + "  join NSXSP on SanPham.IDNSXSP = NSXSP.IDNSXSP\n"
                + "  join ThuongHieuSP on SanPham.IDThuongHieu = ThuongHieuSP.IDThuongHieuSP\n"
                + "  join LoaiDeDep on SanPham.IDLoaiDeDep = LoaiDeDep.IDLoaiDeDep\n"
                + "  where SanPham.AnSP = 0 and TenSP like N'%" + data + "%'";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham spSearch = new SanPham(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9), rs.getInt(10),0,rs.getBigDecimal(12), sql,rs.getString(13), sql,rs.getString(15));
                ListSP.add(spSearch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListSP; 
    }

    @Override
    public List<SanPham> ShowThongTin(String tenSP) {
        List<SanPham> ListCTSP = new ArrayList<>();
        String sql = "SELECT [IDSanPham]\n"
                + "      ,KieuDang.TenKieuDang\n"
                + "      ,MauSP.TenMau\n"
                + "      ,SizeSP.SIze\n"
                + "      ,NSXSP.TenNSX\n"
                + "      ,[ChatLieu]\n"
                + "      ,ThuongHieuSP.TenChatLieu\n"
                + "      ,[IDLoaiDeDep]"
                + "      ,[soLuongTonKho]\n"
                + "      ,[GiaNhapSP]\n"
                + "      ,[GiaBanSP]\n"
                + "      ,[MucDichSuDung]\n"
                + "      ,[NgayNhap]\n"
                + "      ,[HinhAnh]\n"
                + "      ,[MoTa]\n"
                + "      ,SanPham.TrangThai\n"
                + "      ,SanPham.AnSP\n"
                + "  FROM [dbo].[SanPham]\n"
                + "  join KieuDang on SanPham.IDKieuDang = KieuDang.IDKieuDang\n"
                + "  join MauSP on SanPham.IDMauSP = MauSP.IDMauSP	\n"
                + "  join SizeSP on SanPham.IDSizeSP = SizeSP.IDSizeSP\n"
                + "  join NSXSP on SanPham.IDNSXSP = NSXSP.IDNSXSP\n"
                + "  join ThuongHieuSP on SanPham.IDThuongHieu = ThuongHieuSP.IDThuongHieuSP\n"
                + "  where SanPham.AnSP = 0 and TenSP = ?";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ps.setString(1, tenSP);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                SanPham x = new SanPham(rs.getInt(1), tenSP, rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), "", rs.getInt(9), 0, rs.getBigDecimal(11), tenSP, tenSP, sql, tenSP);
                ListCTSP.add(x);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListCTSP;
    }

    @Override
    public String deleteSPID(String ID) {
        String sql = "UPDATE [dbo].[SanPham]\n"
                + "   SET [AnSP] = 1\n"
                + " WHERE IDSanPham = ?";
        if (ID != null) {
            try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
                ps.setString(1, ID);
                ps.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "Xóa thành công ";
        } else {
            return "Xóa thất bại ! ";
        }
    }

    public SanPham getbyID(int id) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = JDBCHelper.executeQuery("select * from SanPham where IDSanPham = ? and AnSP = 0", id);
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setTenSanPham(rs.getString("TenSP"));
                sp.setChatLieu(rs.getString("ChatLieu"));
                list.add(sp);
            }
            return list.get(0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
