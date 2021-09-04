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
import quanlynhansu.Model.PhuCap;

/**
 *
 * @author Acer
 */
public class PhuCapDAO extends ConnectDatabase {

    public ArrayList<PhuCap> load() {
        ArrayList<PhuCap> listpc = new ArrayList<>();
        try {
            String sql = "SELECT *FROM PhuCap";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            listpc.clear();
            while (rs.next()) {
                PhuCap pb = new PhuCap(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                listpc.add(pb);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listpc;
    }

    public int insert(PhuCap pc) {
        try {
            String sql = "Insert into PhuCap(MaNhanVien,LoaiPC,Tien,TuNgay,DenNgay,GhiChu) values (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pc.getMaNhanVien());
            ps.setString(2, pc.getLoaiPC());
            ps.setInt(3, pc.getTienPC());
            ps.setString(4, pc.getTuNgay());
            ps.setString(5, pc.getDenNgay());
            ps.setString(6, pc.getGhichu());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();

        }
        return -1;
    }

    public int update(PhuCap pc) {
        try {
            String sql = "Update PhuCap set  LoaiPC=?, Tien=?, TuNgay=?, DenNgay=?, GhiChu=?  Where MaNhanVien=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(6, pc.getMaNhanVien());
            ps.setString(1, pc.getLoaiPC());
            ps.setInt(2, pc.getTienPC());
            ps.setString(3, pc.getTuNgay());
            ps.setString(4, pc.getDenNgay());
            ps.setString(5, pc.getGhichu());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return -1;
    }
//Xóa 

    public boolean delete(String MaNV) {
        try {
            String sql = "DELETE FROM PhuCap WHERE MaNhanVien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, MaNV);
            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return false;
    }

    public ArrayList<PhuCap> Search(String NV) {
        ArrayList<PhuCap> lists = new ArrayList<>();
        try {
            String sql = "SELECT * FROM PhuCap WHERE MaNhanVien like '%" + NV + "%' or LoaiPC like '%" + NV + "%'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                PhuCap tp = new PhuCap();
                tp.setMaNhanVien(rs.getString(1));
                tp.setLoaiPC(rs.getString(2));
                tp.setTienPC(rs.getInt(3));
                tp.setTuNgay(rs.getString(4));
                tp.setDenNgay(rs.getString(5));
                tp.setGhichu(rs.getString(6));
                lists.add(tp);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return lists;
    }

}
