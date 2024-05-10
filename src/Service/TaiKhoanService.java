/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.TaiKhoan;
import Repository.JDBCHelper;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author Admin
 */
public class TaiKhoanService implements Method<TaiKhoan> {

    String Login = "select * from TaiKhoan where TenTaiKhoan = ? and MatKhau = ?";
    
//    public static void main(String[] args) {
//        TaiKhoanService tk = new TaiKhoanService();
//        System.out.println(tk.CheckTaiKhoan("tk", "mk"));
//        
//    }

    public TaiKhoan CheckTaiKhoan(String tk, String mk) {
//        List<TaiKhoan> list = 
        try {
            ResultSet rs = JDBCHelper.executeQuery(Login, tk, mk);
            TaiKhoan tkl = new TaiKhoan();
//            while (rs.next()) {
            if (rs.next()) {
                tkl.setID(rs.getInt("IDTaiKhoan"));
                tkl.setIDNhanVien(rs.getInt("IDNhanVien"));
                tkl.setTaiKhoan(rs.getString("TenTaiKhoan"));
                tkl.setMatKhau(rs.getString("MatKhau"));
                tkl.setTrangThai(rs.getString("TrangThai"));
            }
//            }
            return tkl;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

//    public static void main(String[] args) {
//        TaiKhoanService service = new TaiKhoanService();
//        service.TaiKhoan("nguyenanh92a", "Pass123");
//        System.out.println(service.TaiKhoan("nguyenanh92_a", "Pass123"));
//    }
    
    @Override
    public List<TaiKhoan> selectbySQL(String Sql, Object... orgs) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TaiKhoan> getALL() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TaiKhoan> getALLresultPage() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TaiKhoan> getbyEntityhidden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TaiKhoan> findEntity(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<TaiKhoan> findEntityhidden(String data) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TaiKhoan getbyID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addEntity(TaiKhoan ett) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteEntity(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateEntity(TaiKhoan ett, int id) {
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
