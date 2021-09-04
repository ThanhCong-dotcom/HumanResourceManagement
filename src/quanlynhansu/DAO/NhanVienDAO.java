/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import quanlynhansu.Model.NhanVien;

/**
 *
 * @author Acer
 */
public class NhanVienDAO extends ConnectDatabase {

    public ArrayList<NhanVien> load() {
        ArrayList<NhanVien> lists = new ArrayList<>();
        try {
            String sql = "SELECT *FROM NhanVien";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            lists.clear();
            while (rs.next()) {
                NhanVien sv = new NhanVien(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13));
                lists.add(sv);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return lists;
    }

    //  Thêm nhân viên
    public int insert(NhanVien nv) {
        try {
            String sql = "Insert into NhanVien(MaNhanVien,MaPB,MaHD,HeSoLuong,TenNV,GioiTinh,NgaySinh,SoCM,DienThoai,TrinhDoHV,DiaChi,Email,TTHonNhan) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nv.getMaNhanVien());
            ps.setString(2, nv.getMaPB());
            ps.setString(3, nv.getMaHD());
            ps.setInt(4, nv.getHeSoLuong());
            ps.setString(5, nv.getTenNV());
            ps.setString(6, nv.getGioiTinh());
            ps.setString(7, nv.getNgaySinh());
            ps.setString(8, nv.getSoCM());
            ps.setString(9, nv.getDienThoai());
            ps.setString(10, nv.getTrinhDoHV());
            ps.setString(11, nv.getDiaChi());
            ps.setString(12, nv.getEmail());
            ps.setString(13, nv.getTTHonNhan());
            return ps.executeUpdate();

        } catch (SQLException ex) {
            ex.getMessage();

        }
        return -1;
    }

    public int update(NhanVien nv) {
        try {
            String sql = "Update NhanVien set  MaPB=?, MaHD=?, HeSoLuong=?, TenNV=?, GioiTinh=?, NgaySinh=?, "
                    + "SoCM=? ,DienThoai=? ,TrinhDoHV=?,DiaChi=?,Email=?,TTHonNhan=? Where MaNhanVien=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nv.getMaPB());
            ps.setString(2, nv.getMaHD());
            ps.setInt(3, nv.getHeSoLuong());
            ps.setString(4, nv.getTenNV());
            ps.setString(5, nv.getGioiTinh());
            ps.setString(6, nv.getNgaySinh());
            ps.setString(7, nv.getSoCM());
            ps.setString(8, nv.getDienThoai());
            ps.setString(9, nv.getTrinhDoHV());
            ps.setString(10, nv.getDiaChi());
            ps.setString(11, nv.getEmail());
            ps.setString(12, nv.getTTHonNhan());
            ps.setString(13, nv.getMaNhanVien());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return -1;
    }

    public boolean delete(String maNhanVien) {
        try {
            String sql = "DELETE FROM NhanVien WHERE MaNhanVien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maNhanVien);
            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {
        }
        return false;
    }

    public ArrayList<NhanVien> SearchTen(String NV) {
        ArrayList<NhanVien> lists = new ArrayList<>();
        try {
            String sql = "SELECT * FROM NhanVien WHERE MaNhanVien like '%" + NV + "%' or TenNV like N'%" + NV + "%' ";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNhanVien(rs.getString(1));
                nv.setMaPB(rs.getString(2));
                nv.setMaHD(rs.getString(3));
                nv.setHeSoLuong(rs.getInt(4));
                nv.setTenNV(rs.getString(5));
                nv.setGioiTinh(rs.getString(6));
                nv.setNgaySinh(rs.getString(7));
                nv.setSoCM(rs.getString(8));
                nv.setDienThoai(rs.getString(9));
                nv.setTrinhDoHV(rs.getString(10));
                nv.setDiaChi(rs.getString(11));
                nv.setEmail(rs.getString(12));
                nv.setTTHonNhan(rs.getString(13));
                lists.add(nv);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return lists;
    }

}
