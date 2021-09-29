package Test;
import java.util.Scanner;
public class FtoC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);

	        System.out.print("Nhap nhiet do(F): ");
	        double F = input.nextDouble();

	        double  C =(( 5 *(F - 32.0)) / 9.0);
	        System.out.println(F + " Do F Bang " + C + " Do C");
	    }
	}