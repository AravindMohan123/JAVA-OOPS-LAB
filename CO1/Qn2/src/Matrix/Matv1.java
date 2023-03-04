package Matrix;
import java.util.Scanner;
class Matv1 {
Scanner sc = new Scanner(System.in);
	int n=10,v;
	int[][] arr = new int[n][n];
	int[][] arr2 = new int[n][n];
	public void data() {
	
	System.out.println("Enter the size of the data");
	n = sc.nextInt();
	
	for(int i =0;i<n;i++) {
		for(int j=0;j<n;j++) {
		System.out.println("Enter the data in matrix 1 "+ i + " and "+ j);
			v = sc.nextInt();
		arr[i][j] = v;
		
		
	}} 
	for(int i =0;i<n;i++) {
		for(int j=0;j<n;j++) {
		System.out.println("Enter the data in matrix 2 "+ i + " and "+ j);
			v = sc.nextInt();
		arr2[i][j] = v;
		
		
	}}
	for(int i =0;i<n;i++) {
		for(int j=0;j<n;j++) {
		
			arr2[i][j] = arr2[i][j] +arr[i][j];
		
	}}
	System.out.println("The value after matrix addition is");
	
	for(int i =0;i<n;i++) {
		for(int j=0;j<n;j++) {
		System.out.print(arr2[i][j] + " ");
		
	}
		
	System.out.println(" ");
	}
	
}
}
