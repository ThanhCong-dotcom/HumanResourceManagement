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
public class HopDong {
    private  String MaHD;
    private String NgayBatDau;
    private int HSLuong;
    private String MaCV;
    private String PhongBan;
    private String NgayKetThuc;
    private String GhiChu;

    public HopDong() {
    }

    public HopDong(String MaHD, String NgayBatDau, int HSLuong, String MaCV, String PhongBan, String NgayKetThuc, String GhiChu) {
        this.MaHD = MaHD;
        this.NgayBatDau = NgayBatDau;
        this.HSLuong = HSLuong;
        this.MaCV = MaCV;
        this.PhongBan = PhongBan;
        this.NgayKetThuc = NgayKetThuc;
        this.GhiChu = GhiChu;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public int getHSLuong() {
        return HSLuong;
    }

    public void setHSLuong(int HSLuong) {
        this.HSLuong = HSLuong;
    }

    public String getMaCV() {
        return MaCV;
    }

    public void setMaCV(String MaCV) {
        this.MaCV = MaCV;
    }

    public String getPhongBan() {
        return PhongBan;
    }

    public void setPhongBan(String PhongBan) {
        this.PhongBan = PhongBan;
    }

    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

  
    
}
