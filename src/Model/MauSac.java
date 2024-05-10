/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class MauSac {
    private String IDmau; 
    private String tenMau ; 
    private String ngayTao ; 
    private String trangThai ; 

    public MauSac(String IDmau, String tenMau, String ngayTao, String trangThai) {
        this.IDmau = IDmau;
        this.tenMau = tenMau;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public MauSac() {
    }

    public String getIDmau() {
        return IDmau;
    }

    public void setIDmau(String IDmau) {
        this.IDmau = IDmau;
    }

    public String getTenMau() {
        return tenMau;
    }

    public void setTenMau(String tenMau) {
        this.tenMau = tenMau;
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
