package Test;

import java.util.Scanner;

public class KiemTraSo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);
	        System.out.print("Nhap So: ");
	        double input = in.nextDouble();

	        if (input > 0)
	        {
	            if (input < 1)
	            {
	                System.out.println("Positive small ");
	            }
	            else if (input > 1000000)
	            {
	                System.out.println("Positive large ");
	            }
	            else
	            {
	                System.out.println("Positive ");
	            }
	        }
	        else if (input < 0)
	        {
	            if (Math.abs(input) < 1)
	            {
	                System.out.println("Negative small ");
	            }
	            else if (Math.abs(input) > 1000000)
	            {
	                System.out.println("Negative large ");
	            }
	            else
	            {
	                System.out.println("Negative ");
	            }
	        }
	        else
	        {
	            System.out.println("Zero");
	        }
	}

}