package qn3;
import java.util.Scanner;

public class EmpMain {
	
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	Teacher obj[] = new Teacher[10]; 
	int c,i=0;
	do{
	System.out.println("Chhose from the options\n1.Add Employee\n2.display Employee\n3.View all employee details");	
	c =sc.nextInt();	
	switch(c) {
	case 1:
	System.out.println("Enter the ID");
	int id =sc.nextInt();
	
	System.out.println("Enter the name");
	String nm =sc.next();
	
	System.out.println("Enter the the address");
	Scanner scn =new Scanner(System.in);
	String ad =scn.nextLine();
	
	System.out.println("Enter the salary");
	long sal =sc.nextInt();
	
	System.out.println("Enter the Department");
	String dep =scn.next();
	
	System.out.println("Enter the Subjects taught");
	Scanner sn = new Scanner(System.in);
	String sb =sn.nextLine();
	
	obj[i] = new Teacher(dep,sb,id,nm,sal,ad);
	if(i == 9) {
		System.out.println("sorry storage filled");
		break;
	}
	i++;
	break;
		
	case 2:
		System.out.println("Enter employee id");
		int n = sc.nextInt();
		obj[n].display();
		break;
	case 3:
		for(int j=0;j<i;j++) {
			
		obj[j].display();
		
		}
		break;
		default:
			System.out.println("Wrong input");
			break;
		}
	}while(c != 0);
	
	
	
	
	
}
}
