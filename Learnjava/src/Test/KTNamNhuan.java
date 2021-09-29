package Test;

import java.util.Scanner;
public class KTNamNhuan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	        int year;
	        Scanner scanner = new Scanner(System.in);
	         
	        System.out.println("Nhập vào năm: ");
	        year = scanner.nextInt();
	         
	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    /*
	                     *  Năm nhuận là năm chia hết cho 4.
	                     *  Nếu năm đó chia hết cho 100 thì cũng phải chia hết cho 400.
	                     */
	                    System.out.println("Năm " + year + " là năm nhuận.");
	                } else {
	                    // Năm chia hết cho 4 và 100 nhưng không chia hết cho 400 thì không là năm nhuận.
	                    System.out.println("Năm " + year + " không phải là năm nhuận.");
	                }
	            } else {
	                // Năm chia hết cho 4 nhưng không chia hết cho 100 thì là năm nhuận.
	                System.out.println("Năm " + year + " là năm nhuận.");
	            }
	        } else {
	            // Năm không chia hết cho 4 thì không phải là năm nhuận.
	            System.out.println("Năm " + year + " không phải là năm nhuận.");
	        }
	    }
	 
	}