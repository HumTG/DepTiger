/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;
import Model.KieuDang; 
import java.util.List;

/**
 *
 * @author Admin
 */
public interface KieuDangInterface {
    List<KieuDang> getAll(); 
    String xoaKieuDang(String maKD); 
    String addKieuDang(KieuDang kd); 
    String suaKieuDang(KieuDang kd , int index ); 
}
