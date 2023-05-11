/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

/**
 *
 * @author DucHoang
 */
import java.util.Date;

public class DatLich {

    private Date ThoiGian;
    private String TenKhachHang;
    private String TenDichVu;
    private int SDT;

    public DatLich(Date ThoiGian, String TenKhachHang, String TenDichVu, int SDT) {
        this.ThoiGian = ThoiGian;
        this.TenKhachHang = TenKhachHang;
        this.TenDichVu = TenDichVu;
        this.SDT = SDT;
    }

    public Date getThoiGian() {
        return ThoiGian;
    }

    public void setThoiGian(Date ThoiGian) {
        this.ThoiGian = ThoiGian;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String TenDichVu) {
        this.TenDichVu = TenDichVu;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

}
