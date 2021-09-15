package Test;
import java.lang.Math;
import java.util.Scanner;

public class TinhNham {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số thứ nhất: ");
		n1 = scanner.nextInt();
		System.out.println("Nhập số thứ hai: ");
		n2 = scanner.nextInt();
		if(n1>=n2) {
			System.out.println("What is n1-n2: ");
			int n;
			System.out.println("Nhập vào kết quả phép trừ: ");
			n = scanner.nextInt();
			if((n1-n2) == n) {
				System.out.println("Đáp án chính xác!!! ");
			}else {
				System.out.print("Đáp án phải là: ");
				System.out.print(n1-n2);
			}
		}else System.out.print("Xin hãy nhập lại!! ");
	}

}
