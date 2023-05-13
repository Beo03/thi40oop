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
    private SanPham TenSP;

    public ChiTietHoaDon(int SoLuong, SanPham SanPham) {
        this.SoLuong = SoLuong;
        this.TenSP = SanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public SanPham getTenSP() {
        return TenSP;
    }

    public void setTenSP(SanPham TenSP) {
        this.TenSP = TenSP;
    }

    public int ThanhTien() {
        
        return SoLuong*TenSP.getGiaBan();
    }



}
