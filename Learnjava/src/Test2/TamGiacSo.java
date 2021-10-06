package Test2;
import java.util.Scanner;

public class TamGiacSo {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int hight;
	    System.out.printf("\n\nNhập vào chiều cao của tam giác: ");
	    hight = sc.nextInt();
	    for (int i = hight; i >= 1; --i) {
	      for (int j = i; j >= 1; --j) {
	        System.out.print(j+" ");
	      }
	      System.out.println();
	    }
	  }
	}