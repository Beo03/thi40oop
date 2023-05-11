/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

/**
 *
 * @author DucHoang
 */
public class Application {

    public static void main(String[] args) {
        QuanLyUser accountManager = new QuanLyUser();

        // Đăng ký tài khoản
        User account1 = new User("Hoang","20/3/2003",123456789,"hoang", "hoang1");
        accountManager.register(account1);

        // Kiểm tra đăng nhập
        String username = "hoang";
        String password = "hoang1";
        if (accountManager.login(username, password)) {
            System.out.println("Đăng nhập thành công!");
        } else {
            System.out.println("Tên đăng nhập hoặc mật khẩu không chính xác!");
        }
    }

}
