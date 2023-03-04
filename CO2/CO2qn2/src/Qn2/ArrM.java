package Qn2;
import java.util.Scanner;
import java.util.Arrays;
public class ArrM {

	public static void main(String[] args) {
		int[] arr = new int[15];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		for(int i =0 ;i<n;i++) {
			System.out.println("Enter the numbers in the array");
			arr[i] = sc.nextInt();
			
		}
	
		Arr a = new Arr();
		System.out.println("Enter the item to be searched");
		int sr = sc.nextInt();
		a.search(arr,sr);
	}

}
