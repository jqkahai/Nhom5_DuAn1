package Sanpham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author kingo
 */
public class Repositories {

    private static Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_sanpham> getAll() {
        sql = "SELECT dbo.SanPham.MaSanPham, dbo.SanPham.ThuongHieu, dbo.SanPham.TenSanPham, dbo.SanPham.NgayTao, dbo.SanPham.NguoiTao, dbo.SanPham.MaDanhMuc, dbo.SanPham.NgayChinhSua, dbo.SanPham.NguoiChinhSua, dbo.SanPham.SoLuongSP, dbo.SanPhamChiTiet.MaSanPham AS Expr1, dbo.SanPhamChiTiet.MaKhuyenMai, dbo.SanPhamChiTiet.MaSPChiTiet, \n"
                + " dbo.SanPhamChiTiet.MoTa, dbo.SanPhamChiTiet.Gia, dbo.SanPhamChiTiet.SoLuong, dbo.SanPhamChiTiet.HinhThucThanhToan\n"
                + "FROM  dbo.SanPham INNER JOIN\n"
                + "         dbo.SanPhamChiTiet ON dbo.SanPham.MaSanPham = dbo.SanPhamChiTiet.MaSanPham";

        ArrayList<Model_sanpham> Listsp = new ArrayList<>();
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String masp;
                String thuonghieu;
                String tensp;
                String ngaytao;
                String MaDanhMuc;
                String soluong;
                String nguoichinhsua;
                String nguoitao;
                String ngaychinhsua;
                String maKM;
                String maSPCT;
                String tenSP;
                String moTa;
                Double gia;
                int soLuong;
                String hinhthucthanhtoan;

                masp = rs.getString(1);
                thuonghieu = rs.getString(2);
                tensp = rs.getString(3);
                ngaytao = rs.getString(4);
                MaDanhMuc = rs.getString(5);
                soluong = rs.getString(6);
                nguoichinhsua = rs.getString(7);
                nguoitao = rs.getString(8);
                ngaychinhsua = rs.getString(9);
                maSPCT = rs.getString(10);
                maKM = rs.getString(11);
                tenSP = rs.getString(12);
                moTa = rs.getString(13);
                gia = rs.getDouble(14);
                soLuong = rs.getInt(15);
                hinhthucthanhtoan = rs.getString(16);
                Listsp.add(new Model_sanpham(masp, thuonghieu, tenSP, ngaytao, MaDanhMuc, soluong, nguoichinhsua, nguoitao, ngaychinhsua, maKM, maSPCT, tenSP, moTa, gia, soLuong, hinhthucthanhtoan));
//                Listsp.add(new Model_sanpham(masp, thuonghieu, tensp, ngaytao, soluong, nguoichinhsua, nguoitao, ngaychinhsua));
            }
            return Listsp;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public ArrayList<Model_SPCT> getSPCT(String maSP) {

        ArrayList<Model_SPCT> arrayList = new ArrayList<>();
        String sql = "		 select MaKhuyenMai,MaSanPham,TenSanPham,MoTa,Gia,SoLuong,HinhThucThanhToan from SanPhamChiTiet where MaSanPham = ?";
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, maSP);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String maKM;
                String maSPCT;
                String tenSP;
                String moTa;
                Double gia;
                int soLuong;
                String hinhthucthanhtoan;

                maKM = rs.getString("MaKhuyenMai");
                maSPCT = rs.getString("MaSanPham");
                tenSP = rs.getString("TenSanPham");
                moTa = rs.getString("MoTa");
                gia = rs.getDouble("Gia");
                soLuong = rs.getInt("SoLuong");
                hinhthucthanhtoan = rs.getString("HinhThucThanhToan");
                arrayList.add(new Model_SPCT(maKM, maSPCT, tenSP, moTa, gia, soLuong, hinhthucthanhtoan));
            }
            return arrayList;
        } catch (Exception e) {
            return null;
        }
    }
}
