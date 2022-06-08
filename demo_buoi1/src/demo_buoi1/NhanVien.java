package demo_buoi1;

public class NhanVien {
	private String hoTen;
	private String maNhanVien;
	private String cmnd;
	private String email;
	private String sdt;
	private String gioTinh;
	
	/* 
	 * Phương thức khởi tạo
	 * */
	
	public NhanVien() {};
	
	public NhanVien(String hoTen, String maNhanVien, String cmnd, String email, String sdt, String gioiTinh) {
		this.hoTen = hoTen;
		this.maNhanVien = maNhanVien;
		this.cmnd = cmnd;
		this.email = email;
		this.sdt = sdt;
		this.gioTinh = gioiTinh;
	}
	
	public void tinhLuong() {
		System.out.println("Đây là hàm tính lương");
	}
	
	public void tongGioLam() {
		System.out.println("Đây là hàm tính tổng giờ làm ");
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getCmnd() {
		return cmnd;
	}

	public void setCmnd(String cmnd) {
		this.cmnd = cmnd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getGioTinh() {
		return gioTinh;
	}

	public void setGioTinh(String gioTinh) {
		this.gioTinh = gioTinh;
	}
	
	
	
}
