package Test;

import java.util.Scanner;

public class KiemTraThuNgay {

	public static void main(String[] args)
    {
		int number;
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhập vào ngày thứ: ");
        number = scanner.nextInt();
        switch (number){
        	case 1 : System.out.println("Monday!!!");
        	break;
        	case 2 : System.out.println("Tuesday!!!");
        	break;
        	case 3 : System.out.println("Wednesday !!!");
        	break;
        	case 4 : System.out.println("Thursday !!!");
        	break;
        	case 5 : System.out.println("Friday !!!");
        	break;
        	case 6 : System.out.println("Saturday !!!");
        	break;
        	case 7 : System.out.println("Sunday !!!");
        	break;
        	default: System.out.println("Ngày sai !!!");
        }
        
    }
}