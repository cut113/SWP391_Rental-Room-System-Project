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
public class SearchDTO {
    String duongPho;
    float gia;
    int dienTich;

    public SearchDTO(String duongPho) {
        this.duongPho = duongPho;
    }

    public SearchDTO(float gia, int dienTich) {
        this.gia = gia;
        this.dienTich = dienTich;
    }

    public String getDuongPho() {
        return duongPho;
    }

    public void setDuongPho(String duongPho) {
        this.duongPho = duongPho;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }
    
    
}
