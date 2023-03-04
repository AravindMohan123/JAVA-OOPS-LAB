package Qn4;
import java.util.Scanner;

public class Symmat {
	int n,v,flag=0;
	int[][] arr = new int[10][10];
	int[][] arr1 = new int[10][10];
	Scanner sc =new Scanner(System.in);
	
	public void datset() {
	System.out.println("Enter the size of the matrix");
	n =  sc.nextInt();
		
		for(int i =0;i<n;i++) {
		for(int j=0;j<n;j++) {
		System.out.println("Enter the data in matrix 2 "+ i + " and "+ j);
			v = sc.nextInt();
		arr[i][j] = v;
		
		
	}}
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				
			arr1[j][i] = arr[i][j];
			
			
		}}
		System.out.println(" ");
	
		for(int i =0;i<n;i++) {
		for(int j=0;j<n;j++) {
		if(arr[i][j] == arr1[i][j]){
			System.out.print(arr[i][j]+" ");
			flag =1;
			
		}else {
			flag =0;
			break;
		}
		
	}}
		System.out.println(" ");
		System.out.println(" ");
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
			System.out.print(arr[i][j]+" ");
			
		}
			System.out.println(" ");
			
			}
		System.out.println(" ");
		
	if(flag ==1) {
		

		
	System.out.println("is a symmetric matrix ");
	
	
	}else {
		
		System.out.println("The matrix is not symmetric");
		
	}
	
	}
}
