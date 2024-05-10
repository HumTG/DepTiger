/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class LoaiKhachHang {
    private int ID;
    private String TenLoaiKhachHang;
    private String DacQuyen;
    private String TrangThai;

    public LoaiKhachHang(int ID, String TenLoaiKhachHang, String DacQuyen, String TrangThai) {
        this.ID = ID;
        this.TenLoaiKhachHang = TenLoaiKhachHang;
        this.DacQuyen = DacQuyen;
        this.TrangThai = TrangThai;
    }

    public LoaiKhachHang(String TenLoaiKhachHang, String DacQuyen, String TrangThai) {
        this.TenLoaiKhachHang = TenLoaiKhachHang;
        this.DacQuyen = DacQuyen;
        this.TrangThai = TrangThai;
    }
    
    public LoaiKhachHang() {
    }

//    public LoaiKhachHang(String TenLoaiKhachHang) {
//        this.TenLoaiKhachHang = TenLoaiKhachHang;
//    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTenLoaiKhachHang() {
        return TenLoaiKhachHang;
    }

    public void setTenLoaiKhachHang(String TenLoaiKhachHang) {
        this.TenLoaiKhachHang = TenLoaiKhachHang;
    }

    public String getDacQuyen() {
        return DacQuyen;
    }

    public void setDacQuyen(String DacQuyen) {
        this.DacQuyen = DacQuyen;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return TenLoaiKhachHang;
    }

//    @Override
//    public String toString() {
//        return "LoaiKhachHang{" + "ID=" + ID + ", TenLoaiKhachHang=" + TenLoaiKhachHang + ", DacQuyen=" + DacQuyen + ", TrangThai=" + TrangThai + '}';
//    }
//    
    
}
