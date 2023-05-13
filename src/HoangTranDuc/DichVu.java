/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

/**
 *
 * @author DucHoang
 */
public class DichVu {

    private String TenDichVu;
    private int GiaThanh;

    public DichVu(String TenDichVu, int GiaThanh) {
        this.TenDichVu = TenDichVu;
        this.GiaThanh = GiaThanh;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String TenDichVu) {
        this.TenDichVu = TenDichVu;
    }

    public int getGiaThanh() {
        return GiaThanh;
    }

    public void setGiaThanh(int GiaThanh) {
        this.GiaThanh = GiaThanh;
    }

}
