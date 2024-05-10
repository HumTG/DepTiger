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
public class PhanHoiKH {
    private int ID;
    private int SoSao;
    private String GhiChu;
    private String TrangThai;

    public PhanHoiKH(int ID, int SoSao, String GhiChu, String TrangThai) {
        this.ID = ID;
        this.SoSao = SoSao;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public PhanHoiKH(int SoSao, String GhiChu, String TrangThai) {
        this.SoSao = SoSao;
        this.GhiChu = GhiChu;
        this.TrangThai = TrangThai;
    }

    public PhanHoiKH() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSoSao() {
        return SoSao;
    }

    public void setSoSao(int SoSao) {
        this.SoSao = SoSao;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "DanhGia{" + "ID=" + ID + ", SoSao=" + SoSao + ", GhiChu=" + GhiChu + ", TrangThai=" + TrangThai + '}';
    }
    
}
