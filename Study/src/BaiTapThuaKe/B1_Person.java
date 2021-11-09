package BaiTapThuaKe;

import java.util.Scanner;

public abstract class B1_Person {
	private String name;
	private char gender; // 0 is boy / 1 is girl
	private int birth_year;

	/**
	 * @param name
	 * @param gender
	 * @param birth_year
	 */
	public B1_Person() {
		super();
	}

	public B1_Person(String name, char gender, int birth_year) {
		super();
		this.name = name;
		this.gender = gender;
		this.birth_year = birth_year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}

	void inputPerson() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap ho ten: ");
		name = scanner.nextLine();
		System.out.print("Gioi tinh(0:Nam ; 1: Nu): ");
		gender = scanner.next().charAt(0);
		System.out.print("Nam sinh: ");
		birth_year = scanner.nextInt();
	}

	void outPerson() {
		System.out.println("Ho va ten: " + getName());
		System.out.println("Gioi tinh: " + getGender());
		System.out.println("Nam sinh: " + getBirth_year());
	}
}