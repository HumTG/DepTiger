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
public class KhachHang {
    private int ID;
    private int IDPhanHoiKH;
    private int IDLoaiKH;
    private int IDSoThich;
    private String HoTen;
    private Date NgaySinh;
    private boolean GioiTinh;
    private String SDT;
    private String DiaChi;
    private String Email;
    private String HinhAnh;
    private String TrangThai;

    public KhachHang(int ID, int IDPhanHoiKH, int IDLoaiKH, int IDSoThich, String HoTen, Date NgaySinh, boolean GioiTinh, String SDT, String DiaChi, String Email, String HinhAnh, String TrangThai) {
        this.ID = ID;
        this.IDPhanHoiKH = IDPhanHoiKH;
        this.IDLoaiKH = IDLoaiKH;
        this.IDSoThich = IDSoThich;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.HinhAnh = HinhAnh;
        this.TrangThai = TrangThai;
    }

    public KhachHang(int IDLoaiKH, String HoTen, Date NgaySinh, boolean GioiTinh, String SDT, String DiaChi, String Email, String HinhAnh) {
        this.IDLoaiKH = IDLoaiKH;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.HinhAnh = HinhAnh;
    }

    public KhachHang() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDPhanHoiKH() {
        return IDPhanHoiKH;
    }

    public void setIDPhanHoiKH(int IDPhanHoiKH) {
        this.IDPhanHoiKH = IDPhanHoiKH;
    }

    public int getIDLoaiKH() {
        return IDLoaiKH;
    }

    public void setIDLoaiKH(int IDLoaiKH) {
        this.IDLoaiKH = IDLoaiKH;
    }

    public int getIDSoThich() {
        return IDSoThich;
    }

    public void setIDSoThich(int IDSoThich) {
        this.IDSoThich = IDSoThich;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public boolean getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "ID=" + ID + ", IDPhanHoiKH=" + IDPhanHoiKH + ", IDLoaiKH=" + IDLoaiKH + ", IDSoThich=" + IDSoThich + ", HoTen=" + HoTen + ", NgaySinh=" + NgaySinh + ", GioiTinh=" + GioiTinh + ", SDT=" + SDT + ", DiaChi=" + DiaChi + ", Email=" + Email + ", HinhAnh=" + HinhAnh + ", TrangThai=" + TrangThai + '}';
    }

}