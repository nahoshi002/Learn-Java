package BaiTapThuaKe;

import java.util.Scanner;

public class B1_Student extends B1_Person {
	private String studentID;
	private int academic_year;

	/**
	 * @param studentID
	 * @param academic_year
	 */
	public B1_Student() {
		super();
	}

	public B1_Student(String studentID, int academic_year, String name, char gender, int birth_year) {
		super(name, gender, birth_year);
		this.studentID = studentID;
		this.academic_year = academic_year;
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getAcademic_year() {
		return academic_year;
	}

	public void setAcademic_year(int academic_year) {
		this.academic_year = academic_year;
	}

	void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ID: ");
		studentID = scanner.nextLine();
		inputPerson();
		System.out.print("Nam nhap hoc: ");
		academic_year = scanner.nextInt();
		System.out.println();
	}

	void outputStudent() {
		System.out.println("ID: " + getStudentID());
		outPerson();
		System.out.println("Nam nhap hoc: " + getAcademic_year());
		System.out.println();
	}
}