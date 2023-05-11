/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class QuanLyHoaDon {

    private List<HoaDon> DanhSachHoaDon;

    public QuanLyHoaDon() {
        DanhSachHoaDon = new ArrayList<>();
    }

    public QuanLyHoaDon(List<HoaDon> HoaDon) {
        this.DanhSachHoaDon = HoaDon;
    }

    public List<HoaDon> getHoaDon() {
        return DanhSachHoaDon;
    }

    public void setHoaDon(List<HoaDon> HoaDon) {
        this.DanhSachHoaDon = HoaDon;
    }

    public void ThemHoaDon(HoaDon hd) {
        DanhSachHoaDon.add(hd);
    }

    public void DoanhThu(int Thang, int Nam) {
        Double DoanhThu;
        DoanhThu = 0.0;
        for (int i = 0; i < DanhSachHoaDon.size(); i++) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Calendar cal = Calendar.getInstance();
                cal.setTime(DanhSachHoaDon.get(i).getNgayLapHD());
                int namNhap = cal.get(Calendar.YEAR);
                int thangNhap = cal.get(Calendar.MONTH) + 1;
                if (namNhap == Nam && thangNhap == Thang) {
                    System.out.println("Ngày nhập vào có cùng tháng và năm với ngày hiện tại!");
                } else {
                    System.out.println("Ngày nhập vào không có cùng tháng và năm với ngày hiện tại!");
                }

            } catch (Exception e) {
                System.out.println("Không thể chuyển đổi ngày!");
            }
        }
    }
}
