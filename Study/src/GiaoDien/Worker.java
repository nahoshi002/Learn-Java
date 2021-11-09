package GiaoDien;

import java.util.Date;

public class Worker extends Person {
	private String congty;
	public String getCongty() {
		return congty;
	}
	public void setCongty(String congty) {
		this.congty = congty;
	}
	public Worker(String congty,String hoten, int gioitinh, Date ngaysinh) {
		super(hoten, gioitinh, ngaysinh);
		// TODO Auto-generated constructor stub
	}

}