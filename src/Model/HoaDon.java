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
public class HoaDon {
    private int ID;
    private double TongTien;
    private int IDKH;
    private int IDNV;
    private int IDPTTT;
    private Date NgayTao;
    private String TrangThai;

    public HoaDon(int ID, double TongTien, int IDKH, int IDNV, int IDPTTT, Date NgayTao, String TrangThai) {
        this.ID = ID;
        this.TongTien = TongTien;
        this.IDKH = IDKH;
        this.IDNV = IDNV;
        this.IDPTTT = IDPTTT;
        this.NgayTao = NgayTao;
        this.TrangThai = TrangThai;
    }

    public HoaDon() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getTongTien() {
        return TongTien;
    }

    public void setTongTien(double TongTien) {
        this.TongTien = TongTien;
    }

    public int getIDKH() {
        return IDKH;
    }

    public void setIDKH(int IDKH) {
        this.IDKH = IDKH;
    }

    public int getIDNV() {
        return IDNV;
    }

    public void setIDNV(int IDNV) {
        this.IDNV = IDNV;
    }

    public int getIDPTTT() {
        return IDPTTT;
    }

    public void setIDPTTT(int IDPTTT) {
        this.IDPTTT = IDPTTT;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "ID=" + ID + ", TongTien=" + TongTien + ", IDKH=" + IDKH + ", IDNV=" + IDNV + ", IDPTTT=" + IDPTTT + ", NgayTao=" + NgayTao + ", TrangThai=" + TrangThai + '}';
    }

}