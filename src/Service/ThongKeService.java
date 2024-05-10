/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.ThongKe;
import Repository.DBconnect;
import java.math.BigDecimal;
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThongKeService implements Method<ThongKe> {

    @Override
    public List<ThongKe> selectbySQL(String Sql, Object... orgs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ThongKe> getALL() {
        String sql = "select  IDHoaDon,HoTen,TongTien,SDT,HoaDon.TrangThai\n"
                + "from HoaDon join \n"
                + "KhachHang on HoaDon.IDKhachHang = KhachHang.IDKhachHang \n"
                + "order by ( HoaDon.TrangThai)";
        List<ThongKe> listTT = new ArrayList<>();
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKe tk = new ThongKe(rs.getInt(1), rs.getString(2), rs.getBigDecimal(3), rs.getString(4), rs.getString(5), 0, BigDecimal.ONE, 0, 0);
                listTT.add(tk);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTT;
    }

    // Dữ liệu thống kê 
    @Override
    public List<ThongKe> getALLresultPage() {
        String sql = "select Count(IDHoaDon) as 'Tổng số hóa đơn'\n"
                + "	  ,SUM(TongTien) as 'Tổng tiền '\n"
                + "	  ,(select COUNT(IDHoaDon) from HoaDon where TrangThai = N'Đã thanh toán' and AnSP = 0) as N'Hóa đơn hoàn thành'\n"
                + "	  ,(select COUNT(IDHoaDon) from HoaDon where TrangThai = N'Chưa thanh toán' and AnSP = 0) as N'Hóa đơn Chưa hoàn thành'\n"
                + "from HoaDon where AnSP = 0";
        List<ThongKe> listTK1 = new ArrayList<>();
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThongKe tk1 = new ThongKe(0, "", BigDecimal.ONE, "", "", rs.getInt(1), rs.getBigDecimal(2), rs.getInt(3), rs.getInt(4));
                listTK1.add(tk1);
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
        return listTK1;
    }

    @Override
    public List<ThongKe> getbyEntityhidden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Tìm kiếm khách hàng qua thống kê 
    @Override
    public List<ThongKe> findEntity(String data) {
        String sql = "select  IDHoaDon,\n"
                + "		HoTen,\n"
                + "		TongTien,\n"
                + "		SDT,\n"
                + "		HoaDon.TrangThai \n"
                + "from HoaDon join \n"
                + "KhachHang on HoaDon.IDKhachHang = KhachHang.IDKhachHang \n"
                + "where HoTen like N'%"+data+"%' or SDT like '"+data+"'\n"
                + "order by ( HoaDon.TrangThai) ";
        List<ThongKe> listSearch = new ArrayList<>();
        try(Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery(); 
            while (rs.next()) {                
                ThongKe tk = new ThongKe(rs.getInt(1),rs.getString(2),rs.getBigDecimal(3),rs.getString(4),rs.getString(5), 0, BigDecimal.ONE, 0, 0); 
                listSearch.add(tk); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSearch; 
    }

    @Override
    public List<ThongKe> findEntityhidden(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ThongKe getbyID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addEntity(ThongKe ett) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteEntity(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateEntity(ThongKe ett, int id) {
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
