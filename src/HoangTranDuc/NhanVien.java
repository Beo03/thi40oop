/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

/**
 *
 * @author DucHoang
 */
public class NhanVien extends User {

    private String ChucVu;

    public NhanVien(String ChucVu, String TenUser, String NgaySinh, int SDT, String username, String password) {
        super(TenUser, NgaySinh, SDT, username, password);
        this.ChucVu = ChucVu;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }
    
}
