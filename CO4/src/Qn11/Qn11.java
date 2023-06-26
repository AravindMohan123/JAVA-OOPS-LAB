package Qn11;


import java.util.*;
public class Qn11 {

	public static void  main(String args[]){
		int n=10;
		LinkedList<Integer> ll = new LinkedList<Integer>();
		while(n != 0){
			
			System.out.println("CHOOSE FROM the following options \n1.insert at the beginnning \n2.insert at the end\n3.insert in a position\n4.remove all\n5.display");
			Scanner sc = new Scanner(System.in);
			n = sc.nextInt();
			switch(n){
			case 1:
				System.out.println("Insert the value");
				int tr = sc.nextInt();
				ll.addFirst(tr);
				break;
			case 2:
				System.out.println("Insert the value");
				int lr = sc.nextInt();
				ll.addLast(lr);
				break;
			case 3:
				System.out.println("Enter the position and value ");
				int pos = sc.nextInt();
				int val =sc.nextInt();
				ll.add(pos, val);
				break;
			case 4:
				ll.clear();
				break;
			case 5:
				System.out.println("display : " + ll);
				break;
			}
				
			
		}
		
		
	}
}
