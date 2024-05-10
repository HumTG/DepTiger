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
public class HoaDonChiTiet {
    private int ID;
    private int IDHD;
    private int IDSP;
    private int soLuong;
    private BigDecimal Gia;
    private String TrangThai;

    public HoaDonChiTiet(int ID, int IDHD, int IDSP, int soLuong, BigDecimal Gia, String TrangThai) {
        this.ID = ID;
        this.IDHD = IDHD;
        this.IDSP = IDSP;
        this.soLuong = soLuong;
        this.Gia = Gia;
        this.TrangThai = TrangThai;
    }

    public HoaDonChiTiet(int IDHD, int IDSP, int soLuong, BigDecimal Gia, String TrangThai) {
        this.IDHD = IDHD;
        this.IDSP = IDSP;
        this.soLuong = soLuong;
        this.Gia = Gia;
        this.TrangThai = TrangThai;
    }

    public HoaDonChiTiet() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDHD() {
        return IDHD;
    }

    public void setIDHD(int IDHD) {
        this.IDHD = IDHD;
    }

    public int getIDSP() {
        return IDSP;
    }

    public void setIDSP(int IDSP) {
        this.IDSP = IDSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getGia() {
        return Gia;
    }

    public void setGia(BigDecimal Gia) {
        this.Gia = Gia;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    public HoaDonChiTiet(int IDHD, int IDSP, int soLuong) {
        this.IDHD = IDHD;
        this.IDSP = IDSP;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "ID=" + ID + ", IDHD=" + IDHD + ", IDSP=" + IDSP + ", soLuong=" + soLuong + ", Gia=" + Gia + ", TrangThai=" + TrangThai + '}';
    }
    
}
