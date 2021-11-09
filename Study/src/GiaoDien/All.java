package GiaoDien;

import java.io.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
public class All {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat ("dd-MM-yyyy", Locale.ENGLISH);
		String input = "22-10-2002";
		java.util.Date ngaysinh = df.parse(input);
		Person person = new Person ("Nguyễn Văn A", 1, ngaysinh);
		System.out.println("Họ tên: " + person.getHoten() + "; Giới tính: " + person.getGioitinh() + "; Ngày Sinh: "
				+ df.format(person.getNgaysinh()));
		
		Student sinhvien = new Student(input, input, 0, ngaysinh);
		sinhvien.setHoten("Nguyễn Văn B");
		sinhvien.setGioitinh(1);
		sinhvien.setNgaysinh(df.parse("27-03-2003"));
		sinhvien.setTruonghoc("Đại Học Huế");
		System.out.println(sinhvien.getHoten() + "; Giới tính: " + sinhvien.getGioitinh() + 
				"; Ngày sinh: " + df.format(sinhvien.getNgaysinh()) + "; " + sinhvien.getTruonghoc());
		
		Worker congnhan = new Worker(input, input, 0, ngaysinh);
		congnhan.setHoten("Nguyễn Thị C");
		congnhan.setGioitinh(0);
		congnhan.setNgaysinh(df.parse("28-06-2002"));
		congnhan.setCongty("TOYOTA");
		System.out.println(congnhan.getHoten() + "; Giới tính: " + congnhan.getGioitinh() + 
				"; Ngày sinh: " + df.format(congnhan.getNgaysinh()) + "; Công ty: " + congnhan.getCongty());
	}

}