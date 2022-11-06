package dao;

import utils.DBUtils;

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
import model.AccountDTO;
import model.RoomDTO;

public class RoomDAO {

    public List<RoomDTO> getRoom() throws SQLException, NamingException, Exception {
        List<RoomDTO> listStudents;
        listStudents = new ArrayList<>();
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "Select * from PhongTro";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while (rs.next()) {
                    int maPhong = rs.getInt("MaPhong");
                    String tieuDe = rs.getString("TieuDe");
                    String Loai = rs.getString("Loai");
                    String lienHe = rs.getString("LienHe");
                    String SDT = rs.getString("SDT");
                    int dienTich = rs.getInt("DienTich");
                    float giaThue = rs.getFloat("GiaThue");
                    String diaChi = rs.getString("DiaChi");
                    String ghiChu = rs.getString("GhiChu");
                    int maDuong = rs.getInt("MaDuong");
                    int maUser = rs.getInt("MaUser");
                    String url = getUrlByID(maPhong);
                    RoomDTO dto = new RoomDTO(maPhong, tieuDe, lienHe, Loai, SDT, dienTich, giaThue, diaChi, ghiChu, maDuong, maUser, url);
                    listStudents.add(dto);
                }
                return listStudents;
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
    public List<RoomDTO> getRoomByUser(int maUser) throws Exception {
        List<RoomDTO> listStudents;
        listStudents = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = new DBUtils().makeConnection();
            if (con != null) {
                String sql = "SELECT * FROM PhongTro \n"
                        + "WHERE MaUser=?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, maUser);
                rs = ps.executeQuery();

                while (rs.next()) {
                    int maPhong = rs.getInt("MaPhong");
                    String tieuDe = rs.getString("TieuDe");
                    String Loai = rs.getString("Loai");
                    String lienHe = rs.getString("LienHe");
                    String SDT = rs.getString("SDT");
                    int dienTich = rs.getInt("DienTich");
                    float giaThue = rs.getFloat("GiaThue");
                    String diaChi = rs.getString("DiaChi");
                    String ghiChu = rs.getString("GhiChu");
                    int maDuong = rs.getInt("MaDuong");
                    String url = getUrlByID(maPhong);

                    RoomDTO dto= new RoomDTO(maPhong, tieuDe, lienHe, Loai, SDT, dienTich, giaThue, diaChi, ghiChu, maDuong, maUser, url);
                    listStudents.add(dto);
                }
                return listStudents;
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
    public String getUrlByID(int id) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DBUtils.makeConnection();
            if (con != null) {
                String sql = "Select UrlHinhAnh from CT_HinhAnh where MaPhong = ?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                rs = ps.executeQuery();
                while (rs.next()) {
                    String url = rs.getString(1);
                    return url;
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

    public RoomDTO getRoomByID(int maPhong) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        System.out.println("get dc room chua ma sua");
        try {
            con = new DBUtils().makeConnection();
            if (con != null) {
                String sql = "SELECT * FROM PhongTro \n"
                        + "WHERE MaPhong=?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, maPhong);
                rs = ps.executeQuery();

                while (rs.next()) {
                    System.out.println("da chay cau sql");
                    String tieuDe = rs.getString("TieuDe");
                    String Loai = rs.getString("Loai");
                    String lienHe = rs.getString("LienHe");
                    String SDT = rs.getString("SDT");
                    int dienTich = rs.getInt("DienTich");
                    float giaThue = rs.getFloat("GiaThue");
                    String diaChi = rs.getString("DiaChi");
                    String ghiChu = rs.getString("GhiChu");
                    int maDuong = rs.getInt("MaDuong");
                    int maUser = rs.getInt("MaUser");
                    String url = getUrlByID(maPhong);

                    return new RoomDTO(maPhong, tieuDe, Loai, lienHe, SDT, dienTich, giaThue, diaChi, ghiChu, maDuong, maUser, url);

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

    public boolean addRoom(String tieuDe, String Loai, String lienHe, String SDT, int dienTich, float giaThue, String diaChi, String ghiChu, int maDuong, int maUser) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = new DBUtils().makeConnection();
            if (con != null) {
                String sql = "INSERT INTO PhongTro \n"
                        + "VALUES(?,?,?,?,?,?,?,?,?,?)";
                ps = con.prepareStatement(sql);
                ps.setString(1, tieuDe);
                ps.setString(2, Loai);
                ps.setString(3, lienHe);
                ps.setString(4, SDT);
                ps.setInt(5, dienTich);
                ps.setFloat(6, giaThue);
                ps.setString(7, diaChi);
                ps.setString(8, ghiChu);
                ps.setInt(9, maDuong);
                ps.setInt(10, maUser);

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

    public boolean deleteRoom(int maphong) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = new DBUtils().makeConnection();
            if (con != null) {
                String sql = "DELETE FROM PhongTro \n"
                        + "WHERE Maphong=?";
                ps = con.prepareStatement(sql);
                ps.setInt(1, maphong);

                int row = ps.executeUpdate();
                if (row > 0) {
                    System.out.println("Delete product success");
                    return true;
                }
                System.out.println("Delete product fail");
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

    public void updateRoom(String maphong, String tieude, String loaiphong, String lienhe, String sdt, String dientich, String giathue, String diachi, String ghichu) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = new DBUtils().makeConnection();
            if (con != null) {
                String sql = "UPDATE Phongtro\n"
                        + "SET TieuDe=?, Loai =? , LienHe=? , SDT=? , DienTich =? , Giathue= ? , DiaChi = ? , GhiChu= ? \n"
                        + "WHERE MaPhong=?";
                ps = con.prepareStatement(sql);
                ps.setString(1, tieude);
                ps.setString(2, loaiphong);
                ps.setString(3, lienhe);
                ps.setString(4, sdt);
                ps.setString(5, dientich);
                ps.setString(6, giathue);
                ps.setString(7, diachi);
                ps.setString(8, ghichu);
                ps.setString(9, maphong);

                int row = ps.executeUpdate();
                if (row > 0) {
                    System.out.println("Update product success");
                }
                System.out.println("Update product fail");
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

    public boolean updateProductByID(int productID, String productName, int quantity, double price) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = new DBUtils().makeConnection();
            if (con != null) {
                String sql = "UPDATE PRODUCT\n"
                        + "SET ProductName=?, Quantity=?, Price=? \n"
                        + "WHERE ProductID=?";
                ps = con.prepareStatement(sql);
                ps.setString(1, productName);
                ps.setInt(2, quantity);
                ps.setDouble(3, price);
                ps.setInt(4, productID);

                int row = ps.executeUpdate();
                if (row > 0) {
                    System.out.println("Update product success");
                    return true;
                }
                System.out.println("Update product fail");
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

}
