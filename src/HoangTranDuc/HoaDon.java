/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

import java.util.List;
import java.util.Date;

/**
 *
 * @author DucHoang
 */
public class HoaDon {

    private List<SanPham> SanPham;
    private Float TongTien;
    private Date NgayLapHD;
    private String NguoiXuatHoaDon;
    private String KhachHang;

    public HoaDon(List<SanPham> SanPham, Float TongTien, Date NgayLapHD, String NguoiXuatHoaDon, String KhachHang) {
        this.SanPham = SanPham;
        this.TongTien = TongTien;
        this.NgayLapHD = NgayLapHD;
        this.NguoiXuatHoaDon = NguoiXuatHoaDon;
        this.KhachHang = KhachHang;
    }

    public List<SanPham> getSanPham() {
        return SanPham;
    }

    public void setSanPham(List<SanPham> SanPham) {
        this.SanPham = SanPham;
    }

    public Float getTongTien() {
        return TongTien;
    }

    public void setTongTien(Float TongTien) {
        this.TongTien = TongTien;
    }

    public Date getNgayLapHD() {
        return NgayLapHD;
    }

    public void setNgayLapHD(Date NgayLapHD) {
        this.NgayLapHD = NgayLapHD;
    }

    public String getNguoiXuatHoaDon() {
        return NguoiXuatHoaDon;
    }

    public void setNguoiXuatHoaDon(String NguoiXuatHoaDon) {
        this.NguoiXuatHoaDon = NguoiXuatHoaDon;
    }

    public String getKhachHang() {
        return KhachHang;
    }

    public void setKhachHang(String KhachHang) {
        this.KhachHang = KhachHang;
    }

}
