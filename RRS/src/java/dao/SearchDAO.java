/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.naming.NamingException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.RoomDTO;
import model.SearchDTO;
import model.SearchDistrictDTO;
import model.SearchCityDTO;
import utils.DBUtils;

/**
 *
 * @author Minh Ngo
 */
public class SearchDAO {

    public List<SearchCityDTO> getTenTP() throws SQLException, NamingException, Exception {
        List<SearchCityDTO> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "select * from ThanhPho";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();

                while (rs.next()) {
                    String tenTP = rs.getString("TenTP");
                    System.out.println(" tenTP " + tenTP);
                    SearchCityDTO s = new SearchCityDTO(tenTP);
                    list.add(s);
                }
                return list;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }

    public List<SearchDistrictDTO> getTenQuan() throws SQLException, NamingException, Exception {
        List<SearchDistrictDTO> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "select * from QuanHuyen";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();

                while (rs.next()) {
                    String tenQuan = rs.getString("TenQuan");
                    System.out.println(" tenQuan " + tenQuan);
                    SearchDistrictDTO s = new SearchDistrictDTO(tenQuan);
                    list.add(s);
                }
                return list;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }

    public List<SearchDTO> getTenDuong() throws SQLException, NamingException, Exception {
        List<SearchDTO> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "select * from DuongPho";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();

                while (rs.next()) {
                    String duongPho = rs.getString("TenDuong");
                    System.out.println(" duongPho " + duongPho);
                    SearchDTO s = new SearchDTO(duongPho);
                    list.add(s);
                }
                return list;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }

    public List<SearchDTO> getGiaDienTich() throws SQLException, NamingException, Exception {
        List<SearchDTO> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "select * from PhongTro";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();

                while (rs.next()) {
                    float gia = rs.getFloat("GiaThue");
                    int dienTich = rs.getInt("DienTich");
                    SearchDTO s = new SearchDTO(gia, dienTich);
                    list.add(s);
                }
                return list;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }

    public List<RoomDTO> getRoom(String TenDuong, float Gia, int DienTich) throws SQLException, NamingException, Exception {
        List<RoomDTO> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "select * from DuongPho where TenDuong=?";
                ps = con.prepareStatement(sql);
                ps.setString(1, TenDuong);
                rs = ps.executeQuery();
                while (rs.next()) {
                    int maDuong = Integer.parseInt(rs.getString("MaDuong"));
                    System.out.println("ma duong la: " + maDuong);
                    sql = "select * from PhongTro where GiaThue<=? and DienTich<=? and MaDuong=?";
                    ps = con.prepareStatement(sql);
                    ps.setFloat(1, Gia);
                    ps.setInt(2, DienTich);
                    ps.setInt(3, maDuong);
                    rs = ps.executeQuery();

                    while (rs.next()) {
                        int maPhong = rs.getInt("MaPhong");
                        float gia = rs.getFloat("GiaThue");
                        int dienTich = rs.getInt("DienTich");
                        String tieuDe = rs.getString("TieuDe");
                        String Loai = rs.getString("Loai");
                        String lienHe = rs.getString("LienHe");
                        String SDT = rs.getString("SDT");
                        String diaChi = rs.getString("DiaChi");
                        String ghiChu = rs.getString("GhiChu");
                        int maUser = rs.getInt("MaUser");
                        RoomDAO dao = new RoomDAO();
                        String url = dao.getUrlByID(maPhong);
                        RoomDTO dto = new RoomDTO(maPhong, tieuDe, lienHe, Loai, SDT, dienTich, gia, diaChi, ghiChu, maDuong, maUser, url);
                        list.add(dto);
                    }
                    return list;
                }

            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }
}
