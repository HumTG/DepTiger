/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.CaLamNhanVien;
import Repository.DBconnect;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 

/**
 *
 * @author Admin
 */
public class CaLamNhanVienService implements CalamNhanVienInterface {

    @Override
    public List<CaLamNhanVien> getAllCaLamNV() {
        List<CaLamNhanVien> listCaLam = new ArrayList<>();
        String sql = "SELECT [IDCaLam]\n"
                + "      ,[TenCaLam]\n"
                + "      ,[ThoiGianBatDau]\n"
                + "      ,[ThoiGianKetThuc]\n"
                + "      ,[NgayTao]\n"
                + "      ,[TrangThai]\n"
                + "      ,[AnSP]\n"
                + "  FROM [dbo].[CaLam] where AnSP = 0";
        try(Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery(); 
            while (rs.next()) {                
                CaLamNhanVien clnv = new CaLamNhanVien(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)); 
                listCaLam.add(clnv); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listCaLam; 
    }

}
