package Test;

import java.util.Scanner;
public class ChuviHT {
	    public static double ChuVi(double r){
	        return r * 2 * 3.14;
	    }
	 
	public static void main(String[] args) {
		 	double r;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhập bán kính đường tròn:  ");
	        r = scanner.nextDouble();
	        System.out.println("Chu vi hình tròn là: "+ ChuVi(r));
	}

}