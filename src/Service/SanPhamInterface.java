/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;
import Model.BangThongTinSP; 
import Model.SanPham; 

import java.util.List;

/**
 *
 * @author Admin
 */
public interface SanPhamInterface {
    List<SanPham> getAll(String data);  
    List<SanPham> ShowThongTin(String tenSP); 
    // Xóa sản phẩm 
    String deleteSPID(String ID); 
    // getAll sản phẩm + tìm kiếm sản phẩm 
    

}
