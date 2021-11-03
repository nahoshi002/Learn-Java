package Bt_1103_B1;

import java.io.*;

public class QLSV {

	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s = new Student("Nguyen Anh Hao", "26-12-2002", '1', 7.5, 5);

		// Clone
		Student s2 = (Student) s.clone();
		System.out.println("Clone:");
		System.out.println(s2.toString());

		// Seriable
		//
		FileOutputStream fos = new FileOutputStream("D:\\Student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s);

		// De-serializing 'a'
		FileInputStream fis = new FileInputStream("D:\\Student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student b = (Student) ois.readObject();
		// down-casting object

		// closing streams
		oos.close();
		ois.close();

		// Compare
		System.out.println("Compare");
		Student c = new Student("Le Thi Thanh Thai", "10-02-2002", '1', 5, 4);
		System.out.println(s.toString() + " va " + c.toString());
		System.out.println(s.compareTo(c));
	}

}