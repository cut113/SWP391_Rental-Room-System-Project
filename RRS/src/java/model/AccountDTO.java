
package model;

public class AccountDTO {
    int userID;
    String username;
    String password;
    String fullname;
    String SDT;
    String email;
    String diaChi;
    int phanQuyen;
    boolean trangThai;

    public AccountDTO(int userID, String username, String password, String fullname, String SDT, String Email, String DiaChi, int PhanQuyen, boolean TrangThai) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.SDT = SDT;
        this.email = Email;
        this.diaChi = DiaChi;
        this.phanQuyen = PhanQuyen;
        this.trangThai = TrangThai;
    }
    
    
    

    public AccountDTO() {
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.diaChi = DiaChi;
    }

    public int getPhanQuyen() {
        return phanQuyen;
    }

    public void setPhanQuyen(int PhanQuyen) {
        this.phanQuyen = PhanQuyen;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.trangThai = TrangThai;
    }

   
    
    
}
    
