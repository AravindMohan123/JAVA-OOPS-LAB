package Qn3;
import java.util.Scanner;
public class OverloadM {
	

	public static void main (String args[]) {
		Overload obj = new Overload();
		Scanner sc = new Scanner(System.in);	
		int c;
		do{
		System.out.println("Enter the choice\n1.square\n2.rectangle\n3.circle\n");	
		 c =sc.nextInt();
		switch(c) {
		case 0:
			System.out.println("Exiting....");
			break;
		case 1:
		System.out.println("Enter the side length\n");
			int n =	sc.nextInt();
			int res = obj.area(n);
			System.out.println("the area is : "+ res);
		break;
		case 2:
			System.out.println("Enter the side length and breadth\n");
			int l =	sc.nextInt();
			int b =sc.nextInt();
			int res1 = obj.area(l,b);
			System.out.println("the area is : "+ res1);
			break;
		case 3: 
			System.out.println("Enter the radius\n");
			int r =	sc.nextInt();
			double pi=3.14;
			double res2 = obj.area(pi,r);
			System.out.println("the area is : "+ res2);
			break;
		default :
			System.out.println("Wrong input pz choose the right option");
			break;
		}	
			
			
		}while(c != 0);

}
}