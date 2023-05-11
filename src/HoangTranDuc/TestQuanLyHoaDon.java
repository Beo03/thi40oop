/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestQuanLyHoaDon {

    public static void main(String[] args) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            List<SanPham> dsSanPham = new ArrayList<>();
            dsSanPham.add(new SanPham("Bánh Mỳ", 11, 10000, 5000, sdf.parse("23/02/2023"), "VND"));
            dsSanPham.add(new SanPham("Mỳ Tôm", 5, 5000, 2000, sdf.parse("23/05/2023"), "Hảo Hảo"));
            dsSanPham.add(new SanPham("Bánh tráng", 20, 6000, 2000, sdf.parse("20/04/2023"), "VIX"));
            dsSanPham.add(new SanPham("Trứng gà", 10, 3000, 1000, sdf.parse("10/03/2023"), "HPG"));

            List<ChiTietHoaDon> dsChiTiet = new ArrayList<>();
            dsChiTiet.add(new ChiTietHoaDon(2, "Bánh Mỳ"));
            dsChiTiet.add(new ChiTietHoaDon(2, "Mỳ Tôm"));
            dsChiTiet.add(new ChiTietHoaDon(2, "Bánh tráng"));
            dsChiTiet.add(new ChiTietHoaDon(2, "Trứng gà"));

            List<ChiTietHoaDon> dsChiTiet2 = new ArrayList<>();
            dsChiTiet2.add(new ChiTietHoaDon(2, "Bánh tráng"));
            dsChiTiet2.add(new ChiTietHoaDon(2, "Trứng gà"));
            // Tạo danh sách hoá đơn

            QuanLyHoaDon qlhd = new QuanLyHoaDon();
            HoaDon hd = new HoaDon(dsChiTiet, sdf.parse("11/05/2023"), "Nghĩa", "Trang");
            HoaDon hd2 = new HoaDon(dsChiTiet2, sdf.parse("15/05/2023"), "Hoàng", "Hậu");

            qlhd.ThemHoaDon(hd);
            qlhd.ThemHoaDon(hd2);

            List<HoaDon> danhSachHoaDon = qlhd.getHoaDon();
            System.out.println("Danh sách hoá đơn:");
            for (HoaDon hoaDon : danhSachHoaDon) {
                System.out.println("Thông tin hoá đơn:");
                System.out.print("Danh sách sản phẩm: ");
                for (ChiTietHoaDon ct : hoaDon.getSanPham()) {
                    System.out.print(ct.getTenSP()+", ");
                }
                System.out.println();
                System.out.println("Ngày lập hoá đơn: " + sdf.format(hoaDon.getNgayLapHD()));
                System.out.println("Người xuất hoá đơn: " + hoaDon.getNguoiXuatHoaDon());
                System.out.println("Khách hàng: " + hoaDon.getKhachHang());
                System.out.println();
            }
        } catch (ParseException ex) {
            Logger.getLogger(TestQuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
