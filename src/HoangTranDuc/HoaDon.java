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

    private List<ChiTietHoaDon> ChiTietHoaDon;
    private List<DichVu> listDichVu;
    private Date NgayLapHD;
    private String NguoiXuatHoaDon;
    private String KhachHang;

    public HoaDon(List<ChiTietHoaDon> ChiTietHoaDon, List<DichVu> listDichVu, Date NgayLapHD, String NguoiXuatHoaDon, String KhachHang) {
        this.ChiTietHoaDon = ChiTietHoaDon;
        this.listDichVu = listDichVu;
        this.NgayLapHD = NgayLapHD;
        this.NguoiXuatHoaDon = NguoiXuatHoaDon;
        this.KhachHang = KhachHang;
    }

    public HoaDon(Date NgaapHD, List<DichVu> listDichVu, String NguoiXuatHoaDon, String KhachHang) {
        this.listDichVu = listDichVu;
        this.NgayLapHD = NgayLapHD;
        this.NguoiXuatHoaDon = NguoiXuatHoaDon;
        this.KhachHang = KhachHang;
    }

    public HoaDon(List<ChiTietHoaDon> ChiTietHoaDon, Date NgayLapHD, String NguoiXuatHoaDon, String KhachHang) {
        this.ChiTietHoaDon = ChiTietHoaDon;
        this.NgayLapHD = NgayLapHD;
        this.NguoiXuatHoaDon = NguoiXuatHoaDon;
        this.KhachHang = KhachHang;
    }

    public List<ChiTietHoaDon> getSanPham() {
        return ChiTietHoaDon;
    }

    public void setSanPham(List<ChiTietHoaDon> ChiTietHoaDon) {
        this.ChiTietHoaDon = ChiTietHoaDon;
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
    
    public int TongTien() {
        int result = 0;
        if (listDichVu != null) {
            for (int i = 0; i < listDichVu.size(); i++) {
                result += listDichVu.get(i).getGiaThanh();
            }
        }

        for (ChiTietHoaDon i : ChiTietHoaDon) {
            result += i.ThanhTien();
        }
        return result;
    }

}
