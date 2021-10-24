package Test6;
import java.util.Scanner;
public class B4_TachChuoi {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
            String message;
            System.out.println("Nhập chuỗi vào chuỗi của bạn: ");
            message = sc.nextLine();
            String[] arrOfStr = message.split(" ");

            for (String a : arrOfStr)
                System.out.println(a);
    }

}