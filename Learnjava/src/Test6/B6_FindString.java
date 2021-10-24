package Test6;

import java.util.Scanner;

public class B6_FindString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Nhập vào chuỗi của bạn: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		
		System.out.print("Nhập vào chuỗi của bạn: ");
		String k = scanner.nextLine();
		int dem=0;
			if(str.contains(k)) {
				dem+=1;
			}
		System.out.println("counter=" + dem);
	}

}
