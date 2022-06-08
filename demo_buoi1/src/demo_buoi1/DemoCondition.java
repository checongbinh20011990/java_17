package demo_buoi1;

public class DemoCondition {

		public static void main(String[] args) {
			/* Nếu là đúng thì thực hiện
			 * Ngược lại là sai thì thực hiện theo điều sai
			 * 
			 * Cú pháp if(điều kiện){
			 *   Thực hiện code theo điều kiện đúng
			 * }else{
			 *    Thực hiện code trái với lại kiện trên
			 * }
			 * 
			 * Toán tử hỗ trợ so sánh : <, >, <=, >=, != 
			 * Phép nối so sanh : hoặc ( || ) , và ( && )
			 * phép hoặc : chỉ cần một trong điều kiện là đúng thì sẽ trả kết quả là đúng
			 * phép và : bắt buộc phải đúng toàn điều kiện so sánh thì mới là đúng
			 *  Giỏi -> 9 - 10 ( 9, 9.5, 9.75, 10 ) 
			 *  
			 *  [9 <= diem <= 10] Gioi
			 *  [7 <= diem <= 8] Kha
			 *  
			 * */
			
			double diem = 4;
			if(diem >= 9 && diem <= 10) {
				//đúng theo điều kiện
				System.out.println("Bạn là học sinh giỏi");
			} else if (diem >= 7 && diem <= 8){
				System.out.println("Bạn là học sinh khá");
			} else if (diem >= 6 && diem < 7){
				System.out.println("Bạn là học sinh tiên tiến");
			} else if (diem >= 5 && diem < 6){
				System.out.println("Bạn là học sinh trung bình");
			} else {
				System.out.println("Bạn là học sinh yếu");
			}
			
			/*
			 * Cầu điều kiện lựa chọn
			 * cú pháp switch(điều kiện){
			 * 	case giá trị cần so sanh : thực hiện code nếu đúng
			 * 
			 *  default : không thoã giá trị nào thì chạy vào đây
			 * }
			 * */
			
			String monHang = "vang";
			switch (monHang) {
				case "quanao": {
					//Nếu là đúng thực hiện code
					System.out.println("Bạn đang ở ngăn quần áo");
					break;
				}
				case "vang": {
					System.out.println("Bạn đang ở ngăn vàng");
					break;
				}
				
				default:
					System.out.println("Không có ngăn nào trùng với món hàng bạn đang mua");
					break;
			}
			
			
			
		}
	
}
