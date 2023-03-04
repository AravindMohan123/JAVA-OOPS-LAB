package Qn1;
import java.util.Scanner;

import java.util.Arrays;

public class Sort {
int n;

Scanner sc =new Scanner(System.in);
	public void data() {
		
		System.out.println("Enter a string");
		String st = sc.next();
		char arr[] = st.toCharArray();
		Arrays.sort(arr);
	String s =	new String(arr);
		System.out.println("Sorted string is : " + s);
	}
}
