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
import quanlynhansu.Model.PhongBan;

/**
 *
 * @author Acer
 */
public class PhongBanDAO extends ConnectDatabase {

    public ArrayList<PhongBan> load() {
        ArrayList<PhongBan> lists = new ArrayList<>();
        try {
            String sql = "SELECT *FROM PhongBan";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            lists.clear();
            while (rs.next()) {
                PhongBan pb = new PhongBan(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getInt(6),
                        rs.getString(7));
                lists.add(pb);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return lists;
    }

    public int insert(PhongBan pb) {
        try {
            String sql = "Insert into PhongBan(MaPB,TenPB,TenBP,NgayThanhLap,PCChucVu,SoLuong,GhiChu) values (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pb.getMaPB());
            ps.setString(2, pb.getTenPB());
            ps.setString(3, pb.getTenBoPhan());
            ps.setString(4, pb.getNgayThanhLap());
            ps.setInt(5, pb.getPCChucVu());
            ps.setInt(6, pb.getSoluong());
            ps.setString(7, pb.getGhichu());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();

        }
        return -1;
    }

    public int update(PhongBan pb) {
        try {
            String sql = "Update PhongBan set  TenPB=?, TenBP=?, NgayThanhLap=?, PCChucVu=?, SoLuong=?, GhiChu=?  Where MaPB=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pb.getTenPB());
            ps.setString(2, pb.getTenBoPhan());
            ps.setString(3, pb.getNgayThanhLap());
            ps.setInt(4, pb.getPCChucVu());
            ps.setInt(5, pb.getSoluong());
            ps.setString(6, pb.getGhichu());
            ps.setString(7, pb.getMaPB());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();

        }
        return -1;
    }
//Xóa phòng ban

    public boolean delete(String maPB) {
        try {
            String sql = "DELETE FROM PhongBan WHERE MaPB=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maPB);
            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.getMessage();

        }
        return false;
    }

    public ArrayList<PhongBan> Search(String PB) {
        ArrayList<PhongBan> listpb = new ArrayList<>();
        try {
            String sql = "SELECT * FROM PhongBan WHERE MaPB like '%" + PB + "%' or TenPB like N'%" + PB + "%' ";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                PhongBan pb = new PhongBan();
                pb.setMaPB(rs.getString(1));
                pb.setTenPB(rs.getString(2));
                pb.setTenBoPhan(rs.getString(3));
                pb.setNgayThanhLap(rs.getString(4));
                pb.setPCChucVu(rs.getInt(5));
                pb.setSoluong(rs.getInt(6));
                pb.setGhichu(rs.getString(7));
                listpb.add(pb);
            }
        } catch (SQLException ex) {
            ex.getMessage();

        }
        return listpb;
    }

}
