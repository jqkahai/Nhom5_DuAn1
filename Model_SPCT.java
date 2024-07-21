/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sanpham;

/**
 *
 * @author Linhx
 */
public class Model_SPCT {
    private String maKM;
    private String maSPCT;
    private String tenSP;
    private String moTa;
    private Double gia;
    private int soLuong;
    private String hinhthucthanhtoan;

    public Model_SPCT() {
    }

    public Model_SPCT(String maKM, String maSPCT, String tenSP, String moTa, Double gia, int soLuong, String hinhthucthanhtoan) {
        this.maKM = maKM;
        this.maSPCT = maSPCT;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.gia = gia;
        this.soLuong = soLuong;
        this.hinhthucthanhtoan = hinhthucthanhtoan;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getMaSPCT() {
        return maSPCT;
    }

    public void setMaSPCT(String maSPCT) {
        this.maSPCT = maSPCT;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getHinhthucthanhtoan() {
        return hinhthucthanhtoan;
    }

    public void setHinhthucthanhtoan(String hinhthucthanhtoan) {
        this.hinhthucthanhtoan = hinhthucthanhtoan;
    }

    @Override
    public String toString() {
        return "Model_HDCT{" + "maKM=" + maKM + ", maSPCT=" + maSPCT + ", tenSP=" + tenSP + ", moTa=" + moTa + ", gia=" + gia + ", soLuong=" + soLuong + ", hinhthucthanhtoan=" + hinhthucthanhtoan + '}';
    }
    
}
