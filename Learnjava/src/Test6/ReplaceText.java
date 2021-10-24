package Test6;

import java.util.Scanner;

public class ReplaceText {

	public static void main(String args[]) {
		System.out.print("Nhập vào chuỗi của bạn: ");
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String replaceString = s1.replaceAll(" ","");//thay thế tất cả ký tự 't' thành 'j'  
		System.out.println(replaceString);
		 }
		}