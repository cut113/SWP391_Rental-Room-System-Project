
package model;

public class AccountDTO {
    String username;
    String password;
    String fullname;
    String SDT;
    String Email;
    String DiaChi;
    int PhanQuyen;
    boolean TrangThai;
    
    public AccountDTO(String username, String password, String fullname, String SDT, String Email, String DiaChi, int PhanQuyen, boolean TrangThai) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
        this.SDT = SDT;
        this.Email = Email;
        this.DiaChi = DiaChi;
        this.PhanQuyen = PhanQuyen;
        this.TrangThai = TrangThai;
    }
    

    public AccountDTO() {
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
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getPhanQuyen() {
        return PhanQuyen;
    }

    public void setPhanQuyen(int PhanQuyen) {
        this.PhanQuyen = PhanQuyen;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    
}
    
