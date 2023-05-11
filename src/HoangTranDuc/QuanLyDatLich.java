/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HoangTranDuc;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DucHoang
 */
public class QuanLyDatLich {

    private List<DatLich> DatLich;

    public QuanLyDatLich() {
        DatLich = new ArrayList<>();

    }

    public QuanLyDatLich(List<DatLich> DatLich) {
        this.DatLich = DatLich;
    }

    public List<DatLich> getDatLich() {
        return DatLich;
    }

    public void setDatLich(List<DatLich> DatLich) {
        this.DatLich = DatLich;
    }

}
