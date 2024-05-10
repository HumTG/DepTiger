/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;

import java.util.List;
import Model.NhanVien; 


public interface NhanVienInterface {
    List<NhanVien> getAllNhanVien(); 
    List<NhanVien> getShowThongTinNhanVien(int IDNV);
    String xoaNhanVien(int IDNV); 
}
