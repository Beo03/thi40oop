/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDichVu {

    private List<DichVu> DichVu;

    public QuanLyDichVu() {
        DichVu = new ArrayList<>();
    }

    public QuanLyDichVu(List<DichVu> DichVu) {
        this.DichVu = DichVu;
    }

    public List<DichVu> getDichVu() {
        return DichVu;
    }

    public void setDichVu(List<DichVu> DichVu) {
        this.DichVu = DichVu;
    }

}
