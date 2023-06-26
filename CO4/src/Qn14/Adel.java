package Qn14;
import java.util.*;
public class Adel {
public static void main(String[] args){
	int v=10 ;
	
	Deque<Integer> q = new ArrayDeque<Integer>(); 
	while(v !=0 ){
		System.out.println("Choose from the following options \n 1.");
		Scanner sc =new Scanner(System.in);
			v = sc.nextInt();
			switch(v){
			
			case 1:
				System.out.println("Enter the value");
				int ad =sc.nextInt();
				q.addFirst(ad);
				break;
			case 2:
				System.out.println("enter the value");
				int al = sc.nextInt();
				q.addLast(al);
				break;
			case 3:
				q.removeFirst();
				System.out.println("Item removed");
				break;
			case 4:
				q.removeLast();
				System.out.println("Remove the last item");
				break;
			case 5:
				System.out.println("the items are : "+ q);
				break;
			
			
			
			
			
			}
			
		}
		
		
	}
	
}

