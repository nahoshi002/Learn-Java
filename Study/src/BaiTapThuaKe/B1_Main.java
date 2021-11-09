package BaiTapThuaKe;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

public class B1_Main {

	private ArrayList<B1_Student> studentList = new ArrayList<>();

	public B1_Main() {

	}

	public ArrayList<B1_Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<B1_Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "B1_Main [studentList=" + studentList + ", getStudentList()=" + getStudentList() + "]";
	}

	void input(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin cua sinh vien: " + (i + 1) + ": ");
			B1_Student s = new B1_Student();
			s.inputStudent();
			getStudentList().add(s);
		}
	}

	void output(int n) {
		input(n);
		for (int i = 0; i < getStudentList().size(); i++) {
			System.out.println("\n THONG TIN SINH VIEN :");
			getStudentList().get(i).outputStudent();
		}
	}

	void findBirthYear(int year) {
		Vector<Object> studentVector = new Vector<>();
		for (int i = 0; i < getStudentList().size(); i++) {
			if (getStudentList().get(i).getBirth_year() == year) {
				studentVector.add("\n MSV: " + getStudentList().get(i).getStudentID());
				studentVector.add("Hoten: " + getStudentList().get(i).getName());
				studentVector.add("Gioi tinh: " + getStudentList().get(i).getGender());
				studentVector.add("Nam sinh: " + getStudentList().get(i).getBirth_year());
				studentVector.add("Nam nhap hoc: " + getStudentList().get(i).getAcademic_year() + "\n");
			}
		}
		System.out.println("Nhung sinh vien co ngay sinh: " + year + ": " + studentVector);
	}

	void findName(String name) {
		Vector<Object> studentVector = new Vector<>();
		for (int i = 0; i < getStudentList().size(); i++) {
			if (getStudentList().get(i).getName().equals(name)) {
				studentVector.add("\n MSV: " + getStudentList().get(i).getStudentID());
				studentVector.add("Hoten: " + getStudentList().get(i).getName());
				studentVector.add("Gioi tinh: " + getStudentList().get(i).getGender());
				studentVector.add("Nam sinh: " + getStudentList().get(i).getBirth_year());
				studentVector.add("Nam nhap hoc: " + getStudentList().get(i).getAcademic_year() + "\n");
			}
		}
		System.out.println("Nhung sinh vien co ten la: " + name + ": " + studentVector);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1_Main sm = new B1_Main();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong sinh vien: ");
		int n = scanner.nextInt();
		sm.output(n);
		System.out.print("Nhap nam sinh can tim: ");
		int year = scanner.nextInt();
		sm.findBirthYear(year);
		scanner.nextLine();
		System.out.print("Nhap vao ten sinh vien can tim: ");
		String name = scanner.nextLine();
		sm.findName(name);
		scanner.close();
	}

}