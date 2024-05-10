/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;

public class SanPham {

    private int IdSanPham;
    private String tenSanPham;
    private String IDKieuDang;
    private String IDMauSanPham;
    private String IDSizeSanPham;
    private String IDNSX;
    private String chatLieu;
    private String IDThuongHieu;
    private String loaiDeDep;
    private int SoLuongTonKho;
    private double giaNhap;
    private BigDecimal giaBan;
    private String mucDichSD;
    private String ngayNhap ; 
    private String moTa;
    private String trangThai;

    public SanPham(int IdSanPham, String tenSanPham, String IDKieuDang, String IDMauSanPham, String IDSizeSanPham, String IDNSX, String chatLieu, String IDThuongHieu, String loaiDeDep, int SoLuongTonKho, double giaNhap, BigDecimal giaBan, String mucDichSD, String ngayNhap, String moTa, String trangThai) {
        this.IdSanPham = IdSanPham;
        this.tenSanPham = tenSanPham;
        this.IDKieuDang = IDKieuDang;
        this.IDMauSanPham = IDMauSanPham;
        this.IDSizeSanPham = IDSizeSanPham;
        this.IDNSX = IDNSX;
        this.chatLieu = chatLieu;
        this.IDThuongHieu = IDThuongHieu;
        this.loaiDeDep = loaiDeDep;
        this.SoLuongTonKho = SoLuongTonKho;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.mucDichSD = mucDichSD;
        this.ngayNhap = ngayNhap;
        this.moTa = moTa;
        this.trangThai = trangThai;
    }

    
    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }


    public int getIdSanPham() {
        return IdSanPham;
    }

    public void setIdSanPham(int IdSanPham) {
        this.IdSanPham = IdSanPham;
    }
    public SanPham() {
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getIDKieuDang() {
        return IDKieuDang;
    }

    public void setIDKieuDang(String IDKieuDang) {
        this.IDKieuDang = IDKieuDang;
    }

    public String getIDMauSanPham() {
        return IDMauSanPham;
    }

    public void setIDMauSanPham(String IDMauSanPham) {
        this.IDMauSanPham = IDMauSanPham;
    }

    public String getIDSizeSanPham() {
        return IDSizeSanPham;
    }

    public void setIDSizeSanPham(String IDSizeSanPham) {
        this.IDSizeSanPham = IDSizeSanPham;
    }

    public String getIDNSX() {
        return IDNSX;
    }

    public void setIDNSX(String IDNSX) {
        this.IDNSX = IDNSX;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public String getIDThuongHieu() {
        return IDThuongHieu;
    }

    public void setIDThuongHieu(String IDThuongHieu) {
        this.IDThuongHieu = IDThuongHieu;
    }

    public String getLoaiDeDep() {
        return loaiDeDep;
    }

    public void setLoaiDeDep(String loaiDeDep) {
        this.loaiDeDep = loaiDeDep;
    }

    public int getSoLuongTonKho() {
        return SoLuongTonKho;
    }

    public void setSoLuongTonKho(int SoLuongTonKho) {
        this.SoLuongTonKho = SoLuongTonKho;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan ;
    }

    public String getMucDichSD() {
        return mucDichSD;
    }

    public void setMucDichSD(String mucDichSD) {
        this.mucDichSD = mucDichSD;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "IdSanPham=" + IdSanPham + ", tenSanPham=" + tenSanPham + ", IDKieuDang=" + IDKieuDang + ", IDMauSanPham=" + IDMauSanPham + ", IDSizeSanPham=" + IDSizeSanPham + ", IDNSX=" + IDNSX + ", chatLieu=" + chatLieu + ", IDThuongHieu=" + IDThuongHieu + ", loaiDeDep=" + loaiDeDep + ", SoLuongTonKho=" + SoLuongTonKho + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", mucDichSD=" + mucDichSD + ", ngayNhap=" + ngayNhap + ", moTa=" + moTa + ", trangThai=" + trangThai + '}';
    }
    
}
