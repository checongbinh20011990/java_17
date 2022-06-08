package demo_buoi1;

public class SinhVien {
	private String hoTen;
	private double diemTB;
	
	public void tinhDiemTrungBinh(double diemTB) {
		if(diemTB >= 9 && diemTB <= 10) {
			System.out.println("Bạn là học sinh giỏi");
		} else if(diemTB >= 7 && diemTB <= 8) {
			System.out.println("Bạn là học sinh khá");
		} else if(diemTB >= 5 && diemTB <= 6) {
			System.out.println("Bạn là học sinh trung bình");
		} else if(diemTB < 5) {
			System.out.println("Bạn là học sinh yếu");
		} else {
			System.out.println("Điểm trung bình không hợp lệ");
		}
	}
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	
	public double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(double diemTB) {
		this.diemTB = diemTB;
	}
	
	
}
