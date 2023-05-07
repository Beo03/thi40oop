/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc.Guest;

/**
 *
 * @author DucHoang
 */
public class DichVu {

    private String tenDichVu;
    private double giaTien;

    public DichVu(String tenDichVu, double giaTien) {
        this.tenDichVu = tenDichVu;
        this.giaTien = giaTien;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
}
