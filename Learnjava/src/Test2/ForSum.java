package Test2;

import java.util.Scanner;

public class ForSum {

	public static void main(String[] args) {
		int sum=0;
		Scanner input = new Scanner(System.in);

        System.out.print("Nhap vao gia tri n : ");
        int num = input.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}