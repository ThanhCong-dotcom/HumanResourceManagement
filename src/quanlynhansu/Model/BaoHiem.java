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
public class BaoHiem {
    private String MaNhanVien;
    private String LoaiBaoHiem;
    private String SoThe;
    private String NgayCap;
    private String NgayHetHan;
    private String NoiCap;
    private  String GhiChu;

    public BaoHiem() {
    }

    public BaoHiem(String MaNhanVien, String LoaiBaoHiem, String SoThe, String NgayCap,String NgayHetHan, String NoiCap, String GhiChu) {
        this.MaNhanVien = MaNhanVien;
        this.LoaiBaoHiem = LoaiBaoHiem;
        this.SoThe = SoThe;
        this.NgayCap = NgayCap;
        this.NgayHetHan=NgayHetHan;
        this.NoiCap = NoiCap;
        this.GhiChu = GhiChu;
        
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getLoaiBaoHiem() {
        return LoaiBaoHiem;
    }

    public void setLoaiBaoHiem(String LoaiBaoHiem) {
        this.LoaiBaoHiem = LoaiBaoHiem;
    }

    public String getSoThe() {
        return SoThe;
    }

    public void setSoThe(String SoThe) {
        this.SoThe = SoThe;
    }

    public String getNgayCap() {
        return NgayCap;
    }

    public void setNgayCap(String NgayCap) {
        this.NgayCap = NgayCap;
    }

    public String getNgayHetHan() {
        return NgayHetHan;
    }

    public void setNgayHetHan(String NgayHetHan) {
        this.NgayHetHan = NgayHetHan;
    }
    
    

    public String getNoiCap() {
        return NoiCap;
    }

    public void setNoiCap(String NoiCap) {
        this.NoiCap = NoiCap;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    
}
