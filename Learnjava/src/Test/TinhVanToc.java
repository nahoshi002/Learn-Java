package Test;
import java.util.Scanner;
public class TinhVanToc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 

		float timeSeconds;
		float mets,kph, mph;

		System.out.print("Nhap Met: ");
		float met = scanner.nextFloat();

		System.out.print("Nhap Gio: ");
		float gio = scanner.nextFloat();

		System.out.print("Nhap Phut: ");
		float phut = scanner.nextFloat();

		System.out.print("Nhap Giay: ");
		float giay = scanner.nextFloat();

		timeSeconds = (gio*3600) + (phut*60) + giay;
		mets = met / timeSeconds;
		kph = ( met/1000.0f ) / ( timeSeconds/3600.0f );
		mph = kph / 1.609f;

		System.out.println("Your speed in meters/second is "+mets);
		System.out.println("Your speed in km/h is "+kph);
		System.out.println("Your speed in miles/h is "+mph);
		
		scanner.close();
	}
}