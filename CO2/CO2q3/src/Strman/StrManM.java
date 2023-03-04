package Strman;
import java.util.Scanner;
import java.util.Arrays;

public class StrManM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String  st= sc.next();
		int c;
		//c = sc.nextInt();
		StrMan w = new StrMan();
		do {
			System.out.println("Choose from the following options");
			System.out.println("1.position\n2.replace\n3.Length\n4.Upper Case\n5.Lower Case\n");
			c = sc.nextInt();
			
			switch(c){
			case 1:
			System.out.println("Enter the position");
			int t = sc.nextInt();
			w.posi(st,t );	
			break;
			case 2:
				System.out.println("Enter the character to be replaced");
				String tbr = sc.next();
				System.out.println("Enter the character to be replaced with");
				String tr = sc.next();
				w.rpl(st,tbr,tr );	
				break;
			case 3:
				
				
				w.len(st);
				break;
			case 4:
				w.upper(st);
				break;
				
			case 5:
				w.lower(st);
				break;
			default:
				System.out.println("Sorry wrong input");
			
			}
			}while(c != 0);
			
			
			
			
			
		
			
	
		}

}
