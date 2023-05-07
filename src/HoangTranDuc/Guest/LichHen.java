/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc.Guest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author DucHoang
 */
public class LichHen {

    private LocalDateTime thoiGian;
    private DichVu dichVu;

    public LichHen(LocalDateTime thoiGian, DichVu dichVu) {
        this.thoiGian = thoiGian;
        this.dichVu = dichVu;
    }

    public LocalDateTime getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(LocalDateTime thoiGian) {
        this.thoiGian = thoiGian;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    @Override
    public String toString() {
        return "Lịch hẹn: " + thoiGian.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"))
                + ", dịch vụ: " + dichVu.getTenDichVu();
    }
}
