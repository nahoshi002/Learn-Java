package BaiTapThuaKe;

import java.util.Scanner;

public class Student extends Person{
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.getGpa() > o.getGpa()) {
			return 1;
		}
		else if(this.getGpa() == o.getGpa()) {
			if(this.getSoicialActivities() > o.getSoicialActivities()) {
				return 1;
			}
			else if(this.getSoicialActivities() == o.getSoicialActivities()) {
				return 0;
			}
			else {
				return -1;
			}
		}
		
		return -1;
	}
	
	@Override
	public String toString() {
		return "Student: studentID: " + studentID + ", academicYear: " + academicYear + ", gpa: " + gpa
				+ ", soicialActivities: " + soicialActivities + ", name: " + name + ", gender: " + gender + ", birthYear: "
				+ birthYear;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(int academicYear) {
		this.academicYear = academicYear;
	}
	public float getGpa() {
		return gpa;
	}
	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public float getSoicialActivities() {
		return soicialActivities;
	}
	public void setSoicialActivities(float soicialActivities) {
		this.soicialActivities = soicialActivities;
	}
	String studentID;
	int academicYear;
	float gpa;
	float soicialActivities;
	
	
	public Student(String name, char gender, int birthYear, String studentID, int academicYear, float gpa,
			float soicialActivities) {
		super(name, gender, birthYear);
		this.studentID = studentID;
		this.academicYear = academicYear;
		this.gpa = gpa;
		this.soicialActivities = soicialActivities;
	}
	
	
	
	public Student() {
		super();
	}
	public void setInfo() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		this.setName(input.next());

		System.out.print("Nhap ma sinh vien: ");
		this.setStudentID(input.next());
		
		System.out.print("Nhap nam sinh: ");
		this.setBirthYear(input.nextInt());
		
		System.out.print("Nhap gioi tinh: ");
		this.setGender(input.next().charAt(0));
		
		System.out.print("Nhap nam nhap hoc: ");
		this.setAcademicYear(input.nextInt());
		
		System.out.print("Nhap gpa: ");
		this.setGpa(input.nextFloat());
		
		System.out.print("Nhap soicialActivities: ");
		this.setSoicialActivities(input.nextFloat());
	}
}