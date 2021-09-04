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
import quanlynhansu.Model.ChucVu;

/**
 *
 * @author Acer
 */
public class ChucVuDAO extends ConnectDatabase {

    public ArrayList<ChucVu> load() {
        ArrayList<ChucVu> listcv = new ArrayList<>();
        try {
            String sql = "SELECT *FROM ChucVu";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            listcv.clear();
            while (rs.next()) {
                ChucVu cv = new ChucVu(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
                listcv.add(cv);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listcv;
    }

    public int insert(ChucVu cv) {
        try {
            String sql = "Insert into ChucVu(MaCV,TenCv,MaNhanVien,NgayBatDau,NgayKetThuc,GhiChu) values (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cv.getMaCV());
            ps.setString(2, cv.getTenCV());
            ps.setString(3, cv.getMaNV());
            ps.setString(4, cv.getNgayBatDau());
            ps.setString(5, cv.getNgayKetThuc());
            ps.setString(6, cv.getGhiChu());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();

        }
        return -1;
    }
    //Sửa

    public int update(ChucVu cv) {
        try {
            String sql = "Update ChucVu set  TenCv=?, MaNhanVien=?, NgayBatDau=?, NgayKetThuc=?,GhiChu=? Where MaCV=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cv.getTenCV());
            ps.setString(2, cv.getMaNV());
            ps.setString(3, cv.getNgayBatDau());
            ps.setString(4, cv.getNgayKetThuc());
            ps.setString(5, cv.getGhiChu());
            ps.setString(6, cv.getMaCV());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return -1;
    }
//Xóa 

    public boolean delete(String MaCV) {
        try {
            String sql = "DELETE FROM ChucVu WHERE MaCV=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, MaCV);
            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return false;
    }

    public ArrayList<ChucVu> Search(String CV) {
        ArrayList<ChucVu> listcv = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ChucVu WHERE MaCV like '%" + CV + "%' or TenCv like N'%" + CV + "%' ";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                ChucVu cv = new ChucVu();
                cv.setMaCV(rs.getString(1));
                cv.setTenCV(rs.getString(2));
                cv.setMaNV(rs.getString(3));
                cv.setNgayBatDau(rs.getString(4));
                cv.setNgayKetThuc(rs.getString(5));
                cv.setGhiChu(rs.getString(6));

                listcv.add(cv);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listcv;
    }
}
