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
public class SearchCityDTO {
    String tenTP;

    public SearchCityDTO(String tenTP) {
        this.tenTP = tenTP;
    }

    public String getTenTP() {
        return tenTP;
    }

    public void setTenTP(String tenTP) {
        this.tenTP = tenTP;
    }
    
    
}
