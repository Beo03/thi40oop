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

    public ChiTietHoaDon(int SoLuong, String TenSP) {
        this.SoLuong = SoLuong;
        this.TenSP = TenSP;
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

    public int ThanhTien() {
        QuanLySanPham qlsp = new QuanLySanPham();
        int result = 0;
        for (var i = 0; i < qlsp.getSanPham().size(); i++) {
            if (TenSP.equals(qlsp.getSanPham().get(i).getTenSP())) {
                result = SoLuong * qlsp.getSanPham().get(i).getGiaBan();
            }
        }
        return result;
    }

}
