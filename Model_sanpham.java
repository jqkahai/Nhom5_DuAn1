package Sanpham;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kingo
 */
public class Model_sanpham {

    private String masp;
    private String thuonghieu;
    private String tensp;
    private String ngaytao;
    private String maDanhMuc;
    private String soluong;
    private String nguoichinhsua;
    private String nguoitao;
    private String ngaychinhsua;
    private String maKM;
    private String maSPCT;
    private String tenSP;
    private String moTa;
    private Double gia;
    private int soLuong;
    private String hinhthucthanhtoan;

    public Model_sanpham() {
    }

    public Model_sanpham(String maKM, String maSPCT, String tenSP, String moTa, Double gia, int soLuong, String hinhthucthanhtoan) {
        this.maKM = maKM;
        this.maSPCT = maSPCT;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.gia = gia;
        this.soLuong = soLuong;
        this.hinhthucthanhtoan = hinhthucthanhtoan;
    }

    public Model_sanpham(String masp, String thuonghieu, String tensp, String ngaytao, String maDanhMuc, String soluong, String nguoichinhsua, String nguoitao, String ngaychinhsua, String maKM, String maSPCT, String tenSP, String moTa, Double gia, int soLuong, String hinhthucthanhtoan) {
        this.masp = masp;
        this.thuonghieu = thuonghieu;
        this.tensp = tensp;
        this.ngaytao = ngaytao;
        this.maDanhMuc = maDanhMuc;
        this.soluong = soluong;
        this.nguoichinhsua = nguoichinhsua;
        this.nguoitao = nguoitao;
        this.ngaychinhsua = ngaychinhsua;
        this.maKM = maKM;
        this.maSPCT = maSPCT;
        this.tenSP = tenSP;
        this.moTa = moTa;
        this.gia = gia;
        this.soLuong = soLuong;
        this.hinhthucthanhtoan = hinhthucthanhtoan;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getThuonghieu() {
        return thuonghieu;
    }

    public void setThuonghieu(String thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(String ngaytao) {
        this.ngaytao = ngaytao;
    }

    public String getMaDanhMuc() {
        return maDanhMuc;
    }

    public void setMaDanhMuc(String maDanhMuc) {
        this.maDanhMuc = maDanhMuc;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getNguoichinhsua() {
        return nguoichinhsua;
    }

    public void setNguoichinhsua(String nguoichinhsua) {
        this.nguoichinhsua = nguoichinhsua;
    }

    public String getNguoitao() {
        return nguoitao;
    }

    public void setNguoitao(String nguoitao) {
        this.nguoitao = nguoitao;
    }

    public String getNgaychinhsua() {
        return ngaychinhsua;
    }

    public void setNgaychinhsua(String ngaychinhsua) {
        this.ngaychinhsua = ngaychinhsua;
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
        return "Model_sanpham{" + "masp=" + masp + ", thuonghieu=" + thuonghieu + ", tensp=" + tensp + ", ngaytao=" + ngaytao + ", maDanhMuc=" + maDanhMuc + ", soluong=" + soluong + ", nguoichinhsua=" + nguoichinhsua + ", nguoitao=" + nguoitao + ", ngaychinhsua=" + ngaychinhsua + ", maKM=" + maKM + ", maSPCT=" + maSPCT + ", tenSP=" + tenSP + ", moTa=" + moTa + ", gia=" + gia + ", soLuong=" + soLuong + ", hinhthucthanhtoan=" + hinhthucthanhtoan + '}';
    }
    

}