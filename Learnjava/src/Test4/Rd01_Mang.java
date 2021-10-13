package Test4;
import java.util.Scanner;
public class Rd01_Mang {
	 public static void InputArray(int []arr) {
	        for (int i=0; i<=arr.length-1;i++) {
	            double randomDouble = Math.random();
	            randomDouble = randomDouble * 2 + 0;
	            int randomInt = (int) randomDouble;
	            arr[i] = randomInt;
	        }

	    }
	    public static void InputArray1(int []arr1) {
	        for (int i=0; i<=arr1.length-1;i++) {
	            double randomDouble = Math.random();
	            randomDouble = randomDouble * 100 + 1;
	            int randomInt = (int) randomDouble;
	            arr1[i] = randomInt;
	        }

	    }
	    public static void Average(int []arr, int []arr1) {
	        double average = 0;
	        for(int i=1; i<=arr.length-1; i++) {
	            average += arr[i]*arr1[i];
	        }
	        System.out.println("Trung binh trong so  : " + (average / arr.length));
	    }

	    public static void OutputArray(int []arr) {
	        for (int i=0; i<=arr.length-1; i++) {
	            System.out.print(arr[i] + " " );
	        }
	        System.out.print("\n");
	    }
	    public static void OutputArray1(int []arr1) {
	        for (int i=0; i<=arr1.length-1; i++) {
	            System.out.print(arr1[i] + " " );
	        }
	    }
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap Mang: ");
	        int n = scanner.nextInt();
	        int []arr = new int[n];
	        int[] arr1 = new int[n];
	        InputArray(arr);
	        InputArray1(arr1);
	        OutputArray(arr);
	        OutputArray1(arr1);
	        System.out.println();
	        Average(arr,arr1);
	    }
	}