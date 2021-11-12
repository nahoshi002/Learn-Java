package BaiTapThuaKe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

	Student[] students;
	
	public static void Show(Student[] students) {
		for (Student o: students) {
			System.out.println(o.toString());
			System.out.println("---------------------------------------");
		}
	}
	
	public static Student[] sortStudent(Student[] stds) {
		for(int i = 0; i < stds.length - 1; i++) {
			for(int j = i + 1; j < stds.length; j++) {
				if(stds[i].compareTo(stds[j]) == -1) {
					Student temp = stds[i];
					stds[i] = stds[j];
					stds[j] = temp;
				}
			}
		}
		return stds;
		
	}
	
	public void write(Student[] student) { 
		
        try {   
            FileOutputStream f = new FileOutputStream("D:\\student.txt");   // tao file f tro den student.txt
            ObjectOutputStream oStream = new ObjectOutputStream(f); // dung de ghi theo Object vao file f
            oStream.writeObject(student);   // ghi student theo kieu Object vao file
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error Write file");
        }
    
	}
	
    public Student[] read() {
    	
        Student[] student = null;
        try {   
            FileInputStream f = new FileInputStream("D:\\student.txt"); // tao file f tro den student.dat
            ObjectInputStream inStream = new ObjectInputStream(f);  // dung de doc theo Object vao file f
            // dung inStream doc theo Object, ep kieu tra ve la Student
            student = (Student[]) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        }
        return student;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so sinh vien");
		int n = input.nextInt();
		
		StudentManagement list = new StudentManagement();
		list.students = new Student[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin cho sinh vien thu " + (i + 1) + ": ");
			//
			list.students[i] = new Student();
			list.students[i].setInfo();
		}
		//
		// Hien thi
		Show(list.students);
		
		//
		// Sap xep
		Student[] result = sortStudent(list.students);
		// Hien thi
		System.out.println("Sau khi sap xep: ");
		Show(result);
		//
		// Ghi file
		// Ghi Object vao file
		list.write(result);
		//
		// Doc tu file
		Student[] resultReadFile = list.read();
		// Hien thi sau khi doc file
		System.out.println("Doc tu file");
		Show(resultReadFile);
	}

}