/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Size;
import Repository.DBconnect;
import Repository.JDBCHelper;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SizeService implements SizeInterface {

    @Override
    public List<Size> getAll() {
        List<Size> listSize = new ArrayList<>();
        String sql = "SELECT [IDSizeSP]\n"
                + "      ,[SIze]\n"
                + "      ,[NgayTao]\n"
                + "      ,[TrangThai]\n"
                + "      ,[AnSP]\n"
                + "  FROM [dbo].[SizeSP] where AnSP = 0 ";
        try (Connection con = DBconnect.getConnection(); PreparedStatement ps = con.prepareCall(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Size sz = new Size(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4));
                listSize.add(sz);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSize;
    }
    
    String Insert = "INSERT INTO [dbo].[SizeSP]\n"
            + "           ([Size]\n"
            + "           ,[NgayTao]\n"
            + "           ,[TrangThai]\n"
            + "           ,[AnSP])\n"
            + "     VALUES(?,getDate(),N'Hoạt Động',0)";
    String Delete = "UPDATE [dbo].[SizeSP]\n"
            + "   SET [AnSP] = 1\n"
            + " WHERE IDSizeSP = ?";
    String Update = "UPDATE [dbo].[SizeSP]\n"
            + "   SET [Size] = ?\n"
            + "      ,[TrangThai] = ?\n"
            + " WHERE IDSizeSP = ?";
    public void insert(Size s){
        JDBCHelper.excuteUpdate(Insert, s.getSize());
    }
    public void delete(int id){
        JDBCHelper.excuteUpdate(Delete, id);
    }
    public void update(Size s , int id){
        JDBCHelper.excuteUpdate(Update, s.getSize(),s.getTrangThai(),id);
    }

}
