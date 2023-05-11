/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DucHoang
 */
public class QuanLyDatHang {

    private List<DonDatHang> DonDatHang;

    public QuanLyDatHang() {
        DonDatHang = new ArrayList<>();
    }

    public QuanLyDatHang(List<DonDatHang> DonDatHang) {
        this.DonDatHang = DonDatHang;
    }

    public List<DonDatHang> getDonDatHang() {
        return DonDatHang;
    }

    public void setDonDatHang(List<DonDatHang> DonDatHang) {
        this.DonDatHang = DonDatHang;
    }

}
