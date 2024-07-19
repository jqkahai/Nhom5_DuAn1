/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class Model_hoadon {
 private String maHD;
 private String maSP;
 private String tenSP;
 private int gia;
 private String ngaytao;
 private String phuongthuc;
 private String tinhtrang;
 private int tongtien;

    public Model_hoadon() {
    }

    public Model_hoadon(String maHD, String maSP, String tenSP, int gia, String ngaytao, String phuongthuc, String tinhtrang, int tongtien) {
        this.maHD = maHD;
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.gia = gia;
        this.ngaytao = ngaytao;
        this.phuongthuc = phuongthuc;
        this.tinhtrang = tinhtrang;
        this.tongtien = tongtien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getPhuongthuc() {
        return phuongthuc;
    }

    public void setPhuongthuc(String phuongthuc) {
        this.phuongthuc = phuongthuc;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public int getTongtien() {
        return tongtien;
    }

    public void setTongtien(int tongtien) {
        this.tongtien = tongtien;
    }

    @Override
    public String toString() {
        return "Model_hoadon{" + "maHD=" + maHD + ", maSP=" + maSP + ", tenSP=" + tenSP + ", gia=" + gia + ", ngaytao=" + ngaytao + ", phuongthuc=" + phuongthuc + ", tinhtrang=" + tinhtrang + ", tongtien=" + tongtien + '}';
    }
 
    public Object[] toDataRow(){
        return new Object[]{maHD,maSP,tenSP,gia,ngaytao,phuongthuc,tinhtrang,tongtien};
    }
}
