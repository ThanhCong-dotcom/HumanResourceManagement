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
public class ChamCong {
    private String MaNhanVien;
    private String NgayCham;
    private String TinhTrang;
    private int PCChucVu;
    private int PCKhac;
    private int SoNgayCong;
    private int SoNgayNghi;
    private float SoGioTangCa;
    private String GhiChu;

    public ChamCong() {
    }

    public ChamCong(String MaNhanVien, String NgayCham, String TinhTrang, int PCChucVu, int PCKhac, int SoNgayCong, int SoNgayNghi, float SoGioTangCa, String GhiChu) {
        this.MaNhanVien = MaNhanVien;
        this.NgayCham = NgayCham;
        this.TinhTrang = TinhTrang;
        this.PCChucVu = PCChucVu;
        this.PCKhac = PCKhac;
        this.SoNgayCong = SoNgayCong;
        this.SoNgayNghi = SoNgayNghi;
        this.SoGioTangCa = SoGioTangCa;
        this.GhiChu = GhiChu;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getNgayCham() {
        return NgayCham;
    }

    public void setNgayCham(String NgayCham) {
        this.NgayCham = NgayCham;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public int getPCChucVu() {
        return PCChucVu;
    }

    public void setPCChucVu(int PCChucVu) {
        this.PCChucVu = PCChucVu;
    }

    public int getPCKhac() {
        return PCKhac;
    }

    public void setPCKhac(int PCKhac) {
        this.PCKhac = PCKhac;
    }

    public int getSoNgayCong() {
        return SoNgayCong;
    }

    public void setSoNgayCong(int SoNgayCong) {
        this.SoNgayCong = SoNgayCong;
    }

    public int getSoNgayNghi() {
        return SoNgayNghi;
    }

    public void setSoNgayNghi(int SoNgayNghi) {
        this.SoNgayNghi = SoNgayNghi;
    }

    public float getSoGioTangCa() {
        return SoGioTangCa;
    }

    public void setSoGioTangCa(float SoGioTangCa) {
        this.SoGioTangCa = SoGioTangCa;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }


    
}
