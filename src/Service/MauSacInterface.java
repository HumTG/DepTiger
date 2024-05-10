/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Service;
import Model.MauSac; 
import java.util.List;

/**
 *
 * @author Admin
 */
public interface MauSacInterface {
    List<MauSac> getAll(); 
    String themMauSac(MauSac ms );
    String suaMauSac(int index , MauSac ms); 
    String xoaMauSac(int idnex  , MauSac ms); 
}
