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
public class PhongBan {
    private  String MaPB;
    private String TenPB;
    private String TenBoPhan;
    private String NgayThanhLap;
    private int PCChucVu;
    private int Soluong;
    private String Ghichu;

    public PhongBan() {
    }

    public PhongBan(String MaPB, String TenPB, String TenBoPhan, String NgayThanhLap, int PCChucVu, int Soluong, String Ghichu) {
        this.MaPB = MaPB;
        this.TenPB = TenPB;
        this.TenBoPhan = TenBoPhan;
        this.NgayThanhLap = NgayThanhLap;
        this.PCChucVu = PCChucVu;
        this.Soluong = Soluong;
        this.Ghichu = Ghichu;
    }

    public String getMaPB() {
        return MaPB;
    }

    public void setMaPB(String MaPB) {
        this.MaPB = MaPB;
    }

    public String getTenPB() {
        return TenPB;
    }

    public void setTenPB(String TenPB) {
        this.TenPB = TenPB;
    }

    public String getTenBoPhan() {
        return TenBoPhan;
    }

    public void setTenBoPhan(String TenBoPhan) {
        this.TenBoPhan = TenBoPhan;
    }

    public String getNgayThanhLap() {
        return NgayThanhLap;
    }

    public void setNgayThanhLap(String NgayThanhLap) {
        this.NgayThanhLap = NgayThanhLap;
    }

    public int getPCChucVu() {
        return PCChucVu;
    }

    public void setPCChucVu(int PCChucVu) {
        this.PCChucVu = PCChucVu;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String Ghichu) {
        this.Ghichu = Ghichu;
    }
    
}
