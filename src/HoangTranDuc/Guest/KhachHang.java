/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc.Guest;

import java.util.ArrayList;

/**
 *
 * @author DucHoang
 */
public class KhachHang {

    private String hoTen;
    private String soDienThoai;
    private String diaChi;
    private String email;
    private ArrayList<LichHen> lichHenList;

    public KhachHang(String hoTen, String soDienThoai, String diaChi, String email) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.email = email;
        lichHenList = new ArrayList<>();
    }

    public void themLichHen(LichHen lichHen) {
        lichHenList.add(lichHen);
    }

    public ArrayList<LichHen> getLichHenList() {
        return lichHenList;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
