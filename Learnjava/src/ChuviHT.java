import java.util.Scanner;
public class ChuviHT {
	
	
	 
	    public static double tinhchuvi(double r){
	        return r * 2 * 3.14;
	    }
	    public static void main(String[] args) {
	        double r;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhập bán kính hình tròn: ");
	        r = scanner.nextDouble();
	   
	        System.out.println("Chu vi hình tròn là: "+ tinhchuvi(r));
	   
	   
	    }
	}