package GiaoDien;

import java.util.Date;

public class Student extends Person {
private String truonghoc;
	
	public String getTruonghoc() {
		return truonghoc;
	}
	public void setTruonghoc(String truonghoc) {
		this.truonghoc = truonghoc;
	}
	public Student(String truonghoc, String hoten, int gioitinh, Date ngaysinh) {
		super(hoten, gioitinh, ngaysinh);

	}

}