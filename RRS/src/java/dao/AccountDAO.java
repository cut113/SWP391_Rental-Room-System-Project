package dao;

import utils.DBUtils;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import model.AccountDTO;

public class AccountDAO implements Serializable {
    public boolean addAccount(String username, String password, String fullname, int SDT, String email, String diaChi, String phanQuyen, boolean trangThai) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = new DBUtils().makeConnection();
            if (con != null) {
                String sql = "INSERT INTO TaiKhoan \n"
                        + "VALUES(?,?,?,?,?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, password);
                ps.setString(3, fullname);
                ps.setInt(4, SDT);
                ps.setString(5, email);
                ps.setString(6, diaChi);
                ps.setString(7, phanQuyen);
                ps.setBoolean(8, trangThai);

                int row = ps.executeUpdate();
                if (row > 0) {
                    System.out.println("Add room successfully");
                    return true;
                }
                System.out.println("Add room successfully");
            }
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public List<AccountDTO> getUser() throws SQLException, NamingException, Exception {
        List<AccountDTO> listClass;
        listClass = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "Select * from TaiKhoan";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int userID = rs.getInt("MaUser");
                    String username = rs.getString("Username");
                    String password = rs.getString("Password");
                    String fullname = rs.getString("Fullname");
                    String SDT = rs.getString("SDT");
                    String Email = rs.getString("EmailLienHe");
                    String DiaChi = rs.getString("DiaChi");
                    int PhanQuyen = rs.getInt("PhanQuyen");
                    boolean TrangThai = rs.getBoolean("TrangThai");
                    AccountDTO cl = new AccountDTO(userID, username, password, fullname, SDT, Email, DiaChi, PhanQuyen, TrangThai);
                    listClass.add(cl);
                }
                return listClass;
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

    public AccountDTO searchUser(String username, String password) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "select * from TaiKhoan where Username = ? and Password = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);
                stm.setString(2, password);
                rs = stm.executeQuery();
                while (rs.next()) {
                    return new AccountDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getBoolean(9));
                }
            }
        } catch (Exception e) {

        }
        return null;
    }

    public void deleteAccount(String username) throws Exception {
        Connection con = null;
        PreparedStatement stm = null;

        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                System.out.println(username);
                String sql = "update dbo.TaiKhoan set TrangThai = 0 where UserName = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, username);

                int row = stm.executeUpdate();
                if (row > 0) {
                    System.out.println("Delete user success");
                }
                System.out.println("Delete user fail");
            }
        } finally {
            if (stm != null) {
                stm.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public AccountDTO getAccountByUserName(String username) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = new DBUtils().makeConnection();
            if (con != null) {
                String sql = "SELECT * FROM TaiKhoan \n"
                        + "WHERE Username=?";
                ps = con.prepareStatement(sql);
                ps.setString(1, username);
                rs = ps.executeQuery();

                while (rs.next()) {
                    int userID = rs.getInt("MaUser");
                    String password = rs.getString("Password");
                    String fullname = rs.getString("Fullname");
                    String SDT = rs.getString("SDT");
                    String Email = rs.getString("Email");
                    String DiaChi = rs.getString("DiaChi");
                    int PhanQuyen = rs.getInt("PhanQuyen");
                    boolean TrangThai = rs.getBoolean("TrangThai");
                    return new AccountDTO(userID, username, password, fullname, SDT, Email, DiaChi, PhanQuyen, TrangThai);
                }
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }
    public void updateAccount(String username, String password, String fullname, String SDT, String Email, String DiaChi) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        System.out.println("da vo toi updateaccount dao");
        try {
            con = new DBUtils().makeConnection();
            if (con != null) {
                String sql = "UPDATE TaiKhoan \n"
                        + "SET Password=?, Fullname=?, SDT=?, EmailLienHe=?, DiaChi=?\n"
                        + "WHERE Username=?";
                ps = con.prepareStatement(sql);
                ps.setString(1, password);
                ps.setString(2, fullname);
                ps.setString(3, SDT);
                ps.setString(4, Email);
                ps.setString(5, DiaChi);
                ps.setString(6, username);
                System.out.println("password: " + password);

                int row = ps.executeUpdate();
                if (row > 0) {
                    System.out.println("Update user success");
                }
                System.out.println("Update user fail");
            }
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
    public void updateAccount(String username, String password, String fullname, String SDT, String Email, String DiaChi, int PhanQuyen, boolean TrangThai) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = new DBUtils().makeConnection();
            if (con != null) {
                String sql = "UPDATE TaiKhoan \n"
                        + "SET Password=?, Fullname=?, SDT=?, EmailLienHe=?, DiaChi=?, PhanQuyen=?, TrangThai=? \n"
                        + "WHERE Username=?";
                ps = con.prepareStatement(sql);
                ps.setString(1, password);
                ps.setString(2, fullname);
                ps.setString(3, SDT);
                ps.setString(4, Email);
                ps.setString(5, DiaChi);
                ps.setInt(6, PhanQuyen);
                ps.setBoolean(7, TrangThai);
                ps.setString(8, username);

                int row = ps.executeUpdate();
                if (row > 0) {
                    System.out.println("Update user success");
                }
                System.out.println("Update user fail");
            }
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    

    public boolean addAccountByUser(String username, String password, String fullname, String SDT, String Email, String DiaChi) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = new DBUtils().makeConnection();
            if (con != null) {
                String sql = "INSERT INTO TaiKhoan \n"
                        + "VALUES (?,?,?,?,?,?,1,1)";
                ps = con.prepareStatement(sql);
                ps.setString(1, username);
                ps.setString(2, password);
                ps.setString(3, fullname);
                ps.setString(4, SDT);
                ps.setString(5, Email);
                ps.setString(6, DiaChi);

                int row = ps.executeUpdate();
                if (row > 0) {
                    System.out.println("Register account successfully");
                    return true;
                }
                System.out.println("Register user fail");
            }
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return false;
    }

    public AccountDTO getUser(String userName) {
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "select * from TaiKhoan where Username = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, userName);
                rs = stm.executeQuery();
                while (rs.next()) {
                    return new AccountDTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getBoolean(9));
                }
            }
        } catch (Exception e) {

        }
        return null;
    }

}
