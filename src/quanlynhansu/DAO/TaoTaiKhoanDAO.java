/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlynhansu.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import quanlynhansu.Model.TaiKhoan;

/**
 *
 * @author Acer
 */
public class TaoTaiKhoanDAO extends ConnectDatabase {

    public int Dangki(TaiKhoan tk) {
        try {
            String sql = "Insert into TaiKhoan(MaNhanVien,TenDangNhap,MatKhau,TenQuyenHan) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, tk.getMaNhanVien());
            ps.setString(2, tk.getTenDangNhap());
            ps.setString(3, tk.getMatKhau());
            ps.setString(4, tk.getTenQuyenHan());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return -1;
    }
}
