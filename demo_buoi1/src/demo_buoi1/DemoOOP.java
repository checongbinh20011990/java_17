package demo_buoi1;

public class DemoOOP {
	public static void main(String[] args) {
		
		NhanVien nhanVienA = new NhanVien(
					 "Nhân viên A", 
					 "MS001", 
					 "093874373", 
					 "nhanviena@gmail.com", 
					 "090873734", 
					 "Nam"
					 );
		
		NhanVien nhanVienB = new NhanVien();
		nhanVienB.setHoTen("Nhân viên B");
		
		System.out.println("kiem tra họ tên " + nhanVienB.getHoTen());
		
//		NhanVien nhanVienB = new NhanVien();
//		nhanVienB.hoTen = "Nhân viên B";
//		
//		NhanVien nhanVienC = new NhanVien();
//		nhanVienC.hoTen = "Nhân viên C";
//		
//		System.out.println("Kiem tra " + nhanVienA.maNhanVien);
//		System.out.println("Kiem tra " + nhanVienB.hoTen);
	
		/* 
		 * Điểm trung bình từ 9 -> 10đ => Học sinh giỏi
		 * Điểm trung bình từ 7 -> 8đ => Học sinh khá
		 * Điểm trung bình từ 5 -> 6đ => Học sinh trung bình
		 * Điểm trung bình dưới 5 => Yếu
		 * */
		
	}
}
