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
public class DoiMatKhauDAO extends ConnectDatabase {

    public int doiMK(TaiKhoan ad) {
        try {
            String sql = "Update TaiKhoan set MatKhau=? WHERE TenDangNhap=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ad.getMatKhau());
            ps.setString(2, ad.getTenDangNhap());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.getMessage();
        }
        return -1;
    }
}
