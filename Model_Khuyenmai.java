/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khuyenmai;

import java.util.Date;

/**
 *
 * @author Linhx
 */
public class Model_Khuyenmai {
    private int ID;
    private String MaKhuyenMai;
    private String TenKhuyenMai;
    private String NgayBatDau;
    private String NgayKetThuc;
    private String hinhThuc;
    private float giatiSP;

    public Model_Khuyenmai() {
    }

    public Model_Khuyenmai(int ID, String MaKhuyenMai, String TenKhuyenMai, String NgayBatDau, String NgayKetThuc, String hinhThuc, float giatiSP) {
        this.ID = ID;
        this.MaKhuyenMai = MaKhuyenMai;
        this.TenKhuyenMai = TenKhuyenMai;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.hinhThuc = hinhThuc;
        this.giatiSP = giatiSP;
    }

    public Model_Khuyenmai(String MaKhuyenMai, String TenKhuyenMai, String NgayBatDau, String NgayKetThuc, String hinhThuc, float giatiSP) {
        this.MaKhuyenMai = MaKhuyenMai;
        this.TenKhuyenMai = TenKhuyenMai;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.hinhThuc = hinhThuc;
        this.giatiSP = giatiSP;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(String MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return TenKhuyenMai;
    }

    public void setTenKhuyenMai(String TenKhuyenMai) {
        this.TenKhuyenMai = TenKhuyenMai;
    }

    public String getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(String NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public String getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(String NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public float getGiatiSP() {
        return giatiSP;
    }

    public void setGiatiSP(float giatiSP) {
        this.giatiSP = giatiSP;
    }
    
    
    
   public Object[] toDatarow(){
       return new Object[]{this.getID(),this.getMaKhuyenMai(),this.getTenKhuyenMai(),this.getNgayBatDau(),this.getNgayKetThuc(),this.getHinhThuc(),this.getGiatiSP()};
   }

    @Override
    public String toString() {
        return "Model_Khuyenmai{" + "ID=" + ID + ", MaKhuyenMai=" + MaKhuyenMai + ", TenKhuyenMai=" + TenKhuyenMai + ", NgayBatDau=" + NgayBatDau + ", NgayKetThuc=" + NgayKetThuc + ", hinhThuc=" + hinhThuc + ", giatiSP=" + giatiSP + '}';
    }
   
   
}
