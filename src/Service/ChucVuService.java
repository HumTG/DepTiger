/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.ChucVuNhanVien;
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
public class ChucVuService implements ChucVuInterface {

    @Override
    public List<ChucVuNhanVien> getAllChucVu() {
        List<ChucVuNhanVien> listChucVuNhanVien = new ArrayList<>();
        String sql = "SELECT [IDChucVu]\n"
                + "      ,[TenChucVu]\n"
                + "      ,[Luong]\n"
                + "      ,[NgayTao]\n"
                + "      ,[TrangThai]\n"
                + "      ,[AnSP]\n"
                + "  FROM [dbo].[ChucVu] where AnSP = 0";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery(); 
            while (rs.next()) {                
                ChucVuNhanVien cvn = new ChucVuNhanVien(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getString(5));
                listChucVuNhanVien.add(cvn); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listChucVuNhanVien;
    }

}
