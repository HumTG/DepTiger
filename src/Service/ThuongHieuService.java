/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.ThuongHieu;
import Repository.DBconnect;
import Repository.JDBCHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ThuongHieuService implements ThuongHieuInterface {

    @Override
    public List<ThuongHieu> getAll() {
        List<ThuongHieu> listTH = new ArrayList<>();
        String sql = "SELECT [IDThuongHieuSP]\n"
                + "      ,[TenChatLieu]\n"
                + "      ,[NgayTao]\n"
                + "      ,[TrangThai]\n"
                + "      ,[AnSP]\n"
                + "  FROM [dbo].[ThuongHieuSP] where AnSP = 0";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ThuongHieu th = new ThuongHieu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                listTH.add(th);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listTH;
    }
    
    String Insert = "INSERT INTO [dbo].[ThuongHieuSP]\n"
            + "           ([TenChatLieu]\n"
            + "           ,[NgayTao]\n"
            + "           ,[TrangThai]\n"
            + "           ,[AnSP])\n"
            + "     VALUES(?,getDate(),N'Hoạt Động',0)";
    String Delete = "UPDATE [dbo].[ThuongHieuSP]\n"
            + "   SET [AnSP] = 1\n"
            + " WHERE IDThuongHieuSP = ?";
    String Update = "UPDATE [dbo].[ThuongHieuSP]\n"
            + "   SET [TenChatLieu] = ?\n"
            + "      ,[TrangThai] = ?\n"
            + " WHERE IDThuongHieuSP = ?";
    public void insert(ThuongHieu th){
        JDBCHelper.excuteUpdate(Insert, th.getTenThuongHieu());
    }
    public void delete(int id){
        JDBCHelper.excuteUpdate(Delete, id);
    }
    public void update(ThuongHieu th , int id){
        JDBCHelper.excuteUpdate(Update, th.getTenThuongHieu(),th.getTrangThai(),id);
    }

}
