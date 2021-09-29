package Test;

import java.util.Scanner;

public class SoLonNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,max=0;
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào số nguyên a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số nguyên b: ");
        b = scanner.nextInt();
        System.out.println("Nhập vào số nguyên c: ");
        c = scanner.nextInt();
        max = a;
        if (max < b) {
        	max = b;
        }
        if(max < c) {
        	max = c;
        }
        System.out.println("So lớn nhất là: "+max);
	}

}
