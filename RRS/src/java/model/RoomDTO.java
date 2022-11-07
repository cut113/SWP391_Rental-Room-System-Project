/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ADMIN
 */
public class RoomDTO {
    int maPhong;
    String Tieude;
    String Loai;
    String LienHe;
    String SDT;
    int DienTich;
    float GiaThue;
    String DiaChi;
    String GhiChu;
    int maDuong;
    int maUser;
    String url;
    boolean trangThai;

    public RoomDTO() {
    }

    public RoomDTO(int maPhong, String Tieude, String Loai, String LienHe, String SDT, int DienTich, float GiaThue, String DiaChi, String GhiChu, int maDuong, int maUser, String url) {
        this.maPhong = maPhong;
        this.Tieude = Tieude;
        this.Loai = Loai;
        this.LienHe = LienHe;
        this.SDT = SDT;
        this.DienTich = DienTich;
        this.GiaThue = GiaThue;
        this.DiaChi = DiaChi;
        this.GhiChu = GhiChu;
        this.maDuong = maDuong;
        this.maUser = maUser;
        this.url = url;
    }

   

    public RoomDTO(int maPhong, String Tieude, String Loai, String LienHe, String SDT, int DienTich, float GiaThue, String DiaChi, String GhiChu, int maDuong, int maUser, String url, boolean trangThai) {
        this.maPhong = maPhong;
        this.Tieude = Tieude;
        this.Loai = Loai;
        this.LienHe = LienHe;
        this.SDT = SDT;
        this.DienTich = DienTich;
        this.GiaThue = GiaThue;
        this.DiaChi = DiaChi;
        this.GhiChu = GhiChu;
        this.maDuong = maDuong;
        this.maUser = maUser;
        this.url = url;
        this.trangThai = trangThai;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTieude() {
        return Tieude;
    }

    public void setTieude(String Tieude) {
        this.Tieude = Tieude;
    }

    public String getLoai() {
        return Loai;
    }

    public void setLoai(String Loai) {
        this.Loai = Loai;
    }

    public String getLienHe() {
        return LienHe;
    }

    public void setLienHe(String LienHe) {
        this.LienHe = LienHe;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getDienTich() {
        return DienTich;
    }

    public void setDienTich(int DienTich) {
        this.DienTich = DienTich;
    }

    public float getGiaThue() {
        return GiaThue;
    }

    public void setGiaThue(float GiaThue) {
        this.GiaThue = GiaThue;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public int getMaDuong() {
        return maDuong;
    }

    public void setMaDuong(int maDuong) {
        this.maDuong = maDuong;
    }

    public int getMaUser() {
        return maUser;
    }

    public void setMaUser(int maUser) {
        this.maUser = maUser;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
     public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
