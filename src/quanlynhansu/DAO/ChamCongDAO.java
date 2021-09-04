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
import quanlynhansu.Model.ChamCong;

/**
 *
 * @author Acer
 */
public class ChamCongDAO extends ConnectDatabase {

    public ArrayList<ChamCong> load() {
        ArrayList<ChamCong> listchamcog = new ArrayList<>();
        try {
            String sql = "SELECT *FROM ChamCong";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            listchamcog.clear();
            while (rs.next()) {
                ChamCong chamcog = new ChamCong(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getInt(7),
                        rs.getFloat(8),
                        rs.getString(9));
                listchamcog.add(chamcog);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listchamcog;
    }

    public int insert(ChamCong chamcog) {
        try {
            String sql = "Insert into ChamCong(MaNhanVien,Ngay,TinhTrang,PCChucVu,PCKhac,SoNgayCong,SoNgayNghi,SoGioTangCa,GhiChu) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, chamcog.getMaNhanVien());
            ps.setString(2, chamcog.getNgayCham());
            ps.setString(3, chamcog.getTinhTrang());
            ps.setInt(4, chamcog.getPCChucVu());
            ps.setInt(5, chamcog.getPCKhac());
            ps.setInt(6, chamcog.getSoNgayCong());
            ps.setInt(7, chamcog.getSoNgayNghi());
            ps.setFloat(8, chamcog.getSoGioTangCa());
            ps.setString(9, chamcog.getGhiChu());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return -1;
    }

    public int update(ChamCong chamCong) {
        try {
            String sql = "Update ChamCong set  Ngay=?, TinhTrang=?, PCChucVu=?, PCKhac=?, SoNgayCong=?,SoNgayNghi=?,SoGioTangCa=?, GhiChu=?  Where MaNhanVien=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, chamCong.getNgayCham());
            ps.setString(2, chamCong.getTinhTrang());
            ps.setInt(3, chamCong.getPCChucVu());
            ps.setInt(4, chamCong.getPCKhac());
            ps.setInt(5, chamCong.getSoNgayCong());
            ps.setInt(6, chamCong.getSoNgayNghi());
            ps.setFloat(7, chamCong.getSoGioTangCa());
            ps.setString(8, chamCong.getGhiChu());
            ps.setString(9, chamCong.getMaNhanVien());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return -1;
    }
//Xóa 

    public boolean delete(String MaNhanVien) {
        try {
            String sql = "DELETE FROM ChamCong WHERE MaNhanVien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, MaNhanVien);
            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return false;
    }

    public ArrayList<ChamCong> Search(String NV) {
        ArrayList<ChamCong> lists = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ChamCong WHERE MaNhanVien like '%" + NV + "%' ";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                ChamCong chamCong = new ChamCong();
                chamCong.setMaNhanVien(rs.getString(1));
                chamCong.setNgayCham(rs.getString(2));
                chamCong.setTinhTrang(rs.getString(3));
                chamCong.setPCChucVu(rs.getInt(4));
                chamCong.setPCKhac(rs.getInt(5));
                chamCong.setSoNgayCong(rs.getInt(6));
                chamCong.setSoNgayNghi(rs.getInt(7));
                chamCong.setSoGioTangCa(rs.getFloat(8));
                chamCong.setGhiChu(rs.getString(9));
                lists.add(chamCong);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return lists;
    }

}
