/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class NhaSanXuat {
    private String IdNSX ; 
    private String tenNSX ;
    private String ngayTao; 
    private String trangThai ; 

    public String getIdNSX() {
        return IdNSX;
    }

    public void setIdNSX(String IdNSX) {
        this.IdNSX = IdNSX;
    }

    public String getTenNSX() {
        return tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
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

    public NhaSanXuat(String IdNSX, String tenNSX, String ngayTao, String trangThai) {
        this.IdNSX = IdNSX;
        this.tenNSX = tenNSX;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public NhaSanXuat() {
    }
    
}
