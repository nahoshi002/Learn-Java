package Test3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class B4_PtB1 {
	public static void PtB1(int aNumber, int bNumber) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");    // làm tròn đến 2 chữ số thập phân
        System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            double nghiem = (double) -bNumber / aNumber;   // ép kiểu để cho ra kết quả chính xác
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Giải phương trình bậc 1");
        System.out.println("Nhập vào số a: ");
        int aNumber = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        int bNumber = scanner.nextInt();
		PtB1(aNumber,bNumber);
	}

}
