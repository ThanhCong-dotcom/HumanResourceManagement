/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu.Model;

/**
 *
 * @author Acer
 */
public class PhuCap {
    private  String MaNhanVien;
    private  String LoaiPC;
    private  int TienPC;
    private  String TuNgay;
    private  String DenNgay;
    private  String Ghichu;

    public PhuCap() {
    }

    public PhuCap(String MaNhanVien, String LoaiPC, int TienPC, String TuNgay, String DenNgay, String Ghichu) {
        this.MaNhanVien = MaNhanVien;
        this.LoaiPC = LoaiPC;
        this.TienPC = TienPC;
        this.TuNgay = TuNgay;
        this.DenNgay = DenNgay;
        this.Ghichu = Ghichu;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getLoaiPC() {
        return LoaiPC;
    }

    public void setLoaiPC(String LoaiPC) {
        this.LoaiPC = LoaiPC;
    }

    public int getTienPC() {
        return TienPC;
    }

    public void setTienPC(int TienPC) {
        this.TienPC = TienPC;
    }

    public String getTuNgay() {
        return TuNgay;
    }

    public void setTuNgay(String TuNgay) {
        this.TuNgay = TuNgay;
    }

    public String getDenNgay() {
        return DenNgay;
    }

    public void setDenNgay(String DenNgay) {
        this.DenNgay = DenNgay;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }
    
}
