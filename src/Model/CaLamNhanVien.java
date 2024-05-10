/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class CaLamNhanVien {
    private int IDCaLam ; 
    private String tenCaLam ; 
    private String thoiGianBatDau ; 
    private String thoiGianKetThuc ; 
    private String ngayTao ; 
    private String trangThai ; 

    public CaLamNhanVien(int IDCaLam, String tenCaLam, String thoiGianBatDau, String thoiGianKetThuc, String ngayTao, String trangThai) {
        this.IDCaLam = IDCaLam;
        this.tenCaLam = tenCaLam;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public CaLamNhanVien() {
    }

    public int getIDCaLam() {
        return IDCaLam;
    }

    public void setIDCaLam(int IDCaLam) {
        this.IDCaLam = IDCaLam;
    }

    public String getTenCaLam() {
        return tenCaLam;
    }

    public void setTenCaLam(String tenCaLam) {
        this.tenCaLam = tenCaLam;
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

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    
}
