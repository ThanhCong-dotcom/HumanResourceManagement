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
import quanlynhansu.Model.ThuongPhat;

/**
 *
 * @author Acer
 */
public class ThuongPhatDAO extends ConnectDatabase {

   
    public ArrayList<ThuongPhat> load() {
        ArrayList<ThuongPhat> listthuogPhat = new ArrayList<>();
        try {
            String sql = "SELECT *FROM ThuongPhat";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            listthuogPhat.clear();
            while (rs.next()) {
                ThuongPhat tp = new ThuongPhat(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
                listthuogPhat.add(tp);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return listthuogPhat;
    }

    /**
     *
     * @param tp 
     * @return
     */
    public int insert(ThuongPhat tp) {
        try {
            String sql = "Insert into ThuongPhat(MaNhanVien,Loai,Tien,LyDo,Ngay,GhiChu) values (?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tp.getMaNhanVien());
            ps.setString(2, tp.getLoaiTP());
            ps.setInt(3, tp.getTien());
            ps.setString(4, tp.getLydo());
            ps.setString(5, tp.getNgay());
            ps.setString(6, tp.getGhichu());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return -1;
    }

    /**
     *
     * @param tp
     * @return
     */
    public int update(ThuongPhat tp) {
        try {
            String sql = "Update ThuongPhat set  Loai=?, Tien=?, LyDo=?, Ngay=?, GhiChu=?  Where MaNhanVien=?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(6, tp.getMaNhanVien());
            ps.setString(1, tp.getLoaiTP());
            ps.setInt(2, tp.getTien());
            ps.setString(3, tp.getLydo());
            ps.setString(4, tp.getNgay());
            ps.setString(5, tp.getGhichu());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return -1;
    }
//Xóa 

    /**
     *
     * @param maNhanVien
     * @return 
     */
    public boolean delete(String maNhanVien) {
        try {
            String sql = "DELETE FROM ThuongPhat WHERE MaNhanVien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, maNhanVien);
            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return false;
    }

    public ArrayList<ThuongPhat> Search(String NV) {
        ArrayList<ThuongPhat> lists = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ThuongPhat WHERE MaNhanVien like '%" + NV + "%' or Loai like N'%"+NV+"%'";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                ThuongPhat tp = new ThuongPhat();
                tp.setMaNhanVien(rs.getString(1));
                tp.setLoaiTP(rs.getString(2));
                tp.setTien(rs.getInt(3));
                tp.setNgay(rs.getString(4));
                tp.setGhichu(rs.getString(5));
                lists.add(tp);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return lists;
    }

}
