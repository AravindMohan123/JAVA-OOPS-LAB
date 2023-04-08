package Qn3;

import java.util.Scanner;

public class PersonM {
	static int i=0;
	
	static Teacher obj[] = new Teacher[10];
	public static void getdata() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name");
		String nm =sc.nextLine();
	
		System.out.println("Enter the gender");
		String gen =sc.nextLine();
		
		System.out.println("Enter the address");
		String addr =sc.nextLine();
		
		System.out.println("Enter the  company name");
		String cnm =sc.nextLine();
		
		System.out.println("Enter the Qualification");
		String qua =sc.nextLine();
		
		System.out.println("Enter the Subject");
		String sbt =sc.nextLine();
		
		System.out.println("Enter the department");
		String dptm =sc.nextLine();
		
		System.out.println("Enter the teacher id");
		int td =sc.nextInt();
		
		System.out.println("Enter the age");
		int a =sc.nextInt();
		System.out.println("Enter the Employee id");
		int emid = sc.nextInt();
		
		obj[i] = new Teacher(nm,gen,addr,a,emid,cnm,qua,sbt,dptm,td);
		i++;
	}
	public static void printdata() {
		
		for(int j=0;j<i;j++){
			System.out.println("\nName = "+obj[j].name+"\ngender ="+obj[j].gender+"\naddress ="+obj[j].address+"\nage ="+obj[j].age+"\nCompany name ="+obj[j].company_name+"\nqualification ="+obj[j].qual+"\nemployee id ="+obj[j].empid+"\nTeacher id "+obj[j].tid+"\nSubject = "+obj[j].sub+"\nDepartment ="+obj[j].dep);
			
			
		}
		
		
		
		
	}
	
	
public static void main(String args[]) {
	int c;
	Scanner scanner = new Scanner(System.in);
	do {
		System.out.println("Enter your choice\n1.Add info\n2.display all\n");
		c=scanner.nextInt();	
		switch(c) {
		case 1:
		getdata();
			break;	
		case 2:
		printdata();
			break;
		
		
		}
	}while(c !=0);
	
	
	
}
}
