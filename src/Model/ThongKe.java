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
public class ThongKe {
    private int idThongKe ; 
    private String tenKhachHangTK ; 
    private BigDecimal tongTienKHTK ; 
    private String SDT ; 
    private String trangThaiTT ; 
    private int tongHoaDon ; 
    private BigDecimal tongTien ; 
    private int tongHoaDonHoanThanh ; 
    private int tongHoaDonChuaHT ; 

    public ThongKe(int idThongKe, String tenKhachHangTK, BigDecimal tongTienKHTK, String SDT, String trangThaiTT, int tongHoaDon, BigDecimal tongTien, int tongHoaDonHoanThanh, int tongHoaDonChuaHT) {
        this.idThongKe = idThongKe;
        this.tenKhachHangTK = tenKhachHangTK;
        this.tongTienKHTK = tongTienKHTK;
        this.SDT = SDT;
        this.trangThaiTT = trangThaiTT;
        this.tongHoaDon = tongHoaDon;
        this.tongTien = tongTien;
        this.tongHoaDonHoanThanh = tongHoaDonHoanThanh;
        this.tongHoaDonChuaHT = tongHoaDonChuaHT;
    }

    

    public ThongKe() {
    }

    public int getIdThongKe() {
        return idThongKe;
    }

    public void setIdThongKe(int idThongKe) {
        this.idThongKe = idThongKe;
    }

    public String getTenKhachHangTK() {
        return tenKhachHangTK;
    }

    public void setTenKhachHangTK(String tenKhachHangTK) {
        this.tenKhachHangTK = tenKhachHangTK;
    }

    public BigDecimal getTongTienKHTK() {
        return tongTienKHTK;
    }

    public void setTongTienKHTK(BigDecimal tongTienKHTK) {
        this.tongTienKHTK = tongTienKHTK;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTrangThaiTT() {
        return trangThaiTT;
    }

    public void setTrangThaiTT(String trangThaiTT) {
        this.trangThaiTT = trangThaiTT;
    }

    public int getTongHoaDon() {
        return tongHoaDon;
    }

    public void setTongHoaDon(int tongHoaDon) {
        this.tongHoaDon = tongHoaDon;
    }

    public BigDecimal getTongTien() {
        return tongTien;
    }

    public void setTongTien(BigDecimal tongTien) {
        this.tongTien = tongTien;
    }

    public int getTongHoaDonHoanThanh() {
        return tongHoaDonHoanThanh;
    }

    public void setTongHoaDonHoanThanh(int tongHoaDonHoanThanh) {
        this.tongHoaDonHoanThanh = tongHoaDonHoanThanh;
    }

    public int getTongHoaDonChuaHT() {
        return tongHoaDonChuaHT;
    }

    public void setTongHoaDonChuaHT(int tongHoaDonChuaHT) {
        this.tongHoaDonChuaHT = tongHoaDonChuaHT;
    }
    
}
