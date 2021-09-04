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
public class NhanVien {

    private String MaNhanVien;
    private String MaPB;
    private String MaHD;
    private int HeSoLuong;
    private String TenNV;
    private String GioiTinh;
    private String NgaySinh;
    private String SoCM;
    private String DienThoai;
    private String TrinhDoHV;
    private String DiaChi;
    private String Email;
    private String TTHonNhan;

    public NhanVien() {
    }

    public NhanVien(String MaNhanVien, String MaPB, String MaHD, int HeSoLuong, String TenNV, String GioiTinh, String NgaySinh, String SoCM, String DienThoai, String TrinhDoHV, String DiaChi, String Email, String TTHonNhan) {
        this.MaNhanVien = MaNhanVien;
        this.MaPB = MaPB;
        this.MaHD = MaHD;
        this.HeSoLuong = HeSoLuong;
        this.TenNV = TenNV;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.SoCM = SoCM;
        this.DienThoai = DienThoai;
        this.TrinhDoHV = TrinhDoHV;
        this.DiaChi = DiaChi;
        this.Email = Email;
        this.TTHonNhan = TTHonNhan;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String MaPB) {
        this.MaPB = MaPB;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public int getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(int HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getSoCM() {
        return SoCM;
    }

    public void setSoCM(String SoCM) {
        this.SoCM = SoCM;
    }

    public String getDienThoai() {
        return DienThoai;
    }

    public void setDienThoai(String DienThoai) {
        this.DienThoai = DienThoai;
    }

    public String getTrinhDoHV() {
        return TrinhDoHV;
    }

    public void setTrinhDoHV(String TrinhDoHV) {
        this.TrinhDoHV = TrinhDoHV;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTTHonNhan() {
        return TTHonNhan;
    }

    public void setTTHonNhan(String TTHonNhan) {
        this.TTHonNhan = TTHonNhan;
    }
            
}
