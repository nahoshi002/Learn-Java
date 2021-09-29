package Test;
import java.util.Scanner;
public class MtoYandD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Nhap Phut: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " Phut la bang " + years + " Nam " + days + " Ngay");
    }
}