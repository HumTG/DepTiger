/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class ChucVuNhanVien {
    private int IDChucVuNhanVien ; 
    private String tenChucVuNhanVien ; 
    private String luongChucVuNhanVien ; 
    private String ngayTaoChucVu ; 
    private String trangThaiChucVu ;

    public ChucVuNhanVien(int IDChucVuNhanVien, String tenChucVuNhanVien, String luongChucVuNhanVien, String ngayTaoChucVu, String trangThaiChucVu) {
        this.IDChucVuNhanVien = IDChucVuNhanVien;
        this.tenChucVuNhanVien = tenChucVuNhanVien;
        this.luongChucVuNhanVien = luongChucVuNhanVien;
        this.ngayTaoChucVu = ngayTaoChucVu;
        this.trangThaiChucVu = trangThaiChucVu;
    }

    public ChucVuNhanVien() {
    }

    public int getIDChucVuNhanVien() {
        return IDChucVuNhanVien;
    }

    public void setIDChucVuNhanVien(int IDChucVuNhanVien) {
        this.IDChucVuNhanVien = IDChucVuNhanVien;
    }

    public String getTenChucVuNhanVien() {
        return tenChucVuNhanVien;
    }

    public void setTenChucVuNhanVien(String tenChucVuNhanVien) {
        this.tenChucVuNhanVien = tenChucVuNhanVien;
    }

    public String getLuongChucVuNhanVien() {
        return luongChucVuNhanVien;
    }

    public void setLuongChucVuNhanVien(String luongChucVuNhanVien) {
        this.luongChucVuNhanVien = luongChucVuNhanVien;
    }

    public String getNgayTaoChucVu() {
        return ngayTaoChucVu;
    }

    public void setNgayTaoChucVu(String ngayTaoChucVu) {
        this.ngayTaoChucVu = ngayTaoChucVu;
    }

    public String getTrangThaiChucVu() {
        return trangThaiChucVu;
    }

    public void setTrangThaiChucVu(String trangThaiChucVu) {
        this.trangThaiChucVu = trangThaiChucVu;
    }
    
}
