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
    private List<SanPham> SanPham;

    public QuanLySanPham(List<SanPham> SanPham) {
        this.SanPham = SanPham;
    }

    public List<SanPham> getSanPham() {
        return SanPham;
    }

    public void setSanPham(List<SanPham> SanPham) {
        this.SanPham = SanPham;
    }
    
}
