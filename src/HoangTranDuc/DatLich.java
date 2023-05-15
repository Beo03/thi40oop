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
import java.util.List;

public class DatLich {

    private Date ThoiGian;
    private String TenKhachHang;
    private List<DichVu> dsDichVu;
    private int SDT;

    public DatLich(Date ThoiGian, String TenKhachHang, List<DichVu> dsDichVu, int SDT) {
        this.ThoiGian = ThoiGian;
        this.TenKhachHang = TenKhachHang;
        this.dsDichVu = dsDichVu;
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

    public List<DichVu> getDsDichVu() {
        return dsDichVu;
    }

    public void setDsDichVu(List<DichVu> dsDichVu) {
        this.dsDichVu = dsDichVu;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

}
