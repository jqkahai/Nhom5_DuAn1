/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Khuyenmai;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Linhx
 */
public class Repositories {
    private Connection con = null;
    private  PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public ArrayList<Model_Khuyenmai> getAll(){
        ArrayList<Model_Khuyenmai> list_KM = new ArrayList<>();
        sql = "select ID,MaKhuyenMai,TenKhuyenMai,NgayBatDau,NgayKetThuc,HinhThuc,GiaTiSanPham from KhuyenMai";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                 int ID;
                 String MaKhuyenMai;
                 String TenKhuyenMai;
                 String NgayBatDau;
                 String NgayKetThuc;
                 String hinhThuc;
                 float giatiSP;
                 ID = rs.getInt(1);
                 MaKhuyenMai = rs.getString(2);
                 TenKhuyenMai = rs.getString(3);
                 NgayBatDau = rs.getString(4);
                 NgayKetThuc = rs.getString(5);
                 hinhThuc = rs.getString(6);
                 giatiSP = rs.getFloat(7);
                 Model_Khuyenmai m = new Model_Khuyenmai(ID, MaKhuyenMai, TenKhuyenMai, NgayBatDau, NgayKetThuc, hinhThuc, giatiSP);
                 list_KM.add(m);
                
            }
            return list_KM;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public int Them(Model_Khuyenmai m1){
        sql ="insert into KhuyenMai (MaKhuyenMai,TenKhuyenMai,NgayBatDau,NgayKetThuc,HinhThuc,GiaTiSanPham) values(?,?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m1.getMaKhuyenMai());
            ps.setObject(2, m1.getTenKhuyenMai());
            ps.setObject(3, m1.getNgayBatDau());
            ps.setObject(4, m1.getNgayKetThuc());
            ps.setObject(5, m1.getHinhThuc());
            ps.setObject(6, m1.getGiatiSP());
            return ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int Sua(Model_Khuyenmai m2,String maSua){
        sql = "update KhuyenMai set TenKhuyenMai = ?,NgayBatDau =?,NgayKetThuc =?,HinhThuc=?,GiaTiSanPham =? where MaKhuyenMai =?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m2.getTenKhuyenMai());
            ps.setObject(2, m2.getNgayBatDau());
            ps.setObject(3, m2.getNgayKetThuc());
            ps.setObject(4, m2.getHinhThuc());
            ps.setObject(5, m2.getGiatiSP());
            ps.setObject(6, maSua);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
        public ArrayList<Model_Khuyenmai> timkiem (String MaKM){
        ArrayList<Model_Khuyenmai> list_KM = new ArrayList<>();
        sql = "select MaKhuyenMai,TenKhuyenMai,NgayBatDau,NgayKetThuc,HinhThuc,GiaTiSanPham from KhuyenMai where MaKhuyenMai like ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1,'%'+MaKM+'%');
            rs = ps.executeQuery();
            while (rs.next()) {
             
                 String MaKhuyenMai;
                 String TenKhuyenMai;
                 String NgayBatDau;
                 String NgayKetThuc;
                 String hinhThuc;
                 float giatiSP;
                 
                 MaKhuyenMai = rs.getString(1);
                 TenKhuyenMai = rs.getString(2);
                 NgayBatDau = rs.getString(3);
                 NgayKetThuc = rs.getString(4);
                 hinhThuc = rs.getString(5);
                 giatiSP = rs.getFloat(6);
                 Model_Khuyenmai m = new Model_Khuyenmai(MaKhuyenMai, TenKhuyenMai, NgayBatDau, NgayKetThuc, hinhThuc, giatiSP);
                 list_KM.add(m);
                
            }
            return list_KM;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
     public int Xoa(String maXoa){
         sql ="delete from KhuyenMai where MaKhuyenMai =?";
         try {
             con = DBConnect.getConnection();
             ps = con.prepareStatement(sql);
             ps.setObject(1,maXoa);
             return ps.executeUpdate();
         } catch (Exception e) {
             e.printStackTrace();
             return 0;
         }
     }

}
