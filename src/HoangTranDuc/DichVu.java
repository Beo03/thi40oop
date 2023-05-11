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
    private Float GiaThanh;

    public DichVu(String TenDichVu, Float GiaThanh) {
        this.TenDichVu = TenDichVu;
        this.GiaThanh = GiaThanh;
    }

    public String getTenDichVu() {
        return TenDichVu;
    }

    public void setTenDichVu(String TenDichVu) {
        this.TenDichVu = TenDichVu;
    }

    public Float getGiaThanh() {
        return GiaThanh;
    }

    public void setGiaThanh(Float GiaThanh) {
        this.GiaThanh = GiaThanh;
    }

}
