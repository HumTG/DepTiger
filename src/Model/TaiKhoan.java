/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class TaiKhoan {
    private int ID;
    private int IDNhanVien;
    private String TaiKhoan;
    private String MatKhau;
    private String TrangThai;
    private Date NgayTao;
    private boolean AnSP;

    public TaiKhoan(int ID, int IDNhanVien, String TaiKhoan, String MatKhau, String TrangThai) {
        this.ID = ID;
        this.IDNhanVien = IDNhanVien;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.TrangThai = TrangThai;
    }

    public TaiKhoan() {
    }

    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(int IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "ID=" + ID + ", IDNhanVien=" + IDNhanVien + ", TaiKhoan=" + TaiKhoan + ", MatKhau=" + MatKhau + ", TrangThai=" + TrangThai + '}';
    }
    
}
