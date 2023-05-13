/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;


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
    
    
    public int DoanhThu(int Thang, int Nam) {
        int DoanhThu = 0;
        for (HoaDon i : DanhSachHoaDon) {
            try {
                Calendar cal = Calendar.getInstance();
                cal.setTime(i.getNgayLapHD());
                int namNhap = cal.get(Calendar.YEAR);
                int thangNhap = cal.get(Calendar.MONTH) + 1;
                if (namNhap == Nam && thangNhap == Thang) {
                    DoanhThu += i.TongTien();
                }
            } catch (Exception e) {
                System.out.println("Không thể chuyển đổi ngày!");
            }
        }
        return DoanhThu;
    }

}
