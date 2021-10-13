package Test4;
import java.util.Scanner;
public class B1_TBC {
	public static void InputArray(int []arr) {
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = scanner.nextInt();
			
		}
		scanner.close();
	}
	public static void Average(int []arr) {
		double average = 0;
		for(int i=0; i<=arr.length-1; i++) {
			average += arr[i];
		}
		System.out.println("Average of array is " + (average / arr.length));
	}
	
	public static void OutputArray(int []arr) {
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập số phần tử của mảng: " );
		n = scanner.nextInt();
		int []arr = new int[n];
		InputArray(arr);
		OutputArray(arr);
		System.out.println();
		Average(arr);
	}

}
