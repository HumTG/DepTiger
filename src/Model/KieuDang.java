/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class KieuDang {

    private String idTenKieuDang;
    private String tenKieuDang;
    private String ngayTao;
    private String trangThai;

    public KieuDang(String idTenKieuDang, String tenKieuDang, String ngayTao, String trangThai) {
        this.idTenKieuDang = idTenKieuDang;
        this.tenKieuDang = tenKieuDang;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public KieuDang() {
    }

    public String getIdTenKieuDang() {
        return idTenKieuDang;
    }

    public void setIdTenKieuDang(String idTenKieuDang) {
        this.idTenKieuDang = idTenKieuDang;
    }

    public String getTenKieuDang() {
        return tenKieuDang;
    }

    public void setTenKieuDang(String tenKieuDang) {
        this.tenKieuDang = tenKieuDang;
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
