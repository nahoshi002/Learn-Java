package Test;
import java.text.DecimalFormat;
import java.util.Scanner;
public class SumAndAvg {

	public static void main(String[] args) {
        int n=5, sum = 0, number;
        float avgNumber;
        Scanner scanner = new Scanner(System.in);
         
        DecimalFormat decimalFormat = new DecimalFormat("#.##");    
         
        for (int count = 1; count <=n; count++) {
            System.out.println("Nhập số thứ " + count + ": ");
            number = scanner.nextInt();
            sum += number;
        }
         
        avgNumber = (float) sum / n;
        System.out.println("Tổng = " + decimalFormat.format(sum));
        System.out.println("Trung bình cộng = " + decimalFormat.format(avgNumber));
    }
 
}