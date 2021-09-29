package Test;
import java.util.Scanner;
public class TongCacChuSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

        System.out.print("Nhập một số nguyên từ 0 đến 1000: ");
        int num = input.nextInt();

        int sodautien = num % 10;
        int soconlai = num / 10;
        int sothu2 = soconlai % 10;
        soconlai = soconlai / 10;
        int sothu3 = soconlai % 10;
        soconlai = soconlai / 10;
        int sothu4 = soconlai % 10;
        int sum = sothu3 + sothu2 + sodautien + sothu4;
        System.out.println("The sum of all digits in " + num + " is " + sum);

    }
}