/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Model.MauSac;
import Repository.DBconnect;
import Repository.JDBCHelper;
import java.util.ArrayList;
import java.util.List;

public class MauSacService implements MauSacInterface {

    @Override
    public List<MauSac> getAll() {
        List<MauSac> listMs = new ArrayList<>();
        String sql = "SELECT [IDMauSP]\n"
                + "      ,[TenMau]\n"
                + "      ,[NgayTao]\n"
                + "      ,[TrangThai]\n"
                + "      ,[AnSP]\n"
                + "  FROM [dbo].[MauSP] where AnSP = 0 ";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                listMs.add(ms);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listMs;
    }

    @Override
    public String themMauSac(MauSac ms) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String suaMauSac(int index, MauSac ms) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String xoaMauSac(int idnex, MauSac ms) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    String Insert = "INSERT INTO [dbo].[MauSP]\n"
            + "           ([TenMau]\n"
            + "           ,[NgayTao]\n"
            + "           ,[TrangThai]\n"
            + "           ,[AnSP])\n"
            + "     VALUES(?,getDate(),N'Hoạt Động',0)";
    String Delete = "UPDATE [dbo].[MauSP]\n"
            + "   SET [AnSP] = 1\n"
            + " WHERE IDMauSP = ?";
    String Update = "UPDATE [dbo].[MauSP]\n"
            + "   SET [TenMau] = ?\n"
            + "      ,[TrangThai] = ?\n"
            + " WHERE IDMauSP = ?";
    public void insert(MauSac ms){
        JDBCHelper.excuteUpdate(Insert, ms.getTenMau());
    }
    public void delete(int id){
        JDBCHelper.excuteUpdate(Delete, id);
    }
    public void update(MauSac ms , int id){
        JDBCHelper.excuteUpdate(Update, ms.getTenMau(),ms.getTrangThai(),id);
    }

}
