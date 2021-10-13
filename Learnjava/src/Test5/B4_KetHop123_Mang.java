package Test5;
import java.util.Scanner;
import java.util.Arrays;
public class B4_KetHop123_Mang {
	public static void InputArray(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			double randomDouble = Math.random();
			randomDouble = randomDouble * 100 + 1;
			int randomInt = (int) randomDouble;
			arr[i] = randomInt;
		}

	}

	public static void OutputArray(int[] arr) {
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	public static void InputArray1(int []arr1) {
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=arr1.length-1; i++) {
			System.out.print("a[" + i + "] = ");
			arr1[i] = scanner.nextInt();
			
		}
		scanner.close();
	}
	 public static void OutputArray1(int []arr1) {
	        for (int i=0; i<=arr1.length-1; i++) {
	            System.out.print(arr1[i] + " ");
	        }

	    }

	public static void sapxeptangdan(int[] arr) {
		Arrays.sort(arr);
		System.out.print("Tang dan :" + Arrays.toString(arr));
	}

	public static void sapxepgiamdan(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.print("Giam dan: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Findall(int[] arr, int item) {
		String index = "";
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == item) {
				index = String.valueOf(i);
			} else {
				index = null;
			}
			if (index == "null") {
				System.out.println("Vị trí tìm được: " + index);
				break;
			} else {
				System.out.println("Vị trí tìm được: " + index);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Độ dài mảng ngẫu nhiên = \n");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		InputArray(arr);
		OutputArray(arr);
		System.out.print("\n");
		sapxeptangdan(arr);
		System.out.print("\n");
		sapxepgiamdan(arr);
		System.out.print("\n");
		System.out.print("Số cần tìm : ");
		int item = scanner.nextInt();
		Findall(arr, item);
		scanner.close();
	}

}