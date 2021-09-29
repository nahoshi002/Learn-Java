package Test;
import java.util.Scanner;
public class InchesToM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);

	        System.out.print("Nhap vao gia tri inches : ");
	        double inch = input.nextDouble();

	        double  met =inch * 0.0254;
	        System.out.println(inch + "Inch la " + met + " Met");
	    }
	}