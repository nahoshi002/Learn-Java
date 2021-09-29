package Test;

import java.util.Scanner;

public class KiemTraSo {

	public static void main(String[] args)
    {
		int number;
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào số nguyên: ");
        number = scanner.nextInt();
        if(number > 0)
        {
            System.out.println(number+" là số dương!!!");
        }
        else if(number < 0)
        {
            System.out.println(number+" là số âm!!!");
        }
        else
        {
            System.out.println(number+" không phải là số âm cũng không phải là số dương!!!");
        }
    }
}