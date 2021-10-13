package Test4;

import java.util.Scanner;

public class B4_MangRd_XuoiNguoc {
	public static void InputArray(int []arr) {
        for (int i=0; i<=arr.length-1;i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            arr[i] = randomInt;
        }

    }
	public static void OutputArray(int []arr) {
        for (int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Nguoc(int []arr) {
       
        	for(int j = arr.length-1 ; j >= 0 ;j--){
        	System.out.print(arr[j]+" ");
        }
        
    }

    public static void Xuoi(int []arr) {
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
        System.out.println("Mảng bạn vừa nhập: ");
        OutputArray(arr);
        System.out.println();
        System.out.println("Mảng bạn nhập vào theo chiều trái sang phải: ");
        Xuoi(arr);
        System.out.println();
        System.out.println("Mảng được in ra theo chiều Phải sang trái: ");
        Nguoc(arr);
    }

}
