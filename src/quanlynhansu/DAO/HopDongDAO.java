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
import quanlynhansu.Model.HopDong;

/**
 *
 * @author Acer
 */
public class HopDongDAO extends ConnectDatabase {

    public ArrayList<HopDong> load() {
        ArrayList<HopDong> lists = new ArrayList<>();
        try {
            String sql = "SELECT *FROM HopDong";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            lists.clear();
            while (rs.next()) {
                HopDong sv = new HopDong(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getInt(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7));
                lists.add(sv);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return lists;
    }

    public int insert(HopDong hd) {
        try {
            String sql = "Insert into HopDong(MaHD,NgayBatDau,HeSoLuong,MaCV,MaPB,NgayKetThuc,GhiChu) values (?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, hd.getMaHD());
            ps.setString(2, hd.getNgayBatDau());
            ps.setInt(3, hd.getHSLuong());
            ps.setString(4, hd.getMaCV());
            ps.setString(5, hd.getPhongBan());
            ps.setString(6, hd.getNgayKetThuc());
            ps.setString(7, hd.getGhiChu());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return -1;
    }
    //Sửa

    public int update(HopDong hd) {
        try {
            String sql = "Update HopDong set  NgayBatDau=?, HeSoLuong=?, MaCV=?, MaPB=?, NgayKetThuc=?, GhiChu=? Where MaHD=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(7, hd.getMaHD());
            ps.setString(1, hd.getNgayBatDau());
            ps.setInt(2, hd.getHSLuong());
            ps.setString(3, hd.getMaCV());
            ps.setString(4, hd.getPhongBan());
            ps.setString(5, hd.getNgayKetThuc());
            ps.setString(6, hd.getGhiChu());
            return ps.executeUpdate();
        } catch (SQLException ex) {
        }
        return -1;
    }
//Xóa 

    public boolean delete(String MaHD) {
        try {
            String sql = "DELETE FROM HopDong WHERE MaHD=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, MaHD);
            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return false;
    }
    public ArrayList<HopDong> Search(String NV)
    {
        ArrayList<HopDong> list = new ArrayList<>();
        try
        {
            String sql="SELECT * FROM HopDong WHERE MaHD like '%" + NV +  "%' or MaCV like '%" + NV +  "%'" ;
            Statement statement= con.createStatement();
            ResultSet rs =statement.executeQuery(sql);
          while(rs.next())
          {
          HopDong  hd = new HopDong();
            hd.setMaHD(rs.getString(1));
            hd.setNgayBatDau(rs.getString(2));
            hd.setHSLuong(rs.getInt(3));
            hd.setMaCV(rs.getString(4));
            hd.setPhongBan(rs.getString(5));
            hd.setNgayKetThuc(rs.getString(6));
            hd.setGhiChu(rs.getString(7));
            list.add(hd);          
          }
        }
        catch(SQLException ex)
        {ex.getMessage();
        }
        return list;
    }

}
