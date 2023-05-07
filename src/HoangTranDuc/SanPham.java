/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

import java.util.Date;

/**
 *
 * @author DucHoang
 */
public class SanPham {
    private String TenSP;
    private int SoTon;
    private int GiaBan;
    private int GiaNhap;
    private Date HSD;
    private String HangSX;

    public SanPham(String TenSP, int SoTon, int GiaBan, int GiaNhap, Date HSD, String HangSX) {
        this.TenSP = TenSP;
        this.SoTon = SoTon;
        this.GiaBan = GiaBan;
        this.GiaNhap = GiaNhap;
        this.HSD = HSD;
        this.HangSX = HangSX;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getSoTon() {
        return SoTon;
    }

    public void setSoTon(int SoTon) {
        this.SoTon = SoTon;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }

    public int getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(int GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public Date getHSD() {
        return HSD;
    }

    public void setHSD(Date HSD) {
        this.HSD = HSD;
    }

    public String getHangSX() {
        return HangSX;
    }

    public void setHangSX(String HangSX) {
        this.HangSX = HangSX;
    }
    
}
