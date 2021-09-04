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
public class TaiKhoan {
    private String MaNhanVien;
    private String  TenDangNhap;
    private String MatKhau;
    private String TenQuyenHan;
    
    public TaiKhoan() {
    }

    public TaiKhoan(String TenDangNhap, String MatKhau) {
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public TaiKhoan(String MaNhanVien ,String TenDangNhap, String MatKhau, String TenQuyenHan) {
        this.MaNhanVien=MaNhanVien;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.TenQuyenHan = TenQuyenHan;
    }

    public String getTenQuyenHan() {
        return TenQuyenHan;
    }

    public void setTenQuyenHan(String TenQuyenHan) {
        this.TenQuyenHan = TenQuyenHan;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }
    
    
    
    
}
