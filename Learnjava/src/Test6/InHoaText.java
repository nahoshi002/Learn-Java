package Test6;

import java.util.Scanner;

public class InHoaText {

	public static void main(String[] args) {
	    //khai báo và khởi tạo một string name
		System.out.print("Nhập vào chuỗi của bạn: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
	    System.out.println("\n\nChuỗi ban đầu: " + name);
	    // tạo hai chuỗi con firstLetter và remainingLetters
	    // chuỗi firstLetter chứa chữ cái đầu tiên của  name
	    String firstLetter = name.substring(0, 1);
	    // chuỗi remainingLetters chứa phần còn lại của name
	    String remainingLetters = name.substring(1, name.length());
	 
	    //sử dụng phương thức toUpperCase() để chuyển đổi firstLetter thành chữ in hoa
	    firstLetter = firstLetter.toUpperCase();
	 
	    //sau khi chuyển đổi thì gộp chúng lại
	    name = firstLetter + remainingLetters;
	    System.out.println("Chuỗi sau khi đổi: " + name);
	 
	    
	  }
	}