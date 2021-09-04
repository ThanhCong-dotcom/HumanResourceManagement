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
import java.util.List;
import quanlynhansu.Model.NhanVien;

/**
 *
 * @author Acer
 */
public class ThongKeDAO extends ConnectDatabase {

    public ArrayList<NhanVien> loadGioiTinh(String GioiTinh) {
        ArrayList<NhanVien> lists = new ArrayList<>();
        try {
            String sql = "{call  sp_GioiTinhSv (?)}";// gọi câu hàm thủ tục stored procedure
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, GioiTinh);
            ResultSet rs = pstm.executeQuery();
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

    public ArrayList<NhanVien> loadTrinhDoHV(String trinhdo) {
        ArrayList<NhanVien> lists = new ArrayList<>();
        try {
            String sql = "{call  sp_TrinhDoHV (?)}";// gọi câu hàm thủ tục stored procedure
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, trinhdo);
            ResultSet rs = pstm.executeQuery();
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

    public int TKTongSoNhanVien() {
        int tongNV = 0;
        try {
            ResultSet rs;
            String sql = "{call sp_TongSoNhanVien }";
            PreparedStatement pstm = con.prepareCall(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                tongNV = rs.getInt("tongNV");
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return tongNV;
    }

    public int TKTongSoGTNhanVien(String GioiTinh) {
        int tongNV = 0;
        try {
            ResultSet rs;
            String sql = "{call sp_TongSoGT(?)}"; // gọi  hàm thủ tục stored procedure
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, GioiTinh);
            rs = pstm.executeQuery();
            while (rs.next()) {
                tongNV = rs.getInt("SoGT");
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return tongNV;
    }

    public int TKTongSoTrinhdoHV(String TD) {
        int tongTD = 0;
        try {
            ResultSet rs;
            String sql = "{call sp_TongSoTrinhDo(?)}"; // gọi  hàm thủ tục stored procedure
            PreparedStatement pstm = con.prepareCall(sql);
            pstm.setString(1, TD);
            rs = pstm.executeQuery();
            while (rs.next()) {
                tongTD = rs.getInt("SoTrinhDo");
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return tongTD;
    }

    public List<Object[]> TKLuong() {
        List<Object[]> list = new ArrayList<>();
        try {

            String sql = "{call sp_BangLuong }";// gọi  hàm thủ tục stored procedure
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaNhanVien"),
                    rs.getString("TenNV"),
                    rs.getInt("LuongCB"),
                    rs.getInt("HeSoLuong"),
                    rs.getString("GioiTinh"),
                    rs.getInt("Phucap"),
                    rs.getInt("SoNgayCong"),
                    rs.getFloat("SoGioTangCa"),
                    rs.getLong("LuongThucLanh")};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return list;
    }

    //Tìm kiếm thông tin lương nhân viên
    public List<Object[]> TKLuongsearch(String luong) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs;
            String sql = "select Luong.MaNhanVien,NhanVien.TenNV,Luong.LuongCB,NhanVien.HeSoLuong,NhanVien.GioiTinh,(ChamCong.PCChucVu+ChamCong.PCKhac) as 'Phucap',ChamCong.SoNgayCong,ChamCong.SoGioTangCa,\n"
                    + "((LuongCB*HeSoLuong)+ChamCong.PCChucVu+ChamCong.PCKhac+(SoGioTangCa*30))  as 'LuongThucLanh'\n"
                    + "from  Luong inner join NhanVien on Luong.MaNhanVien=NhanVien.MaNhanVien inner join ChamCong on ChamCong.MaNhanVien=NhanVien.MaNhanVien\n"
                    + "where luong.MaNhanVien like'%" + luong + "%' or NhanVien.TenNV like N'%" + luong + "%'";
            PreparedStatement pstm = con.prepareCall(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                Object[] model = {
                    rs.getString("MaNhanVien"),
                    rs.getString("TenNV"),
                    rs.getInt("LuongCB"),
                    rs.getInt("HeSoLuong"),
                    rs.getString("GioiTinh"),
                    rs.getInt("Phucap"),
                    rs.getInt("SoNgayCong"),
                    rs.getFloat("SoGioTangCa"),
                    rs.getLong("LuongThucLanh")};
                list.add(model);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return list;
    }
}
