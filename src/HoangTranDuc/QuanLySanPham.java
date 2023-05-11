/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

/**
 *
 * @author DucHoang
 */
import java.util.ArrayList;
import java.util.List;

public class QuanLySanPham {

    private List<SanPham> DanhSachSanPham;

    public QuanLySanPham() {
        DanhSachSanPham = new ArrayList<>();
    }

    public QuanLySanPham(List<SanPham> DanhSachSanPham) {
        this.DanhSachSanPham = DanhSachSanPham;
    }

    public List<SanPham> getSanPham() {
        return DanhSachSanPham;
    }

    public void setSanPham(List<SanPham> DanhSachSanPham) {
        this.DanhSachSanPham = DanhSachSanPham;
    }

    public void ThemSanPham(SanPham sp) {
        DanhSachSanPham.add(sp);
    }

    public void XoaSanPham(SanPham sp) {
        DanhSachSanPham.remove(sp);
    }

    public void capNhatSoLuong(int SoLuong, String TenSanPham) {
        for (SanPham i : DanhSachSanPham) {
            if (i.getTenSP().equals(TenSanPham)) {
                i.setSoTon(i.getSoTon() - SoLuong);
            }
        }
    }
}
