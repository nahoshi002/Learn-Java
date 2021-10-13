package Test5;
import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;
public class B3_MangTangGiam {
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
		 public static void sapxeptangdan(int []arr1) {
			 Arrays.sort(arr1);
			 System.out.print("Tang dan :" + Arrays.toString(arr1));
		    }
		 public static void sapxepgiamdan(int []arr1) {
			  int temp = 0;    
		        for  ( int  i =  0 ; i <arr1.length; i ++) {     
		            for  ( int  j = i + 1 ; j <arr1.length; j ++) {     
		            	if(arr1[i] < arr1[j]) {      
		            		temp = arr1 [i];    
		                   arr1 [i] = arr1 [j];    
		                   arr1 [j] = temp;    
		               }     
		            }     
		        }    
		            
		        System.out.print("Giam dan: ");    
		        for (int i = 0; i < arr1.length; i++) {     
		            System.out.print(arr1[i] + " ");    
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
		 System.out.print("Độ dài mảng nguyên = \n");
	       int n1 = scanner.nextInt();
	       int[] arr1 = new int[n1];
		InputArray1(arr1);
		OutputArray1(arr1);
		System.out.print("\n");
		sapxeptangdan(arr1);
		System.out.print("\n");
		sapxepgiamdan(arr1);
	}

}