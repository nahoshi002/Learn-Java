package Bt_1103_B1;
import java.io.*;
import Bt_1103_B1.Student;

public class Car_Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Bt3_Car c = new Bt3_Car("ASAMA\n", "2 Bàn đạp\n", 2, "28-2-2017");
		
		//Seriable
		//
		FileOutputStream fos = new FileOutputStream("D:\\Car.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(c);
	    
	    // De-serializing 'a'
	    FileInputStream fis = new FileInputStream("D:\\Car.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Bt3_Car b = (Bt3_Car)ois.readObject(); 
	    // down-casting object
	    System.out.print(b.toString());
	
	    // closing streams
	    oos.close();
	    ois.close();
	}

}