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
import quanlynhansu.Model.Luong;
 

/**
 *
 * @author Acer
 */
public class LuongDAO extends ConnectDatabase{
    
    public ArrayList<Luong> load() {
        ArrayList<Luong> listlg = new ArrayList<>();
        try {
            String sql = "SELECT *FROM Luong";
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            listlg.clear();
            while (rs.next()) {
                Luong lg = new Luong(
                        rs.getString(1),
                        rs.getInt(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8));
                listlg.add(lg);
            }
        } catch (SQLException ex) {ex.getMessage();
        }
        return listlg;
    }
     
    public int insert(Luong lg) {
        try {
            String sql = "Insert into Luong(MaNhanVien,LuongCB,ChucVu,ChucDanh,PCChucVu,NgayNhap,NgaySua,GhiChu) values (?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, lg.getMaNV());
            ps.setInt(2, lg.getLuongCB());
            ps.setString(3, lg.getChucVu());
            ps.setString(4, lg.getChucDanh());
            ps.setInt(5, lg.getPCChucVu());
            ps.setString(6, lg.getNgayNhap());
            ps.setString(7, lg.getNgaySua());
            ps.setString(8, lg.getGhiChu());
            return ps.executeUpdate();
        } catch (SQLException ex) {ex.getMessage();

        }
        return -1;
    }
     //Sửa
         public int update(Luong lg) {
        try {
            String sql = "Update Luong set  LuongCB=?, ChucVu=?, ChucDanh=?, PCChucVu=?, NgayNhap=?, NgaySua=?,GhiChu=? Where MaNhanVien=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(8, lg.getMaNV());
            ps.setInt(1, lg.getLuongCB());
            ps.setString(2, lg.getChucVu());
            ps.setString(3, lg.getChucDanh());
            ps.setInt(4, lg.getPCChucVu());
            ps.setString(5, lg.getNgayNhap());
            ps.setString(6, lg.getNgaySua());
            ps.setString(7, lg.getGhiChu());
            return ps.executeUpdate();
        } catch (SQLException ex) {ex.getMessage();
        }
        return -1;
    }
//Xóa 
    public boolean delete(String HSLuong) {
        try {
            String sql = "DELETE FROM Luong WHERE MaNhanVien=?";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, HSLuong);
            return pstm.executeUpdate() > 0;
        } catch (SQLException ex) {ex.getMessage();
        }
        return false;
    }
     
public ArrayList<Luong> Search(String NV)
    {
        ArrayList<Luong> listlg = new ArrayList<>();
        try
        {
            String sql="SELECT * FROM Luong WHERE MaNhanVien like '%" + NV +  "%' " ;
            Statement statement= con.createStatement();
            ResultSet rs =statement.executeQuery(sql);
          while(rs.next())
          {
          Luong  pb = new Luong();
            pb.setMaNV(rs.getString(1));
            pb.setLuongCB(rs.getInt(2));
            pb.setChucVu(rs.getString(3));
            pb.setChucDanh(rs.getString(4));
            pb.setPCChucVu(rs.getInt(5));
            pb.setNgayNhap(rs.getString(6));
            pb.setNgaySua(rs.getString(7));
            pb.setGhiChu(rs.getString(8));
            listlg.add(pb);          
          }
        }
        catch(SQLException ex)
        {ex.getMessage();
        }
        return listlg;
    }
}
