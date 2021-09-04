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
import quanlynhansu.Model.TaiKhoan;

/**
 *
 * @author Acer
 */
public class DangNhapDAO extends ConnectDatabase {

    public TaiKhoan dangnhap(String TenDangNhap, String MatKhau) {
        TaiKhoan dangNhap = null;
        try {
            String sql = "Select TenDangNhap,MatKhau,TenQuyenHan from Taikhoan where TenDangNhap=? and MatKhau=?  ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, TenDangNhap);
            ps.setString(2, MatKhau);
        
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dangNhap = new TaiKhoan();
                dangNhap.setTenDangNhap(rs.getString(1));
                dangNhap.setMatKhau(rs.getString(2));
                dangNhap.setTenQuyenHan(rs.getString(3));
               
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return dangNhap;
    }

   public TaiKhoan getData() {
        TaiKhoan tk = null;
        try {
            String sql = "Select * from TaiKhoan ";
           Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                tk = new TaiKhoan();
                tk.setMaNhanVien(rs.getString(1));
                tk.setTenDangNhap(rs.getString(2));
                tk.setMatKhau(rs.getString(3));
                tk.setTenQuyenHan(rs.getString(4));
                
            }
        } catch (SQLException e) {
            e.getMessage();
        }
        return tk;
    }
}
