package model;

public class Customer {
   private String MaNV;
    private String TenNV;
    private int CCCD;
    private boolean GioiTinh;
    private int SDT;
    private String TK;
    private String MK;
    private String Email;
    private int TrangThai;

    public Customer() {
    }

    public Customer(String MaNV, String TenNV, int CCCD, boolean GioiTinh, int SDT, String TK, String MK, String Email, int TrangThai) {
        this.MaNV = MaNV;
        this.TenNV = TenNV;
        this.CCCD = CCCD;
        this.GioiTinh = GioiTinh;
        this.SDT = SDT;
        this.TK = TK;
        this.MK = MK;
        this.Email = Email;
        this.TrangThai = TrangThai;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getTenNV() {
        return TenNV;
    }

    public void setTenNV(String TenNV) {
        this.TenNV = TenNV;
    }

    public int getCCCD() {
        return CCCD;
    }

    public void setCCCD(int CCCD) {
        this.CCCD = CCCD;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }

    public String getTK() {
        return TK;
    }

    public void setTK(String TK) {
        this.TK = TK;
    }

    public String getMK() {
        return MK;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
    
}
   