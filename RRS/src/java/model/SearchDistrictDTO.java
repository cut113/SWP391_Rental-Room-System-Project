/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Minh Ngo
 */
public class SearchDistrictDTO {
    String tenQuan;

    public SearchDistrictDTO(String tenQuan) {
        this.tenQuan = tenQuan;
    }

    public String getTenQuan() {
        return tenQuan;
    }

    public void setTenQuan(String tenQuan) {
        this.tenQuan = tenQuan;
    }
    
    
}
