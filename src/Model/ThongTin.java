/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Admin
 */
public class ThongTin {
    private int ID;
    private String Ten;

    public ThongTin(int ID, String Ten) {
        this.ID = ID;
        this.Ten = Ten;
    }

    public ThongTin() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    @Override
    public String toString() {
        return "ThongTin{" + "ID=" + ID + ", Ten=" + Ten + '}';
    }
    
}
