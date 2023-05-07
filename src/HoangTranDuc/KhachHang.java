/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

/**
 *
 * @author DucHoang
 */
public class KhachHang extends User{
    private String LoaiKH;

    public KhachHang(String LoaiKH, String TenUser, String NgaySinh, int SDT, String username, String password) {
        super(TenUser, NgaySinh, SDT, username, password);
        this.LoaiKH = LoaiKH;
    }

    public String getLoaiKH() {
        return LoaiKH;
    }

    public void setLoaiKH(String LoaiKH) {
        this.LoaiKH = LoaiKH;
    }
    
}
