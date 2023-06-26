package Qn12.Qn10;
import java.util.*;
public class Arraylis {
	public static void main(String args[]) {
		
		ArrayList<String> ar = new ArrayList<String>();
		int s =10;
		Scanner sc = new Scanner(System.in);
		Scanner c = new Scanner(System.in);
		while(s != 0) {
			System.out.println("Choose from the following options\n1.add String\n2.remove String\n3.replace String \n 4.to Uppercase\n5.to lower case\n6. display");
			s =c.nextInt();
			switch(s){
	
		case 1:
			Scanner scn = new Scanner(System.in);
			System.out.println("Enter the String");
			String fe = scn.nextLine(); 
			ar.add(fe);
			break;
		case 2:
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter the String");
			String fe1 = sc1.nextLine(); 
			ar.remove(fe1);
			break;
		case 3:
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter the string to be replaced");
			String r = sc2.nextLine();
			int t=ar.indexOf(r);
			System.out.println("Enter the new string");
			String n = sc2.nextLine();
			ar.set(t, n);
			break;
		
		case 4:
			System.out.println("Enter the index of the string ");
			int i = sc.nextInt();
			System.out.println(ar.get(i));
			System.out.println(ar.get(i).toUpperCase());
			break;
		case 5:

			System.out.println("Enter the index of the string ");
			int in = sc.nextInt();
			System.out.println(ar.get(in));
			System.out.println(ar.get(in).toLowerCase());
			break;
		case 6:
			System.out.println(ar);
			break;
			
		}
		
	}
	}
}
