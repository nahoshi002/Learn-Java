package Test4;
import java.util.Scanner;
public class B2_MangRd_TBC {
	public static void InputArray(int []arr) {
        for (int i=0; i<=arr.length-1;i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            arr[i] = randomInt;
        }

    }
    public static void Average(int []arr) {
        double average = 0;
        for(int i=0; i<=arr.length-1; i++) {
            average += arr[i];
        }
        System.out.println("Trung binh cong : " + (average / arr.length));
    }

    public static void OutputArray(int []arr) {
        for (int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Mang: ");
        int n = scanner.nextInt();
        int []arr = new int[n];
        InputArray(arr);
        OutputArray(arr);
        System.out.println();
        Average(arr);
    }
}