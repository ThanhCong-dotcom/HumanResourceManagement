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
import quanlynhansu.Model.BaoHiem;

/**
 *
 * @author Acer
 */
public class BaoHiemDAO extends ConnectDatabase {


    public ArrayList<BaoHiem> load() {
        ArrayList<BaoHiem> listbh = new ArrayList<>();
        try {
            String sql = "SELECT *FROM BaoHiem";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            listbh.clear();
            while (rs.next()) {
                BaoHiem bh = new BaoHiem(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
                listbh.add(bh);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listbh;
    }

    // Method thêm
    public int insert(BaoHiem bh) {
        try {
            String sql = "Insert into BaoHiem(MaNhanVien,LoaiBaoHiem,SoThe,NgayCap,NgayHetHan,NoiCap,GhiChu) values (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, bh.getMaNhanVien());
            ps.setString(2, bh.getLoaiBaoHiem());
            ps.setString(3, bh.getSoThe());
            ps.setString(4, bh.getNgayCap());
            ps.setString(5, bh.getNgayHetHan());
            ps.setString(6, bh.getNoiCap());
            ps.setString(7, bh.getGhiChu());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return -1;
    }
// Method Sửa 
    public int update(BaoHiem bh) {
        try {
            String sql = "Update BaoHiem set  LoaiBaoHiem=?, SoThe=?, NgayCap=?, NgayHetHan=?, NoiCap=?, GhiChu=?  Where MaNhanVien=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(7, bh.getMaNhanVien());
            ps.setString(1, bh.getLoaiBaoHiem());
            ps.setString(2, bh.getSoThe());
            ps.setString(3, bh.getNgayCap());
            ps.setString(4, bh.getNgayHetHan());
            ps.setString(5, bh.getNoiCap());
            ps.setString(6, bh.getGhiChu());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return -1;
    }
//Xóa 

    public boolean delete(String maNhanVien) {
        try {
            String sql = "DELETE FROM BaoHiem WHERE MaNhanVien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maNhanVien);
            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return false;
    }
// Method tìm kiếm
    public ArrayList<BaoHiem> Search(String NV) {
        ArrayList<BaoHiem> lists = new ArrayList<>();
        try {
            String sql = "SELECT * FROM BaoHiem WHERE MaNhanVien like '%" + NV + "%' or SoThe like '%" + NV + "%'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                BaoHiem bh = new BaoHiem();
                bh.setMaNhanVien(rs.getString(1));
                bh.setLoaiBaoHiem(rs.getString(2));
                bh.setSoThe(rs.getString(3));
                bh.setNgayCap(rs.getString(4));
                bh.setNgayHetHan(rs.getString(5));
                bh.setNoiCap(rs.getString(6));
                bh.setGhiChu(rs.getString(7));
                lists.add(bh);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return lists;
    }

}
