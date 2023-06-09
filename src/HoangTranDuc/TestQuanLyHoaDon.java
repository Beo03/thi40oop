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

            QuanLySanPham qlsp = new QuanLySanPham(dsSanPham);
            
            List<DichVu> dsDichVu = new ArrayList<>();
            dsDichVu.add(new DichVu("Cắt móng tay", 100000));
            dsDichVu.add(new DichVu("Sơn móng tay", 150000));
            dsDichVu.add(new DichVu("Nhổ lông nách", 70000));

            List<ChiTietHoaDon> dsChiTiet = new ArrayList<>();
            dsChiTiet.add(new ChiTietHoaDon(2, new SanPham("Bánh Mỳ", 11, 10000, 5000, sdf.parse("23/02/2023"), "VND")));
            dsChiTiet.add(new ChiTietHoaDon(2, new SanPham("Bánh tráng", 20, 6000, 2000, sdf.parse("20/04/2023"), "VIX")));
            dsChiTiet.add(new ChiTietHoaDon(2, new SanPham("Mỳ Tôm", 5, 5000, 2000, sdf.parse("23/05/2023"), "Hảo Hảo")));
            dsChiTiet.add(new ChiTietHoaDon(2, new SanPham("Trứng gà", 10, 3000, 1000, sdf.parse("10/03/2023"), "HPG")));

            List<ChiTietHoaDon> dsChiTiet2 = new ArrayList<>();
            dsChiTiet2.add(new ChiTietHoaDon(2, new SanPham("Bánh Mỳ", 11, 10000, 5000, sdf.parse("23/02/2023"), "VND")));
            dsChiTiet2.add(new ChiTietHoaDon(2, new SanPham("Bánh tráng", 20, 6000, 2000, sdf.parse("20/04/2023"), "VIX")));
            // Tạo danh sách hoá đơn

            QuanLyHoaDon qlhd = new QuanLyHoaDon();
            HoaDon hd = new HoaDon(dsChiTiet, sdf.parse("11/05/2023"), "Nghĩa", "Trang");
            HoaDon hd1 = new HoaDon(dsChiTiet2, dsDichVu, sdf.parse("15/05/2023"), "Hoàng", "Hậu");

            qlhd.ThemHoaDon(hd);
            qlhd.ThemHoaDon(hd1);

            List<HoaDon> danhSachHoaDon = qlhd.getHoaDon();
            System.out.println("Danh sách hoá đơn:");
            System.out.println();
            int index = 1;
            for (HoaDon hoaDon : danhSachHoaDon) {
                System.out.println("   Thông tin hoá đơn:");
                if (hoaDon.getChiTietHoaDon() != null) {
                    System.out.print("     Danh sách sản phẩm: ");
                    for (ChiTietHoaDon ct : hoaDon.getChiTietHoaDon()) {
                        System.out.print(ct.getTenSP().getTenSP() + ", ");
                    }
                    System.out.println();
                }
                if (hoaDon.getListDichVu() != null) {
                    System.out.print("     Danh sách dịch vụ: ");
                    for (DichVu dv : hoaDon.getListDichVu()) {
                        System.out.print(dv.getTenDichVu() + ", ");
                    }
                }
                System.out.println();
                System.out.println("     Ngày lập hoá đơn: " + sdf.format(hoaDon.getNgayLapHD()));
                System.out.println("     Người xuất hoá đơn: " + hoaDon.getNguoiXuatHoaDon());
                System.out.println("     Khách hàng: " + hoaDon.getKhachHang());
                System.out.println("   Tổng tiền hoá đơn " + index + ": " + hoaDon.TongTien());
                System.out.println();
                index++;
            }

        } catch (ParseException ex) {
            Logger.getLogger(TestQuanLyHoaDon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
