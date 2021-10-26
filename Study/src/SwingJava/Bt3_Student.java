package SwingJava;

import java.util.Scanner;
import SwingJava.Bt2_Tax.payTax;

public class Bt3_Student extends Bt1_Person implements payTax {
	// Thuoc tinh
	protected static String name, email;
	protected static int studentID;
	protected static int phone;

	// Ham khoi tao co doi so
	public Bt3_Student(String name, int studentID, int phone, String email) {
		super(birthday, gender, blood_type);
		this.name = name;
		this.studentID = studentID;
		this.phone = phone;
		this.email = email;
	}

	// getter cho name
	public String getName() {
		return name;
	}

	// getter cho studentID
	public int getStudentID() {
		return studentID;
	}

	// getter cho email
	public String getEmail() {
		return email;
	}

	// getter cho phone
	public int getPhone() {
		return phone;
	}

	// setter cho name
	public void setName(String name) {
		this.name = name;
	}

	// setter cho StudentID
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	// setter cho email
	public void setEmail(String email) {
		this.email = email;
	}

	// setter cho phone
	public void setPhone(int phone) {
		this.phone = phone;
	}

	// Ham hien thi
	public void display() {
		super.display();
		System.out.println("\tHo Ten: " + name);
		System.out.println("\tID Hoc Sinh: " + studentID);
		System.out.println("\tPhone: " + phone);
		System.out.println("\tEmail: " + email);
	}

	// Ham nhap thong tin
	public void enter() {
		Scanner sc = new Scanner(System.in);
		super.enter();
		System.out.print("\tNhap Ho Ten: ");
		name = sc.next();
		System.out.print("\tNhap ID Hoc Sinh: ");
		studentID = sc.nextInt();
		System.out.print("\tNhap Phone: ");
		phone = sc.nextInt();
		System.out.print("\tNhap Email: ");
		email = sc.next();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bt3_Student P1 = new Bt3_Student(name, studentID, phone, email);
		P1.enter();
		P1.display();
	}

	@Override
	public double calcTax(double income, int start_time, int end_time) {
		// TODO Auto-generated method stub
		return 0;
	}
}