/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

/**
 *
 * @author DucHoang
 */
public class ChiTietHoaDon {

    private int SoLuong;
    private String TenSP;
    private SanPham ThanhTien;

    public ChiTietHoaDon(int SoLuong, String TenSP, SanPham ThanhTien) {
        this.SoLuong = SoLuong;
        this.TenSP = TenSP;
        this.ThanhTien = ThanhTien;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public SanPham getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(SanPham ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

}
