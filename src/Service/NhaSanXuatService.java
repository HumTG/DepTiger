/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NhaSanXuat;
import java.sql.Connection;
import java.sql.ResultSet;
import Repository.DBconnect;
import Repository.JDBCHelper;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhaSanXuatService implements NhaSanXuatInterface {

    @Override
    public List<NhaSanXuat> getAll() {
        List<NhaSanXuat> listNSX = new ArrayList<>();
        String sql = "SELECT [IDNSXSP]\n"
                + "      ,[TenNSX]\n"
                + "      ,[NgayTao]\n"
                + "      ,[TrangThai]\n"
                + "      ,[AnSP]\n"
                + "  FROM [dbo].[NSXSP] where AnSP = 0 ";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhaSanXuat nsx = new NhaSanXuat(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                listNSX.add(nsx);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listNSX;
    }

    String Insert = "INSERT INTO [dbo].[NSXSP]\n"
            + "           ([TenNSX]\n"
            + "           ,[NgayTao]\n"
            + "           ,[TrangThai]\n"
            + "           ,[AnSP])\n"
            + "     VALUES(?,getDate(),N'Hoạt Động',0)";
    String Delete = "UPDATE [dbo].[NSXSP]\n"
            + "   SET [AnSP] = 1\n"
            + " WHERE IDNSXSP = ?";
    String Update = "UPDATE [dbo].[NSXSP]\n"
            + "   SET [TenNSX] = ?\n"
            + "      ,[TrangThai] = ?\n"
            + " WHERE IDNSXSP = ?";
    public void insert(NhaSanXuat nsx){
        JDBCHelper.excuteUpdate(Insert, nsx.getTenNSX());
    }
    public void delete(int id){
        JDBCHelper.excuteUpdate(Delete, id);
    }
    public void update(NhaSanXuat nsx , int id){
        JDBCHelper.excuteUpdate(Update, nsx.getTenNSX(),nsx.getTrangThai(),id);
    }
}
