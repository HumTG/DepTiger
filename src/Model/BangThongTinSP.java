/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class BangThongTinSP {
    private String ten ; 
    private String id ; 
    private BigDecimal gia ;
    private String thuongHieu ; 
    private String kieuDang ; 
    private int size ; 
    private String mauSP ;
    private String nhaSX ; 
    private int soLuong ; 
    private String trangThai ; 

    public BangThongTinSP(String ten, String id, BigDecimal gia, String thuongHieu, String kieuDang, int size, String mauSP, String nhaSX, int soLuong, String trangThai) {
        this.ten = ten;
        this.id = id;
        this.gia = gia;
        this.thuongHieu = thuongHieu;
        this.kieuDang = kieuDang;
        this.size = size;
        this.mauSP = mauSP;
        this.nhaSX = nhaSX;
        this.soLuong = soLuong;
        this.trangThai = trangThai;
    }
//
    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public BangThongTinSP() {
    }

    
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getGia() {
        return gia;
    }

    public void setGia(BigDecimal gia) {
        this.gia = gia;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getKieuDang() {
        return kieuDang;
    }

    public void setKieuDang(String kieuDang) {
        this.kieuDang = kieuDang;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMauSP() {
        return mauSP;
    }

    public void setMauSP(String mauSP) {
        this.mauSP = mauSP;
    }

    public String getNhaSX() {
        return nhaSX;
    }

    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
}
