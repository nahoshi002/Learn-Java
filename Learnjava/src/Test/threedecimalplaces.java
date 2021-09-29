package Test;
import java.util.Scanner;
public class threedecimalplaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Scanner check = new Scanner(System.in);

	        System.out.print("Nhap So 1 : ");
	        double a = check.nextDouble();
	        System.out.print("Nhap So 2 : ");
	        double b = check.nextDouble();
	        
	        a = Math.round(a * 1000);
	        a = a / 1000;

	        b = Math.round(b * 1000);
	        b = b / 1000;

	        if (a == b)
	        {
	            System.out.println("2 số giống nhau!!!");
	        }
	        else
	        {
	            System.out.println("2 số khác nhau!!!");
	        }
	}

}