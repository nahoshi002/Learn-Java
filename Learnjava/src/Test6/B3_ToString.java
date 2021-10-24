package Test6;
import java.util.Scanner;
public class B3_ToString {
	public static String toString(char[] a)
    {
        // Creating object of String class
        String string = new String(a);

        return string;
    }

    public static void main(String args[])
    {

        // Character array
        char s[] = { 'T', 'e', 'o', 'R', 'a','t', 'Đ', 'e',
                     'p', 'T', 'r', 'a', 'i' };

        // Printing converted string from character array
        System.out.println(toString(s));
    }
}