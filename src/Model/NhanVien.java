/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class NhanVien {
    private int idNhanVien ; 
    private String hoTenNhanVien ; 
    private String tenChucVuNhanVien ; 
    private String LuongNhanVien ; 
    private String caLamNhanVien ; 
    private String thoiGianBatDau ; 
    private String thoiGianKetThuc ; 
    private int gioiTinhNhanVien ; 
    private String ngaySinhNhanVien;
    private String diaChiNhanVien ; 
    private String emailNhanVien ; 
    private String trangThaiNhanVien ; 

    public NhanVien(int idNhanVien, String hoTenNhanVien, String tenChucVuNhanVien, String LuongNhanVien, String caLamNhanVien, String thoiGianBatDau, String thoiGianKetThuc, int gioiTinhNhanVien, String ngaySinhNhanVien, String diaChiNhanVien, String emailNhanVien, String trangThaiNhanVien) {
        this.idNhanVien = idNhanVien;
        this.hoTenNhanVien = hoTenNhanVien;
        this.tenChucVuNhanVien = tenChucVuNhanVien;
        this.LuongNhanVien = LuongNhanVien;
        this.caLamNhanVien = caLamNhanVien;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.gioiTinhNhanVien = gioiTinhNhanVien;
        this.ngaySinhNhanVien = ngaySinhNhanVien;
        this.diaChiNhanVien = diaChiNhanVien;
        this.emailNhanVien = emailNhanVien;
        this.trangThaiNhanVien = trangThaiNhanVien;
    }

    public NhanVien() {
    }

    public String getGioiTinhNhanVienString(){
        if (gioiTinhNhanVien == 1) {
            return "Nam"; 
        }
        else return "Nữ"; 
    }
    public int getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(int idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getHoTenNhanVien() {
        return hoTenNhanVien;
    }

    public void setHoTenNhanVien(String hoTenNhanVien) {
        this.hoTenNhanVien = hoTenNhanVien;
    }

    public String getTenChucVuNhanVien() {
        return tenChucVuNhanVien;
    }

    public void setTenChucVuNhanVien(String tenChucVuNhanVien) {
        this.tenChucVuNhanVien = tenChucVuNhanVien;
    }

    public String getLuongNhanVien() {
        return LuongNhanVien;
    }

    public void setLuongNhanVien(String LuongNhanVien) {
        this.LuongNhanVien = LuongNhanVien;
    }

    public String getCaLamNhanVien() {
        return caLamNhanVien;
    }

    public void setCaLamNhanVien(String caLamNhanVien) {
        this.caLamNhanVien = caLamNhanVien;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public String getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(String thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public int getGioiTinhNhanVien() {
        return gioiTinhNhanVien;
    }

    public void setGioiTinhNhanVien(int gioiTinhNhanVien) {
        this.gioiTinhNhanVien = gioiTinhNhanVien;
    }

    public String getNgaySinhNhanVien() {
        return ngaySinhNhanVien;
    }

    public void setNgaySinhNhanVien(String ngaySinhNhanVien) {
        this.ngaySinhNhanVien = ngaySinhNhanVien;
    }

    public String getDiaChiNhanVien() {
        return diaChiNhanVien;
    }

    public void setDiaChiNhanVien(String diaChiNhanVien) {
        this.diaChiNhanVien = diaChiNhanVien;
    }

    public String getEmailNhanVien() {
        return emailNhanVien;
    }

    public void setEmailNhanVien(String emailNhanVien) {
        this.emailNhanVien = emailNhanVien;
    }

    public String getTrangThaiNhanVien() {
        return trangThaiNhanVien;
    }

    public void setTrangThaiNhanVien(String trangThaiNhanVien) {
        this.trangThaiNhanVien = trangThaiNhanVien;
    }
    
}
