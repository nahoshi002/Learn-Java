package Test6;

import java.util.Scanner;

public class B6_FindString {

	public static void main(String[] args) {
	    String chuoi;
	    int count = 0;
	    Scanner scanner = new Scanner(System.in);
	         
	    System.out.print("Nhập vào chuỗi bất kỳ: ");
	    chuoi = scanner.nextLine();
	    System.out.print("Nhập vào kí tự cần tìm: " );
	    char kyTu = ' ';
        try
        {
        	kyTu = (char) System.in.read();
        }
        catch(Exception e)
        {
              System.out.println("Nhập lỗi!");
        }
	    // duyệt từ đầu đến cuối chuỗi
	    for (int i = 0; i < chuoi.length(); i++) {
	        // Nếu ký tự tại vị trí thứ i bằng 'a' thì tăng count lên 1
	        if (chuoi.charAt(i) == kyTu) {
	        	System.out.println("Vị trí "+i+" xuất hiện kí tự "+ kyTu);
	            count++;
	        }
	    }
	         
	    System.out.println("Số lần xuất hiện của ký tự " + kyTu +
	        " trong chuỗi " + chuoi + " = " + count);
	}
}