/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

import java.util.List;

/**
 *
 * @author DucHoang
 */
public class DonDatHang {

    private String TenKhachHang;
    private int SDT;
    private String DiaChi;
    private List<SanPham> dsSanPham;
    private int SoLuong;

    public DonDatHang(String TenKhachHang, int SDT, String DiaChi, List<SanPham> dsSanPham, int SoLuong) {
        this.TenKhachHang = TenKhachHang;
        this.SDT = SDT;
        this.DiaChi = DiaChi;
        this.dsSanPham = dsSanPham;
        this.SoLuong = SoLuong;
    }

    

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public List<SanPham> getDsSanPham() {
        return dsSanPham;
    }

    public void setDsSanPham(List<SanPham> dsSanPham) {
        this.dsSanPham = dsSanPham;
    }

    

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

}
