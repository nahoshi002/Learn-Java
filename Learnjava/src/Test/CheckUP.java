package Test;

import java.util.Scanner;

public class CheckUP {

	 public static void main(String args[])
	    {
	        String username, password;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Nhập vào username:");
	        username = s.nextLine();
	        System.out.print("Nhập vào password:");
	        password = s.nextLine();
	        if(username.equals("HuyHoang") && password.equals("2021"))
	        {
	            System.out.println("Đăng nhập thành công");
	        }
	        else
	        {
	            System.out.println("Đăng nhập thất bại,hãy kiểm tra lại tài khoản hoặc mật khẩu của bạn");
	        }
	    }
	}
