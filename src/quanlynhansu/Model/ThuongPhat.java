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
public class ThuongPhat {
    private  String MaNhanVien;
    private String LoaiTP;
    private  int Tien;
    private String Lydo;
    private String Ngay;
    private String Ghichu;

    public ThuongPhat() {
    }

    public ThuongPhat(String MaNhanVien, String LoaiString, int Tien, String Lydo, String Ngay, String Ghichu) {
        this.MaNhanVien = MaNhanVien;
        this.LoaiTP = LoaiString;
        this.Tien = Tien;
        this.Lydo = Lydo;
        this.Ngay = Ngay;
        this.Ghichu = Ghichu;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getLoaiTP() {
        return LoaiTP;
    }

    public void setLoaiTP(String LoaiTP) {
        this.LoaiTP = LoaiTP;
    }

    public int getTien() {
        return Tien;
    }

    public void setTien(int Tien) {
        this.Tien = Tien;
    }

    public String getLydo() {
        return Lydo;
    }

    public void setLydo(String Lydo) {
        this.Lydo = Lydo;
    }

    public String getNgay() {
        return Ngay;
    }

    public void setNgay(String Ngay) {
        this.Ngay = Ngay;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }
    
    
}
