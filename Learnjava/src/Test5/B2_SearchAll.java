package Test5;

import java.util.Scanner;

public class B2_SearchAll {
	public static void InputArray(int []arr) {
		for (int i=0; i<=arr.length-1;i++) {
			double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
			arr[i] = randomInt;
		}
		
	}
	
	public static void FindAll(int []arr, int item) {
		String index = "";
		for (int i=0; i<=arr.length-1; i++) {
			if (arr[i] == item) {
				index=String.valueOf(i);
			} else {
				index = null;
			}
		if(index == "null") {
			System.out.println("Vị trí tìm được: "+index);
			break;
		}else {
			System.out.println("Vị trí tìm được: "+index);
		}
		}
	}
	
	public static void OutputArray(int []arr) {
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Độ dài mảng = ");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		InputArray(arr);
		OutputArray(arr);
		System.out.println();
		System.out.print("Số cần tìm = ");
		int item = scanner.nextInt();
		FindAll(arr, item);
		scanner.close();
	}
}
