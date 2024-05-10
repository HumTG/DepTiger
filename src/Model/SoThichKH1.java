/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class SoThichKH1 {
    private int ID;
    private String TenSP;
    private String TrangThai;

    public SoThichKH1(int ID, String TenSP, String TrangThai) {
        this.ID = ID;
        this.TenSP = TenSP;
        this.TrangThai = TrangThai;
    }

    public SoThichKH1(String TenSP, String TrangThai) {
        this.TenSP = TenSP;
        this.TrangThai = TrangThai;
    }

    public SoThichKH1() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "SoThichKH{" + "ID=" + ID + ", TenSP=" + TenSP + ", TrangThai=" + TrangThai + '}';
    }
    
}
