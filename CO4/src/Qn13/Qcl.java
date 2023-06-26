package Qn13;
import java.util.*;
public class Qcl {
	public static void main(String args[]) {
		PriorityQueue <Integer> qn = new PriorityQueue<>();
		int c =10;
		while(c != 0){
			System.out.println("Choose from the following options\n1.add num\n 2.delete num\n 3.front \n 4.display");
			Scanner sc = new Scanner(System.in);
			c = sc.nextInt();
			switch(c){
			
			case 1:
				System.out.println("Enter the value ");
				int n = sc.nextInt();
				qn.add(n);
				break;
			case 2:
				qn.poll();
				System.out.println("removed");
				break;
			case 3:
				qn.peek();
				break;
			case 4:
				Iterator itr = qn.iterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
					
			
			
				}
				break;
			
			}
			
		}
		
		
		
		
	}

}
