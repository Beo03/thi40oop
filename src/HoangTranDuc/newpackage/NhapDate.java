/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc.newpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class NhapDate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày (dd/MM/yyyy): ");
        String ngayNhap = sc.nextLine();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date date = sdf.parse(ngayNhap);
            String ngay = sdf.format(date);
            System.out.println("Ngày nhập vào là: " + ngay);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            int namNhap = cal.get(Calendar.YEAR);
            int thangNhap = cal.get(Calendar.MONTH) + 1;
            

            int namHienTai = 2023;
            int thangHienTai = 10;

            if (namNhap == namHienTai && thangNhap == thangHienTai) {
                System.out.println("Ngày nhập vào có cùng tháng và năm với ngày hiện tại!");
            } else {
                System.out.println("Ngày nhập vào không có cùng tháng và năm với ngày hiện tại!");
            }

            
        } catch (Exception e) {
            System.out.println("Không thể chuyển đổi ngày!");
        }
        sc.close();
    }
}
