package demo_buoi1;

import java.util.ArrayList;
import java.util.List;

public class DemoArray {
	
	public static void main(String[] args) {
//		String[] arrayString = {"Java","Array","Java Core","Spring boot"};
		
		//Tự tìm hiểu mảng 2 chiều
		
//		for(int i=0 ; i <= arrayString.length - 1; i++) {
//			System.out.println("Giá trị mảng " + i);
//			System.out.println("Giá trị mảng " + arrayString[i]);
//			break;
//		}
		
//		for (String value : arrayString) {
//			System.out.println("Giá trị mảng foreach " + value);
//		}
		
		
		List<String> listString = new ArrayList<>();
		listString.add("Java");
		listString.add("Array");
		listString.add("Java Core");
		listString.add("Spring boot");
		
		for(int i=0 ; i < listString.size(); i++) {
			System.out.println("Giá trị mảng " + i);
			System.out.println("Giá trị mảng " + listString.get(i));
		}
		
//		for (String value : listString) {
//			System.out.println("Giá trị mảng foreach " + value);
//		}
		
		
		double diemHSA, tuoiHSA; //Học sinh A
		String lopHSA, hotenHSA; //Học sinh A
		
	}
	
}
