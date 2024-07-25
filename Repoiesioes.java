/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repristsy;
import Config.DBConnect;
import Entity.Model_KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author ASUS
 */
public class Repoiesioes {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    public ArrayList<Model_KhachHang> getAll(){
    ArrayList<Model_KhachHang> Listkh = new ArrayList();
    sql = "select  id,MaKhachHang,HoTen,GioiTinh,Ngaysinh,DiaChi,SDT,Email from  KhachHang";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            int id;
            String makh;
            String hoten;
            boolean gt;
            String ngaysinh;
            String diachi;
            int sdt;
            String email;
            id = rs.getInt(1);
            makh = rs.getString(2);
            hoten = rs.getString(3);
            gt = rs.getBoolean(4);
            ngaysinh = rs.getString(5);
            diachi = rs.getString(6);
            sdt = rs.getInt(7);
            email = rs.getString(8);
            Model_KhachHang m = new Model_KhachHang(id,makh,hoten,gt,ngaysinh,diachi,sdt,email);
            Listkh.add(m);
            }
            return Listkh;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public  int them(Model_KhachHang m ){
    sql = "insert into KhachHang(MaKhachHang,HoTen,GioiTinh,Ngaysinh,DiaChi,SDT,Email) values(?,?,?,?,?,?,?)";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, m.getMakh());
            ps.setObject(2, m.getHoten());
            ps.setObject(3, m.getGioitinh());
            ps.setObject(4, m.getNgaysinh());
            ps.setObject(5, m.getDiachi());
            ps.setObject(6, m.getSdt());
            ps.setObject(7, m.getEmail());
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public int xoa(String makh){
    sql = "delete from KhachHang where MaKhachHang = ?";
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1,makh);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0 ;
        }
    }
public int sua(int id,Model_KhachHang m){
        sql="update KhachHang set MaKhachHang =?,HoTen=?,GioiTinh=?,NgaySinh=?,DiaChi=?,SDT=?,Email=? where ID=?";
        try {
            con=DBConnect.getConnection();
            ps=con.prepareStatement(sql);
            ps.setObject(1, m.getMakh());
            ps.setObject(2, m.getHoten());
            ps.setObject(3, m.getGioitinh());
            ps.setObject(4, m.getNgaysinh());
            ps.setObject(5, m.getDiachi());
            ps.setObject(6, m.getSdt());
            ps.setObject(7, m.getEmail());
             ps.setObject( 8,id);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
        
    }
    public ArrayList<Model_KhachHang> timkiem(String makh){
    sql = "select ID,MaKhachHang,HoTen,GioiTinh,NgaySinh,DiaChi,SDT,Email from KhachHang where MaKhachHang like ?";
    ArrayList<Model_KhachHang> Listtk = new ArrayList();
        try {
            con = DBConnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1,"%"+makh+"%");
            rs = ps.executeQuery();
            while(rs.next()){
                int id;
                String makhh;
                String hoten;
                Boolean gt;
                String ngaysinh;
                String diachi;
                int sdt;
                String email;
                id = rs.getInt(1);
                makhh= rs.getString(2);
                hoten= rs.getString(3);
                gt = rs.getBoolean(4);
                ngaysinh = rs.getString(5);
                diachi = rs.getString(6);
                sdt = rs.getInt(7);
                email = rs.getString(8);
                Model_KhachHang m = new Model_KhachHang(id,makhh,hoten,gt,ngaysinh,diachi,sdt,email);
                Listtk.add(m);
            }
            return Listtk;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
}
