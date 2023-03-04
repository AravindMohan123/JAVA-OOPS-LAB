package qn4;
import java.util.Scanner;

public class EmployeeM {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int i,n;
	i=0;
	Employee e[] = new Employee[10];
 
	do{
		
	System.out.println("Choose from the following options");
	System.out.println("1.add employee details\n2.Search for an Employee");
	n =sc.nextInt();	
	switch(n) {
	case 1:
	System.out.println("Enter the employee number");
	int eNo = sc.nextInt();
	System.out.println("Enter Employee Name");
	String Nm = sc.next();
	System.out.println("Enter the Salary");
	double sal = sc.nextDouble();
	e[i] = new Employee(eNo,Nm,sal);
	i++;
	break;
	case 2:
	System.out.println("Enter the employee id");
	int sr = sc.nextInt();
	if(e[sr].eNo != 0) {
		System.out.println("Employee id:"+e[sr].eNo+"\n"+"Employee name :"+e[sr].eName+"\n"+"Salary :"+e[sr].salary+"\n" );
	}else {
		System.out.println("Item not found");
	}
		
	break;
	default:
		System.out.println("Choose the right option please");
	
	
	
	}	
		
		
		
	}while(n != 0);
	
	
	
	
}
}
