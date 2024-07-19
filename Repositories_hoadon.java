package model;

import java.sql.*;
import java.util.ArrayList;

public class Repositories_hoadon{

    public ArrayList<Model_hoadon> getData() {
        ArrayList<Model_hoadon> al = new ArrayList<>();
        String sql = "SELECT        dbo.HoaDon.MaHoaDon, dbo.HoaDonChiTiet.MaSanPham, dbo.SanPhamChiTiet.TenSanPham, dbo.SanPhamChiTiet.Gia, dbo.HoaDon.NgayTao, dbo.HoaDon.PhuongThuc, dbo.HoaDon.TinhTrang,dbo.HoaDon.TongTien\n"
                + "FROM            dbo.HoaDon INNER JOIN\n"
                + "                         dbo.HoaDonChiTiet ON dbo.HoaDon.MaHoaDon = dbo.HoaDonChiTiet.MaHoaDon INNER JOIN\n"
                + "                         dbo.SanPhamChiTiet ON dbo.HoaDon.ID = dbo.SanPhamChiTiet.ID";
        try (Connection con = DB.DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Model_hoadon m = new Model_hoadon();
                m.setMaHD(rs.getString(1));
                m.setMaSP(rs.getString(2));
                m.setTenSP(rs.getString(3));
                m.setGia(rs.getInt(4));
                m.setNgaytao(rs.getString(5));
                m.setPhuongthuc(rs.getString(6));
                m.setTinhtrang(rs.getString(7));
                m.setTongtien(rs.getInt(8));
                al.add(m);
            }
            return al;
        } catch (Exception e) {
            return null;
        }

    }
}
