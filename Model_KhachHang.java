/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author ASUS
 */
public class Model_KhachHang {
    private int id;
    private String makh;
    private String hoten;
    private Boolean gioitinh;
    private String ngaysinh;
    private String diachi;
    private int sdt;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Boolean getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Model_KhachHang(String makh, String hoten, Boolean gioitinh, String ngaysinh, String diachi, int sdt, String email) {
        this.makh = makh;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
    }

    public Model_KhachHang(int id, String makh, String hoten, Boolean gioitinh, String ngaysinh, String diachi, int sdt, String email) {
        this.id = id;
        this.makh = makh;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
    }

    public Model_KhachHang() {
    }
    public Object[] todataRow(){
    return new Object[]{this.getId(),this.getMakh(),this.getHoten(),this.getGioitinh()?"Nam":"Nữ",this.getNgaysinh(),this.getDiachi(),this.getSdt(),this.getEmail()};
    }
}
