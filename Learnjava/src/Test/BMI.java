package Test;

import java.util.Scanner;

public class BMI {
	public static void main(String[] args) throws Exception {
		tinhbmi();
    }
	public static void tinhbmi()  {
        Scanner s = new Scanner(System.in);
        System.out.print("Nhập cân nặng tính bằng kg: ");
        float cannang = s.nextFloat();
        System.out.print("Nhập chiều cao tính bằng m: ");
        float chieucao = s.nextFloat();
        // tinh toan BMI cua doi tuong
        float bmi = (cannang)/(chieucao*chieucao);
        System.out.println("BMI: "+bmi);
        printbmi(bmi);
}
    private static void printbmi(float bmi) {
        if(bmi < 18.5) {
            System.out.println("Underweight");
        }else if (bmi < 25) {
            System.out.println("Normal");
        }else if (bmi < 30) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}