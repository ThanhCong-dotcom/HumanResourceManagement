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
public class Luong {
    private String MaNV;
    private int LuongCB;
    private String ChucVu;
    private String ChucDanh;
    private int PCChucVu;
    private String NgayNhap;
    private String NgaySua;
    private String GhiChu;

    public Luong() {
    }

    public Luong(String MaNV, int LuongCB, String ChucVu, String ChucDanh, int PCChucVu, String NgayNhap, String NgaySua, String GhiChu) {
        this.MaNV = MaNV;
        this.LuongCB = LuongCB;
        this.ChucVu = ChucVu;
        this.ChucDanh = ChucDanh;
        this.PCChucVu = PCChucVu;
        this.NgayNhap = NgayNhap;
        this.NgaySua = NgaySua;
        this.GhiChu = GhiChu;
    }

   
    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public int getLuongCB() {
        return LuongCB;
    }

    public void setLuongCB(int LuongCB) {
        this.LuongCB = LuongCB;
    }

    public String getChucVu() {
        return ChucVu;
    }

    public void setChucVu(String ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getChucDanh() {
        return ChucDanh;
    }

    public void setChucDanh(String ChucDanh) {
        this.ChucDanh = ChucDanh;
    }

    public int getPCChucVu() {
        return PCChucVu;
    }

    public void setPCChucVu(int PCChucVu) {
        this.PCChucVu = PCChucVu;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public String getNgaySua() {
        return NgaySua;
    }

    public void setNgaySua(String NgaySua) {
        this.NgaySua = NgaySua;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }



}
