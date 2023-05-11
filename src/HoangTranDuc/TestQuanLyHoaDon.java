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
            List<SanPham> danhSachSanPham = new ArrayList<>();
            danhSachSanPham.add(new SanPham("Bánh Mỳ", 11, 10000, 5000, sdf.parse("23/02/2023"), "VND"));
            danhSachSanPham.add(new SanPham("Mỳ Tôm", 5, 5000, 2000, sdf.parse("23/05/2023"), "Hảo Hảo"));

            // Tạo danh sách hoá đơn
            QuanLyHoaDon qlhd = new QuanLyHoaDon();
            HoaDon hd = new HoaDon(danhSachSanPham, 15000.0f, sdf.parse("11/05/2023"), "Hoàng", "Hậu");
            HoaDon hd2 = new HoaDon(danhSachSanPham, 20000.0f, sdf.parse("15/05/2023"), "Nam", "Nữ");

            qlhd.ThemHoaDon(hd);
            qlhd.ThemHoaDon(hd2);

            List<HoaDon> danhSachHoaDon = qlhd.getHoaDon();
            System.out.println("Danh sách hoá đơn:");
            for (HoaDon hoaDon : danhSachHoaDon) {
                System.out.println("Thông tin hoá đơn:");
                System.out.print("Danh sách sản phẩm: ");
                for (SanPham sanPham : hoaDon.getSanPham()) {
                    System.out.print(sanPham.getTenSP()+", ");
                }
                System.out.println();
                System.out.println("Tổng tiền: " + hoaDon.getTongTien());
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
