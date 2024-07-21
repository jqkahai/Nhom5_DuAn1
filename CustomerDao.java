package dao;

import model.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {

    public List<Customer> getAllCustomers() {
        List<Customer> customerList = new ArrayList<>();
        String sql = "SELECT * FROM User_NhanVien";

        try (Connection connection = JDBCConnection.getConnection();
             PreparedStatement pst = connection.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                Customer customer = new Customer();

                customer.setMaNV(rs.getString("MaNV"));
                customer.setTenNV(rs.getString("TenNV"));
                customer.setCCCD(rs.getInt("CCCD"));
                customer.setGioiTinh(rs.getBoolean("GioiTinh"));
                customer.setSDT(rs.getInt("SDT"));
                customer.setTK(rs.getString("TK"));
                customer.setMK(rs.getString("MK"));
                customer.setEmail(rs.getString("Email"));
                customer.setTrangThai(rs.getInt("TrangThai"));

                customerList.add(customer);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return customerList;
    }

    public Customer getCustomerById(String maNV) {
        String sql = "SELECT * FROM User_NhanVien WHERE MaNhanVien = ?";

        try (Connection connection = JDBCConnection.getConnection();
             PreparedStatement pst = connection.prepareStatement(sql)) {
            
            pst.setString(1, maNV);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                Customer customer = new Customer();

                customer.setMaNV(rs.getString("MaNV"));
                customer.setTenNV(rs.getString("TenNV"));
                customer.setCCCD(rs.getInt("CCCD"));
                customer.setGioiTinh(rs.getBoolean("GioiTinh"));
                customer.setSDT(rs.getInt("SDT"));
                customer.setTK(rs.getString("TK"));
                customer.setMK(rs.getString("MK"));
                customer.setEmail(rs.getString("Email"));
                customer.setTrangThai(rs.getInt("TrangThai"));

                return customer;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public void addCustomer(Customer customer) {
        String sql = "INSERT INTO User_NhanVien (MaNhanVien, Tennhanvien, CCCD, GioiTinh, SDT, TaiKhoan, MatKhau, Email, TrangThai) VALUES(?,?,?,?,?,?,?,?,?)";

        try (Connection connection = JDBCConnection.getConnection();
             PreparedStatement pst = connection.prepareStatement(sql)) {
            
            pst.setString(1, customer.getMaNV());
            pst.setString(2, customer.getTenNV());
            pst.setInt(3, customer.getCCCD());
            pst.setBoolean(4, customer.isGioiTinh());
            pst.setInt(5, customer.getSDT());
            pst.setString(6, customer.getTK());
            pst.setString(7, customer.getMK());
            pst.setString(8, customer.getEmail());
            pst.setInt(9, customer.getTrangThai());

            pst.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateCustomer(Customer customer) {
        String sql = "UPDATE User_NhanVien SET Tennhanvien = ?, CCCD = ?, GioiTinh = ?, SDT = ?, TaiKhoan = ?, MatKhau = ?, Email = ?, TrangThai = ? WHERE MaNhanVien = ?";

        try (Connection connection = JDBCConnection.getConnection();
             PreparedStatement pst = connection.prepareStatement(sql)) {
            
            pst.setString(1, customer.getTenNV());
            pst.setInt(2, customer.getCCCD());
            pst.setBoolean(3, customer.isGioiTinh());
            pst.setInt(4, customer.getSDT());
            pst.setString(5, customer.getTK());
            pst.setString(6, customer.getMK());
            pst.setString(7, customer.getEmail());
            pst.setInt(8, customer.getTrangThai());
            pst.setString(9, customer.getMaNV());

            pst.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void deleteCustomer(String maNV) {
        String sql = "DELETE FROM User_NhanVien WHERE MaNhanVien = ?";

        try (Connection connection = JDBCConnection.getConnection();
             PreparedStatement pst = connection.prepareStatement(sql)) {
            
            pst.setString(1, maNV);
            pst.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public List<Customer> searchCustomers(String valToSearch) {
        List<Customer> customerList = new ArrayList<>();
        String sql = "SELECT * FROM User_NhanVien WHERE CONCAT(MaNhanVien, Tennhanvien, CCCD, SDT, TaiKhoan) LIKE ?";

        try (Connection connection = JDBCConnection.getConnection();
             PreparedStatement pst = connection.prepareStatement(sql)) {
            
            pst.setString(1, "%" + valToSearch + "%");
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                Customer customer = new Customer();

                customer.setMaNV(rs.getString("MaNV"));
                customer.setTenNV(rs.getString("TenNV"));
                customer.setCCCD(rs.getInt("CCCD"));
                customer.setGioiTinh(rs.getBoolean("GioiTinh"));
                customer.setSDT(rs.getInt("SDT"));
                customer.setTK(rs.getString("TK"));
                customer.setMK(rs.getString("MK"));
                customer.setEmail(rs.getString("Email"));
                customer.setTrangThai(rs.getInt("TrangThai"));

                customerList.add(customer);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return customerList;
    }
}
