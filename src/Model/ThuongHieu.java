/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class ThuongHieu {
   private String IdThuongHieu ; 
    private String tenThuongHieu ; 
    private String ngayTao ; 
    private String trangThai ; 

    public ThuongHieu(String IdThuongHieu, String tenThuongHieu, String ngayTao, String trangThai) {
        this.IdThuongHieu = IdThuongHieu;
        this.tenThuongHieu = tenThuongHieu;
        this.ngayTao = ngayTao;
        this.trangThai = trangThai;
    }

    public ThuongHieu() {
    }

    public String getIdThuongHieu() {
        return IdThuongHieu;
    }

    public void setIdThuongHieu(String IdThuongHieu) {
        this.IdThuongHieu = IdThuongHieu;
    }

    public String getTenThuongHieu() {
        return tenThuongHieu;
    }

    public void setTenThuongHieu(String tenThuongHieu) {
        this.tenThuongHieu = tenThuongHieu;
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
